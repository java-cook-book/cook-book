package cookbook.service;

import cookbook.model.Comment;

import java.util.List;

public interface CommentService {

    void save(Comment comment);

    List<Comment> getAll();

}
