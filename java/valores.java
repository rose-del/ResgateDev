public class valores {
    
    public static void main(String[] args){

        boolean fimDeSemana = true;
        boolean fazendoSol = true;

        boolean vamosAPraia = fimDeSemana && fazendoSol;

        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana"; // Operador ternário

        System.out.println(mensagem);

    }
}
