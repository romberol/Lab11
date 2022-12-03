package builder;

import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@SuperBuilder
@ToString
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dob;
    private double weight;
    private double height;
    @Singular(value = "occupation")
    private List<String> occupations;

    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Roman")
                .lastName("B")
                .occupation("UCU")
                .dob(LocalDate.parse("2003-09-05"))
                .build();
        System.out.println(user);
    }
}
