package com.primeirotrampodev.exercicioClasseProdutoTipo.Service;

import com.primeirotrampodev.exercicioClasseProdutoTipo.Entidade.Categoria;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    private Categoria getCategoria1() {

        Categoria categoria1 = new Categoria();

        categoria1.setId(1);
        categoria1.setNome("Comida");

        return categoria1;

    }

    private Categoria getCategoria2() {

        Categoria categoria2 = new Categoria();

        categoria2.setId(1);
        categoria2.setNome("Moda");

        return categoria2;
    }

    private Categoria getCategoria3() {

        Categoria categoria3 = new Categoria();

        categoria3.setId(1);
        categoria3.setNome("Tênis");

        return categoria3;

    }

    private Categoria getCategoria4() {

        Categoria categoria4 = new Categoria();

        categoria4.setId(1);
        categoria4.setNome("Carro");

        return categoria4;
    }

    private Categoria getCategoria5() {

        Categoria categoria5 = new Categoria();

        categoria5.setId(1);
        categoria5.setNome("Furadeira");


        return categoria5;
    }

    public Categoria buscarCategoriaPorId(Integer id){

        if(id.equals(1)){
            return getCategoria1();
        } else if (id.equals(2)) {
            return getCategoria2();
        } else if (id.equals(3)) {
            return getCategoria3();
        } else if (id.equals(4)) {
            return getCategoria4();
        } else if (id.equals(5)) {
            return getCategoria5();
        }else{
            return new Categoria();
        }

    }
}