package command.implementation;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckConstants;
import entity.BrainFuckData;

/**
 *
 */
public class ShiftLeft extends Command {

    private final int idCommand = BrainFuckConstants.ID_SHIFT_LEFT;

    @Override
    public int getIdCommand() {
        return idCommand;
    }

    @Override
    public void execute(BrainFuckData data, BrainFuckCode code) {

        int currentIndexInArray = data.getCurrentIndexInArray();
        currentIndexInArray -= this.getNumberOfIteration();
        data.setCurrentIndexInArray(currentIndexInArray);

        code.changeCurrentPositionOn(1);
    }
}
