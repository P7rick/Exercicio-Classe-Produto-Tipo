package com.primeirotrampodev.exercicioClasseProdutoTipo.Service;

import com.primeirotrampodev.exercicioClasseProdutoTipo.Entidade.Tipo;
import org.springframework.stereotype.Service;

@Service
public class TipoService {
    public Tipo tipoDeProduto1() {

        Tipo tipo1 = new Tipo();

        tipo1.setId(1);
        tipo1.setNome("Alimento");

        return tipo1;
    }

    public Tipo tipoDeProduto2() {

        Tipo tipo2 = new Tipo();

        tipo2.setId(1);
        tipo2.setNome("Vestuário");

        return tipo2;

    }

    public Tipo tipoDeProduto3() {

        Tipo tipo3 = new Tipo();

        tipo3.setId(1);
        tipo3.setNome("Calçado");

        return tipo3;
    }

    public Tipo tipoDeProduto4() {

        Tipo tipo4 = new Tipo();

        tipo4.setId(1);
        tipo4.setNome("Veiculo");

        return tipo4;
    }

    public Tipo tipoDeProduto5() {

        Tipo tipo5 = new Tipo();

        tipo5.setId(1);
        tipo5.setNome("Ferramenta");

        return tipo5;
    }

    public Tipo buscarTipoPorId(Integer id) {

        if(id.equals(1)){
            return tipoDeProduto1();
        } else if (id.equals(2)) {
            return tipoDeProduto2();
        } else if (id.equals(3)) {
            return tipoDeProduto3();
        } else if (id.equals(4)) {
            return tipoDeProduto4();
        } else if (id.equals(5)) {
            return tipoDeProduto5();
        }else{
            return new Tipo();
        }

    }
}
