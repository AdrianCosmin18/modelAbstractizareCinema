package mycode.controller;

import mycode.model.Film;

public interface Cinema {

    void addFilm(Film f);
    void removeFilm(int index);
    Film getFilmById(int id);
    void traverse();
}
