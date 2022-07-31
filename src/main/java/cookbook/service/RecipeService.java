package cookbook.service;

import cookbook.model.Recipe;

import java.util.List;

public interface RecipeService {

    void save(Recipe recipe);

    List<Recipe> getAll();

    void deleteById(Integer id);

    Recipe getById(Integer id);

    List<Recipe> findByKeyword(String keyword);

    void update(Recipe recipe);










}
