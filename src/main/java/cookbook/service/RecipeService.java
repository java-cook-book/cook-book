package cookbook.service;

import cookbook.entity.RecipeEntity;

import java.util.List;

public interface RecipeService {

    void save(RecipeEntity recipe);

    List<RecipeEntity> getAll();

    void deleteById(Integer id);

    RecipeEntity getById(Integer id);

    List<RecipeEntity> findByKeyword(String keyword);

    void update(RecipeEntity recipe);










}
