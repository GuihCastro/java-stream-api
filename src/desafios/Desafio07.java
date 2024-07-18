package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio07 {
    /* Desafio 7 - Encontrar o segundo número maior da lista:
    Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console. */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        segundoMaior.ifPresentOrElse(
                n -> System.out.println("O segundo maior número da lista é: " + n),
                () -> System.out.println("A lista não contém um segundo maior número")
        );
    }
}
