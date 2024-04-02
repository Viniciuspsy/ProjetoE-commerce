package br.senai.fatesg.ecommerce.ecommerceVinicius.repository;

import br.senai.fatesg.ecommerce.ecommerceVinicius.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository  extends JpaRepository<Endereco, Integer> {
}
