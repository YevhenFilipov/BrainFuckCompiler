package services;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckConstants;

import java.util.LinkedList;
import java.util.List;

/**
 */
public class BrainFuckCompiler {

    public boolean checkLexisOfThisCode(BrainFuckCode code) {
        final String codeString = code.getCode();
        int numOfBlocks = 0;
        for (int i = 0; i < codeString.length(); i++) {
            char curChar = codeString.charAt(i);
            switch (curChar) {
                case BrainFuckConstants.WHILE:
                    numOfBlocks++;
                    break;
                case BrainFuckConstants.END:
                    numOfBlocks--;
                    break;
            }
        }
        if (numOfBlocks == 0) {
            return true;
        }
        return false;
    }

    public List<Command> getCommands(BrainFuckCode code) {
        List<Command> commandsList = new LinkedList<Command>();
        if(!this.checkLexisOfThisCode(code)) return commandsList;
        for (int i = 0; i < code.getCode().length(); i++) {
            CommandFactory factory = new CommandFactory();
            char currentCharInCode = code.getCode().charAt(i);
            Command command = factory.getCommand(currentCharInCode);
            commandsList.add(command);
        }
        return commandsList;
    }

    public List<Command> optimizeCommands(BrainFuckCode code){
        List<Command> commands = this.getCommands(code);
        List<Command> optimizedCommands = new LinkedList<Command>();
        if(commands.isEmpty()) return optimizedCommands;



        return optimizedCommands;
    }


}
