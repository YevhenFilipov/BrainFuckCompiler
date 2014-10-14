package entity;

import command.Command;

import java.util.List;

/**
 */
public class BrainFuckCode {
    private final List<Command> code;
    private int currentPosition;

    public BrainFuckCode(List<Command> code) {
        this.code = code;
        this.currentPosition = 0;
    }

    public List<Command> getCode() {
        return code;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void changeCurrentPositionOn(int deltaCurrentPosition) {
        this.currentPosition += deltaCurrentPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BrainFuckCode that = (BrainFuckCode) o;

        if (currentPosition != that.currentPosition) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + currentPosition;
        return result;
    }
}
