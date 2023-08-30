package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;
        int odabir = 0;
        do {
            System.out.println("Unesite max velicinu broja elemenata vektora V (n):");
            n = input.nextInt();
        } while (n < 2 || n > 10);
        int[][] V = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                do {
                    System.out.println("Unesite elemente matrice:");
                    Scanner unos = new Scanner(System.in);
                    m = unos.nextInt();
                } while (m < 1 || m > 5);
                V[i][j] = m;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", V[i][j]);
            }
            System.out.println();
        }
        System.out.println("Unesite jednu od mogucnosti");
        while (odabir != -1) {
            System.out.println("Izracun aritmeticke sredine sporedne dijagonale. -1");
            System.out.println("Izračunati sumu neparnih elemenata prvog retka i prvog stupca matrice. Ukoliko\n" +
                    "ne postoje neparni elementi ispisati da nije bilo moguće izračunati sumu  -2");
            System.out.println("Ispisati sve brojeve na parnim indeksima vektora V  -3");
            odabir = input.nextInt();
            switch (odabir) {
                case 1:
                    int rezultat = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i == n - j - 1)
                                rezultat += (V[i][j]) / n;

                        }
                    }
                    System.out.println(rezultat);
                    break;
                case 2:
                    int sum = 0;
                    int redak = 0;
                    int stupac = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (V[i][j] % 2 != 0)
                                if (i == 0)
                                    redak += V[i][j];
                            if (V[i][j] % 2 != 0)
                                if (j == 0)
                                    stupac += V[i][j];
                            if (redak + stupac != 0) {
                                sum = (redak + stupac) - V[0][0];
                            }
                        }
                    }
                    if (sum != 0) {
                        System.out.println(sum);
                    } else
                        System.out.println("Nema sume!");
                    break;

                case 3:
                    for (int i = 0; i < n; i++) {
                        if(i % 2 !=0) continue;;
                        for (int j = 0; j < n; j++) {
                            if(j%2 !=0) {
                                continue;
                            }
                            System.out.println(V[i][j]);
                        }
                    }break;
            }
        }
    }
}