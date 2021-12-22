package com.company;

import com.company.domain.Celular;
import com.company.domain.Pessoa;
import com.company.domain.SortUtil;
import com.company.interfaces.Precedente;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static Object Pessoa;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidade;
        char confirma;

        System.out.print("Deseja cadastrar Funcionário (S/N)? ");
        confirma = sc.next().charAt(0);

        if(confirma == 'S') {

            System.out.print("Digite a quantidada de funcionários para cadastro: ");
            quantidade = sc.nextInt();

            System.out.println();

            Pessoa[] arr = new Pessoa[quantidade];

            for (int i = 0; i < quantidade; i++) {
                String nome, cpf;

                sc.nextLine();
                System.out.print("Digite o nome do funcionário: ");
                nome = sc.nextLine();

                System.out.print("Digite o CPF do funcionário: ");
                cpf = sc.nextLine();

                System.out.println("FUNCIONÁRIO CADASTRADO!");
                System.out.println();

                arr[i] = new Pessoa(nome, cpf);
            }

            SortUtil.ordena(arr);

            System.out.println();

            System.out.println("Funcionários Cadastrados: ");
            for (Pessoa i : arr) {
                System.out.println(i);
            }
        }
        else if (confirma == 'N') {
            System.out.print("Deseja cadastrar Número de Telefone(S/N)? ");
            confirma = sc.next().charAt(0);

            if (confirma == 'S') {
                System.out.print("Digite a quantidade de números para cadastro: ");
                quantidade = sc.nextInt();

                System.out.println();

                Celular[] arrCel = new Celular[quantidade];

                for(int i = 0; i < arrCel.length; i ++) {
                    String telefone, proprietario;

                    sc.nextLine();
                    System.out.print("Digite o número de telefone: ");
                    telefone = sc.nextLine();

                    System.out.print("Digite o nome do Proprietário: ");
                    proprietario = sc.nextLine();

                    arrCel [i] = new Celular(telefone, proprietario);
                }

                SortUtil.ordena(arrCel);

                System.out.println();

                System.out.println("Números Cadastrados: ");
                for(Celular j : arrCel) {
                    System.out.println(j);
                }
            }
            else if (confirma == 'N') {
                System.out.println("Muito Obrigado!");
            }
        }
        else {
            System.out.println("Muito Obrigado");
        }


    }
}
