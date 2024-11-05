package br.com.fiap.monitoramento.service;


import br.com.fiap.monitoramento.model.Alerta;
import br.com.fiap.monitoramento.model.Desastre;
import br.com.fiap.monitoramento.repository.DesastreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DesastreService {

    @Autowired
    private DesastreRepository desastreRepository;

    public Desastre adicionar(Desastre desastre){
        return desastreRepository.save(desastre);
    }

    public Desastre buscarPorId(Long id){
        Optional<Desastre> desastreOptional = desastreRepository.findById(id);

        if(desastreOptional.isPresent()){
            return desastreOptional.get();
        }else {
            throw new RuntimeException("Desastre nao encontrado");
        }
    }

    public List<Desastre> listarAlertas(){
        return desastreRepository.findAll();
    }

    public void excluir(Long id){
        Optional<Desastre> desastreOptional = desastreRepository.findById(id);

        if (desastreOptional.isPresent()){
            desastreRepository.delete(desastreOptional.get());
        } else{
            throw new RuntimeException("Desastre nao encontrado");
        }
    }


}
