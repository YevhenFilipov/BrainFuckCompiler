package command.implementation;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckConstants;
import entity.BrainFuckData;

/**
 *
 */
public class IncrementValue extends Command  {

    private final int idCommand = BrainFuckConstants.ID_INCREMENT_VALUE;

    @Override
    public int getIdCommand() {
        return idCommand;
    }

    @Override
    public void execute(BrainFuckData data, BrainFuckCode code) {

        char currentCharInArray = data.getCurrentCharFromArray();
        currentCharInArray += this.getNumberOfIteration();
        data.setCurrentCharToArray(currentCharInArray);

        code.changeCurrentPositionOn(1);
    }
}
