package strategy;

import lombok.Getter;

@Getter
public class Client {
    private static int count = 0;
    private final int id;
    private final String name;
    private int age;
    private final String email;
    public Client(String name, String email){
        this.name = name;
        this.email = email;
        id = count++;
    }
}
