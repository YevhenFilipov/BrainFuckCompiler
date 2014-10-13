package command.implementation;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckData;

/**
 *
 */
public class Comment extends Command {
    @Override
    public void execute(BrainFuckData data, BrainFuckCode code) {
        int currentPositionInCode = code.getCurrentPosition() + 1;
        code.setCurrentPosition(currentPositionInCode);
    }
}
