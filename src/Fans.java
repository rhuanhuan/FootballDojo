class Fans implements Observers {

    private String supportTeam;

    Fans(String supportTeam) {
        this.supportTeam = supportTeam;
    }

    @Override
    public String reactToGoal(String goalTeam) {
        return supportTeam.equals(goalTeam) ? "Cheer" : "Boo";
    }

}