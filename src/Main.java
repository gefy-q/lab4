public class Main {
    public static void main(String[] args) {
        Pasco pasco = new Pasco();
        Luis luis = new Luis();
        Ellie ellie = new Ellie();
        System.out.println(luis.getLoc());
        luis.go(new Forest().new Trees());
        luis.disappear();
        luis.look(luis);
        print(luis.getLoc());
        pasco.go(new House());
        luis.go(new Lawn());
        try{
            pasco.alive();
        }
        catch (AliveException ae) {
            print(ae.getMessage());
        }
        luis.look(pasco);
        luis.freeze();
        pasco.look(luis);
        luis.feel();
        luis.shrink(Object.HEART);
        luis.feel();
        pasco.fallDown();
        pasco.feel();
        luis.go(new Path());
        luis.go(new Forest());
        luis.pierce(Object.BRANCH);
        luis.think("Я иду в лес следом за мертвецом, я иду следом за мертвецом на кладбище домашних животных, и это не сон. Господи, миленький, это не сон. Это все происходит на самом деле.");
        luis.feel();
        luis.be();
        pasco.hit(luis);
        luis.hit(pasco);
        pasco.pointAtSmth(new Place() {
            final String name = "что-то в стороне";

            public String getName() {
                return name;
            }
        });
        pasco.smile();
        Deadwood deadwood = new Deadwood();
        ellie.go(deadwood);
        deadwood.changeToBones();
    }

    public static void print(String message) {
        System.out.println(message);
    }
}



















