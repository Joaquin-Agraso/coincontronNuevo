package tup.coincontrol.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tup.coincontrol.models.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    void deleteExpenseById(Long id);
    Optional<Expense> findExpenseById(Long id);
    List<Expense> findByCategory_Id(Long categoryId);
    
}
