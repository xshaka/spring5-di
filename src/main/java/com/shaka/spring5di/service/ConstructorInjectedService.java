package com.shaka.spring5di.service;

import com.shaka.spring5di.component.PeopleGreeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedService {

    private PeopleGreeter greeter;

    @Autowired
    public ConstructorInjectedService(PeopleGreeter greeter) {
        this.greeter = greeter;
    }

    public String greet() {
        return greeter.sayHello();
    }
}
