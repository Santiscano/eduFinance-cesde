package com.eduFinance.expenses.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expenses {
    @Id
    private Long id_expenses;
    private Long user_id;
    private Long category_id;
    private String description;
    private int cantidad;
    private Date fecha;
}
