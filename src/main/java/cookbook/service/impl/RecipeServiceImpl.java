package cookbook.service.impl;


import cookbook.model.Recipe;
import cookbook.repository.RecipeRepository;
import cookbook.service.RecipeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class RecipeServiceImpl implements RecipeService {
    @Autowired
    private  RecipeRepository recipeRepository;

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

    @Override
    public List<Recipe> findByTag(String tag) {
        return recipeRepository.findByTag(tag);
    }


}
