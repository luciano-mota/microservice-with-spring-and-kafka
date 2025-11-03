package io.github.lcmdev.lcompras.produtos.service;

import io.github.lcmdev.lcompras.produtos.model.Produto;
import io.github.lcmdev.lcompras.produtos.repostory.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Optional<Produto> obterPorId(Long id) {
        return produtoRepository.findById(id);
    }
}
