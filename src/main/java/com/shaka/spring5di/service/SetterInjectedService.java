package com.shaka.spring5di.service;

import com.shaka.spring5di.component.PeopleGreeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedService {

    private PeopleGreeter greeter;

    @Autowired
    public void setGreeter(PeopleGreeter greeter) {
        this.greeter = greeter;
    }

    public String greet() {
        return greeter.sayHello();
    }
}