public class homework2 {
    public static void main(String[] args) {
        aquarium aquarium = new aquarium();
        aquarium.addList(new turtle("Donatello"))
                .addList(new turtle("Miquelangelo"))
                .addList(new turtle("Rafaello"))
                .addList(new turtle("Leonardo"))
                .addList(new clown("Nemo"))
                .addList(new clown("Daddy"))
                .addList(new crab("Mr Crabbs"))
                .addList(new crab("Jack"))
                .addList(new shark("Steve"))
                .addList(new shark("Benedict"))
                .addList(new tuna("Tony"))
                .addList(new tuna("Liam"));
        
        for (var item : aquarium.getListOfInhabitants()) {
            System.out.println(item);
        }

        for (var item : aquarium.walk()) {
            System.out.printf("They can walk: \n %s with the speed of %d km/h; \n", item.toString(), item.speedOfWalk());
        }

        System.out.printf("And the quickest walker is %s! \n", aquarium.winnerWalking());

        for (var item : aquarium.swimm()) {
            System.out.printf("They can swim: \n %s with the speed of %d km/h; \n", item.toString(), item.speedOfSwimm());
        }

        System.out.printf("And the quickest swimmer is %s! \n", aquarium.winnerSwimming());
    }
    
}