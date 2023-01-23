public class Deadwood extends Place {
    public Deadwood() {
        name = "куча валежника";
        loc = "в кучу валежника";
    }

    @Override
    void changes(People people) {
        people.hp -= 200;
        people.calmness += 200;
        people.mood = Mood.Happy;
    }

    void changeToBones() {
        loc = "в груду костей";
        System.out.println(name + " превратилась " + loc);
        name = "груда костей";
    }
}
