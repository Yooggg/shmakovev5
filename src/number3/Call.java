package number3;

public class Call {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+7 123 456 7890","Nokia",0.5f);
        Phone phone2 = new Phone("+7 463 128 1340","Sony",0.4f);
        Phone phone3 = new Phone("+7 132 674 3546","Samsung",0.45f);

        System.out.println();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        System.out.println();

        System.out.println(phone1.receiveCall("Степа"));
        System.out.println(phone2.receiveCall("Гоша"));
        System.out.println(phone3.receiveCall("Вероника"));

        System.out.println();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        System.out.println();

        System.out.println(phone1.receiveCall("Степа","+7 930 343 2065"));
        System.out.println(phone2.receiveCall("Гоша","+7 902 564 2625"));
        System.out.println(phone3.receiveCall("Вероника","+7 132 358 2045"));

        System.out.println();

        String[] numbers = {"4091","112","911"};
        Phone.sendMessage(numbers);


    }
}
