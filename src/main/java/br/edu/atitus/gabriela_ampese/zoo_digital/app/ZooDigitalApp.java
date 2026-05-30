package br.edu.atitus.gabriela_ampese.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.atitus.gabriela_ampese.zoo_digital.animais.*;
import br.edu.atitus.gabriela_ampese.zoo_digital.comportamentos.*;
import br.edu.atitus.gabriela_ampese.zoo_digital.especies.Animal;

public class ZooDigitalApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Animal> animais = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n===== ZOO DIGITAL =====");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Listar Todos os Animais");
            System.out.println("3 - Listar Animais Corredores");
            System.out.println("4 - Listar Animais Nadadores");
            System.out.println("5 - Listar Animais Voadores");
            System.out.println("6 - Listar Animais Predadores");
            System.out.println("7 - Exibir Total de Animais");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    cadastrarAnimal(animais, scanner);
                    break;

                case 2:
                    listarAnimais(animais);
                    break;

                case 3:
                    listarCorredores(animais);
                    break;

                case 4:
                    listarNadadores(animais);
                    break;

                case 5:
                    listarVoadores(animais);
                    break;

                case 6:
                    listarPredadores(animais);
                    break;

                case 7:
                    System.out.println("Total de animais: " + Animal.getContador());
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarAnimal(List<Animal> animais, Scanner scanner) {

        System.out.println("\n=== CADASTRAR ANIMAL ===");
        System.out.println("1 - Cachorro");
        System.out.println("2 - Gato");
        System.out.println("3 - Cavalo");
        System.out.println("4 - Vaca");
        System.out.println("5 - Golfinho");
        System.out.println("6 - Pato");
        System.out.println("7 - Pinguim");
        System.out.println("8 - Corvo");
        System.out.println("9 - QueroQuero");
        System.out.println("10 - Lambari");
        System.out.println("11 - Tilapia");
        System.out.println("12 - Traira");
        System.out.println("13 - PeixeMorcego");
        System.out.println("14 - Cobra");
        System.out.println("15 - Crocodilo");
        System.out.println("16 - Lagarto");
        System.out.println("17 - Tartaruga");

        System.out.print("Escolha o animal: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        Animal animal = null;

        switch (tipo) {

            case 1:
                animal = new Cachorro(nome, idade);
                break;

            case 2:
                animal = new Gato(nome, idade);
                break;

            case 3:
                animal = new Cavalo(nome, idade);
                break;

            case 4:
                animal = new Vaca(nome, idade);
                break;

            case 5:
                animal = new Golfinho(nome, idade);
                break;

            case 6:
                System.out.print("Cor das penas: ");
                animal = new Pato(nome, idade, scanner.nextLine());
                break;

            case 7:
                System.out.print("Cor das penas: ");
                animal = new Pinguim(nome, idade, scanner.nextLine());
                break;

            case 8:
                System.out.print("Cor das penas: ");
                animal = new Corvo(nome, idade, scanner.nextLine());
                break;

            case 9:
                System.out.print("Cor das penas: ");
                animal = new QueroQuero(nome, idade, scanner.nextLine());
                break;

            case 10:
                animal = new Lambari(nome, idade);
                break;

            case 11:
                animal = new Tilapia(nome, idade);
                break;

            case 12:
                animal = new Traira(nome, idade);
                break;

            case 13:
                animal = new PeixeMorcego(nome, idade);
                break;

            case 14:
                animal = new Cobra(nome, idade);
                break;

            case 15:
                animal = new Crocodilo(nome, idade);
                break;

            case 16:
                animal = new Lagarto(nome, idade);
                break;

            case 17:
                animal = new Tartaruga(nome, idade);
                break;

            default:
                System.out.println("Animal inválido.");
        }

        if (animal != null) {
            animais.add(animal);
            System.out.println("Animal cadastrado com sucesso!");
        }
    }

    private static void listarAnimais(List<Animal> animais) {

        System.out.println("\n=== TODOS OS ANIMAIS ===");

        for (Animal animal : animais) {

            System.out.println(animal);

            animal.comer();
            animal.emitirSom();
        }
    }

    private static void listarCorredores(List<Animal> animais) {

        System.out.println("\n=== ANIMAIS CORREDORES ===");

        for (Animal animal : animais) {

            if (animal instanceof Corrida) {

                System.out.println(animal);

                Corrida corredor = (Corrida) animal;
                corredor.correr();
            }
        }
    }

    private static void listarNadadores(List<Animal> animais) {

        System.out.println("\n=== ANIMAIS NADADORES ===");

        for (Animal animal : animais) {

            if (animal instanceof Nado) {

                System.out.println(animal);

                Nado nadador = (Nado) animal;
                nadador.nadar();
            }
        }
    }

    private static void listarVoadores(List<Animal> animais) {

        System.out.println("\n=== ANIMAIS VOADORES ===");

        for (Animal animal : animais) {

            if (animal instanceof Voo) {

                System.out.println(animal);

                Voo voador = (Voo) animal;
                voador.voar();
            }
        }
    }

    private static void listarPredadores(List<Animal> animais) {

        System.out.println("\n=== ANIMAIS PREDADORES ===");

        for (Animal animal : animais) {

            if (animal instanceof Predacao) {

                System.out.println(animal);

                Predacao predador = (Predacao) animal;
                predador.cacar();
            }
        }
    }
}