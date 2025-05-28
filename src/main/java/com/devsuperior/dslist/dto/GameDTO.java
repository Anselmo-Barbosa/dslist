package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import jakarta.persistence.*;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

public class GameDTO {

    private long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrL;
    private String shortDescription;
    private String longDescription;

    public GameDTO() {
    }

    public GameDTO(Game gameEntity) {
        this.id = gameEntity.getId();
        this.title = gameEntity.getTitle();
        this.genre = gameEntity.getGenre();
        this.year = gameEntity.getYear();
        this.platforms = gameEntity.getPlatforms();
        this.score = gameEntity.getScore();
        this.imgUrL = gameEntity.getImgUrL();
        this.longDescription = gameEntity.getLongDescription();
        this.shortDescription = gameEntity.getShortDescription();


        //OU (precisa de getters e setters
        //BeanUtils.copyProperties(gameEntity,this);

    }
    public long getId() {
        return id;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getImgUrL() {
        return imgUrL;
    }

    public Double getScore() {
        return score;
    }

    public String getPlatforms() {
        return platforms;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

}
