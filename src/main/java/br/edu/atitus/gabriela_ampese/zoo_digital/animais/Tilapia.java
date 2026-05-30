package br.edu.atitus.gabriela_ampese.zoo_digital.animais;

import br.edu.atitus.gabriela_ampese.zoo_digital.comportamentos.Nado;
import br.edu.atitus.gabriela_ampese.zoo_digital.especies.Peixe;

public final class Tilapia extends Peixe implements Nado {

    public Tilapia(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override
    public void comer() {
        this.comer("algas");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está borbulhando");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando pelo açude");
    }

}