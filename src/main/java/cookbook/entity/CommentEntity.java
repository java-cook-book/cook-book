package cookbook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CommentEntity {

    @Id
    private Integer id;

    private String content;

    private String userName;

    private Integer recipeId;

    public CommentEntity(String content, String userName, Integer recipeId) {
        this.content = content;
        this.userName = userName;
        this.recipeId = recipeId;
    }
}

