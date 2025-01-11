# 어댑터 패턴
어댑터 패턴은 그 이름과 같이 조정에 따른 적응에 사용된다. 
호환되지 않는 인터페이스를 호환 가능한 인터페이스로 변환하여, 두 클래스를 함께 작동할 수 잇게 한다.
* 구현 방식
  * 클래스 어댑터
    * 상속 관계를 사용
      * Adaptee와 ITarget 인터페이스의 정의가 대부분 같다면 클래스 어댑터의 코드 길이가 줄어든다.
  * 객체 어댑터
    * 합성 관계를 사용
      * 클래스 어댑터에 비해 더욱 유연하게 대응 가능하다.