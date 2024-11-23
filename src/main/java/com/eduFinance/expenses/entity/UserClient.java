package com.eduFinance.expenses.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserClient {
    @Id
    private Long id_user_client;
    private Long expenses_id;
    private String name_user;
    private String email;
    private String password;
}
