//2. Korzystając z funkcji split (podzielcie po spacji)
// odwrócie słowa w podanym przez użytkownika zdaniu. Wyświetlcie to zdanie

package pl.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj zdanie: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] cutSentence = sentence.split(" ");

        for (int count = cutSentence.length; count > 0; count--) {
            System.out.print(cutSentence[count-1] + " ");
        }
    }
}