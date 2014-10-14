package command;

import entity.BrainFuckCode;
import entity.BrainFuckData;

/**
 *
 */
public abstract class Command {
    private int numberOfIteration = 1;

    public void incrementNumberOfIteration() {
        this.numberOfIteration++;
    }

    public int getNumberOfIteration() {
        return numberOfIteration;
    }

    public abstract int getIdCommand();
    public abstract void execute(BrainFuckData data, BrainFuckCode code);


}
