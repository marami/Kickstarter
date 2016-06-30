package ua.com.goit.gojava7.kickstarter.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionController {

    @RequestMapping("/error/404.html")
    public ModelAndView get404() {
        return new ModelAndView("404");
    }

    @RequestMapping("/error/500.html")
    public ModelAndView get500(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("500");
        modelAndView.addObject("status", request.getAttribute("javax.Servlet.error.status_code"));
        modelAndView.addObject("reason", request.getAttribute("javax.Servlet.error.message"));
        return modelAndView;
    }
}
