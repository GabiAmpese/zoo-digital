package br.edu.atitus.gabriela_ampese.zoo_digital.animais;

import br.edu.atitus.gabriela_ampese.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.gabriela_ampese.zoo_digital.especies.Reptil;

public final class Lagarto extends Reptil implements Corrida {

    public Lagarto(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("insetos");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está fazendo sons baixos!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo rapidamente entre as pedras!");
    }

}