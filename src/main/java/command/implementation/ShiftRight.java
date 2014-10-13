package command.implementation;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckData;


/**
 *
 */
public class ShiftRight extends Command{

    @Override
    public void execute(BrainFuckData data, BrainFuckCode code) {

        int currentIndexInArray = data.getCurrentIndexInArray();
        currentIndexInArray++;
        data.setCurrentIndexInArray(currentIndexInArray);

        int currentPositionInCode = code.getCurrentPosition() + 1;
        code.setCurrentPosition(currentPositionInCode);
    }
}
