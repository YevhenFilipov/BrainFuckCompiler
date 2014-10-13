package command.implementation;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckData;

/**
 *
 */
public class DecrementValue extends Command {
    @Override
    public void execute(BrainFuckData data, BrainFuckCode code) {
        char currentCharInArray = data.getCurrentCharFromArray();
        currentCharInArray--;
        data.setCurrentCharToArray(currentCharInArray);

        int currentPositionInCode = code.getCurrentPosition() + 1;
        code.setCurrentPosition(currentPositionInCode);
    }
}
