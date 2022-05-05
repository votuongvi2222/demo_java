package tdtu.dp.mid.refactoring.composingmethod.after;

public class Cash implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println(amount + " is paid with cash.");
    }

    @Override
    public String toString() {
        return "Cash{}";
    }
}
