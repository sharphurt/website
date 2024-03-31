package net.catstack.website.controller;

import lombok.RequiredArgsConstructor;
import net.catstack.website.dto.ShortNewsInformationDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PageController {

    @GetMapping(value = {"/", "/index"})
    public String getIndexPage(Model model) {
        var newsCard = new ShortNewsInformationDto(
                "uuid122333", "News HEader", "Новостить описание новости", "12 апреля 2023", "https://kakogo-chisla.ru/wp-content/uploads/2022/06/Den-morskoj-svinki.jpeg", "Морская свинка", "/fjsodjsodjs"
        );

        model.addAttribute("news", List.of(newsCard, newsCard, newsCard));


        return "index";
    }

}
