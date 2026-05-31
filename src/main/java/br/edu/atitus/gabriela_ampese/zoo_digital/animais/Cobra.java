package br.edu.atitus.gabriela_ampese.zoo_digital.animais;

import br.edu.atitus.gabriela_ampese.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.gabriela_ampese.zoo_digital.especies.Reptil;

public final class Cobra extends Reptil implements Predacao {

    public Cobra(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("roedores");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está sibilando!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando um rato pequeninho!");
    }

}