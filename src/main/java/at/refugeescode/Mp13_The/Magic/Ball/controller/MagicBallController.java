package at.refugeescode.Mp13_The.Magic.Ball.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MagicBallController {

    @ModelAttribute("sentance1")
    String say(){
        return "I ammmmmmmmmmm sarah";
    }

    @GetMapping
    String page(Model model) {
        model.addAttribute("sentance", "Sarah is here");
        return "magicBall";
    }
}
