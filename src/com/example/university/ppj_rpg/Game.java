package com.example.university.ppj_rpg;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    Random random = new Random();

    public static void main(String[] args) {
        new Game().run();
    }

    private void run() {
        Character myCharacter = new Character("Nazar", 5, 5, 5, "blue");
        Character character1 = new Character("C1", 5, 7, 3, "blue");
        Character character2 = new Character("C2", 4, 4, 7, "red");
        Character character3 = new Character("C3", 1, 5, 9, "red");
        Character character4 = new Character("C4", 9, 4, 2, "blue");
        Character[] characters = {character1, character2, character3, character4};
        System.out.println(myCharacter);
        System.out.println("Other Characters");
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("You encountered a character");
            int randomCharacter = random.nextInt(characters.length);
            System.out.println(characters[randomCharacter]);
            System.out.println("Enter your choice: 0 - exit, 1 - attack, 2 - skip");
            choice = scanner.nextLine();
            if (choice.equals("1")) {
                menuAttack(myCharacter, scanner, characters[randomCharacter]);
            }
        } while (!choice.equals("0"));
        System.out.println("Game Over !");
    }

    private void menuAttack(Character myCharacter, Scanner scanner, Character otherCharacter) {
        if (myCharacter.isAlly(otherCharacter)) {
            System.out.println("This is our ally, move to next character");
            return;
        }
        System.out.println("Choose attack type M - magic, P - physical");
        System.out.println();
        String strAttackType = scanner.nextLine();
        AttackType attackType = strAttackType.equalsIgnoreCase("M") ? AttackType.MAGICAL : AttackType.PHYSICAL;
        System.out.println("Choosen attack type " + attackType);
        System.out.println("Choose hit power");
        int hitPower = Integer.parseInt(scanner.nextLine());
        attack(myCharacter, otherCharacter, hitPower, attackType);
        System.out.println(myCharacter);
        System.out.println(otherCharacter);
    }

    private void attack(Character myCharacter, Character enemy, int hitPower, AttackType attackType) {
        System.out.println("Attack ! ");
        if (attackType.equals(AttackType.PHYSICAL)) {
            myCharacter.getStamina().decrease(hitPower);
        } else {
            myCharacter.getManna().decrease(hitPower);
        }
        enemy.getHp().decrease(hitPower);
        int randomAttackType = random.nextInt(2);
        AttackType enemyAttackType = randomAttackType == 0 ? AttackType.PHYSICAL : AttackType.MAGICAL;
        System.out.println("Enemy is attacking us with 1 hit power,  attack type = " + enemyAttackType);
        if (enemyAttackType.equals(AttackType.PHYSICAL)) {
            enemy.getStamina().decrease(1);
        } else {
            enemy.getManna().decrease(1);
        }
        myCharacter.getHp().decrease(1);
        System.out.println(checkWinner(myCharacter, enemy));

    }

    private String checkWinner(Character myCharacter, Character enemy) {
        if (enemy.getHp().getValue() <= 0 && myCharacter.getHp().getValue() <= 0) {
            return "ничья";
        } else if (enemy.getHp().getValue() <= 0) {
            return "You win";
        } else if (myCharacter.getHp().getValue() <= 0) {
            return "You Lose";
        } else {
            return "Everybody is alive";
        }
    }
}
