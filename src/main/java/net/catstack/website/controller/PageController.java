package net.catstack.website.controller;

import lombok.RequiredArgsConstructor;
import net.catstack.website.dto.ShortGameInformationDto;
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
                "News HEader", "Новостить описание новости", "12 апреля 2023", "https://kakogo-chisla.ru/wp-content/uploads/2022/06/Den-morskoj-svinki.jpeg", "Морская свинка", "/fjsodjsodjs"
        );

        var gameCard = new ShortGameInformationDto(
                "News HEader", "Новостить описание новости", "https://kakogo-chisla.ru/wp-content/uploads/2022/06/Den-morskoj-svinki.jpeg", "Морская свинка", List.of("google-play", "steam"), "/dsodjsodjsodj"
        );
        var gameCard1 = new ShortGameInformationDto(
                "News HEader", "Новостить описание новости", "https://kakogo-chisla.ru/wp-content/uploads/2022/06/Den-morskoj-svinki.jpeg", "Морская свинка", List.of("steam"), "/dsodjsodjsodj"
        );


        model.addAttribute("news", List.of(newsCard, newsCard, newsCard));
        model.addAttribute("games", List.of(gameCard, gameCard1, gameCard));

        return "index";
    }

}
