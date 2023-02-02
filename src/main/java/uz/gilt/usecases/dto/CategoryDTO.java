package uz.gilt.usecases.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryDTO {
    private long id;
    private String name;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
