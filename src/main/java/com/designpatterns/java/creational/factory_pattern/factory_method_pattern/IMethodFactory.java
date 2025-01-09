package com.designpatterns.java.creational.factory_pattern.factory_method_pattern;

import com.designpatterns.java.creational.factory_pattern.products.IProduct;

// 팩터리 메서드 패턴은 다음과 같이 인터페이스로 Factory를 정의하고 구체화 시키는 방식이다.
// 더욱 단순 팩터리 패턴보다 확장성이 좋다.
// 과도한 설계라고 보일 수 있겠지만 복잡한 생성 로직이 들어간다고 생각하면 이해가 된다.
public interface IMethodFactory {
    IProduct createProduct();
}
