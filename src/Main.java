import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean playAgain = true;
        Scanner scanner = new Scanner(System.in);

        while (playAgain) {
            ArrayList<Character> userInputHistory = new ArrayList<>();
            String word = String.valueOf(Words.getRandomWord());
            int wordLength = word.length();
            StringBuilder sb = new StringBuilder();
            System.out.println("Добро пожаловать в игру виселица!");
            System.out.println("Вам загадано слово из: " + wordLength + " букв");
            //System.out.println(word);

            for (int i = 0; i < wordLength; i++) {
                sb.append("_");
            }
            System.out.println(sb);

            while (userInputHistory.size() < 7) {
                System.out.println("\nВведите букву:");
                String userInput = scanner.nextLine();
                if (userInput.length() != 1 || !(Character.isLetter(userInput.charAt(0)))) {
                    System.out.println("Введите одну букву!");
                } else if (!(userInput.matches("[а-яА-Я]"))) {
                    System.out.println("Введите одну русскую букву!");
                } else {
                    String userLetter = userInput.toUpperCase();
                    System.out.println("Буква: " + userLetter);
                    if (word.contains(userLetter)) {
                        for (int i = 0; i < word.length(); i++) {
                            if (word.charAt(i) == userLetter.charAt(0)) {
                                sb.setCharAt(i, userLetter.charAt(0));
                            }
                        }
                        System.out.println("\nЕсть такая буква!");
                        System.out.println("Слово: " + sb);
                        System.out.println("Ошибки " + "(" + userInputHistory.size() + "): " + userInputHistory);
                        if (sb.toString().equals(word)) {
                            System.out.println("Слово отгадано! \n Начать заново? (y/n)");
                            userInput = scanner.nextLine();
                            if (userInput.equals("y")){
                                break;
                            }
                            else {
                                playAgain = false;
                                break;
                            }
                        }
                    } else {
                        userInputHistory.add(userLetter.charAt(0));
                        System.out.println("\nТакой буквы нет :(");
                        System.out.println("Слово: " + sb);
                        System.out.println("Ошибки " + "(" + userInputHistory.size() + "): " + userInputHistory);
                        System.out.println(GallowsConditions.values()[userInputHistory.size() - 1].getGallowsCondition());
                        if (userInputHistory.size() == 7){
                            System.out.println("Игра окончена");
                            System.out.println("\nНачать заново? (y/n)");
                            userInput = scanner.nextLine();
                            if (userInput.equals("y")){
                                break;
                            }
                            else {
                                playAgain = false;
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println("Игра окончена");
        }
    }
}