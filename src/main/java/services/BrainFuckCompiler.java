package services;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckConstants;
import entity.BrainFuckData;
import my_exceptions.SyntaxErrorBrainFuckCodeException;

import java.util.LinkedList;
import java.util.List;

/**
 */
public class BrainFuckCompiler {

    public boolean checkLexisOfThisCode(String code) throws SyntaxErrorBrainFuckCodeException{
        int numOfBlocks = 0;
        for (int i = 0; i < code.length(); i++) {
            char curChar = code.charAt(i);
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
        throw new SyntaxErrorBrainFuckCodeException(BrainFuckConstants.BAD_BRAIN_FUCK_CODE);
    }

    public List<Command> getCommands(String code) throws SyntaxErrorBrainFuckCodeException {
        List<Command> commandsList = new LinkedList<Command>();
        if(!this.checkLexisOfThisCode(code)) return commandsList;
        for (int i = 0; i < code.length(); i++) {
            CommandFactory factory = new CommandFactory();
            char currentCharInCode = code.charAt(i);
            Command command = factory.getCommand(currentCharInCode);
            commandsList.add(command);
        }
        return commandsList;
    }

    public BrainFuckCode optimizeCommands(String code) throws SyntaxErrorBrainFuckCodeException {
        List<Command> commands = this.getCommands(code);
        List<Command> optimizedCommands = new LinkedList<Command>();

        if(commands.isEmpty()) return null;

        boolean firstIterationFlag = true;

        for (Command currentCommand: commands){
            if(currentCommand.getIdCommand() == BrainFuckConstants.ID_COMMENT) continue;
            if (firstIterationFlag){
                optimizedCommands.add(currentCommand);
                firstIterationFlag = false;
                continue;
            }
            Command lastOptimizedCommand = optimizedCommands.get(optimizedCommands.size() - 1);
            switch (currentCommand.getIdCommand()){
                case BrainFuckConstants.ID_WHILE:
                case BrainFuckConstants.ID_END:
                case BrainFuckConstants.ID_PRINT_TO_CONSOLE: optimizedCommands.add(currentCommand);
                    break;
                case BrainFuckConstants.ID_SHIFT_RIGHT:
                case BrainFuckConstants.ID_SHIFT_LEFT:
                case BrainFuckConstants.ID_INCREMENT_VALUE:
                case BrainFuckConstants.ID_DECREMENT_VALUE:{
                    if (currentCommand.getIdCommand() == lastOptimizedCommand.getIdCommand()){
                        lastOptimizedCommand.incrementNumberOfIteration();
                    }else optimizedCommands.add(currentCommand);
                }
                    break;
                default: continue;
            }
        }
        BrainFuckCode optimizedCode = new BrainFuckCode(optimizedCommands);
        return optimizedCode;
    }

    public void execute (BrainFuckData data, String code) throws SyntaxErrorBrainFuckCodeException {
        BrainFuckCode commands = this.optimizeCommands(code);
        while (commands.getCurrentPosition() < commands.getCode().size()){
            int indexOfCurrentCommand = commands.getCurrentPosition();
            Command currentCommand = commands.getCode().get(indexOfCurrentCommand);

            currentCommand.execute(data, commands);
        }
    }


}
