package cookbook.controller;

import cookbook.model.Comment;
import cookbook.model.Recipe;
import cookbook.service.CommentService;
import cookbook.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.management.openmbean.CompositeData;
@Slf4j
@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;
    @Autowired
    private RecipeService recipeService;

    @GetMapping("comments/create")
    public String showCommentForm(ModelMap modelMap) {
        modelMap.addAttribute("emptyComment", new Comment());
        return "recipe-details";
    }

    @PostMapping("/comments/{id}/save")
    public String handleNewRecipe(@PathVariable Integer id, @ModelAttribute("emptyComment") Comment comment) {
        commentService.save(comment);
        return "redirect:/recipe-details";
    }

    @GetMapping("/recipes/{id}/comments")
    public String recipeComments(@PathVariable Integer id,ModelMap modelMap) {
        modelMap.addAttribute("comments", commentService.getAll());
        modelMap.addAttribute("recipes", recipeService.getById(id));
        return "redirect:/recipe-details";
    }
}
