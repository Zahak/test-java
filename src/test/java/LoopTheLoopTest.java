import org.junit.Test;

import static org.junit.Assert.assertEquals;

import se.johannes.LoopTheLoop;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopTheLoopTest {
    private ArrayList<String> list = new ArrayList<>();

    @Test
    public void testLoops() {
        list.addAll(Arrays.asList(prepList()));
        list.addAll(Arrays.asList(prepList()));
        list.addAll(Arrays.asList(prepList()));

        LoopTheLoop loopTheLoop = new LoopTheLoop();
        assertEquals(list, loopTheLoop.run());
    }

    private String[] prepList() {
        String[] helloWorldArray = {
                "Hello world! 1",
                "Hello world! 2",
                "Hello world! 3",
                "Hello world! 4",
                "Hello world! 5",
                "Hello world! 6",
                "Hello world! 7",
                "Hello world! 8",
                "Hello world! 9",
                "Hello world! 10",
                "Hello world! 11",
                "Hello world! 12",
                "Hello world! 13",
                "Hello world! 14",
                "Hello world! 15",
                "Hello world! 16",
                "Hello world! 17",
                "Hello world! 18",
                "Hello world! 19",
                "Hello world! 20"
        };

        return helloWorldArray;
    }
}
