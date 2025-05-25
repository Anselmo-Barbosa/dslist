package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

//Classe que faz dupla referencia(relacionamento) entre Game e Gamelist
@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;

    public Belonging() {
    }

    public BelongingPK getId() {
        return id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Belonging(Game game, GameList list, Integer position) {
        this.id.setGame(game);
        this.id.setGameList(list);
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
