package command;

import entity.BrainFuckCode;
import entity.BrainFuckData;

/**
 *
 */
public interface Command {

    public void execute(BrainFuckData data, BrainFuckCode code);

}
