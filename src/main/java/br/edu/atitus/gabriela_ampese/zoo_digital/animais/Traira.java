package br.edu.atitus.gabriela_ampese.zoo_digital.animais;
import br.edu.atitus.gabriela_ampese.zoo_digital.comportamentos.Nado;
import br.edu.atitus.gabriela_ampese.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.gabriela_ampese.zoo_digital.especies.Peixe;

public class Traira extends Peixe implements Nado {

    public Traira(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override
    public void comer() {
        this.comer("lambaris");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está borbulhando");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando no rio");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está caçando com a tática de emboscada");
    }
}