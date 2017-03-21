package pl.wiktordolecki;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.emptyCollectionOf;
import static org.hamcrest.Matchers.is;
import static pl.wiktordolecki.Excercise02.cons;
import static pl.wiktordolecki.Excercise02.head;
import static pl.wiktordolecki.Excercise02.tail;

public class Excercise02Test {

    @Test
    public void headReturnsFirstElement() throws Exception {
        List<String> list = asList("head", "gives", "first", "element", "of", "a", "list");

        assertThat(head(list), is("head"));
    }

    @Test
    public void tailReturnsRemainingElements() throws Exception {
        List<String> list = asList("head", "gives", "first", "element", "of", "a", "list");

        assertThat(tail(list), contains("gives", "first", "element", "of", "a", "list"));
    }

    @Test
    public void tailOfOneElementListIsEmpty() throws Exception {
        List<String> list = asList("head");

        assertThat(tail(list), emptyCollectionOf(String.class));
    }

    @Test
    public void consCreatesCorrectList() throws Exception {
        String head = "head";
        List<String> tail = asList("added", "correctly", "to", "the", "list");

        List<String> result = cons(head, tail);

        assertThat(result, contains("head", "added", "correctly", "to", "the", "list"));
    }

    @Test
    public void reverseRecursive() throws Exception {

    }

    @Test
    public void reverseNonRecursive() throws Exception {

    }

}