package cookbook.repository;

import cookbook.entity.RecipeEntity;
import cookbook.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RecipeRepository extends JpaRepository<RecipeEntity, Integer> {

Recipe findById(String id);
}
