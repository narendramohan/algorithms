package datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DynamicArrayTest {
    private DynamicArray array;
    @Before
    public void SetUp() throws Exception {
        array = new DynamicArray(2);
    }

    @Test
    public void get() {
        array.set(0,"a");
        Assert.assertEquals("a",array.get(0));
    }

    @Test
    public void set() {
        array.set(0,"a");
        Assert.assertEquals("a",array.get(0));
    }

    @Test
    public void insert() {
        array.add("a");
        array.add("c");
        array.add("d");

        array.insert(1,"b");
        Assert.assertEquals("b", array.get(1));
    }

    @Test
    public void delete() {
    }

    @Test
    public void isEmpty() {
        assertEquals(true,array.isEmpty());
        array.add("a");
        assertEquals(false,array.isEmpty());
    }

    @Test
    public void contains() {
        array.add("a");
        array.add("b");
        array.add("c");

        assertEquals(true, array.contains("b"));
        assertEquals(false, array.contains("d"));

    }

    @Test
    public void size() {
        assertEquals(0, array.size());
        array.add("a");
        assertEquals(1,array.size());
    }


}