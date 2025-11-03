package io.github.lcmdev.lcompras.clientes.repository;

import io.github.lcmdev.lcompras.clientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
