package ru.netology;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AfishаManagerTest {
    AfishаManager afishаManagerDefault = new AfishаManager();
    AfishаManager afishаManager = new AfishаManager(7);

    private Film first = new Film(1, "bloodShot", "thriller");
    private Film second = new Film(2, "forward", "cartoon");
    private Film third = new Film(3, "hotelBelgrade", "comedy");
    private Film fourth = new Film(4, "gentlemen", "thriller");
    private Film fifth = new Film(5, "invisibleMan", "horror");
    private Film sixth = new Film(6, "trollsWorldTour", "cartoon");
    private Film seventh = new Film(7, "numberOne", "comedy");
    private Film eighth = new Film(8, "spiderMan2", "fantasy");
    private Film ninth = new Film(9, "spiderMan3", "fantasy");
    private Film tenth = new Film(10, "spiderMan3", "fantasy");
    private Film eleventh = new Film(11, "Mario", "cartoon");

    @Test
    public void removeIfExists() {
        AfishаManager afishаManager = new AfishаManager(2);
        afishаManager.addFilm(fourth);
        afishаManager.addFilm(fifth);
        afishаManager.addFilm(sixth);
        afishаManager.removeById(4);
        Film[] actual = afishаManager.showAll();
        Film[] expected = new Film[]{sixth, fifth};
        assertArrayEquals(expected, actual);
    }


    @Test
    public void showFilms() {
        AfishаManager afishаManager = new AfishаManager(7);
        afishаManager.addFilm(first);
        afishаManager.addFilm(second);
        afishаManager.addFilm(third);
        afishаManager.addFilm(fourth);
        afishаManager.addFilm(fifth);
        afishаManager.addFilm(sixth);
        afishаManager.addFilm(seventh);
        Film[] actual = afishаManager.showAll();
        Film[] expected = new Film[]{seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAboveMaxFilms() {
        afishаManagerDefault.addFilm(first);
        afishаManagerDefault.addFilm(second);
        afishаManagerDefault.addFilm(third);
        afishаManagerDefault.addFilm(fourth);
        afishаManagerDefault.addFilm(fifth);
        afishаManagerDefault.addFilm(sixth);
        afishаManagerDefault.addFilm(seventh);
        afishаManagerDefault.addFilm(eighth);
        afishаManagerDefault.addFilm(ninth);
        afishаManagerDefault.addFilm(tenth);
        afishаManagerDefault.addFilm(eleventh);
        Film[] actual = afishаManagerDefault.showAll();
        Film[] expected = new Film[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    void addFIlm() {
        afishаManagerDefault.addFilm(first);
        afishаManagerDefault.addFilm(second);
        afishаManagerDefault.addFilm(third);
        Film[] actual = afishаManagerDefault.showAll();
        Film[] expected = new Film[]{third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void showEmpty() {
        AfishаManager afishаManager = new AfishаManager(15);
        Film[] actual = afishаManager.showAll();
        Film[] expected = new Film[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    void showNegative() {
        AfishаManager afishаManager = new AfishаManager(-1);
        Film[] actual = afishаManager.showAll();
        Film[] expected = new Film[]{};
        assertArrayEquals(expected, actual);
    }
}