package cookbook.controller;

import cookbook.entity.CommentEntity;
import cookbook.model.Comment;
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

@Slf4j
@Controller
public class CommentController {


    private CommentService commentService;



    public CommentController(CommentService commentService) {
        this.commentService = commentService;

    }

    @GetMapping("/recipes/{id}/comments/create")
    public String showCommentForm(@PathVariable Integer id, ModelMap modelMap) {
        modelMap.addAttribute("emptyComment", new Comment());
        modelMap.addAttribute("recipeId", id);
        return "comment-create";
    }


    @PostMapping("/recipes/{id}/comments/save")
    public String handleNewComment(@PathVariable Integer id, @ModelAttribute("emptyComment") Comment comment) {
        log.info("Handle new comment: " + comment);

        commentService.save(id, comment);
        return "redirect:/recipe-details";
    }

}


