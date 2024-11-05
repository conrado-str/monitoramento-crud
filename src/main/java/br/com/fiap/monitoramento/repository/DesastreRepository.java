package br.com.fiap.monitoramento.repository;

import br.com.fiap.monitoramento.model.Desastre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DesastreRepository extends JpaRepository<Desastre, Long> {

    public Desastre findByNome(String nome);

}
