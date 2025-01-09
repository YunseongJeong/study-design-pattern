package com.designpatterns.java.creational.factory_pattern.factory_method_pattern;

import com.designpatterns.java.creational.factory_pattern.products.IProduct;
import com.designpatterns.java.creational.factory_pattern.products.ProductA;

public class ProductAMethodFactory implements IMethodFactory {
    @Override
    public IProduct createProduct() {
        return new ProductA();
    }
}
