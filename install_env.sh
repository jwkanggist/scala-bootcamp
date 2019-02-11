#! /bin/bash

brew tap caskroom/versions
brew cask search java
brew cask install java8


brew install scala
export SCALA_HOME=/usr/local/Cellar/scala/2.12.4/libexec
export PATH=$PATH:$SCLAL_HOME/bin


brew install apache-spark
export SPARK_HOME=/usr/local/Cellar/apache-spark/2.2.0/libexec
export PATH=$PATH:$SPARK_HOME
