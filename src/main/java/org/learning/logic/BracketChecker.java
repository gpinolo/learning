package org.learning.logic;

import java.util.Map;
import java.util.Stack;

public class BracketChecker {

    private final static char OPEN_ROUND = '(';
    private final static char OPEN_SQUARE = '[';
    private final static char OPEN_CURLY = '{';
    private final static char CLOSED_ROUND = ')';
    private final static char CLOSED_SQUARE = ']';
    private final static char CLOSED_CURLY = '}';

    private final static Map<Character, Character> CLOSED_OPEN_BRACKET = Map.of(CLOSED_ROUND, OPEN_ROUND,
                                                                                CLOSED_SQUARE, OPEN_SQUARE,
                                                                                CLOSED_CURLY, OPEN_CURLY);

    /**
     * Check that the brackets `()`, `[]`and `{}` are correctly nested and balanced
     * @param brackets sequence to check
     * @return true if brackets sequence are correctly nested and balanced
     */
    public static boolean isValid(String brackets) {
        if(brackets==null){
            throw new IllegalArgumentException();
        }
        char[] charArray = brackets.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : charArray) {
            switch (c) {
                case OPEN_ROUND, OPEN_SQUARE, OPEN_CURLY -> stack.push(c);
                case CLOSED_ROUND, CLOSED_SQUARE, CLOSED_CURLY -> {
                    if(stack.isEmpty()){
                        return false;
                    }
                    Character lastBracket = stack.pop();
                    if (lastBracket != CLOSED_OPEN_BRACKET.get(c)) {
                        return false;
                    }
                }
                default -> throw new IllegalStateException("Unexpected char: " + c);
            }
        }
        return stack.isEmpty();
    }
}