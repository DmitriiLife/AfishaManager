package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostManagerTest {

    PostManager postManager = new PostManager();
    PostManager repo = new PostManager();
    PostManager maxFilm = new PostManager(10);


    @Test
    public void ShowTenFilms() {
        Film[] actual = postManager.getAllLast();
        Film[] expected = new Film[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void PostManager() {
        Film first = new Film(1, "first", "thriller");
        Film second = new Film(2, "second", "cartoon");
        Film third = new Film(3, "third", "comedy");
        Film fourth = new Film(4, "fourth", "thriller");
        Film fifth = new Film(5, "fifth", "horror");
        Film sixth = new Film(6, "sixth", "cartoon");
        Film seventh = new Film(7, "seventh", "comedy");

        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.save(fourth);
        repo.save(fifth);
        repo.save(sixth);
        repo.save(seventh);
    }

    @Test
    void getAllLast() {
        Film[] actual = postManager.getAllLast();
        Film[] expected = new Film[]{};
        assertArrayEquals(expected, actual);
    }
}