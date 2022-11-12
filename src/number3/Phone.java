package number3;

import org.jetbrains.annotations.NotNull;

public class Phone {
    private String number;
    private String model;
    private float weight;

    public Phone(String number, String model, float weight) {
        this(number,model);
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public String receiveCall(String name){
        return "Звонит " + name;
    }

    public String receiveCall(String name, String number){
        return "Звонит " + name + "  " + number;
    }

    public static void sendMessage(String... numbers){
        for (String number: numbers) {
            System.out.printf("%-10s",number);
        }
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return (number + " " + model + " " + weight + "kg");
    }
}
