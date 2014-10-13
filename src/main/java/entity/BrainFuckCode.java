package entity;

/**
 */
public class BrainFuckCode {
    private final String code;
    private int currentPosition;

    public BrainFuckCode(String code){
        this.code = code;
        this.currentPosition = 0;
    }

    public String getCode() {
        return code;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BrainFuckCode that = (BrainFuckCode) o;

        if (currentPosition != that.currentPosition) return false;
        if (!code.equals(that.code)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code.hashCode();
        result = 31 * result + currentPosition;
        return result;
    }
}
