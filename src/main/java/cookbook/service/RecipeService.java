package cookbook.service;

import cookbook.entity.RecipeEntity;
import cookbook.model.Recipe;

import java.util.List;

public interface RecipeService {

    void save(Recipe recipe);

    List<RecipeEntity> getAll();

    void deleteById(Integer id);

    RecipeEntity getById(Integer id);

    List<RecipeEntity> findByKeyword(String keyword);

    void update(Recipe recipe);










}
