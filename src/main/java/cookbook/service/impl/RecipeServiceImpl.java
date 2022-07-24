package cookbook.service.impl;

import cookbook.entity.RecipeEntity;
import cookbook.model.Recipe;
import cookbook.repository.RecipeRepository;
import cookbook.service.RecipeService;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
        initData(recipeRepository);
    }



    @Override
    public void save(Recipe recipe) {
        recipeRepository.save(new RecipeEntity());
    }

    @Override
    public List<Recipe> getAll() {
        return recipeRepository.
                findAll()
                .stream()
                .map(e -> Recipe.from(e))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(Integer id) {
        recipeRepository.deleteById(id);
    }


    @Override
    public Object getById(Integer id) {

        return recipeRepository.findById(id).orElseThrow(()->
                new RuntimeException("Recipe doesn't exist"));
    }


    private void initData(RecipeRepository recipeRepository) {
        List<RecipeEntity> recipes = new ArrayList<RecipeEntity>();
        recipes.add(new RecipeEntity(1, "Makaron",
                "Ugotuj makaron w wodzie. Dodaj sól", "Makaron, sól",
                "Gotuj aż bedzie miękki", LocalDate.now()));

        recipeRepository.saveAll(recipes);
    }

}
