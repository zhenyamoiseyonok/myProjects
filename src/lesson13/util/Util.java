package lesson13.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {

    public static void pressEnter() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для продолжения нажмите ENTER");
        while (true) {
            String string;
            try {
                string = bufferedReader.readLine().trim();
                if ("".equalsIgnoreCase(string)) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
