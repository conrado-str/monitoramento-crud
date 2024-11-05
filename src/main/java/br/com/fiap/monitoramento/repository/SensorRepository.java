package br.com.fiap.monitoramento.repository;


import br.com.fiap.monitoramento.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SensorRepository extends JpaRepository<Sensor, Long> {

    public Optional<Sensor> findById(Long id);

}
