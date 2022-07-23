package cookbook.service.impl;

import cookbook.model.Comment;
import cookbook.model.Recipe;
import cookbook.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    private List<Comment> comments;

    public CommentServiceImpl() {
        comments = new ArrayList<>();
        comments.add(new Comment("ciekawy przepis, ale dodałabym więcej soli", "piekarowa" ));

    }

    @Override
    public void save(Comment comment) {
        comments.add(comment);
    }

    @Override
    public List<Comment> getAll() {
        return comments;
    }
}
