package org.example;
import org.example.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Context cn = new Context();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("which strategy?");
            String strategyClassName = sc.nextLine();
            try {
                Strategy strategy = (Strategy) Class
                        .forName("org.example." + strategyClassName)
                        .getDeclaredConstructor()
                        .newInstance();

                    cn.setStrategy(strategy);
                    cn.makeOperation();

            } catch (Exception e) {
                System.out.println("❌ Strategy not found! Please try again.");
            }

        }

    }
}