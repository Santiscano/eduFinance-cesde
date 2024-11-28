package com.eduFinance.expenses.service;

import com.eduFinance.expenses.entity.Expenses;
import com.eduFinance.expenses.repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpensesServiceJPA implements ExpensesServices {

    @Autowired
    ExpensesRepository expensesRepository;

    @Override
    public List<Expenses> getAllExpenses() {
        return expensesRepository.findAll();
    }

    @Override
    public Expenses getExpensesById(int id) {
        return expensesRepository.findById((long) id).get();
    }

    @Override
    public Expenses addExpenses(Expenses expenses) {
        return expensesRepository.save(expenses);
    }

    @Override
    public Expenses updateExpenses(Expenses expenses) {
        return expensesRepository.save(expenses);
    }

    @Override
    public void deleteExpenses(int id) {
        expensesRepository.deleteById((long) id);
    }
}
