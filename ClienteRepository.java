package com.avaliacao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avaliacao.Entity.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

}
