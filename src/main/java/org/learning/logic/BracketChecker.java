package org.learning.logic;

import java.util.Stack;

public class BracketChecker {

    private final static char OPEN_ROUND = '(';
    private final static char OPEN_SQUARE = '[';
    private final static char OPEN_CURLY = '{';
    private final static char CLOSED_ROUND = ')';
    private final static char CLOSED_SQUARE = ']';
    private final static char CLOSED_CURLY = '}';

    /**
     * verifica se le parentesi (tonde `()`, quadre `[]` e graffe `{}`)
     * sono correttamente annidate e bilanciate nella stringa fornita.
     * @param braces la sequenza di parentesi da controllare
     * @return true se la sequenza di parentesi fornita è annidata correttamente, false altrimenti
     */
    public static boolean isValid(String braces) {
        if(braces==null){
            throw new IllegalArgumentException();
        }
        char[] charArray = braces.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : charArray) {
            switch (c) {
                case OPEN_ROUND -> stack.push(OPEN_ROUND);
                case OPEN_SQUARE -> stack.push(OPEN_SQUARE);
                case OPEN_CURLY -> stack.push(OPEN_CURLY);
                case CLOSED_ROUND -> {
                    Character lastBracket = stack.pop();
                    if (lastBracket != OPEN_ROUND) {
                        return false;
                    }
                }
                case CLOSED_SQUARE -> {
                    Character lastBracket = stack.pop();
                    if (lastBracket != OPEN_SQUARE) {
                        return false;
                    }
                }
                case CLOSED_CURLY -> {
                    Character lastBracket = stack.pop();
                    if (lastBracket != OPEN_CURLY) {
                        return false;
                    }
                }
                default -> throw new IllegalStateException("Unexpected char: " + c);
            }

        }
        return true;
    }
}
