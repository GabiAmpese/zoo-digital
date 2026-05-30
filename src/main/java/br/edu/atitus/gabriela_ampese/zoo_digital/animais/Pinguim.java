package br.edu.atitus.gabriela_ampese.zoo_digital.animais;
import br.edu.atitus.gabriela_ampese.zoo_digital.comportamentos.Nado;
import br.edu.atitus.gabriela_ampese.zoo_digital.especies.Ave;

public class Pinguim extends Ave implements Nado {

    public Pinguim(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("peixes");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está grasnando");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando atrás de peixes");
    }
    
}