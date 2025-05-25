package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.ManyToAny;

import java.util.Objects;

//Emcapsula dois atributos em uma so classe
@Embeddable
public class BelongingPK {
    //Faz o relacionamento
    @ManyToOne
    //Mapeia as chaves FK de game e gamelist para BelongingPK
    @JoinColumn(name = "game_id")
    private Game game;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;

    public BelongingPK(){}

    public BelongingPK(Game game, GameList gameList) {
        this.game = game;
        this.list = gameList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(game, that.game) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }

    public Game getGame() {
        return game;
    }

    public GameList getGameList() {
        return list;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setGameList(GameList gameList) {
        this.list = gameList;
    }
}
