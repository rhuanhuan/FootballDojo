import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ReporterTest {

    @Test
    public void shouldBeAbleToReportTheGoalTeam() throws Exception {
        Reporter reporter = new Reporter();
        assertEquals("Goal Team A",reporter.reactToGoal("A"));
        assertNotEquals("Goal Team A",reporter.reactToGoal("B"));
    }

}
