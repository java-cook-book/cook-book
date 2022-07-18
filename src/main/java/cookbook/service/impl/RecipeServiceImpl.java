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
    public void deleteByRecipeName(String recipeName) {
        Recipe recipe = getByRecipeName(recipeName);
        recipeRepository.deleteById(recipe.getId());

    }

    @Override
    public void update(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    @Override
    public List<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    @Override
    public Recipe getById(Integer id) {
        return recipeRepository.findById(id).orElse(null);
    }

    @Override
    public Recipe getByRecipeName(String recipeName) {
        return recipeRepository.findByRecipeName(recipeName);
    }
}
