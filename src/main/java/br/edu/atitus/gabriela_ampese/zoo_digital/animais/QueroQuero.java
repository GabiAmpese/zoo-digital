package br.edu.atitus.gabriela_ampese.zoo_digital.animais;

import br.edu.atitus.gabriela_ampese.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.gabriela_ampese.zoo_digital.comportamentos.Voo;
import br.edu.atitus.gabriela_ampese.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.gabriela_ampese.zoo_digital.especies.Ave;

public final class QueroQuero extends Ave implements Corrida, Voo, Predacao {

    public QueroQuero(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("insetos");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está cantando quero-quero!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo pelo campo!");
    }

    @Override
    public void voar() {
        IO.println(this.getNome() + " está voando sobre a pastagem!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está procurando insetos para capturar!");
    }
}