package cookbook.repository;


import cookbook.entity.RecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RecipeRepository extends JpaRepository<RecipeEntity, Integer> {

        RecipeEntity findById(String id);


        @Query(value = "select * from recipe s where s.recipe_name like %:keyword% or s.tag like %:keyword%", nativeQuery = true)
        List<RecipeEntity> findByKeyword(String keyword);
}
