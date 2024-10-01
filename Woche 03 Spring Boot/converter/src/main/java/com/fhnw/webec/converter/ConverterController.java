package com.fhnw.webec.converter;

import com.fhnw.webec.converter.data.ImperialLength;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ConverterController {

    @GetMapping("convert")
    public String convert(@ModelAttribute ImperialLength input, Model model) {

        if (input.hasValue()) {
            var metricLength = input.toMetricLength();

            model.addAttribute("cm", metricLength.cm());
            model.addAttribute("mm", metricLength.mm());
            model.addAttribute("input", input);
        }

        return "converter";
    }
}
