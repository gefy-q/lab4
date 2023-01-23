public class Ellie extends People implements HumanActions, HumanCondition{

    public Ellie() {
        name = "Элли";
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
        try {
            if (hp > 100 && calmness > 100) {
                System.out.println(name + " залезла " + place.loc);
                loc = place;
                hp -= 100;
            } else {
                HpException hpe = new HpException(name + " необходим отдых");
                throw hpe;
            }
        }
        catch (HpException hpe) {
            System.out.println(hpe.getMessage());
            hp += 10;
            calmness += 100;
        }
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
        if (calmness > 800) {
            return "Cпокойствие";
        }
        if (calmness > 700) {
            return "Легкое беспокойство";
        }
        if (calmness > 400) {
            return "Беспокойство";
        }
        if (calmness > 200) {
            return "Испуг";
        } else {
            return "Паническую аттаку";
        }
    }

    @Override
    public String hpCondition() {
        if (hp > 900) {
            return " полон сил.";
        } else if (hp > 700) {
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
