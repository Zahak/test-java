import org.junit.Test;
import org.junit.Assert;

public class StringsFunTest {
    @Test
    public void compareStrings() {
        String s1 = "I like";
        s1 += " Apples";

        String s2 = "I";
        s2 += " like Apples";

        // To be very explicit to what we are trying to test.
        Assert.assertFalse(s1 == s2);
        Assert.assertTrue(s1.equals(s2));

        // Above simplified - gives better feedback if failing
        Assert.assertNotSame(s1, s2);
        Assert.assertEquals(s1, s2);
    }

    @Test
    public void compareStringsWithTwist() {
        String s1 = "I like Apples";
        String s2 = "I like Apples";

        // Note that this time they are the same. Clever Java.
        Assert.assertSame(s1, s2);
        Assert.assertEquals(s1, s2);
    }

    @Test
    public void compareStringInterns() {
        String s1 = "I like";
        s1 += " Apples";

        String s2 = "I";
        s2 += " like Apples";

        String s3 = s1.intern();
        String s4 = s2.intern();

        Assert.assertSame(s3, s4);
        Assert.assertEquals(s3, s4);
    }

    @Test
    public void compareStringsWithStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder(13);
        stringBuilder.append("I like");
        stringBuilder.append(" Apples");
        String s1 = stringBuilder.toString();

        stringBuilder = new StringBuilder(13);
        stringBuilder.append("I");
        stringBuilder.append(" like Apples");
        String s2 = stringBuilder.toString();

        // Interesting that using the StringBuilder still results in different resources.
        Assert.assertNotSame(s1, s2);
        Assert.assertEquals(s1, s2);
    }
}
