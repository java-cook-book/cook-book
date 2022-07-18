package cookbook.repository;

import cookbook.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

    Recipe findByRecipeName(String recipeName);

}
