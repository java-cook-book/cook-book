package cookbook.controller;

import cookbook.entity.RecipeEntity;
import cookbook.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import cookbook.model.Recipe;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Slf4j
@Controller
public class RecipeController {
    @Autowired
    private final RecipeService recipeService;
    public RecipeController (RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/recipes/create")
    public String showRecipeForm(ModelMap modelMap) {
        modelMap.addAttribute("emptyRecipe", new Recipe());
        return "recipe-create";
    }

    @PostMapping("/recipes/save")
    public String handleNewRecipe(@ModelAttribute("emptyRecipe") Recipe recipe) {
        recipeService.save(Recipe.from(new RecipeEntity()));
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
    @GetMapping("/recipes/delete/{id}")
    public String deleteBook(@PathVariable Integer id){
        log.info("deleted Recipe by id with  " + id);
        recipeService.deleteById(id);
        return "redirect:/recipes/list";
    }

    @GetMapping("/recipes/edit/{id}")
    public String showEditRecipeForm(@PathVariable Integer id, ModelMap modelMap) {
        modelMap.addAttribute("recipe", recipeService.getById(id));
        return "recipe-edit";
    }

    @PostMapping("/recipes/update")
    public String handleUpdatedRecipe(@ModelAttribute("recipe") Recipe recipe, Errors errors) {
        log.info("Handle recipe to update: " + recipe);

        if (errors.hasErrors()) {
            log.error("Errors form frontend: " + errors.getFieldErrors());
            return "recipe-edit";
        }

        recipeService.save(recipe);
        return "redirect:/recipes/list";
    }
}
