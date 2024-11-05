package br.com.fiap.monitoramento.service;


import br.com.fiap.monitoramento.model.Sensor;
import br.com.fiap.monitoramento.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SensorService {

    @Autowired
    private SensorRepository sensorRepository;

    public Sensor adiconar(Sensor sensor){
        return sensorRepository.save(sensor);
    }

    public Sensor buscarPorId(Long id){
        Optional<Sensor> sensorOpicional = sensorRepository.findById(id);
        if (sensorOpicional.isPresent()){
            return sensorOpicional.get();
        }else {
            throw new RuntimeException("Sensor nao encontrado");
        }
    }

    public List<Sensor> listarSensores(){
        return sensorRepository.findAll();
    }

    public void excluir(Long id){
        Optional<Sensor> sensorOptional = sensorRepository.findById(id);

        if (sensorOptional.isPresent()){
            sensorRepository.delete(sensorOptional.get());
        } else{
            throw new RuntimeException("Sensor nao encontrado");
        }
    }

    public Sensor atualizar(Sensor sensor){
        Optional<Sensor> sensorOptional = sensorRepository.findById(sensor.getId());

        if (sensorOptional.isPresent()){
            return sensorRepository.save(sensor);
        } else{
            throw new RuntimeException("Nao existe esse sensor");
        }
    }
}
