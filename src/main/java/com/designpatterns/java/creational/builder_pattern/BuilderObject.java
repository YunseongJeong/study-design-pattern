package com.designpatterns.java.creational.builder_pattern;

public class BuilderObject {
    private int a; // 필요
    private int b; // 선택
    private int c1; // c1, c2 둘 다 설정해야함
    private int c2;
    private int d1; // d1, d2 둘 중에 하나만 설정해야함
    private int d2;

    private BuilderObject(BuilderObject.Builder builder){
        a = builder.a;
        b = builder.b;
        c1 = builder.c1;
        c2 = builder.c2;
        d1 = builder.d1;
        d2 = builder.d2;
    }

   // static nested class인 Builder를 통해서 인자를 setter로 입력 받고 build() 메서드에서 객체를 생성한다.
    public static class Builder {
        private static final int DEFAULT_VALUE = 0;

        private int a = DEFAULT_VALUE;
        private boolean isASetted = false;
        private int b = DEFAULT_VALUE;
        private int c1 = DEFAULT_VALUE;
        private boolean isC1Setted = false;
        private int c2 = DEFAULT_VALUE;
        private boolean isC2Setted = false;
        private int d1 = DEFAULT_VALUE;
        private boolean isD1Setted = false;
        private int d2 = DEFAULT_VALUE;
        private boolean isD2Setted = false;

        public BuilderObject build(){
            if (isASetted && (isC1Setted == isC2Setted) && (isD1Setted ^ isD2Setted)){ // 무결성 로직 검사
                throw new IllegalArgumentException();
            }
            return new BuilderObject(this);
        }

        // 다른 Setter는 생략
        public BuilderObject.Builder setA(int a){
            isASetted = true;
            this.a = a;
            return this;
        }
    }
}
