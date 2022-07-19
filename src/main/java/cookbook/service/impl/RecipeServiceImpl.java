package cookbook.service.impl;

import cookbook.model.Recipe;
import cookbook.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {
    private List<Recipe> recipes;

    private static int counter;

    public RecipeServiceImpl() {
        recipes = new ArrayList<>();
        recipes.add(new Recipe(1, "Makaron", "Ugotuj makaron w wodzie. Dodaj sól", "Makaron, sól", "Gotuj aż bedzie miękki"));
        counter = 1;
    }

    @Override
    public void save(Recipe recipe) {
        recipe.setId(++counter);
        recipes.add(recipe);
    }

    @Override
    public List<Recipe> getAll() {
        return recipes;
    }

}
