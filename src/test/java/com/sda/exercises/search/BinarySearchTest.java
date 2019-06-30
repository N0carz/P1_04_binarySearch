package com.sda.exercises.search;

import com.sda.exercises.exception.NoElementException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void searchTest() {

        //given
        BinarySearch binarySearch = new BinarySearch();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        new ArrayList<>(list);

        //when
        int returned = 0;
        try {
            returned = binarySearch.search(list, 5);
        } catch (NoElementException e) {
            e.printStackTrace();
        }
        int expected = 4;

        //then
        Assert.assertEquals(returned, expected);
    }

    @Test
    public void searchThrowException(){

        //given
        BinarySearch binarySearch = new BinarySearch();
        List<Integer> list = new ArrayList<>(Arrays.asList(3,4,2,0));

//        when
        try {
            binarySearch.search(list, 5);
            expectedException.expect(NoElementException.class);
        } catch (NoElementException e) {
            e.printStackTrace();
        }
    }
}
