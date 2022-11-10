package com.sangali.desafioAna.bootstrap;

import com.sangali.desafioAna.domain.TabelaAna;
import com.sangali.desafioAna.repositories.AnaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.Flow;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AnaRepository anaRepository;

    public BootStrapData(AnaRepository anaRepository) {
        this.anaRepository = anaRepository;

    }

    @Override
    public void run(String... args) throws Exception {

        TabelaAna tabelaAna1 = new TabelaAna();

        tabelaAna1.setNome("Rodrigo");
        tabelaAna1.setConta(1);
        tabelaAna1.setBandeira(1);

        anaRepository.save(tabelaAna1);

        TabelaAna tabelaAna2 = new TabelaAna();
        tabelaAna2.setNome("Rodrigo");
        tabelaAna2.setConta(1);
        tabelaAna2.setBandeira(2);

        anaRepository.save(tabelaAna2);

        TabelaAna tabelaAna3 = new TabelaAna();
        tabelaAna3.setNome("Ana");
        tabelaAna3.setConta(1);
        tabelaAna3.setBandeira(1);

        anaRepository.save(tabelaAna3);

        TabelaAna tabelaAna4 = new TabelaAna();
        tabelaAna4.setNome("Ana");
        tabelaAna4.setConta(1);
        tabelaAna4.setBandeira(2);

        anaRepository.save(tabelaAna4);

        TabelaAna tabelaAna5 = new TabelaAna();
        tabelaAna5.setNome("Jose");
        tabelaAna5.setConta(1);
        tabelaAna5.setBandeira(1);

        anaRepository.save(tabelaAna5);

        TabelaAna tabelaAna6 = new TabelaAna();
        tabelaAna6.setNome("Maria");
        tabelaAna6.setConta(1);
        tabelaAna6.setBandeira(3);

        anaRepository.save(tabelaAna6);


        System.out.println("Tabela Ana count: " + anaRepository.count());

    }
}
