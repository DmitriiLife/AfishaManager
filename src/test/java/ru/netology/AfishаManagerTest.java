package ru.netology;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AfishаManagerTest {

    AfishаManager afishаManager = new AfishаManager(10);

    @Test
    public void showAllFilms() {
        Film first = new Film(1, "bloodShot", "thriller");
        Film second = new Film(2, "forward", "cartoon");
        Film third = new Film(3, "hotelBelgrade", "comedy");
        Film fourth = new Film(4, "gentlemen", "thriller");
        Film fifth = new Film(5, "invisibleMan", "horror");
        Film sixth = new Film(6, "trollsWorldTour", "cartoon");
        Film seventh = new Film(7, "numberOne", "comedy");
        afishаManager.addFilm(first);
        afishаManager.addFilm(second);
        afishаManager.addFilm(third);
        afishаManager.addFilm(fourth);
        afishаManager.addFilm(fifth);
        afishаManager.addFilm(sixth);
        afishаManager.addFilm(seventh);
        Film[] actual = afishаManager.getAllLast();
        Film[] expected = new Film[]{seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void RemoveIfExists() {
        int idToRemove = 1;
        Film first = new Film(1, "bloodShot", "thriller");
        Film second = new Film(2, "forward", "cartoon");
        Film third = new Film(3, "hotelBelgrade", "comedy");
        Film fourth = new Film(4, "gentlemen", "thriller");
        Film fifth = new Film(5, "invisibleMan", "horror");
        Film sixth = new Film(6, "trollsWorldTour", "cartoon");
        Film seventh = new Film(7, "numberOne", "comedy");
        afishаManager.addFilm(first);
        afishаManager.addFilm(second);
        afishаManager.addFilm(third);
        afishаManager.addFilm(fourth);
        afishаManager.addFilm(fifth);
        afishаManager.addFilm(sixth);
        afishаManager.addFilm(seventh);
        afishаManager.removeById(idToRemove);
        Film[] actual = afishаManager.getAllLast();
        Film[] expected = new Film[]{seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAboveMaxFilms() {
        Film first = new Film(1, "bloodShot", "thriller");
        Film second = new Film(2, "forward", "cartoon");
        Film third = new Film(3, "hotelBelgrade", "comedy");
        Film fourth = new Film(4, "gentlemen", "thriller");
        Film fifth = new Film(5, "invisibleMan", "horror");
        Film sixth = new Film(6, "trollsWorldTour", "cartoon");
        Film seventh = new Film(7, "numberOne", "comedy");
        Film eighth = new Film(8, "spiderMan2", "fantasy");
        Film ninth = new Film(9, "spiderMan3", "fantasy");
        Film tenth = new Film(10, "spiderMan3", "fantasy");
        Film eleventh = new Film(11, "Mario", "cartoon");
        afishаManager.addFilm(first);
        afishаManager.addFilm(second);
        afishаManager.addFilm(third);
        afishаManager.addFilm(fourth);
        afishаManager.addFilm(fifth);
        afishаManager.addFilm(sixth);
        afishаManager.addFilm(seventh);
        afishаManager.addFilm(eighth);
        afishаManager.addFilm(ninth);
        afishаManager.addFilm(tenth);
        afishаManager.addFilm(eleventh);
        Film[] actual = afishаManager.getAllLast();
        Film[] expected = new Film[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }
}
