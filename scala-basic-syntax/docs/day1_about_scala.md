About Scala
===============================================================
- Author Jaewook Kang 2019 2.4

> 2001년에 EPFL 마틴 오더스키 교수가 자바 제네릭 컴파일러를 개발하면서 느꼈던 자바의 몇가지 단점을 보완하고 연구 플랫폼으로 사용하기 위해서 설계한 언어

## 특징
- 객체지향 + 함수
- 적은 양의 코드로 방대한 규모의 시스템을 작성할 수 있다.
~~코드는 간결해지지만 사실 가독성은 떨어진~~

### 지향성
- Scalable
- Abstraction
- Composition
- Decomposition

### 쉬운 언어 확장
- 도메인 특화 언어: ??
- Call by Name: 값이 아닌 함수를 인자로 전달 받는다. 
- Trait: ??
- 

### 짧은 소스
- 게터/세터 자동생성
- 싱글톤: object 키워드로 싱글톤 오브젝트 생성 가능. 자바의 static에 대응하는 키워드가 없고 클래스와 같은 이름의 오브젝트로 생성
- 타입추론: 변수의 타입, 함수의; 반환값의 타입등을 컴파일러가 추론해준다

### 함수형 언어
> 함수 프로그래밍의 핵심은 프로그래밍을 수학에 가깝게 만드는 것이다
- 함수도 객체이다: 함수도 일반적으로 데이터라고 생각하는 Int나 String 타입들과 동일한 취급을 받는다.  
스칼라에서 모든 값은 객체이므로 함수도 객체이다.
- 함수가 곧 데이터 이다: 함수 리터럴 지원 
- 함수를 다루는 함수: 
```scala
val lambdaExample = Map(x->x*x([1,2,3,4]) // 문법이 이상하다

```
- 불변성: val로 선언된 변수는 그 변수가 더이상 유효하지 않게 될때 까지 그 값을 바꾸는 것이 불가능하다. 하지만 가리키고 있는 개체의 상태가 바뀌는것은 허용한다. 
```scala
val arr = Array(1,2,3,4,5)
arr = Array(1,2,3) // 불가능
arr(0) = 0 // 가능
```

### 자바 호환성
- 자바의 코드를 100% 가져다 쓸 수 있다. 자바에서는 scala 코드를 사용할 수 없다.


### XML 지원
- XML 리터럴을 지원한다. 즉 변수에 XML 코드를 하드코딩 할 수 있다. 
- XML 리터럴 내에서 스칼라 코드를 이용해서 동적으로 XML을 생성 할 수 있다.
- XML 파씽이 쉽다
- 스칼라 3에서는 지원 중단이 예정되어 있다. 

## 코드 컨벤션
- 클래스/오브젝트명은 파스칼케이스: PascalCase
- 함수/메소드 명은 카멜케이스:camelCase
- 파일명은 해당 파일에서 실행되는 오브젝트 명과 동일하게
- 스칼라 프로그램은 오브젝트의 main(args: Array[String])에서 시작한다. 