package uz.gilt.usecases.dataaccesslayer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDomain implements Serializable {
    private long id;
    private String name;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
