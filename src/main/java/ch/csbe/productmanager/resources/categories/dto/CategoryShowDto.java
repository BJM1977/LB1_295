package ch.csbe.productmanager.resources.categories.dto;

import lombok.Data;

@Data
public class CategoryShowDto {
    public Long id;
    public String active;
    public String name;
}
