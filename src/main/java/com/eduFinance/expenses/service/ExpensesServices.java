package com.eduFinance.expenses.service;

import com.eduFinance.expenses.entity.Expenses;

import java.util.List;

public interface ExpensesServices {
    public List<Expenses> getAllExpenses();
    public Expenses getExpensesById(int id);
    public Expenses addExpenses(Expenses expenses);
    public Expenses updateExpenses(Expenses expenses);
    public void deleteExpenses(int id);
}
