import java.util.*;

// Módulo 3 - Collections e Streams

public class Main {

    public static void main(String[] args){
        // Aula 01 - List

//        List<String> alunosNaAula = List.of("Marina", "Rafael", "Bianca", "Thiago", "Rafael");
//
//        System.out.println(alunosNaAula.get(0));
//        System.out.println(alunosNaAula.size());

        // Aula 02 - Map

//        Map<String, Integer> frequenciaMensalPorAluno = new HashMap<>();
////        frequenciaMensalPorAluno.put("Marina", 22);
////        frequenciaMensalPorAluno.put("Rafael", 15);
////        frequenciaMensalPorAluno.put("Bianca", 27);
////        frequenciaMensalPorAluno.put("Thiago", 9);
////
////        int diasDaMarina = frequenciaMensalPorAluno.get("Marina");
////
////        System.out.printf("Marina foi à academia %d dias esse mês%n", diasDaMarina);

//        Map<Integer, Integer> frequenciaMensalPorMatricula = new HashMap<>();
//        frequenciaMensalPorMatricula.put(1042, 22);
//        frequenciaMensalPorMatricula.put(1078, 8);
//
//        System.out.println(frequenciaMensalPorMatricula.get(1042));

        // Aula 03 - Set

        List<String> exerciciosDaSemana = List.of("Supino Reto", "Agachamento", "Supino Reto", "Levantamento Terra", "Agachamento", "Supino Reto");

        Set<String> exerciciosUnicos = new HashSet<>(exerciciosDaSemana);

        System.out.println("Total de registros: " + exerciciosDaSemana);
        System.out.println("Exercicios unicos: " + exerciciosUnicos.size());

        boolean jaTreinouLevantamentoTerra = exerciciosUnicos.contains("Levantamento Terra");
        System.out.println(jaTreinouLevantamentoTerra);
    }
}
