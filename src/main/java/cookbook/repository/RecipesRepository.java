package cookbook.repository;

import cookbook.model.Recipes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipesRepository extends JpaRepository<Recipes, Integer> {

    Recipes findByNameRecipes(String nameRecipes);

}
