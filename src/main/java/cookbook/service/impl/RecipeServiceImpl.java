package cookbook.service.impl;


import cookbook.model.Recipe;
import cookbook.repository.RecipeRepository;
import cookbook.service.RecipeService;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
    @Override
    public void save(Recipe recipe) {
        recipeRepository.save(recipe);

    }

    @Override
    public List<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        recipeRepository.deleteById(id);
    }

    public void update(Recipe recipe){
        recipeRepository.save(recipe);
    }


    @Override
    public Recipe getById(Integer id) {
        return recipeRepository.findById(id).orElse(null);
    }




}
