public class Gorilla extends Mammal {
    
    public Gorilla(int energylevel){
        super(energylevel);
}

    public void throwSomething(){
        System.out.println("The Gorrila has thrown something");
        this.energylevel -= 5;
    }



    public void eatBananas(){
        System.out.println("The Gorilla just ate a banana");
        this.energylevel += 10;
    }



    public void Climb(){
        System.out.println("The Gorilla has climbed a tree");
        this.energylevel -=10;
    }


}
