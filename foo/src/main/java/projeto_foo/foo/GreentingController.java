package projeto_foo.foo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreentingController {
    
    private static final String tempate = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong(0);

    @RequestMapping("/greenting")
    public Greeting greenting(@RequestParam(value = "nome", defaultValue = "word") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(tempate, name));
    }



}
