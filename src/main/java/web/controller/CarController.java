package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.UserService;


@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCars(@RequestParam(required = false) Integer count, ModelMap model){
        UserService userService = new UserService();
        model.addAttribute("cars", userService.getCars(count));
        return "cars";
    }

}
