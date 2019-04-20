package dx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerDemo01 {

    @RequestMapping("/hello")
    public String sayHellow(){
        System.out.println("DEMO01控制器执行了");

        return "success";
    }
}
