package com.sda.exercises.search;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchTest {

    @Test
    public void searchTest() {

        //given
        BinarySearch binarySearch = new BinarySearch();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        new ArrayList<>(list);

        //when
        int returned = binarySearch.search(list, 5);
        int expected = 4;

        //then
        Assert.assertEquals(returned, expected);
    }
}
