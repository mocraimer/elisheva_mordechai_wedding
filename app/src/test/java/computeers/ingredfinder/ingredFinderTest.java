package computeers.ingredfinder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mordechai on 17/03/2017.
 */
public class ingredFinderTest {

    @Test
    public void createIngerdientFinder() throws Exception {
        IngredientFinder first = new IngredientFinder();
        first.onClickFind();
    }
}
