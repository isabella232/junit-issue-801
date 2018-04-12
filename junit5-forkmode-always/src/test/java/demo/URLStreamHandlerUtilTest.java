package demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class URLStreamHandlerUtilTest
{
    @Test
    public void testGetFactory()
    {
        Assertions.assertNotNull(URLStreamHandlerUtil.getFactory(), "Should not have been null");
    }
}
