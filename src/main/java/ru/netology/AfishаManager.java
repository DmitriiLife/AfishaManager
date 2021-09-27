package ru.netology;

public class AfishаManager {
    private Film[] film = new Film[0];
    private int maxFilms = 10;


    public AfishаManager(int maxFilms) {
        this.maxFilms = maxFilms;
    }

    public AfishаManager() {
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
        int length = film.length + 1;
        Film[] result = new Film[length];
        System.arraycopy(film, 0, result, 0, film.length);
        int lastIndex = result.length - 1;
        result[lastIndex] = item;
        film = result;
    }

    public Film[] showAll() {
        int length = maxFilms;
        if (length > film.length) {
            length = film.length;
        }
        if (maxFilms <= 0) {
            length = film.length;
        }
        Film[] result = new Film[length];
        for (int i = 0; i < length; i++) {
            int index = film.length - i - 1;
            result[i] = film[index];
        }
        return result;
    }
}