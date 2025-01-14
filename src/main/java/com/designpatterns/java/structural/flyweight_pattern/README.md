# 플라이웨이트 패턴
플라이웨이트 패턴은 공유를 위해 사용되는 패턴이다.
그 목적은 객체를 재사용하여 메모리를 절약하는 적이다. (이때 공유되는 객체는 불변 객체여야만 한다.)

ex) Java에서 String Class는 플라이웨이트 패턴 설계를 해서 같은 문자열은 한번만 저장한다.
```java
String s1 = "asdf";
String s2 = "asdf";
System.out.println(s1 == s2); // true : 즉 가리키는 pointer가 같다.
```

### 플라이웨이트, 캐시, 오브젝트 풀의 차이
#### 플라이웨이트 - 캐시
* 플라이웨이트 패턴은 팩터리 클래스를 사용하여 생성된 객체를 캐싱한다.
* 여기서 캐시는 실제로 저장소를 의미하고, 일반적으로 언급하는 캐시는 재사용을 위한 것이 아닌 주로 액세스 효율성 개선을 위한 것이다.
#### 플라이웨이트 패턴 - 오브젝트 풀
* 풀링과 플라이웨이트 패턴 모두 재사용을 위한 것이지만 의미가 조금 다르다.
  * 풀링은 반복 사용(생성 시간을 절약), 플라이웨이트는 공동 사용(메모리 공간을 절약)이다.
  