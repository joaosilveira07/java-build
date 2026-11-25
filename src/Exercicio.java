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
}
