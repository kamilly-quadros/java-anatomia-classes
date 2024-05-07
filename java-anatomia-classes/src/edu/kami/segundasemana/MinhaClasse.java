package edu.kami.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Kamilly";
        String segundoNome = "Quadros";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método "+primeiroNome.concat(" ").concat(segundoNome);
    }
}
