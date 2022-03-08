package behaviouraldesignpattern.template;

public abstract class Employee {
    abstract void work();
    abstract void takePause();
    abstract void getPaid();
    
    public final void comeToWork() {
        work();
        takePause();
        work();
        getPaid();
    }
}
