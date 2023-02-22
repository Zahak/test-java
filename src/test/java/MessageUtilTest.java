import org.junit.Test;
import se.johannes.MessageUtil;

import static org.junit.Assert.assertEquals;

public class MessageUtilTest {
    String message1 = "Hello world!";
    String message2 = "Foo bar";

    MessageUtil messageUtil = new MessageUtil(message1);

    @Test
    public void testPrintMessage() {
        assertEquals(message1, messageUtil.printMessage());
    }

    @Test
    public void testSetNewMessage() {
        messageUtil.setMessage(message2);
        assertEquals(message2, messageUtil.printMessage());
    }
}
