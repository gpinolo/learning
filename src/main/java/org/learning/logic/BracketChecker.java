package org.learning.logic;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class BracketChecker {

    private final static Map<Character, Character> CLOSED_OPEN_BRACKET = Map.of(')', '(',
                                                                                ']', '[',
                                                                                '}', '{');
    private final static Set<Character> CLOSED_BRACKET_SET = CLOSED_OPEN_BRACKET.keySet();
    private final static Collection<Character> OPEN_BRACKET_COLLECTION = CLOSED_OPEN_BRACKET.values();

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
            if(OPEN_BRACKET_COLLECTION.contains(c)){
                stack.push(c);
            }
            else if(CLOSED_BRACKET_SET.contains(c)){
                if (stack.isEmpty() || stack.pop() != CLOSED_OPEN_BRACKET.get(c)) {
                    return false;
                }
            }
            else{
                throw new IllegalStateException("Unexpected char: " + c);
            }
        }
        return stack.isEmpty();
    }
}
