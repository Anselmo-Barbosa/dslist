package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repository.GameListRepository;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//A anotação @Service indica que essa classe de serviços faz parte do sistema
@Service
public class GameListService {

    //Services está chamando Repository (Injeytando dependencia)
    //ou seja, é uma conecção com a camada inferior por meio de um estanciamento
    @Autowired
    private GameListRepository gameListRepository ;

    //Diz pro DP que essa é uma operação apenas de leitura
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(e -> new GameListDTO(e)).toList();
    }

}
