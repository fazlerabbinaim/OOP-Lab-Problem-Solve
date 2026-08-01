import java.util.Scanner;

class Flower {
    String whatsYourName() {
        return "I have many names.";
    }
}

class Jasmine extends Flower {
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    String whatsYourName() {
        return "Lily";
    }
}


class State {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends State {
    @Override
    Jasmine yourNationalFlower() { 
        return new Jasmine();
    }
}

class AndhraPradesh extends State {
    @Override
    Lily yourNationalFlower() { 
        return new Lily();
    }
}

public class returnTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stateName = scan.next();
        scan.close();

        State state = null;

        if (stateName.equals("WestBengal")) {
            state = new WestBengal();
        } else if (stateName.equals("AndhraPradesh")) {
            state = new AndhraPradesh();
        }

        if (state != null) {
            Flower flower = state.yourNationalFlower();
            System.out.println(flower.whatsYourName());
        }
    }
}