package eu.axinite.jpatest.service;

import eu.axinite.jpatest.model.Player;
import eu.axinite.jpatest.repo.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class SoccerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private SoccerService self;

    @Transactional
    public void plainTest() {
        Player player = new Player();

        player.setName("test1");
        playerRepository.save(player);

        Player player2 = playerRepository.findOne(player.getId());

        player2.setName("test2");

    }


}
