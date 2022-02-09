package aitu.java;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("C:/example/example/youshouldwriteyourownpath/file1.txt"));
        Scanner sc2 = new Scanner(new File("C:/example/example/youshouldwriteyourownpath/file2.txt"));
        int x, y;
        while(sc1.hasNextLine()) {
            x = sc1.nextInt();
            y = sc1.nextInt();
        }

        while(sc2.hasNextLine()) {
            x = sc2.nextInt();
            y = sc2.nextInt();
        }

    }
}
