package services;

import entity.BrainFuckCode;
import entity.BrainFuckConstants;

/**
 */
public class CheckLexis {
    public CheckLexis() {

    }

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
}
