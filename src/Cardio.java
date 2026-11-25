public class Cardio extends Exercicio{
    // Aula 02 - Herança e Polimorfismo

    private double velocidadeMediaKmH;

    public Cardio(String nome, int duracaoMinutos, double velocidadeMediaKmH) {
        super(nome, duracaoMinutos);
        this.velocidadeMediaKmH = velocidadeMediaKmH;
    }

    @Override
    public double calcularGastoCalorico(double pesoAlunoKg){
        return duracaoMinutos * 8.0;
    }
}
