package com.designpatterns.java.creational.factory_pattern;

import com.designpatterns.java.creational.factory_pattern.products.IProduct;
import com.designpatterns.java.creational.factory_pattern.products.ProductA;
import com.designpatterns.java.creational.factory_pattern.products.ProductB;

import java.util.HashMap;
import java.util.Map;

// 단순 팩터리 패턴이다.
// 보통 팩터리 클래스명의 맨 뒤엔 Factory를 붙인다.
public class SimpleFactory {
    // 팩터리 클래스에서 객체를 생성하는 메서드의 이름은 보통 create로 시작한다.
    public static IProduct createProduct(Character c){
        if (c.equals('A')){
            return new ProductA();
        } else if (c.equals('B')) {
            return new ProductB();
        }
        return null;
    }

    // 아래와 같이 Products를 캐싱할 수도 있다.
    private static final Map<Character, IProduct> cachedProducts = new HashMap<>();
    static {
        cachedProducts.put('A', new ProductA());
        cachedProducts.put('B', new ProductB());
    }

    public static IProduct createCachedProduct(Character c){
        IProduct product = cachedProducts.get(c);
        return product;
    }
}
