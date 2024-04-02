package br.senai.fatesg.ecommerce.ecommerceVinicius.repository;

import br.senai.fatesg.ecommerce.ecommerceVinicius.model.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Integer> {
}
