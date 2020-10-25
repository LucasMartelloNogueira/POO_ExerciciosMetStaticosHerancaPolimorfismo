package POO_exerciciosMetodosStaticosHerancaPolimorfismo.Questao5;

import java.util.ArrayList;

public class ContatoPessoaFisica extends Contato{
    private String nome;
    private int cpf;
    private int dataDeAniversario;
    public static ArrayList<ContatoPessoaFisica> listaPessoasFisicas = new ArrayList<ContatoPessoaFisica>();

    public ContatoPessoaFisica(int numero, String endereco, String nome, int cpf, int dataDeAniversario){
        super(numero, endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeAniversario = dataDeAniversario;
        listaPessoasFisicas.add(this);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public int getCpf(){
        return this.cpf;
    }

    public void setCpf(int novoCpf){
        this.cpf = novoCpf;
    }

    public int getDataDeAniversario(){
        return this.dataDeAniversario;
    }

    public void setDataDeAniversario(int novaDataDeAniversario){
        this.dataDeAniversario = novaDataDeAniversario;
    }

    public void infoContato(){
        System.out.println("INFO PESSOA FISICA: ");
        System.out.println("numero: " + this.getNumero());
        System.out.println("endereco: " + this.getEndereco());
        System.out.println("nome: " + this.getNome());
        System.out.println("cpf: " + this.getCpf());
        System.out.println("data de aniversario: " + this.getDataDeAniversario());
    }

    public static ContatoPessoaFisica buscaPorCpf(int cpf){
        for (ContatoPessoaFisica p : listaPessoasFisicas){
            if (p.getCpf() == cpf){
                return p;
            }
        }
        return null;
    }

}
