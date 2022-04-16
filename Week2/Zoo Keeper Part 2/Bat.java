public class Bat extends Mammal {
    
    public Bat( int energylevel ){
        super(energylevel);
    }

    public void Fly(){
        System.out.println("The sound a bat taking off");
        this.energylevel -= 50;
    }

    public void eatHumans(){
        System.out.println("Hoomans are annoying...");
        this.energylevel += 25;
    }

    public void attackTown(){
        System.out.println("The Bat is attackin, the town is on fire!");
        this.energylevel -= 100;
    }
}
