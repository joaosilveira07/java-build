public class Musculacao extends Exercicio{
    // Aula 02 - Herança e Polimorfismo

    private int series;
    private int reps;
    private double cargaKg;

    public Musculacao(String nome, int duracaoMinutos, int series, int reps, double cargaKg){
        super(nome, duracaoMinutos);
        this.series = series;
        this.reps = reps;
        this.cargaKg = cargaKg;
    }

    public double getCargaKg() {
        return cargaKg;
    }

    public void setCargaKg(double cargaKg) {
        this.cargaKg = cargaKg;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public double calcularGastoCalorico(double pesoAlunoKg) {
        return duracaoMinutos * 6.0;
    }
}
