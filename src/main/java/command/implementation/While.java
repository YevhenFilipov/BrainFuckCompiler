package command.implementation;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckData;
import services.BrainFuckServices;


/**
 *
 */
public class While implements Command {
    @Override
    public void execute(BrainFuckData data, BrainFuckCode code) {
        if (data.getCurrentCharFromArray() == 0) {
            BrainFuckServices services = new BrainFuckServices();
            int currentPositionInCode = code.getCurrentPosition();
            currentPositionInCode += services.getLoopLength(code, true);
            code.setCurrentPosition(currentPositionInCode);
        } else {
            int currentPositionInCode = code.getCurrentPosition() + 1;
            code.setCurrentPosition(currentPositionInCode);
        }
    }
}
