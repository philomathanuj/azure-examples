package az.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    @RequestMapping("/")
    public String home() {
        return "Hello Docker World For Azure";
    }
}
