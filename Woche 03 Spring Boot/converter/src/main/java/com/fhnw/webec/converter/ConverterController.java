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
            int cmValue = (int) Math.floor(cm);
            int mmValue = (int) Math.round((cm - cmValue) * 10);

            model.addAttribute("cm", cmValue);
            model.addAttribute("mm", mmValue);
            model.addAttribute("inches", inches);
        }

        return "converter";
    }
}
