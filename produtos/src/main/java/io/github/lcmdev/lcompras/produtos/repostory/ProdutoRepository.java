package io.github.lcmdev.lcompras.produtos.repostory;

import io.github.lcmdev.lcompras.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
