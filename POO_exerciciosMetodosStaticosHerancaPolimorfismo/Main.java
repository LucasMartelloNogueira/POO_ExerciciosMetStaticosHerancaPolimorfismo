package POO_exerciciosMetodosStaticosHerancaPolimorfismo;

import java.util.ArrayList;

import POO_exerciciosMetodosStaticosHerancaPolimorfismo.Questao1e2.ConversaoDeUnidadesArea;
import POO_exerciciosMetodosStaticosHerancaPolimorfismo.Questao3.Pessoa;
import POO_exerciciosMetodosStaticosHerancaPolimorfismo.Questao4.*;
import POO_exerciciosMetodosStaticosHerancaPolimorfismo.Questao5.*;
import POO_exerciciosMetodosStaticosHerancaPolimorfismo.Questao6.Pais;

public class Main {

    static void questao2(){
        int areaCampoFutMetQua = 8250;
        double areaCampoFutPesQua = ConversaoDeUnidadesArea.metrosParaPes(areaCampoFutMetQua);
        double areaCampoFutAcresQua = ConversaoDeUnidadesArea.pesParaAcres(areaCampoFutPesQua);
        double areaCampoFutCentQua = ConversaoDeUnidadesArea.pesParaCentimetros(areaCampoFutPesQua);
        System.out.println("area campo futebol em pes quadrados: " + areaCampoFutPesQua);
        System.out.println("area campo futebol em acres quadrados: " + areaCampoFutAcresQua);
        System.out.println("area campo futebol em centimetros quadrados: " + areaCampoFutCentQua);

    }
    
    static void questao3(){
        Pessoa avo = new Pessoa("Claudia", 76);
        Pessoa mae = new Pessoa("Luisa", 45, avo);
        Pessoa pai = new Pessoa("Nuno", 60);
        Pessoa filha = new Pessoa("Nina", 19, mae, pai);
        Pessoa.printArvoreGenealogica(filha);
    }

    static void questao4(){
        Quadrilatero a = new Quadrilatero(2, 5);
        Triangulo b = new Triangulo(3, 2);
        Circulo c = new Circulo(3);
        
        System.out.println("area quadrado: " + a.calcularArea());
        System.out.println("area triangulo: " + b.calcularArea());
        System.out.println("area circulo: " + c.calcularArea());
    }

    static void questao5(){
        ContatoPessoaFisica pessoa1 = new ContatoPessoaFisica(12, "Rua Bla Bla", "Bozo", 1, 21091976);
        ContatoPessoaJuridica empresa1 = new ContatoPessoaJuridica(111, "rua imaginaria 2", "ser a pior empresa", 2, -9999);

        System.out.println("LISTA DE PESSOAS FISICAS: ");
        for (ContatoPessoaFisica p : ContatoPessoaFisica.listaPessoasFisicas){
            p.infoContato();
        }
        System.out.println("------------------------------");

        System.out.println("LISTA DE PESSOAS JURIDICAS: ");
        for (ContatoPessoaJuridica e : ContatoPessoaJuridica.listaPessoasJuridicas){
            e.infoContato();
        }
        System.out.println("------------------------------");
        
        System.out.println("BUSCANDO PESSOA POR CPF: ");
        ContatoPessoaFisica pessoaProcurada = ContatoPessoaFisica.buscaPorCpf(1);
        pessoaProcurada.infoContato();
        System.out.println("------------------------------");

        System.out.println("BUSCANDO EMPRESA POR CNPJ: ");
        ContatoPessoaJuridica empresaProcurada = ContatoPessoaJuridica.buscaPorCnpj(2);
        empresaProcurada.infoContato();
        System.out.println("------------------------------");
    }

    static void questao6(){
        Pais pais1 = new Pais("Brasil", "Brasilia", 1000);
        System.out.println("INFO DO PAIS: ");
        System.out.println("nome: " + pais1.getNome());
        System.out.println("capital: " + pais1.getNomeCapital());
        System.out.println("dimensao em km^2: " + pais1.getDimesaoEmKm2());

        Pais pais2 = new Pais("Argentina", "Buenos Aires", 300);
        Pais pais3 = new Pais("Uruguai", "Montevideu", 200);
        Pais pais4 = new Pais("Paraguai", "Assuncao", 100);
        Pais pais5 = new Pais("Chile", "Santiago", 80);

        System.out.println("resultado: " + pais1.equals(pais2));

        ArrayList<Pais> algunsVizinhosBrasil = new ArrayList<Pais>();
        algunsVizinhosBrasil.add(pais2);
        algunsVizinhosBrasil.add(pais3);
        algunsVizinhosBrasil.add(pais4);
        pais1.setListaVizinhos(algunsVizinhosBrasil);

        ArrayList<Pais> algunsVizinhosArg = new ArrayList<Pais>();
        algunsVizinhosArg.add(pais1);
        algunsVizinhosArg.add(pais3);
        algunsVizinhosArg.add(pais4);
        algunsVizinhosArg.add(pais5);
        pais2.setListaVizinhos(algunsVizinhosArg);

        ArrayList<Pais> vizinhosBrEArg = pais1.vizinhosEmComum(pais2);

        System.out.println("VIZINHOS EM COMUM DO BRASIL E ARGENTINA: ");
        for (Pais p : vizinhosBrEArg){
            System.out.println("nome: " + p.getNome());
        }
    }

    public static void main(String[] args) {
        //questao 1 esta na pasta "Questao1e2"
        //questao2();
        //questao3();
        //questao4();
        //questao5();
        //questao6();
    }
    
}
