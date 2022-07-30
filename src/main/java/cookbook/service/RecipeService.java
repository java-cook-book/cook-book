package cookbook.service;

import cookbook.model.Recipe;

import java.util.List;

public interface RecipeService {

    void save(Recipe recipe);

    List<Recipe> getAll();

    void deleteById(Integer id);

    Recipe getById(Integer id);

 List<Recipe> findByTag(String tag);

    void update(Recipe recipe);










}
