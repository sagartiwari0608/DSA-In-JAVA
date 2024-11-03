package ArraysInJava;

public class MyArrays {
    private int[] items;
    private int index;

    public MyArrays(int intialSize) {
        this.items = new int[intialSize];
        this.index = 0;
    }

    public void insert(int value) {
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
        for (int i = indexToDelete; i < this.index - 1; i++) {
            items[i] = items[i + 1];
        }
        this.index--;
        return removedItem;
    }
}
