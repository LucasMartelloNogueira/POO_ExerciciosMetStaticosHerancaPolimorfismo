package POO_exerciciosMetodosStaticosHerancaPolimorfismo.Questao4;

public class Quadrilatero extends FiguraGeometrica {
    private double base;
    private double altura;

    public Quadrilatero(double base, double altura){
        super(4);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        double area = this.base * this.altura;
        return area;
    }

    public void poliMorfismoTeste(){
        System.out.println("ola");
    }
}
