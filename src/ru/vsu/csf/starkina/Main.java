package ru.vsu.csf.starkina;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static ArrayList<String> yesAnswers = new ArrayList<String>()
    {{
            add("yes");
            add("да");
        }};

    private final static ArrayList<String> noAnswers = new ArrayList<String>()
    {{
            add("no");
            add("нет");
        }};

    private static boolean wasAnswerPositive(String question) {
        System.out.println(question);
        do {
            String answer = scanner.nextLine().toLowerCase();
            if (yesAnswers.contains(answer))
                return true;
            if (noAnswers.contains(answer))
                return false;

            System.out.println("Вы должны вводить только \"да\"/\"yes\" или \"нет\"/\"no\" в любом регистре!");
        } while (true);
    }

    public static void main(String[] args) {
        System.out.println("Доброе утро, милейший Лео! Вы проснулись в новом замечательном дне");
        while (true) {
            System.out.println("Покрути свой тотем - волчок. Если он крутится, то тебе стоит проснуться. Проснись, Лео! :)");
            if (wasAnswerPositive("Вы голодны?")) {
                System.out.println("Если вы голодны, то предлагаю вам сходить в кафе или ресторан");
                if (wasAnswerPositive("Вы встретили прекрасную незнакомку. Пригласите ли вы ее на свидание?")) {
                    System.out.println("Вы пошли на свидание");
                    System.out.println("Свидание прошло весьма успешно. Но делу - время, потехе - час.");
                }
            }
            if (wasAnswerPositive("Может, немного поработаем?")) {
                System.out.println("Вы пошли на съемки нового фильма или программы");
                if (!wasAnswerPositive("Вы устали?")) {
                    while (!wasAnswerPositive("А теперь вы устали?"))
                        System.out.println("Тогда поработаем еще чуть-чуть");
                }
            }
            if (wasAnswerPositive("Может, сходим в спортзал?")) {
                System.out.println("Вы пошли в спортзал");
                if (!wasAnswerPositive("Вы устали и хотите отдохнуть?")) {
                    while (!wasAnswerPositive("А теперь вы устали?"))
                        System.out.println("Тогда надо подкачаться еще");
                }
            }
            System.out.println("После тяжелого дня предлагаю сходить в душ, а потом решить, что делать дальше");
            if (wasAnswerPositive("Нужно ли сегодня идти на премию Оскар?")) {
                if (wasAnswerPositive("Вы получили премию Оскар?")) System.out.println("Это inception и ты спишь");
                else System.out.println("Не грусти, иди поспи");
            } else {
                System.out.println("Предлагаю поплавать на корабле");
                if (wasAnswerPositive("Кстати, выбранный вами корабль называется Титаник??")) {
                    System.out.println("К сожалению,вы купили не счастливый билет. Вы утонули");
                    break;
                } else System.out.println("Вы покатались на кораблике и затем отправились домой");
            }
        }
    }
    }


