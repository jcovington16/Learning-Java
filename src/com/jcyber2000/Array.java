package com.jcyber2000;

import static java.lang.Math.max;
import java.util.*;

public class Array {
    private int items[] = {10, 20, 30, 40};
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // If the array is full, resize it
        if (items.length == count) {
            //Create new array (twice the size)
            int[] newItems = new int[count * 2];

            // Copy all the existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            // Set "items" to new array
            items = newItems;
        }
        // Add the new item at the end
        items[count++] = item;
    }

    public void removeAt(int index) {
        // Validate the index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        // Shift items to the left to fill the hole
        // [10, 20, 30, 40]
        // index: 1
        // 1 <-2
        // 2 <-3
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(int item) {
        // If we find it, return index
        // Otherwise return -1
        // O(n) because the worse case item being last in the array
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }

    public void maxItem() {
        // Look through the array and find the max value
        // Return the max value once it is found
        int i;
        int max = items[0];
        for (i = 0; i < items.length; i++)
            if (items[i] > max)
                max = items[i];
    }

    public void reverse(int a[]) {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

}
