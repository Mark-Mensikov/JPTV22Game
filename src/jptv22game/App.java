/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {

    public void run() {
        System.out.println("----Start Game----");
        Random random = new Random();
        boolean repeat = true;
        int coint = 10;
        do {
            int myNumber = random.nextInt(9-0+1)-0;
            int userNumber = 10;
            System.out.print("Задумано число в диапазоне от 0 до 9, угадайте какое это число (у вас есть три попытки): ");
            Scanner scanner = new Scanner(System.in);
            int atempt = 1;
            do {
                System.out.println("Попытка номер " + atempt + ": ");
                do {
                    try {
                        userNumber = scanner.nextInt();
                        scanner.nextLine();
                        break;
                    } catch (Exception e) {
                        System.out.println("Недопустимый символ, еще раз! ");
                        scanner.nextLine();
                    }
                } while (true);
                if (myNumber == userNumber) {
                    coint+=1;
                    System.out.println("Ты выйграл!");
                    break;
                }else{
                    if (atempt > 2) {
                        System.out.println("Ты проиграл!");
                        coint -=3;
                        System.out.println("Было загадано число " + myNumber);
                    break;
                    }else{
                        if (myNumber > userNumber) {
                        System.out.println("Неправильно попробуй еще раз.(загаданное число больше)" );
                        }else{
                        System.out.println("Неправильно попробуй еще раз.(загаданное число меньше)");
                        }  
                    }
                }
                atempt++;
            } while (true);
            System.out.println("ваш баланс " + coint);
            System.out.println("Нажмите \"q\" для выхода или любую кнопку для продолжения");
            String q = scanner.nextLine();
            if (q.equals("q")) {
                repeat = false;
            }
        }while (repeat);
        System.out.println("----End Game----");
    }
   
}