package mycode;

import mycode.controller.Cinema;

import java.util.Scanner;

public class View {

    private Cinema cinema;
    Scanner read;

    public View(Cinema controller) {

        this.cinema = controller;
        read = new Scanner(System.in);
    }

    public void menu(){

        System.out.println("1 Traverse");
        System.out.println("2 Add person");
        System.out.println("3 Exit");
    }

    void play(){

        boolean run = true;

        while(run){

            menu();
            String a;
            System.out.print("Alegere : ");
            int alegere = Integer.parseInt(read.next());

            switch(alegere){

                case 1 : cinema.traverse();
                break;

                case 2 : run = false;
                break;
            }
        }
    }
}
