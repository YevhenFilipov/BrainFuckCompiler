package command.implementation;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckConstants;
import entity.BrainFuckData;

/**
 *
 */
public class Comment extends Command {
    private final int idCommand = BrainFuckConstants.ID_COMMENT;

    @Override
    public int getIdCommand() {
        return idCommand;
    }

    @Override
    public void execute(BrainFuckData data, BrainFuckCode code) {
        code.changeCurrentPositionOn(1);
    }
}
