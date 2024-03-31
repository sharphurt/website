package net.catstack.website.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ShortNewsInformationDto {

    private String title;
    private String description;
    private String publicationDate;
    private String imageUrl;
    private String imageAlt;
    private String newsUrl;
}
