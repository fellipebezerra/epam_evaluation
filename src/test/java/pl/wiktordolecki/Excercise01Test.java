package pl.wiktordolecki;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static pl.wiktordolecki.Excercise01.divisibleBy3OR5;

/**
 * Examples of expected behavior
 */
public class Excercise01Test
{
    @Test
    public void emptyList() {
        List<Integer> integers = divisibleBy3OR5(1);
        assertThat(integers, is(Collections.<Integer>emptyList()));
    }

    @Test
    public void listForN3() {
        List<Integer> integers = divisibleBy3OR5(3);
        assertThat(integers, contains(3));
    }

    @Test
    public void listForN5() {
        List<Integer> integers = divisibleBy3OR5(5);
        assertThat(integers, contains(3,5));
    }


    @Test
    public void listForN6() {
        List<Integer> integers = divisibleBy3OR5(6);
        assertThat(integers, contains(3,5,6));
    }
}
