package com.accountbook.domain.repository.category;

import com.accountbook.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long>, CategoryRepositoryCustom {

    Optional<Category> findBySeq(Long seq);

    void deleteBySeq(Long seq);
}
