package ru.ivmiit.mvc.models;


import lombok.*;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private List<Car> cars;

    @Override
    public String toString() {
        return "Владелец{" + "id=" + id + ", Имя ='" + firstName + '\'' + ", Фамилия ='" + lastName + '\'' + ", Авто= " + cars + '}';
    }
}
