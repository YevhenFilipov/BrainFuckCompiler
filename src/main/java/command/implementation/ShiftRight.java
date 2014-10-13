package command.implementation;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckConstants;
import entity.BrainFuckData;


/**
 *
 */
public class ShiftRight extends Command{

    private final int idCommand = BrainFuckConstants.ID_SHIFT_RIGHT;

    @Override
    public int getIdCommand() {
        return idCommand;
    }

    @Override
    public void execute(BrainFuckData data, BrainFuckCode code) {

        int currentIndexInArray = data.getCurrentIndexInArray();
        currentIndexInArray++;
        data.setCurrentIndexInArray(currentIndexInArray);

        int currentPositionInCode = code.getCurrentPosition() + 1;
        code.setCurrentPosition(currentPositionInCode);
    }
}
