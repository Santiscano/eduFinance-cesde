package com.eduFinance.expenses.controller;

import com.eduFinance.expenses.entity.Expenses;
import com.eduFinance.expenses.service.ExpensesServiceJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
@CrossOrigin(origins = "*")
public class ExpensesController {

    @Autowired
    ExpensesServiceJPA expensesService;

    @GetMapping("")
    public List<Expenses> getAllExpenses() {
        return expensesService.getAllExpenses();
    }

    @GetMapping("/{id}")
    public Expenses getExpensesById(@PathVariable int id) {
        return expensesService.getExpensesById(id);
    }

    @PostMapping("/add")
    public Expenses addExpenses(@RequestBody Expenses expenses) {
        System.out.println(expenses);
        return expensesService.addExpenses(expenses);
    }

    @PutMapping("/update")
    public Expenses updateExpenses(@RequestBody Expenses expenses) {
        return expensesService.updateExpenses(expenses);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteExpenses(@PathVariable int id) {
        expensesService.deleteExpenses(id);
    }
}
