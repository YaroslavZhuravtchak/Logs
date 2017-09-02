package com.zhuravchak.numbers;
import org.apache.log4j.Logger;

import java.util.InputMismatchException;


public class Main {

    static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        NumeralSystemConventor conventor = new NumeralSystemConventor();
        long number = -1;
        while (number == -1) {
            try {
                number = conventor.inputNumber();
            } catch (NumberFormatException|InputMismatchException e) {
              logger.error(e + " (catch)");
            }
        }
        System.out.println("Your number in the binary numeral system:");
        System.out.println(conventor.convert(number, 2));
        System.out.println("Your number in the octal numeral system:");
        System.out.println(conventor.convert(number, 8));
        System.out.println("Your number in the hexadecimal numeral system:");
        System.out.println(conventor.convert(number, 16));
    }
}