package com.shaka.spring5di.service;

import com.shaka.spring5di.component.PeopleGreeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedService {

    @Autowired
    private PeopleGreeter greeter;

    public String greet() {
        return greeter.sayHello();
    }
}
