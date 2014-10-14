package command.implementation;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckConstants;
import entity.BrainFuckData;
import services.BrainFuckServices;

/**
 *
 */
public class End extends Command {

    private final int idCommand = BrainFuckConstants.ID_END;

    @Override
    public int getIdCommand() {
        return idCommand;
    }

    @Override
    public void execute(BrainFuckData data, BrainFuckCode code) {

        if (data.getCurrentCharFromArray() == 0) {
            code.changeCurrentPositionOn(1);
        } else {
            BrainFuckServices services = new BrainFuckServices();
            code.changeCurrentPositionOn(-services.getLoopLength(code, false));
        }
    }
}
