public class Musculacao extends Exercicio implements Progressivo {
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

    // Aula 03 - Interfaces vs Classes Abstratas

    @Override
    public double sugerirProximaCarga(int repeticoesAlvo) {
        boolean atingiuMeta = reps >= repeticoesAlvo;
        if(atingiuMeta) {
            return Math.round((cargaKg * 1.05) * 4) / 4.0; // 5% arrendondado pra 0.25kg
        }
        return cargaKg;
    }
}
