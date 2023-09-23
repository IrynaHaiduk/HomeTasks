package de.telran.lesson17.searchAlgoritm;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arrForSearch = {8, 3, 5, 2,2, 4, 7, 6};

        int elementForSearch = 5;

        int indexForSearch = linearSearch(arrForSearch, elementForSearch);

        if(indexForSearch >= 0) {
            System.out.println("Search element " + elementForSearch + " in this array on index " + indexForSearch);
        } else {
            System.out.println("There is not such element in this array");
        }

    }

    public static int linearSearch(int[] workingArray, int elementForSearch) {
        for (int index = 0; index < workingArray.length; index++) {
            if (workingArray[index] == elementForSearch) {
              return index;
            }
        }
        return -1;
    }
}
