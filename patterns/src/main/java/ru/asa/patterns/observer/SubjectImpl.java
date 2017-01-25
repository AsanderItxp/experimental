package ru.asa.patterns.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * ========== ItCorp v. 1.0 class library ==========
 * <p/>
 * http://www.it.ru/
 * <p/>
 * &copy; Copyright 1990-2016, by ItCorp.
 * <p/>
 * ========== SubjectImpl.java ==========
 * <p/>
 * $Revision:  $<br/>
 * $Author:  $<br/>
 * $HeadURL:  $<br/>
 * $Id:  $
 * <p/>
 * 25.01.2017 18:39: Original version (AAVolkov)<br/>
 */
public class SubjectImpl implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index>0){
            observers.remove(observer);
        }
    }

    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update();
        }
    }

    // Изменение состояния
    public void changeState(){
        notifyObservers();
    }
}
