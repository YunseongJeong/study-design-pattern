# 반복자 패턴
반복자 패턴은 커서 패턴이라고도한다. 컬렉션을 정해진 순서대로 가져올 때 사용된다. (컬렉션 : Array, Linked List, Tree, Graph, Jump Table)
* 반복자 패턴은 컬렉션의 순회 작업을 컬렉션에서 분리한 후, 반복자에 넣어 컬렉션과 반복자의 책임이 단일하게 되도록 한다.

#### 반복자의 문제
* 반복자는 생성된 이후에 Collection에 변경 사항이 생겼을 때, 의도하지 않은 방향으로 실행 될 수 있다. 
* 해결
  1. 순회 중에 삭제, 추가를 불가능하도록 한다.
  2. 요소를 삭제하거나, 추가 후에 Collection에 오류를 보고한다.
     * 변경 사항이 있는지 알기 위해 mod count를 사용한다. (변경 사항이 생길 때마다 1을 더한다.)


### 스냅숏 기능을 지원하는 반복자
* 스냅숏이란?
  * 스냅숏은 원본 컬렉션의 복사본을 의미한다.
  * 원본 컬렉션의 요소가 추가되거나 삭제되더라도 스냅숏은 변경되지 않는다.
  * 구현
    * 복사본 기반
      * 말 그대로 스냅숏 반복자를 생성할 때마다 복사본을 만든다.
    * timestamp 기반
      * addTimestamp와 delTimestamp, snapshotTimestamp를 통해서 snapshotTimestamp가 찍힐 때의 collection을 복원해서 보여준다.