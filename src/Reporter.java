class Reporter implements Observers {

    @Override
    public String reactToGoal(String goalTeam) {
        return  "Goal Team "+goalTeam;
    }
}
