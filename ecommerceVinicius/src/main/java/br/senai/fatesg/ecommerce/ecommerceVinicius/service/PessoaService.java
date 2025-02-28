package br.senai.fatesg.ecommerce.ecommerceVinicius.service;

import br.senai.fatesg.ecommerce.ecommerceVinicius.Interface.IService;
import br.senai.fatesg.ecommerce.ecommerceVinicius.model.Pessoa;
import br.senai.fatesg.ecommerce.ecommerceVinicius.repository.PessoaRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service //indica camada de serviço/negócio
public class PessoaService implements IService<Pessoa, Integer> {
    @Autowired //injeção de dependência
    private PessoaRepository pessoaRepository;


    @Override
    @Transactional
    public Pessoa create(Pessoa entity) {
        log.info("Acessando método PessoaService.create");
        log.debug("Valores recebidos: {}", entity);

        return pessoaRepository.save(entity);
    }

    @Override
    public List<Pessoa> read() {
        log.info("Acessando método PessoaResource.read()");

        List<Pessoa> lista = pessoaRepository.findAll();

        log.debug("Resultado da consulta: {} registros", lista.size());

        return lista;
    }

    @Override
    public Pessoa read(Integer id) {
        log.info("Acessando método PessoaResource.read(id)");
        log.debug("Valores recebidos: id = {}", id);
        //Pessoa pessoaEncontrado = pessoaRepository.findById(id);
        log.debug("Resultado da consulta: {} registros", 0);
        return null;
    }

    @Override
    @org.springframework.transaction.annotation.Transactional
    public Pessoa update(Integer id, Pessoa entity) {
        log.info("Acessando método PessoaService.update");
        log.debug("Valores recebidos - id: {}, entity: {}", id, entity);


        Optional<Pessoa> pessoaEncontrado = pessoaRepository.findById(id);
        if(pessoaEncontrado.isPresent()){
            pessoaRepository.save(entity);
        }

        return null;
    }

    @Override
    @org.springframework.transaction.annotation.Transactional
    public void delete(Integer id) {
        log.info("Acessando método delete");
        log.info("Valor recebido: {id}", id);

    }
}