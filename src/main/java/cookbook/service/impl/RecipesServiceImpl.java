package cookbook.service.impl;

import cookbook.model.Recipes;
import cookbook.repository.RecipesRepository;
import cookbook.service.RecipesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipesServiceImpl implements RecipesService {
    private final RecipesRepository recipesRepository;

    public RecipesServiceImpl(RecipesRepository recipesRepository) {
        this.recipesRepository = recipesRepository;
    }

    @Override
    public void save(Recipes recipes) {
        recipesRepository.save(recipes);
    }

    @Override
    public void deleteByNameRecipes(String nameRecipes) {
        Recipes recipes = getByNameRecipes(nameRecipes);
        recipesRepository.deleteById(recipes.getId());

    }

    @Override
    public void update(Recipes recipes) {
        recipesRepository.save(recipes);
    }

    @Override
    public List<Recipes> getAll() {
        return recipesRepository.findAll();
    }

    @Override
    public Recipes getById(Integer id) {
        return recipesRepository.findById(id).orElse(null);
    }

    @Override
    public Recipes getByNameRecipes(String nameRecipes) {
        return recipesRepository.findByNameRecipes(nameRecipes);
    }
}
