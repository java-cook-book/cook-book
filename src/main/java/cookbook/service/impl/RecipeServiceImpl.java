package cookbook.service.impl;


import cookbook.entity.RecipeEntity;
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
    public void save(RecipeEntity recipe) {
        recipeRepository.save(recipe);
    }

    @Override
    public List<RecipeEntity> getAll() {
        List<RecipeEntity> recipes = (List<RecipeEntity>)recipeRepository.findAll();
        return recipes;
    }



    @Override
    public void deleteById(Integer id) {
        recipeRepository.deleteById(id);
    }

    public void update(RecipeEntity recipe){
        recipeRepository.save(recipe);
    }


    @Override
    public RecipeEntity getById(Integer id) {
        return recipeRepository.findById(id).orElse(null);
    }

    @Override
    public List<RecipeEntity> findByKeyword(String keyword) {
        return recipeRepository.findByKeyword(keyword);
    }


}
