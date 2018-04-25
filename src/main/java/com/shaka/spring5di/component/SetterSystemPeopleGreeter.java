package com.shaka.spring5di.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("setter")
public class SetterSystemPeopleGreeter implements PeopleGreeter {

    private String helloMessage;

    @Autowired
    public SetterSystemPeopleGreeter(@Value("#{systemProperties['message']}") String helloMessage) {
        this.helloMessage = helloMessage;
    }

    @Override
    public String sayHello() {
        return helloMessage;
    }
}
