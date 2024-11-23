package com.eduFinance.expenses.repository;

import com.eduFinance.expenses.entity.UserClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserClientRepository extends JpaRepository<UserClient, Long> {
}
