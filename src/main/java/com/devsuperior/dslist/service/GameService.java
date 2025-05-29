package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repository.GameRepository;
import org.aspectj.util.LangUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

//A anotação @Service indica que essa classe de serviços faz parte do sistema
@Service
public class GameService {

    //Services está chamando Repository (Injeytando dependencia)
    //ou seja, é uma conecção com a camada inferior por meio de um estanciamento
    @Autowired
    private GameRepository gameReposity;

    //Diz pro BD que essa é uma operação apenas de leitura
@Transactional(readOnly = true)
public List<GameMinDTO> findAll(){
    List<Game> result = gameReposity.findAll();
    return result.stream().map(e -> new GameMinDTO(e)).toList();
}
//Metodo reservado da projection
@Transactional(readOnly = true)
public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameReposity.searchByList(listId);
        return result.stream().map(e -> new GameMinDTO(e)).toList();
    }

@Transactional(readOnly = true)
public GameDTO findById(Long id){
    Game result = gameReposity.findById(id).get();
    return new GameDTO(result);
}


}
