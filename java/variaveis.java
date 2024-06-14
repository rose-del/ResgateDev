class variaveis {
    public static void main(String[] args) {

        String nome = "Rose"; //declara o *tipo primeiro
        int num; //declarando
        int num2 = 2; // declarando e atribuindo
        num = 3; //atribuindo

        int soma = num + num2;
        int subtracao = num - num2;
        int multiplicacao = num * num2;
        float divisao = (float) num/num2; //Quando o valor da divisão de dois inteiros dar um número de ponto flutuante


        System.out.println("Hello, " + nome);
        System.out.println(num + "+" + num2 + " = " + soma);
    System.out.println(num + "-" + num2 + " = " + subtracao);
        System.out.println(num + "x" + num2 + " = " + multiplicacao);
        System.out.println(num + ":" + num2 + " = " + divisao);
    }
}