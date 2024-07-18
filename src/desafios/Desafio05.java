package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio05 {
    /* Desafio 5 - Calcule a média dos números maiores que 5:
    Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console. */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosMaioresQueCinco = numeros.stream()
                .filter(n -> n > 5)
                .toList();

        int soma = numerosMaioresQueCinco.stream()
                .reduce(0, Integer::sum);

        double media = (double) soma / numerosMaioresQueCinco.size();

        System.out.println("A média dos números maiores que 5 é: " + media);
    }
}
