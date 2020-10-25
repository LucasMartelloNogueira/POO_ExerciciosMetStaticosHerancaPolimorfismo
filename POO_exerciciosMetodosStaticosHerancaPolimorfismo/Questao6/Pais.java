package POO_exerciciosMetodosStaticosHerancaPolimorfismo.Questao6;

import java.util.ArrayList;

public class Pais {
    private String nome;
    private String nomeCapital;
    private int dimensaoEmKM2;
    private ArrayList<Pais> listaVizinhos = new ArrayList<Pais>();

    public Pais(String nome, String nomeCapital, int dimensaoEmKM2){
        this.nome = nome;
        this.nomeCapital = nomeCapital;
        this.dimensaoEmKM2 = dimensaoEmKM2;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getNomeCapital(){
        return this.nomeCapital;
    }

    public void setNomeCapital(String novoNomeCapital){
        this.nomeCapital = novoNomeCapital;
    }

    public int getDimesaoEmKm2(){
        return this.dimensaoEmKM2;
    }

    public void setDimensaoEmKm2(int novaDimensaoEmKm2){
        this.dimensaoEmKM2 = novaDimensaoEmKm2;
    }

    public boolean equals(Pais outro){
        if (this.getNome() == outro.getNome()){
            if (this.getNomeCapital() == outro.getNomeCapital()){
                return true;
            }
        }
        return false;
    }

    public void setListaVizinhos(ArrayList<Pais> vizinhos){
        for (Pais v : vizinhos){
            this.listaVizinhos.add(v);
        }
    }

    public ArrayList<Pais> getListaVizinhos(){
        return this.listaVizinhos;
    }

    public ArrayList<Pais> vizinhosEmComum(Pais outro){
        ArrayList<Pais> listaVizinhosEmComum = new ArrayList<Pais>();
        
        for (Pais v1 : this.listaVizinhos){
            for (Pais v2 : outro.listaVizinhos){
                if (v1 == v2){
                    listaVizinhosEmComum.add(v1);
                }
            }
        }
        return listaVizinhosEmComum;
    }
}
