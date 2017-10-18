package com.shaka.spring5di.component;

import com.shaka.spring5di.Greeter;
import org.springframework.stereotype.Component;

@Component
public class SimpleGreeter implements Greeter {

    @Override
    public String greet() {
        return "Hello world!!!";
    }
}
