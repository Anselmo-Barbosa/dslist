package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Classe DTO serve para apresentar apenas informações necessárias no front, não todas as infos do BD
public class GameMinDTO {

    private long id;
    private String title;
    private Integer year;
    private String imgUrL;
    private String shortDescription;

    public GameMinDTO(){
    }

    //Tansforma um game entidade em um game dto
    public GameMinDTO(Game gameEntity) {
        id = gameEntity.getId();
        title = gameEntity.getTitle();
        year = gameEntity.getYear();
        imgUrL = gameEntity.getImgUrL();
        shortDescription = gameEntity.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrL() {
        return imgUrL;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}

