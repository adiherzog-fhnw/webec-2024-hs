package com.fhnw.webec.converter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConverterController {

    @GetMapping("convert")
    public String convert(Double inches, Model model) {

        if (inches != null) {
            var cm = inches * 2.54;
            int cmOnly = (int) Math.floor(cm);
            int mm = (int) Math.round((cm - cmOnly) * 10);

            model.addAttribute("cm", cmOnly);
            model.addAttribute("mm", mm);
            model.addAttribute("inches", inches);
        }

        return "converter";
    }
}
