package cookbook.service;

import cookbook.model.Recipe;

import java.util.List;

public interface RecipeService {

    void save(Recipe recipe);

    List<Recipe> getAll();

    void deleteById(Integer id);

    Object getById(Integer id);

    void update(Recipe recipe);








}
