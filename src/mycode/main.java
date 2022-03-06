package mycode;

import mycode.controller.Cinema;
import mycode.controller.CinemaAfi;
import mycode.controller.CinemaPlaza;

public class main {

    public static void main(String[] args) {


        CinemaAfi cinemaAfi = new CinemaAfi();
        CinemaPlaza cinemaPlaza = new CinemaPlaza();

        Cinema c = cinemaAfi;
        c = cinemaPlaza;

        View v = new View(c);
        v.play();
    }
}
