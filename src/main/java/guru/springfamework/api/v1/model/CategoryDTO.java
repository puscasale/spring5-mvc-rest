package guru.springfamework.api.v1.model;

import lombok.Data;

/**
 * Created by jt on 9/24/17.
 */
@Data
public class CategoryDTO {
    private Long id;
    private String name;

    public void setId(Long id) {
            this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
