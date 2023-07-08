package com.company;

public class Main {

    public static void main(String[] args) {
        final int max = 10;
        Integer[] array = new Integer[max];
        add(array, 1);
        add(array, 2);
        add(array, 3);
        add(array, 4);
        add(array, 5);
        add(array, 6);
        add(array, 7);
        add(array, 8);
        add(array, 9);
        add(array, 10);
        add(array, 7);
        add(array, 7);

        Generic<Integer> myArray = new Generic<>(array);
        System.out.println(myArray.Search(6));
        System.out.println(myArray.Search(7));

        printArray(array);

        remove(array,5);

        printArray(array);

    }
    public static void add(Integer[] arr, int elem) {
        try {
            for(int i = 0; i <= arr.length; i++) {
                if (i == arr.length) throw new Exception("Массив полон. Нельзя добавить элемент "+elem);
                if (arr[i] == null) {
                    arr[i] = elem;
                    break;
                }
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void remove(Integer[] arr, int elem) {
        try {
            boolean flag = false;
            int tmp = -1;
            for(int i = 0; i < arr.length; i++) {
                if ((arr[i] == elem)&&(!flag)) {
                    System.out.println("Элемент "+arr[i]+ " удалён, массив перестроен");
                    arr[i] = null;
                    tmp = i;
                    flag = true;
                }
            }
            if (!flag) throw new Exception("Такого элемента нет в массиве или массив пуст");

            for(int j = tmp; j < arr.length-1; j++) {
                arr[j] = arr[j + 1];
                arr[j + 1] = null;
            }

        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void printArray(Integer[] arr) {
        try {
            int count = 0;
            for (Integer integer : arr) {
                if (integer != null)
                    count++;
            }
            if (count == 0) throw new Exception("Массив пуст. Печатать нечего");
            for (int j = 0; j < count; j++)
                System.out.println(arr[j]);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
