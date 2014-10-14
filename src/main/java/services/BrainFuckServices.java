package services;

import command.Command;
import entity.BrainFuckCode;
import entity.BrainFuckConstants;

/**
 *
 */
public class BrainFuckServices {

    public int getLoopLength(BrainFuckCode code, boolean forvardSearch){
        int loopLenght = 0;
        int numberOfInnerLoops = 0;
        int currentPosition = code.getCurrentPosition();

        while (currentPosition > 0 && currentPosition < code.getCode().size()){
            Command currentCommand = code.getCode().get(currentPosition);
            switch (currentCommand.getIdCommand()){
                case BrainFuckConstants.ID_WHILE: numberOfInnerLoops++;
                    break;
                case BrainFuckConstants.ID_END: numberOfInnerLoops--;
                    break;
            }
            loopLenght++;
            if(numberOfInnerLoops == 0) break;
            if (forvardSearch) currentPosition ++;
            else currentPosition --;
        }
        return loopLenght - 1;
    }
}
