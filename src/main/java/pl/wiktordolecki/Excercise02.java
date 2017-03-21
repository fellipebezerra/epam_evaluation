package pl.wiktordolecki;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
/**
 * @author Felipe Bezerra
 */
import java.util.ArrayList;

/**
 * Using given bellow restricted list API write function that creates
 * NEW Reversed list from input list. Original list should not be altered.
 *
 * Limit used list operations only to given: head, tail, cons
 * and isEmpty() of java.util.List
 *
 * 1. using recursion
 * 2. without using recursion
 */
public class Excercise02<T> {

    /**
     * First element of a list
     */
    public static<T> T head(List<T> list) {
        if (list.isEmpty()) {        	
            throw new NoSuchElementException();
        } else {
            return list.get(0);
        }
    }

    /**
     * All elements of a list except first
     */
    public static<T> List<T> tail(List<T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return list.subList(1, list.size());
        }
    }

    /**
     * Construct new list from element and given tail
     */
    public static List<String> cons(String elem, List<String> tail) {
        
        int Size = tail.size();
        ArrayList<String> list = new ArrayList<String>();
        list.add(elem);
        for (int i = 0; i < Size; i++) {
        	//System.out.println(tail.get(i));
        	list.add(tail.get(i));    
        }
        
        return list;
    }

    /**
     * Recursive implementation of list reversing
     *
     * @param list List to be reverted
     * @param <T> list type
     * @return Reverted contents of input list
     */
    public static<T> List<T> reverseRecursive(List<T> list) {
        return Collections.emptyList();
    }

    /**
     * Non-Recursive implementation of list reversing
     *
     * @param list List to be reverted
     * @param <T> list type
     * @return Reverted contents of input list
     */
    public static<T> List<T> reverseNonRecursive(List<T> list) {
        return Collections.emptyList();
    }
}
