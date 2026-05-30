package br.edu.atitus.gabriela_ampese.zoo_digital.animais;

import br.edu.atitus.gabriela_ampese.zoo_digital.comportamentos.Nado;
import br.edu.atitus.gabriela_ampese.zoo_digital.especies.Reptil;

public final class Tartaruga extends Reptil implements Nado {

    public Tartaruga(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("algas");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está fazendo sons suaves!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando calmamente pelo lago!");
    }

}