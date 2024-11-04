package ArraysInJava;

public class MyArrays {
    private int[] items;
    private int index;

    public MyArrays(int intialSize) {
        this.items = new int[intialSize];
        this.index = 0;
    }

    public void insert(int value) {
        // this is just for insertion
        // this.items[index] = value;
        // this.index++;

        // this will be for incrementing the array size by twice so that we dont
        // increment it always.
        if (this.index == this.items.length) {
            int[] temp = new int[items.length * 2];

        }
        this.items[index] = value;
        this.index++;
    }

    public String toString() {
        StringBuilder arrToStr = new StringBuilder();
        arrToStr.append("[ ");
        for (int num : items) {
            arrToStr.append(num).append(", ");
        }
        arrToStr.append("\b").append("\b").append("]");
        return arrToStr.toString();
    }

    public int find(int value) {
        for (int num = 0; num < this.index; num++) { // here we used index because having array length more than items
                                                     // added will cause performance and inconsistant issues whenn we
                                                     // find 0 in it because of default "int" value being zero 0 .
            if (items[num] == value) {
                return num;
            }
        }
        return -1;
    }

    public int removeAtIndex(int indexToDelete) {
        var removedItem = items[indexToDelete];
        if (indexToDelete > this.index) {
            throw new IllegalArgumentException();
        }
        for (int i = indexToDelete; i < this.index - 1; i++) {
            items[i] = items[i + 1];
        }
        this.index--;
        this.items[index] = 0;
        return removedItem;
    }

    public int max() {
        var maxItem = this.items[0];
        for (int i = 0; i < this.index; i++) {
            if (this.items[i] > maxItem) {
                maxItem = this.items[i];
            }
        }
        return maxItem;
    }

    public int min() {
        var minItem = this.items[0];
        for (int i = 0; i < this.index; i++) {
            if (this.items[i] < minItem) {
                minItem = this.items[i];
            }
        }
        return minItem;
    }

    public void reverseArray() {
        // this method works but isn't optimal as it was known it takes O(n) space and
        // time both.
        // One Point to note is that when we are asked to not change the original array
        // then we are supposed to use O(n) space complexity.
        // except time complexity should always be O(1) with the TWO POINTER METHOD.

        // var reversedArray = new int[this.index];
        // var tempIndex = 0;
        // for (int i = this.index; i >= 0; i--) {
        // reversedArray[tempIndex] = this.items[i];
        // System.out.println(reversedArray[tempIndex]);
        // }

        // Two Pointer method.
        int i = 0;
        int j = this.index - 1;
        var temp = 0;

        while (i < j) {
            temp = this.items[i];
            this.items[i] = this.items[j];
            this.items[j] = temp;
            i++;
            j--;
        }

    }
}
