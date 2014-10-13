package command.implementation;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckConstants;
import entity.BrainFuckData;

/**
 *
 */
public class DecrementValue extends Command {

    private final int idCommand = BrainFuckConstants.ID_DECREMENT_VALUE;

    @Override
    public int getIdCommand() {
        return idCommand;
    }

    @Override
    public void execute(BrainFuckData data, BrainFuckCode code) {
        char currentCharInArray = data.getCurrentCharFromArray();
        currentCharInArray--;
        data.setCurrentCharToArray(currentCharInArray);

        int currentPositionInCode = code.getCurrentPosition() + 1;
        code.setCurrentPosition(currentPositionInCode);
    }
}
