public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        
        if (mediaFinal < 6)
            System.out.print("REPROVADO");
        else if (mediaFinal == 6)
            System.out.print("PROVA MINERVA");
        else
            System.out.print("APROVADO");
    }
}
