package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("/file1.txt"));
        Scanner sc2 = new Scanner(new File("/file2.txt"));
        int x, y;
        Shape newvar = new Shape();
        Shape newvar2 = new Shape();
        while(sc1.hasNextLine()) {
            x = sc1.nextInt();
            y = sc1.nextInt();
            Point var = new Point(x, y);
            newvar.addPoint(var);
        }
        newvar.AddDistance();
        System.out.println(newvar.CalculatePerimeter());
        System.out.println(newvar.longestSide());
        System.out.println(newvar.AvrgLength());

        while(sc2.hasNextLine()) {
            x = sc2.nextInt();
            y = sc2.nextInt();
            Point var = new Point(x, y);
            newvar2.addPoint(var);
        }
        newvar2.AddDistance();
        System.out.println(newvar2.CalculatePerimeter());
        System.out.println(newvar2.longestSide());
        System.out.println(newvar2.AvrgLength());

    }
}




