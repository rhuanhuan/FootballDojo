import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class FootballGameTest {
    @Test
    public void shouldReportTheTeamWhenGoal() throws Exception {
        FootballGame footballGame = new FootballGame();
        Reporter report = mock(Reporter.class);
        footballGame.addObservers(report);
        footballGame.reactToGoal("A");
        verify(report).reactToGoal("A");
    }

    @Test
    public void shouldFansReactWhenTheTeamWhenGoal() throws Exception {
        FootballGame footballGame = new FootballGame();
        Fans fansA = mock(Fans.class);
        footballGame.addObservers(fansA);
        footballGame.reactToGoal("A");
        verify(fansA).reactToGoal("A");
    }
}
