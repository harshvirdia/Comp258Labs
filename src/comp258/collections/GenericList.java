/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.collections;

public class GenericList<T extends Comparable<T>> {
    
    private T[] items;
    private int size;
    private int currentPosition;

    @SuppressWarnings("unchecked")
    public GenericList() {
        items = (T[]) new Comparable[10];
        size = 0;
        currentPosition = -1;
    }

    public void add(T item) {
        if (size == items.length) {
            @SuppressWarnings("unchecked")
            T[] newItems = (T[]) new Comparable[items.length * 2];

            System.arraycopy(items, 0, newItems, 0, size);
            items = newItems;
        }

        items[size++] = item;

        if (currentPosition == -1) {
            currentPosition = 0;
        }
    }

    public T getMaximum() {
        if (size == 0) {
            currentPosition = -1;
            return null;
        }

        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (items[i].compareTo(items[maxIndex]) > 0) {
                maxIndex = i;
            }
        }

        currentPosition = maxIndex;
        return items[maxIndex];
    }

    public T getCurrent() {
        if (currentPosition < 0 || currentPosition >= size) {
            return null;
        }

        return items[currentPosition];
    }

    public void advance() {
        if (currentPosition >= 0 && currentPosition < size - 1) {
            currentPosition++;
        }
    }

    public T removeCurrent() {
        if (currentPosition < 0 || currentPosition >= size) {
            return null;
        }

        T removed = items[currentPosition];

        for (int i = currentPosition; i < size - 1; i++) {
            items[i] = items[i + 1];
        }

        items[--size] = null;

        if (size == 0) {
            currentPosition = -1;
        } else if (currentPosition >= size) {
            currentPosition = size - 1;
        }

        return removed;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
