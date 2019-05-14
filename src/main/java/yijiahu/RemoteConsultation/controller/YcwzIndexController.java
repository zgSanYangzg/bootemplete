package yijiahu.RemoteConsultation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("")
public class YcwzIndexController {

    @RequestMapping("/index")
    public String index(ModelMap map) {

        return "index";
    }
}
