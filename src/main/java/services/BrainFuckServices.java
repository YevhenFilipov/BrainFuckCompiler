package services;

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

        while (currentPosition > 0 && currentPosition < code.getCode().length()){
            switch (code.getCode().charAt(currentPosition)){
                case BrainFuckConstants.WHILE: numberOfInnerLoops++;
                    break;
                case BrainFuckConstants.END: numberOfInnerLoops--;
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
