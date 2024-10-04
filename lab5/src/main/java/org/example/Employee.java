package org.example;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String fullName;
    private LocalDate dateOfBirth;
}
