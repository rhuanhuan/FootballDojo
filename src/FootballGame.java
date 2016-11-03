import java.util.ArrayList;

class FootballGame{

    private ArrayList<Observers> observersList;

    public FootballGame() {
        this.observersList = new ArrayList<Observers>();
    }

    void addObservers(Observers observer){
        observersList.add(observer);
    }

    void deleteObservers(Observers observer){
        observersList.remove(observer);
    }

    public void reactToGoal(String teamName){
        for (Observers observer : observersList){
            observer.reactToGoal(teamName);
        }
    }
}
