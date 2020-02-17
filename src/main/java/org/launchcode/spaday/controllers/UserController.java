package org.launchcode.spaday.controllers;

import org.launchcode.spaday.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class UserController {

    @GetMapping()
    public String displayAddUserForm(Model model){
        model.addAttribute("");
        return "user/add";
    }

    @PostMapping()
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify){

    }
}
