package services;

import command.Command;
import command.implementation.*;
import entity.BrainFuckConstants;

/**
 *
 */
public class CommandFactory {

    public Command getCommand(char currentOperator){

        Command command;
        switch (currentOperator){
            case BrainFuckConstants.SHIFT_RIGHT: command = new ShiftRight();
                break;
            case BrainFuckConstants.SHIFT_LEFT: command = new ShiftLeft();
                break;
            case BrainFuckConstants.INCREMENT_VALUE: command = new IncrementValue();
                break;
            case BrainFuckConstants.DECREMENT_VALUE: command = new DecrementValue();
                break;
            case BrainFuckConstants.PRINT_TO_CONSOLE: command = new PrintToConsole();
                break;
            case BrainFuckConstants.WHILE: command = new While();
                break;
            case BrainFuckConstants.END: command = new End();
                break;
            default: command = new Comment();
                break;
        }
        return command;
    }
}
