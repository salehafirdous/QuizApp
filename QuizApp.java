package com.elevatelabs.tasks.task8;

import java.util.*;


public class QuizApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(
                "What is Java?",
                new String[]{"Programming Language", "Database", "Operating System"},
                1 // correct answer = option 1
        ));
        questions.add(new Question(
                "Which of these is an OOP concept?",
                new String[]{"Encapsulation", "HTML", "CSS"},
                1
        ));
        questions.add(new Question(
                "Which keyword is used to inherit a class in Java?",
                new String[]{"extends", "implements", "inherits"},
                1
        ));
        questions.add(new Question(
                "Which collection allows duplicates?",
                new String[]{"Set", "List", "Map"},
                2
        ));

        //Quiz loop
        int score = 0;
        int qNo = 1;
        for (Question q : questions) {
            System.out.println("\nQ" + qNo + ". " + q.getText());
            String[] opts = q.getOptions();
            for (int i = 0; i < opts.length; i++) {
                System.out.println((i + 1) + ". " + opts[i]);
            }
            System.out.print("Your answer (1-" + opts.length + "): ");
            int ans = sc.nextInt();

            if (ans == q.getCorrectIndex()) {
                System.out.println("Correct");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " +
                        opts[q.getCorrectIndex() - 1]);
            }
            qNo++;
        }

        // TO Show final score
        System.out.println("\nYou scored " + score + "/" + questions.size() + " correct answers!");
       
    }
}
