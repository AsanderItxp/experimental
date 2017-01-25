package ru.asa.patterns.observer;

/**
 * ========== ItCorp v. 1.0 class library ==========
 * <p/>
 * http://www.it.ru/
 * <p/>
 * &copy; Copyright 1990-2016, by ItCorp.
 * <p/>
 * ========== ObserverImpl.java ==========
 * <p/>
 * $Revision:  $<br/>
 * $Author:  $<br/>
 * $HeadURL:  $<br/>
 * $Id:  $
 * <p/>
 * 25.01.2017 18:37: Original version (AAVolkov)<br/>
 */
public class ObserverImpl implements Observer{

    Subject subject;

    public ObserverImpl(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update() {
        //TODO SOME
    }
}
