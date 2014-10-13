package services;

import command.Command;
import entity.BrainFuckCode;
import java.util.LinkedList;
import java.util.List;

/**
 */
public class CommandMaker {
    public List<Command> getCommands(BrainFuckCode code) {
        List<Command> commandsList = new LinkedList<Command>();
        for (int i = 0; i < code.getCode().length(); i++) {
            CommandFactory factory = new CommandFactory();
            char currentCharInCode = code.getCode().charAt(i);
            Command command = factory.getCommand(currentCharInCode);
            commandsList.add(command);
        }
        return commandsList;
    }
}
