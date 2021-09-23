package ru.netology;

public class AfishаManager {
    private Film[] film = new Film[0];
    private int maxFilms = 10;


    public AfishаManager(int maxFilms) {
        this.maxFilms = maxFilms;
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
        int Length = film.length + 1;
        Film[] result = new Film[Length];
        System.arraycopy(film,0,result,0,film.length);
        int lastIndex = result.length - 1;
        result[lastIndex] = item;
        film = result;
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
}