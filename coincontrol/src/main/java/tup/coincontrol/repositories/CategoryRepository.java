package tup.coincontrol.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tup.coincontrol.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    void deleteCategoryById(Long id);
    Optional<Category> findCategoryById(Long id);
}
