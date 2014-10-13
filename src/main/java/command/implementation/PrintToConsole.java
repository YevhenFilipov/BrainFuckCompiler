package command.implementation;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckData;

/**
 *
 */
public class PrintToConsole extends Command{
    @Override
    public void execute(BrainFuckData data, BrainFuckCode code) {

        System.out.print(data.getCurrentCharFromArray());

        int currentPositionInCode = code.getCurrentPosition() + 1;
        code.setCurrentPosition(currentPositionInCode);
    }
}
