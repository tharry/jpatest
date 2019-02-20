package eu.axinite.jpatest.service;

import eu.axinite.jpatest.model.Player;
import eu.axinite.jpatest.repo.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class SoccerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private SoccerService self;

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void plainTest() {
        Player player = new Player();

        player.setName("test1");
        playerRepository.save(player);

        Player player2 = playerRepository.findOne(player.getId());

        em.flush();

        Player player3 = playerRepository.findOne(player.getId());

        em.clear();

        Player player4 = playerRepository.findOne(player.getId());

        System.out.println("done");
    }


}
