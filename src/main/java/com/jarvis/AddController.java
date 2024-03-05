package com.jarvis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("value1") int i, @RequestParam("value2") int j){
        AddServices service = new AddServices();
        int k = service.add(i,j);
        ModelAndView view = new ModelAndView();
        view.setViewName("display.jsp");
        view.addObject("sum",k);
        return view;
    }
}
