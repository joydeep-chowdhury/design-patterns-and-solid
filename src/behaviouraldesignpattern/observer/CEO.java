package behaviouraldesignpattern.observer;

public class CEO extends Observer {

    public CEO(Programmer programmer) {
        this.programmer = programmer;
        this.programmer.attach(this);
    }
    
    @Override
    public void update() {
        if(this.programmer.getState().equalsIgnoreCase("Successful")) {
            System.out.println("CEO is happy with Manager and Lead Programmer.");
        } else {
            System.out.println("CEO is unhappy with Manager and Lead Programmer.");
        }
    }
}

