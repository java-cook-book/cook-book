package cookbook.controller;

import cookbook.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import cookbook.model.Recipe;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("")
    public String recipeList(ModelMap modelMap) {
        modelMap.addAttribute("recipe", recipeService.getAll());

        return "";
    }

    @GetMapping("")
    public String showCreateNewRecipes(ModelMap modelMap) {
        modelMap.addAttribute("emptyRecipes", new Recipe());

        return "";
    }


    @PostMapping("")
    public String handleNewRecipes(@Validated @ModelAttribute("emptyRecipe") Recipe recipe, Errors errors) {

        if(errors.hasErrors()){
            return "";
        }

        recipeService.save(recipe);
        return "";
    }
}
