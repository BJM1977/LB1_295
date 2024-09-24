package ch.csbe.productmanager.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("playground")
public class PlaygroundController {

    //http://localhost:8080/playground/hello-world
    @GetMapping("hello-world")
    public String helloWorld(){
        return "Hello Java Spring Boot";
    }
}