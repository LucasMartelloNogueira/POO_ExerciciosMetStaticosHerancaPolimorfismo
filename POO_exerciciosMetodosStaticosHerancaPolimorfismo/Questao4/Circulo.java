package POO_exerciciosMetodosStaticosHerancaPolimorfismo.Questao4;

public class Circulo extends FiguraGeometrica{
    private double raio;

    public Circulo(double raio){
        super(Integer.MAX_VALUE);       //ciruculos tem infinitos lados - MAX_VALUE eh para significar infinitos lados
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }

    @Override
    public double calcularArea(){
        double area = Math.PI * (Math.pow(this.raio, 2));
        return area;
    }
}
