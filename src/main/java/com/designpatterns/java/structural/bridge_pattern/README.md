# 브리지 패턴
> Decouple an abstraction from its implementation so that thew true can vary independently
* 클래스에 독립적으로 변하는 두 개 또는 그 이상의 차원이 존재하고, 합성 메서드를 통해 이 클래스를 두개 또는 그 이상의 차원으로 확장할 수 있다.
* 브리지 패턴은 하나의 클래스에 Component들을 가지게 하는 것과 같다. 
  * 그래서 여러 Component들의 조합을 구현하기 위해 M*N개의 Class를 구현하는 것이 아닌 M+N개의 클래스만 구현하면 된다.