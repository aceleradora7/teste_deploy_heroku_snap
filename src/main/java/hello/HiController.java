package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class HiController {

    @RequestMapping("/")
    public String index(){

        return "index";

    }

    @RequestMapping("/hi")
    public String hi( @RequestParam(value="name", required = false, defaultValue = "World") String name, Model model){
        model.addAttribute("name", name);
        return "hi";
    }



}


