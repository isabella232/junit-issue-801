package demo;

import org.junit.Assert;
import org.junit.Test;

public class URLStreamHandlerUtilTest
{
    @Test
    public void testGetFactory()
    {
        Assert.assertNotNull("Should not have been null", URLStreamHandlerUtil.getFactory());
    }
}
