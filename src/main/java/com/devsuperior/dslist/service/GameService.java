package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//A anotação @Service indica que essa classe de serviços faz parte do sistema
@Service
public class GameService {

    //Services está chamando Repository (Injeytando dependencia)
    //ou seja, é uma conecção com a camada inferior por meio de um estanciamento
    @Autowired
    private GameRepository gameReposity;

public List<GameMinDTO> findAll(){
    List<Game> result = gameReposity.findAll();
    return result.stream().map(e -> new GameMinDTO(e)).toList();
}
}
