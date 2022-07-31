package cookbook.controller;


import cookbook.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import cookbook.entity.RecipeEntity;

import java.util.List;

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
        modelMap.addAttribute("emptyRecipe", new RecipeEntity());
        return "recipe-create";
    }

    @PostMapping("/recipes/save")
    public String handleNewRecipe(@ModelAttribute("emptyRecipe") RecipeEntity recipe) {
        recipeService.save(recipe);
        return "redirect:/";
    }

    @RequestMapping(path = {"/","/search"})
    public String showRecipes(RecipeEntity recipe, Model model, String keyword) {
        if(keyword != null){
            List<RecipeEntity> recipes = recipeService.findByKeyword(keyword);
            model.addAttribute("recipes", recipes);
        } else {
            List<RecipeEntity> recipes = recipeService.getAll();
            model.addAttribute("recipes", recipes);
            }
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
        return "redirect:/";
    }

    @GetMapping("/recipes/edit/{id}")
    public String showEditRecipeForm(@PathVariable Integer id, ModelMap modelMap) {
        modelMap.addAttribute("recipe", recipeService.getById(id));
        return "recipe-edit";
    }

    @PostMapping("/recipes/update")
    public String handleUpdatedRecipe(@ModelAttribute("recipe") RecipeEntity recipe, Errors errors) {
        log.info("Handle recipe to update: " + recipe);

        if (errors.hasErrors()) {
            log.error("Errors form frontend: " + errors.getFieldErrors());
            return "recipe-edit";
        }

        recipeService.save(recipe);
        return "redirect:/";
    }

}
