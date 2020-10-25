package POO_exerciciosMetodosStaticosHerancaPolimorfismo.Questao5;


public class Contato {
    private int numero;
    private String endereco;

    public Contato(int numero, String endereco){
        this.numero = numero;
        this.endereco = endereco;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int novoNumero){
        this.numero = novoNumero;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String novoEndereco){
        this.endereco = novoEndereco;
    }

    public void infoContato(){
        System.out.println("numero: " + this.getNumero());
        System.out.println("endereco: " + this.getEndereco());
    }
}
