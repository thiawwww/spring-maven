import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
public class DockerDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }
}

@RestController
class HelloWorldController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello, World!";
    }
}
