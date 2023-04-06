
package com.primeirotrampodev.exercicioClasseProdutoTipo.Service;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.primeirotrampodev.exercicioClasseProdutoTipo.Entidade.Produto;
import com.primeirotrampodev.exercicioClasseProdutoTipo.Entidade.Tipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.primeirotrampodev.exercicioClasseProdutoTipo.Service.CategoriaService;
@Service
public class ProdutoService {


    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private TipoService tipoService;

  public Produto getProduto(String nome, Double preco,Integer categoriaId, Integer tipoId) {

        Produto produto = new Produto();

        Tipo tipo = new Tipo();

        produto.setNome(nome);
        produto.setPreço(preco);
        produto.setCategoria(categoriaService.buscarCategoriaPorId(categoriaId));

        produto.setTipo(tipoService.buscarTipoPorId(tipoId));

        return produto;
    }
}