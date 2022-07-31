package cookbook.service;

import cookbook.entity.CommentEntity;
import cookbook.model.Comment;

import java.util.List;

public interface CommentService {


    void save(Integer id, Comment comment);

//    Comment addComment(String content, String userName, Recipe recipe);

    public List<CommentEntity> recipeComments(Integer recipeId);
}