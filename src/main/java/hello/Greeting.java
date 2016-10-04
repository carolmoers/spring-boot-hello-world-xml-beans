package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class Greeting {

    private static final String template = "Hello, %s. This page has been visited %d times!";

    @Autowired
    private Counter counter;

    public String greeting(String name) {
        return String.format(template, name, counter.counter());
    }
}
