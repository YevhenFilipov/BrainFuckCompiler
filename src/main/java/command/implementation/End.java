package command.implementation;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckData;
import services.BrainFuckServices;

/**
 *
 */
public class End extends Command {
    @Override
    public void execute(BrainFuckData data, BrainFuckCode code) {

        if (data.getCurrentCharFromArray() == 0) {
            int currentPositionInCode = code.getCurrentPosition() + 1;
            code.setCurrentPosition(currentPositionInCode);
        } else {
            BrainFuckServices services = new BrainFuckServices();
            int currentPositionInCode = code.getCurrentPosition();
            currentPositionInCode -= services.getLoopLength(code, false);
            code.setCurrentPosition(currentPositionInCode);
        }
    }
}
