package net.catstack.website.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ShortNewsInformationDto {

    private String uuid;
    private String header;
    private String description;
    private String publicationDate;
    private String imageUrl;
    private String imageAlt;
    private String newsUrl;
}
