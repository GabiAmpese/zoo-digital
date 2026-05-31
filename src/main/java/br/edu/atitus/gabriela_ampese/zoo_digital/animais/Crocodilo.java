package br.edu.atitus.gabriela_ampese.zoo_digital.animais;

import br.edu.atitus.gabriela_ampese.zoo_digital.comportamentos.Nado;
import br.edu.atitus.gabriela_ampese.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.gabriela_ampese.zoo_digital.especies.Reptil;

public final class Crocodilo extends Reptil implements Nado, Predacao {

    public Crocodilo(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("peixes");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está rugindo!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando silenciosamente no rio!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está escondido, esperando sua presa na margem do rio!");
    }
}