package com.shaka.spring5di.component;

public interface PeopleGreeter {

    default String sayHello() {
        return "Hello world";
    }
}
