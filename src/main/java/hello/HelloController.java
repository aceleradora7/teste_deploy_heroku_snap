package hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Hello World";
    }

    @RequestMapping(value = "/hi", params = {"name"})
    @ResponseBody
    public String hi( @RequestParam(value="name") String value){
        return "Hi, " + value;
    }

}
