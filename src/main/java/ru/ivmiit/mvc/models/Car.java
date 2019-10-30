package ru.ivmiit.mvc.models;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "owner")
public class Car {
    public Long  id;
    private String model;
    private User owner;
}
