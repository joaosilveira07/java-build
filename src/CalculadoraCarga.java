import java.util.ArrayList;
import java.util.List;

public class CalculadoraCarga {
    public static void main(String[] args) {
//        AULA 01 - Condicionais e Loops

//        double pesoLevantado = 80.5;
//        int repeticoesFeitas = 8;
//
//        // formula de britzky
//        double cargaMaxima = pesoLevantado / (1.0278 - (0.0278 * repeticoesFeitas));
//
//        System.out.printf("Sua carga máxima estimada é: %.1f kg.\n", cargaMaxima);
//
//        String nivel;
//
//        if (cargaMaxima < 60){
//            nivel = "Iniciante";
//        } else if (cargaMaxima < 120){
//            nivel = "Intermediário";
//        } else {
//            nivel = "Avançado";
//        }

//        System.out.printf("Carga máxima: %.1f kg | Nível: %s\n", cargaMaxima, nivel);

//        double[] cargasDaSemana = {80, 82.5, 85, 87.5, 90};

//        for (int i = 0; i < cargasDaSemana.length; i++){
//            System.out.printf("Treino %d: %.1f kg registrado.%n", i + 1, cargasDaSemana[i]);
//        }

//        for (double carga : cargasDaSemana){
//            System.out.printf("Carga registrada: %.1f kg%n", carga);
//        }

//        int segundosDeDescanso = 5;
//        while (segundosDeDescanso > 0){
//            System.out.printf("%d segundos restantes...%n", segundosDeDescanso);
//            segundosDeDescanso--;
//        }
//        System.out.println("Descanso finalizado! Próxima série.");
//
//        int repeticoes = 7;
//        if (repeticoes >= 8) {
//            System.out.println("Meta atingida");
//        } else {
//            System.out.println("Você não atingiu a meta de repetições, sugiro abaixar o peso.");
//        }
//
//        for (int serie = 1; serie <= 4; serie++) {
//            System.out.println("Série " + serie);
//        }
//    }

//        AULA 02 - Array e List

        List<Double> cargasDaSemana = new ArrayList<>();
        cargasDaSemana.add(80.0);
        cargasDaSemana.add(82.5);
        cargasDaSemana.add(85.0);
        System.out.println("Total de treinos registrados: " + cargasDaSemana.size());

        String a = new String("Supino");
        String b = new String("Supino");
        boolean saoIguais;
        if (a == b){
            saoIguais = true;
        } else {
            saoIguais = false;
        }
        System.out.println(saoIguais);
        if (a.equals(b)){
            saoIguais = true;
        } else {
            saoIguais = false;
        }
        System.out.println(saoIguais);
    }
}
