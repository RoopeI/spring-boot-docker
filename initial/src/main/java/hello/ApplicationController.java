package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @RequestMapping("/")
    public String index() {
        return "Hello, hello\n";
    }

    @RequestMapping("/{name}")
    public String sayHello(@PathVariable String name) {

        return "Hello " + name + "\n";
    }

}
