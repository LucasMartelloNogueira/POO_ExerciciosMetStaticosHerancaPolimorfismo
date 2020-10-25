package POO_exerciciosMetodosStaticosHerancaPolimorfismo.Questao3;

public class Pessoa {
    String nome;
    int idade;
    Pessoa mae;
    Pessoa pai;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, Pessoa mae){
        this.nome = nome;
        this.idade = idade;
        this.mae = mae;
    }

    public Pessoa(String nome, int idade, Pessoa mae, Pessoa pai){
        this.nome = nome;
        this.idade = idade;
        this.mae = mae;
        this.pai = pai;
    }

    public static void printArvoreGenealogica(Pessoa a){
        System.out.println("nome: " + a.nome);
        System.out.println("idade: " + a.idade);
        if (a.mae != null){
            System.out.println("mae: " + a.mae.nome);
        }
        if (a.pai != null){
            System.out.println("pai: " + a.pai.nome);
        }
        
        System.out.println("------------------");

        if (a.mae != null){
            printArvoreGenealogica(a.mae);
        }
        if (a.pai != null){
            printArvoreGenealogica(a.pai);
        }
    }
}
