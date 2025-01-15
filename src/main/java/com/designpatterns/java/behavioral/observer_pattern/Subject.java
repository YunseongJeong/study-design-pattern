package com.designpatterns.java.behavioral.observer_pattern;

// observable 인터페이스
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
