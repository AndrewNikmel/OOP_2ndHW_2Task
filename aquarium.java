import java.util.ArrayList;
import java.util.List;

public class aquarium {
    private List<inhabitants> listOfInhabitants = new ArrayList<>();
    
    public List<inhabitants> getListOfInhabitants() {
        return listOfInhabitants;
    }

    public aquarium addList(inhabitants inhabitant) {
        listOfInhabitants.add(inhabitant);
        return this;
    }

    public List<swimming> swimm() {
        List<swimming> swimmable = new ArrayList<>();
        for (var item : listOfInhabitants) {
            if (item instanceof swimming) {
                swimmable.add((swimming) item);
            }
        }
        return swimmable;
    }

    public List<walking> walk() {
        List<walking> walkable = new ArrayList<>();
        for (var item : listOfInhabitants) {
            if (item instanceof walking) {
                walkable.add((walking) item);
            }
        }
        return walkable;
    }

    public swimming winnerSwimming() {
        int index = 0;
        for (int i = 0; i < swimm().size(); i++) {
            if(swimm().get(i).speedOfSwimm() > swimm().get(index).speedOfSwimm()) {
                index = i;
            }
        }
        return swimm().get(index);
    }

    public walking winnerWalking() {
        int index = 0;
        for (int i = 0; i < walk().size(); i++) {
            if(walk().get(i).speedOfWalk() > walk().get(index).speedOfWalk()) {
                index = i;
            }
        }
        return walk().get(index);
    }

}
