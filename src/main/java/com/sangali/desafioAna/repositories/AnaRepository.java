package com.sangali.desafioAna.repositories;

import com.sangali.desafioAna.domain.TabelaAna;
import org.springframework.data.repository.CrudRepository;

public interface AnaRepository extends CrudRepository<TabelaAna, Long>
{
}
