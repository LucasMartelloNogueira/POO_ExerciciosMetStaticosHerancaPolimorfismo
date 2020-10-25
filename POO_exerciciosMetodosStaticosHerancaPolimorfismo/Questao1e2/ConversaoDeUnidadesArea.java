package POO_exerciciosMetodosStaticosHerancaPolimorfismo.Questao1e2;

public class ConversaoDeUnidadesArea {

    public static double metrosParaPes(int metros){
        return metros * 10.76;
    }

    public static double metrosParaPes(Double metros){
        return metros * 10.76;
    }

    public static double pesParaCentimetros(double pes){
        return pes * 929;
    }

    public static double milhasParaAcres(double milhas){
        return milhas * 640;
    }

    public static double acresParaPes(double acres){
        return acres * 43.56;
    }

    //metodo extra para a questao 2
    public static double pesParaAcres(double pes){
        return pes / 43.56;
    }

}
