package command.implementation;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckConstants;
import entity.BrainFuckData;

/**
 *
 */
public class PrintToConsole extends Command {

    private final int idCommand = BrainFuckConstants.ID_PRINT_TO_CONSOLE;

    @Override
    public int getIdCommand() {
        return idCommand;
    }

    @Override
    public void execute(BrainFuckData data, BrainFuckCode code) {

        System.out.print(data.getCurrentCharFromArray());

        code.changeCurrentPositionOn(1);
    }
}
