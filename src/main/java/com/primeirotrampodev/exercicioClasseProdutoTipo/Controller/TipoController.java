package com.primeirotrampodev.exercicioClasseProdutoTipo.Controller;

import com.primeirotrampodev.exercicioClasseProdutoTipo.Entidade.Produto;
import com.primeirotrampodev.exercicioClasseProdutoTipo.Entidade.Tipo;
import com.primeirotrampodev.exercicioClasseProdutoTipo.Service.ProdutoService;
import com.primeirotrampodev.exercicioClasseProdutoTipo.Service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipo")
public class TipoController {
    @Autowired
    private TipoService tipoService;

    @Autowired
    private ProdutoService produtoService;

@GetMapping("/produto")
    public Produto getTipo(@RequestParam ("nomeProduto") String nomeProduto, @RequestParam ("precoProduto") Double precoProduto, @RequestParam ("categoriaId") Integer categoriaid,@RequestParam ("tipoId") Integer tipoId){

        return produtoService.getProduto(nomeProduto,precoProduto,categoriaid, tipoId);
    }

}
