package POO_exerciciosMetodosStaticosHerancaPolimorfismo.Questao4;

public class Triangulo extends FiguraGeometrica{
    private String tipoTriangulo = "retangulo";
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        super(3);
        this.base = base;
        this.altura = altura;
    }

    public String getTipoTriangulo(){
        return this.tipoTriangulo;
    }

    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    @Override
    public double calcularArea(){
        double area = (this.base * this.altura) / 2;
        return area;
    }
}
