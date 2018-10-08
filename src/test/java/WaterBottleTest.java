import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {
    WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle();
    }

    @Test
    public void startsAtVolume100(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drinkTakesVolume10(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void bottleEmpties(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void bottleFills(){
        bottle.empty();
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }
}
