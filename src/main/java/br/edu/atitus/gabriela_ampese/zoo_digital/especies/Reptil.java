package br.edu.atitus.gabriela_ampese.zoo_digital.especies;

public abstract class Reptil extends Animal {

    public Reptil(String nome, Integer idade, Boolean temEscamas) {
        super(nome, "Réptil", idade);
        this.temEscamas = temEscamas;
    }

    private Boolean temEscamas;

    public Boolean getTemEscamas() {
        return temEscamas;
    }

    public void setTemEscamas(Boolean temEscamas) {
        this.temEscamas = temEscamas;
    }

    public void trocarPele() {
        IO.println(this.getNome() + " está trocando de pele.");
    }

}