package com.example.myapp2;

import com.example.myapp2.TextForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TextController {

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("textForm", new TextForm());
        return "index";
    }

    @PostMapping("/process")
    public String processForm(@ModelAttribute TextForm textForm, Model model) {
        String reversedText = new StringBuilder(textForm.getText()).reverse().toString();
        model.addAttribute("reversedText", reversedText);
        return "result";
    }
}