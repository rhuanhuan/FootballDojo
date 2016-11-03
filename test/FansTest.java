import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FansTest {
    @Test
    public void shouldCheerWhenSupportTeamGoal() throws Exception {
        Fans fans = new Fans("A");
        assertEquals(fans.reactToGoal("A"),"Cheer");
    }
}
