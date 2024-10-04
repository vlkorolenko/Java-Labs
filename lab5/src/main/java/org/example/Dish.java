package org.example;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dish {
    private int id;
    private String type;
    private String name;
    private LocalDate expiryDate;
}

