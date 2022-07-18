package cookbook.service;

import cookbook.model.Recipe;

import java.util.List;

public interface RecipeService {

    void save(Recipe recipe);

    void deleteByRecipeName(String recipeName);

    void update (Recipe recipe);

    List<Recipe> getAll();

    Recipe getById(Integer id);

    Recipe getByRecipeName(String recipeName);

}
