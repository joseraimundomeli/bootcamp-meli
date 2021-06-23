package br.com.digitalhouse.FirstProject.controllers;

import java.util.Scanner;

class ConversorDecimalRomano {

        public String conversor(Integer numero){
            int[] vaNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] vaRom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            int i = 0;
            String result = "";
            while (numero > 0) {
                if (numero >= vaNum[i]) {
                    result += vaRom[i]+"";
                    numero -= vaNum[i];
                } else {
                    i++;
                }
            }
            return result;
        }
}