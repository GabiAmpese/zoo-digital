package br.edu.atitus.gabriela_ampese.zoo_digital.animais;

import br.edu.atitus.gabriela_ampese.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.gabriela_ampese.zoo_digital.especies.Mamifero;

public final class Cavalo extends Mamifero implements Corrida {

    public Cavalo(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("ração e pasto");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está relinchando!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está galopando muito rápido!");
    }
}