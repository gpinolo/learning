package org.learning.logic;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class BracketChecker {

    private final static Map<Character, Character> CHARACTER_CHARACTER_MAP = Map.of(')', '(',
                                                                                ']', '[',
                                                                                '}', '{');
    private final static Set<Character> CLOSED_BRACKET_SET = CHARACTER_CHARACTER_MAP.keySet();
    private final static Collection<Character> OPEN_BRACKET_COLLECTION = CHARACTER_CHARACTER_MAP.values();

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
        for (char bracket : charArray) {
            if(OPEN_BRACKET_COLLECTION.contains(bracket)){
                stack.push(bracket);
            }
            else if(CLOSED_BRACKET_SET.contains(bracket)){
                if (stack.isEmpty() || stack.pop() != CHARACTER_CHARACTER_MAP.get(bracket)) {
                    return false;
                }
            }
            else{
                throw new IllegalStateException("Unexpected char: " + bracket);
            }
        }
        return stack.isEmpty();
    }
}
