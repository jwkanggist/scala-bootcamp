package sparkguide

import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.{SparkConf, SparkContext}
import org.json4s.DefaultFormats

object FlightDataExample {
  implicit val formats: DefaultFormats = DefaultFormats

  def main(args: Array[String]): Unit ={

    val sparkConf: SparkConf = new SparkConf().setMaster("local").setAppName("FE")
    val sc: SparkContext = SparkContext.getOrCreate(sparkConf)
    val spark: SparkSession = SparkSession.builder().config(sparkConf).getOrCreate()

    import spark.implicits._

    val importCSVPath = "/Users/marcomacpro/SourceCodes/Spark-The-Definitive-Guide/data/flight-data/csv/2015-summary.csv"
    val flightData2015 = spark.read.option("inferSchema","true").option("header","true").csv(importCSVPath)

    // spark partitions num setting
    spark.conf.set("spark.sql.shuffle.partitions",5)
    val takenArray = flightData2015.sort("count").take(2)

    // Dataframe을 sql 테이블로 생성
    flightData2015.createOrReplaceTempView("flight_data_2015")

    val sqlWay = spark.sql(
      """SELECT DEST_COUNTRY_NAME, count(1)
        FROM flight_data_2015
        GROUP BY DEST_COUNTRY_NAME
      """)

    val dataFrameWay = flightData2015.groupBy("DEST_COUNTRY_NAME").count()

    sqlWay.explain()
    dataFrameWay.explain()

    //==========================

    /*
    +--------------------+-------------------+-----+
    |   DEST_COUNTRY_NAME|ORIGIN_COUNTRY_NAME|count|
    +--------------------+-------------------+-----+
    |       United States|            Romania|   15|
    |       United States|            Croatia|    1|
    |       United States|            Ireland|  344|
    |               Egypt|      United States|   15|
    |       United States|              India|   62|
    |       United States|          Singapore|    1|
    |       United States|            Grenada|   62|
    |          Costa Rica|      United States|  588|
    |             Senegal|      United States|   40|
    |             Moldova|      United States|    1|
    |       United States|       Sint Maarten|  325|
    |       United States|   Marshall Islands|   39|
    |              Guyana|      United States|   64|
    |               Malta|      United States|    1|
    |            Anguilla|      United States|   41|
    |             Bolivia|      United States|   30|
    |       United States|           Paraguay|    6|
    |             Algeria|      United States|    4|
    |Turks and Caicos ...|      United States|  230|
    |       United States|          Gibraltar|    1|
    +--------------------+-------------------+-----+
     */

    flightData2015.groupBy($"DEST_COUNTRY_NAME").sum("count").withColumnRenamed("sum(count)","destination_total").sort().limit(5).show

  }

}
