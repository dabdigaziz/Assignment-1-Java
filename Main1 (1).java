import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

package com.company;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/dabdigaziz/IdeaProjects/Java/file1.txt");
        Scanner sc = new Scanner(file);
        double x, y;

        while (sc.hasNextInt()) {
            x = sc.nextInt();
            y = sc.nextInt();
        }
        Point NewPoint = new Point(x, y);
        System.out.print
    }
}

