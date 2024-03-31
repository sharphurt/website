package net.catstack.website.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.hibernate.sql.ast.SqlTreeCreationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class PageController {

    @GetMapping(value = {"/", "/index"})
    public String getIndexPage() {
        return "index";
    }

}
