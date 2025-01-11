# 데커레이터 패턴

## JAVA IO 라이브러리의 기본 설계 분석
### Java IO 라이브러리 사용 방법
* java의 io 라이브러리의 구조는 수 많은 쓰기와 읽기를 담당하는 클래스들로 구성되어있다. 
  * 바이트 스트림 - InputStream, OutputStream
  * 문자열 스트임 - Reader, Writer
* 사용 예시
    ```
    InputStream in = new FileInputStream("test.txt");
    InputStream bin = new BufferedInputStream(in);
    byte[] data = new byte[128];
    while (bin.read(data) != -1) {
    ...
    }
  ```
  위 코드와 같이 두개의 InputStream으로 불편하게 수행해야한다.
### 상속 기반 설계
* Java io 라이브러리는 상속을 사용하게 되면 크기가 너무 커지기에 상속이 아닌 합성을 사용한다.
  * 모든 Stream에 Buffered...Stream이 아닌 하나의 Buffered..Stream을 함께 사용하도록하는 것이다.
  * 즉 상속 구조가 너무 복잡해서 상속 관계를 합성 관계로 바꾸어 문제를 해결한 것이다.
## 데커레이터 패턴이란?
* 위의 IO 라이브러리처럼 상속을 합성으로 대체한 것이라 볼 수 있다.
* 데커레이터 클래스가 원본 클래스와 동일한 상위 클래스를 상속하기 때문에 원본 클래스 내에 여러개의 데커레이터 클래스를 중첩할 수 있다.
* 또한 데커레이터 클래스의 기능이 원본 클래스의 기능을 향상 시킨다.