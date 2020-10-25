package POO_exerciciosMetodosStaticosHerancaPolimorfismo.Questao4;

public class FiguraGeometrica {
    private int qntLados;
    private double area;

    public FiguraGeometrica(int qntLados){
        this.qntLados = qntLados;
    }

    public int getQntLados(){
        return this.qntLados;
    }

    public double getArea(){
        return this.area;
    }

    public void setArea(Double novaArea){
        this.area = novaArea;
    }
    
    public double calcularArea(){
        return 0;
    }

    public void poliMorfismoTeste(){
        System.out.println("oi");
    }
    
}
