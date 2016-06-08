package ingsoft.com.magic_assistant;

import com.ingsoft.magic_assistant.data.RivalLife;
import com.ingsoft.magic_assistant.data.UserLife;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Leonardo on 8/6/2016.
 */
public class HomeTest {

    UserLife userLife;
    RivalLife rivalLife;

    @Before
    public void setup(){
        userLife = new UserLife();
        rivalLife = new RivalLife();
    }

    @Test
    public void userLifeInitializeWith20PointsTest(){
        assertEquals(userLife.rep,20,0);
    }

    @Test
    public void decrementOneLifePointToUserTest(){
        userLife.decrement();
        assertEquals(userLife.rep,19,0);
    }

    @Test
    public void incrementOneLifePointToUserTest(){
        userLife.increment();
        assertEquals(userLife.rep,21,0);
    }

    @Test
    public void userVenomInitializeWithZeroPoints(){
        assertEquals(userLife.venonLevel,0,0);
    }


    @Test
    public void incrementOneVenomPointToUserTest(){
        userLife.incrementVenon();
        assertEquals(userLife.venonLevel,1,0);
    }

    @Test
    public void userHasNoMoreLifesLeftTest(){
        userLife.rep = 0;
        assertTrue(userLife.hasNoMoreLifesLeft());
    }

    @Test
    public void venomIsTooHighTest(){
        userLife.venonLevel = 14;
        assertTrue(userLife.venonIsTooHigh());
    }

}
