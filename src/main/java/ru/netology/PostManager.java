package ru.netology;

import java.util.Arrays;

public class PostManager {
    public Film[] film = new Film[0];
    private int maxFilms = 10;

    public PostManager(int maxFilms) {
        this.maxFilms = maxFilms;
    }

    public PostManager() {
    }

    private static String[] films = {
            "bloodShot",
            "forward",
            "hotelBelgrade",
            "gentlemen",
            "invisibleMan",
            "trollsWorldTour",
            "numberOne",
    };
    static String newFilm = "spiderMan";

    public static void main(String[] args) {
        String[] allFilms = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            allFilms[i] = films[i];
        }
        allFilms[allFilms.length - 1] = newFilm;
        films = allFilms;
        System.out.println(Arrays.toString(films));
    }

    public Film[] getAllLast() {
        int resultLength;
        if (film.length < maxFilms) {
            resultLength = film.length;
        } else {
            resultLength = maxFilms;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = resultLength - i - 1;
            result[i] = film[index];
        }
        return result;
    }

    public void save(Film item) {
        int length = film.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(film, 0, tmp, 0, film.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        film = tmp;
    }

    public Film[] findAll() {
        return film;
    }

    public void removeById(int id) {

        int length = film.length - 1;
        Film[] tmp = new Film[length];
        int index = 0;
        for (Film item : film) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        film = tmp;
    }

    public void addFilm(Film item) {
        int filmLength = film.length + 1;
        Film[] result = new Film[filmLength];
        for (int i = 0; i < film.length; i++) {
            result[i] = film[i];
        }
        int lastIndex = result.length - 1;
        result[lastIndex] = item;
        film = result;
    }

    public Film[] getAll() {
        Film[] films = findAll();
        Film[] result = new Film[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}