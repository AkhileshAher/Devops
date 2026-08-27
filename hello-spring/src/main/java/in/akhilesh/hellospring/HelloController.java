package in.akhilesh.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public Map<String,String> hello() throws Exception {
        String env = System.getenv().getOrDefault("ENV_VALUE","No Env set");
        String hostname = InetAddress.getLocalHost().getHostName();
        return Map.of("message","Hello from Simple App (Spring Boot)","env",env,"container",hostname);
    }
}
