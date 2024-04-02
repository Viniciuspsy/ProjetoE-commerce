package br.senai.fatesg.ecommerce.ecommerceVinicius.repository;

import br.senai.fatesg.ecommerce.ecommerceVinicius.model.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaJuridicaRepository  extends JpaRepository<PessoaJuridica, Integer> {
}
