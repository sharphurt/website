package net.catstack.website.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ShortGameInformationDto {

    private String title;
    private String description;
    private String imageUrl;
    private String imageAlt;
    private List<String> gamePlatforms;
    private String gameUrl;
}
