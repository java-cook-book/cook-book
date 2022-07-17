package cookbook.service;

import cookbook.model.Recipes;

import java.util.List;

public interface RecipesService {

    void save(Recipes recipes);

    void deleteByNameRecipes(String nameRecipes);

    void update (Recipes recipes);

    List<Recipes> getAll();

    Recipes getById(Integer id);

    Recipes getByNameRecipes(String nameRecipes);

}
