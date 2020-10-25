package POO_exerciciosMetodosStaticosHerancaPolimorfismo.Questao5;

import java.util.ArrayList;

public class ContatoPessoaJuridica extends Contato{
    private String razaoSocial;
    private int cnpj;
    private int faturamento;
    public static ArrayList<ContatoPessoaJuridica> listaPessoasJuridicas = new ArrayList<ContatoPessoaJuridica>();

    public ContatoPessoaJuridica(int numero, String endereco, String razaoSocial, int cnpj, int faturamento){
        super(numero, endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.faturamento = faturamento;
        listaPessoasJuridicas.add(this);
    }

    public String getRazaoSocial(){
        return this.razaoSocial;
    }

    public void setRazaoSocial(String novaRazaoSocial){
        this.razaoSocial = novaRazaoSocial;
    }

    public int getCnpj(){
        return this.cnpj;
    }

    public void setCnpj(int novoCnpj){
        this.cnpj = novoCnpj;
    }

    public int getFaturamento(){
        return this.faturamento;
    }

    public void setFaturamento(int novoFaturamento){
        this.faturamento = novoFaturamento;
    }

    public void infoContato(){
        System.out.println("INFO PESSOA JURIDICA: ");
        System.out.println("numero: " + this.getNumero());
        System.out.println("endereco: " + this.getEndereco());
        System.out.println("razao social: " + this.getRazaoSocial());
        System.out.println("cnpj: " + this.getCnpj());
        System.out.println("faturamento: " + this.getFaturamento());
    }

    public static ContatoPessoaJuridica buscaPorCnpj(int cnpj){
        for (ContatoPessoaJuridica p : listaPessoasJuridicas){
            if (p.getCnpj() == cnpj){
                return p;
            }
        }
        return null;
    }

}
