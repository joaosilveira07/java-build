public abstract class Exercicio {
    // Módulo 2
    // Aula 01 - Encapsulamento e Primeira Classe
    protected String nome;
    protected int duracaoMinutos;

    public Exercicio(String nome, int duracaoMinutos){
        this.nome = nome;
        this.duracaoMinutos = duracaoMinutos;
    }

    public abstract double calcularGastoCalorico(double pesoAlunoKg);

    public String getNome(){
        return this.nome;
    }

    public int getDuracaoMinutos(){
        return this.duracaoMinutos;
    }

    // Aula 02 - Herança e Polimorfismo
    public static void main(String[] args) {
        Exercicio supino = new Musculacao("Supino Reto", 10, 4, 5, 20);
        Exercicio corrida = new Cardio("Corrida na esteira", 20, 10.0);

        Exercicio[] treinoHoje = {supino, corrida};
        for (Exercicio ex : treinoHoje){
            double gasto = ex.calcularGastoCalorico(80);
            System.out.printf("%s gastou aproximadamente %.0f kcal%n", ex.getNome(), gasto);
        }
    }
}
