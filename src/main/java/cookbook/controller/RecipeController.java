package cookbook.controller;

import cookbook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import cookbook.model.Recipe;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecipeController {
    @Autowired
    private RecipeService recipeService;


    @GetMapping("/recipes/create")
    public String showRecipeForm(ModelMap modelMap) {
        modelMap.addAttribute("emptyRecipe", new Recipe());
        return "recipe-create";
    }

    @PostMapping("/recipes/save")
    public String handleNewRecipe(@ModelAttribute("emptyRecipe") Recipe recipe) {
        recipeService.save(recipe);
        return "redirect:/recipes/list";
    }

    @GetMapping("/recipes/list")
    public String showRecipes(ModelMap modelMap) {
        modelMap.addAttribute("recipes", recipeService.getAll());
        return "recipe-list";
    }
    @GetMapping("/recipes/{id}")
    public String recipeDetails(@PathVariable Integer id, ModelMap modelMap){
        modelMap.addAttribute("recipe", recipeService.getById(id));
        return "recipe-details";
    }
}
