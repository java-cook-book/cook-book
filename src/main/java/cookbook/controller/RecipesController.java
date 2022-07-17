package cookbook.controller;

import cookbook.service.RecipesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import cookbook.model.Recipes;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecipesController {

    private RecipesService recipesService;

    public RecipesController(RecipesService recipesService) {
        this.recipesService = recipesService;
    }

    @GetMapping("")
    public String recipesList(ModelMap modelMap) {
        modelMap.addAttribute("recipes", recipesService.getAll());

        return "";
    }

    @GetMapping("")
    public String showCreateNewRecipes(ModelMap modelMap) {
        modelMap.addAttribute("emptyRecipes", new Recipes());

        return "";
    }


    @PostMapping("")
    public String handleNewRecipes(@Validated @ModelAttribute("emptyRecipes") Recipes recipes, Errors errors) {

        if(errors.hasErrors()){
            return "";
        }

        recipesService.save(recipes);
        return "";
    }
}
