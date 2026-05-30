package br.edu.atitus.gabriela_ampese.zoo_digital.animais;

import br.edu.atitus.gabriela_ampese.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.gabriela_ampese.zoo_digital.comportamentos.Voo;
import br.edu.atitus.gabriela_ampese.zoo_digital.especies.Ave;

public final class Corvo extends Ave implements Voo, Predacao {

    public Corvo(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("insetos");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está grasnando!");
    }

    @Override
    public void voar() {
        IO.println(this.getNome() + " está voando pelos céus!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está procurando pequenos animais para capturar!");
    }
}