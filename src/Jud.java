public class Jud extends People implements HumanActions, HumanCondition {

    public Jud() {
        name = "Джад";
        System.out.println("Персонаж " + name + " создан.");
    }

    @Override
    public void disappear() {

    }

    @Override
    public void look(People people) {

    }

    @Override
    public void stay() {

    }

    @Override
    public void go(Place place) {

    }

    @Override
    public void freeze() {

    }

    @Override
    public void feel() {

    }

    @Override
    public void think(String thought) {

    }

    @Override
    public void be() {

    }

    @Override
    public void wince() {

    }

    @Override
    public void hit(People people) {

    }

    @Override
    public void fallDown() {

    }

    @Override
    public void smile() {
        System.out.println(name + " улыбнулся ");
    }

    @Override
    public String calmnessCondition(int calmness) {
        if (calmness > 900) {
            return "Cпокойствие";
        }
        if (calmness > 600) {
            return "Легкое беспокойство";
        }
        if (calmness > 300) {
            return "Беспокойство";
        }
        if (calmness > 100) {
            return "Испуг";
        } else {
            return "Паническую аттаку";
        }
    }

    @Override
    public String hpCondition() {
        if (hp > 900) {
            return " полон сил.";
        } else if (hp > 500) {
            return " все еще бодр.";
        } else if (hp > 400) {
            return " немного устал.";
        } else if (hp > 200) {
            return " устал.";
        } else if (hp > 100) {
            return " при смерти.";
        } else {
            return " вырубился из-за недостатка сил.";
        }
    }

    @Override
    public String moodCondition() {
        return mood.getTitle();
    }

    @Override
    public void alive() {
        if (hp < 0){
            throw new AliveException(name + " мертв.");
        }
        else {
            System.out.println(name + " жив.");
        }
    }
}
