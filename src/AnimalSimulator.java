

import Animal.cachorro;
import Animal.leao;
import Animal.lobo;

public class AnimalSimulator {
    public static void main(String[] args) {
        cachorro dog = new cachorro();
        lobo lobo = new lobo();
        leao simba = new leao();



        System.out.println("\nCachorro");
        dog.emitSound();
        dog.move();

        System.out.println("\nLobo");
        lobo.emitSound();
        lobo.move();

        System.out.println("\nLeão");
        simba.emitSound();
        simba.move();




    }
}
