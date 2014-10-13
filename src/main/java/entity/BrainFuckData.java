package entity;

import java.util.Arrays;

/**
 */
public class BrainFuckData {
    private char[] charArray;
    private int currentIndexInArray;

    public BrainFuckData() {
        this.charArray = new char[30000];
        this.currentIndexInArray = 0;
    }

    public char getCurrentCharFromArray() {
        return charArray[currentIndexInArray];
    }

    public void setCurrentCharToArray(char charToArray) {
        this.charArray[currentIndexInArray] = charToArray;
    }

    public int getCurrentIndexInArray() {
        return currentIndexInArray;
    }

    public void setCurrentIndexInArray(int currentIndexInArray) {
        this.currentIndexInArray = currentIndexInArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BrainFuckData that = (BrainFuckData) o;

        if (currentIndexInArray != that.currentIndexInArray) return false;
        if (!Arrays.equals(charArray, that.charArray)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(charArray);
        result = 31 * result + currentIndexInArray;
        return result;
    }
}
