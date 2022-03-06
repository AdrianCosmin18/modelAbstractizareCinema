package mycode.controller;

import mycode.model.Film;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class CinemaAfi implements Cinema{

    private ArrayList<Film> filme;

    public CinemaAfi() {

        filme = new ArrayList<>();
        load();
    }

    public void load(){

        try{

            File f = new File("cinema/src/mycode/utility/filmeAfi.txt");
            Scanner read = new Scanner(f);
            while(read.hasNextLine()){

                String text = read.nextLine();
                addFilm(new Film(text));
            }
        }catch(Exception e){}
    }

    @Override
    public void traverse(){

        for (Film f: filme){

            System.out.println(f);
            System.out.println();
        }
    }

    @Override
    public void addFilm(Film f) {

        filme.add(f);
    }

    @Override
    public void removeFilm(int index) {

        filme.remove(index);
    }

    @Override
    public Film getFilmById(int id) {

        for(Film f : filme){

            if(f.getId() == id)
                return f;
        }

        return null;
    }

}
