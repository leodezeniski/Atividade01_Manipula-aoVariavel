public class Atividade01_ManipulacaoVariavel {
    public static void main(String[] args) {
        // Criação de Variáveis
        int idade = 25; // Número inteiro representando a idade
        double altura = 1.75; // Número decimal representando a altura em metros
        String nome = "João"; // String representando o nome da pessoa
        boolean estudante = true; // Variável booleana para indicar se a pessoa é estudante

        // Atribuição de Valores (já atribuídos acima)

        // Operações Simples
        int idade_1 = 30; // Segunda idade para somar com a idade principal
        int somaIdades = idade + idade_1; // Soma de duas idades

        double fator = 2.0;
        double alturaMultiplicada = altura * fator; // Multiplicação da altura por um fator

        String saudacao = "Olá, " + nome + "!"; // Concatenação do nome com uma saudação

        // Exibição de Resultados
        System.out.println("Variáveis Criadas:");
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Nome: " + nome);
        System.out.println("Estudante: " + estudante);

        System.out.println("\nResultados das Operações:");
        System.out.println("Soma das Idades: " + somaIdades);
        System.out.println("Altura Multiplicada: " + alturaMultiplicada + " metros");
        System.out.println("Saudação: " + saudacao);
    }
}
