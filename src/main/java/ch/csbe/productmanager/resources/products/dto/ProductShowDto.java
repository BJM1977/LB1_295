package ch.csbe.productmanager.resources.products.dto;


import lombok.Data;

@Data
public class ProductShowDto {
    public Long id;
    public String name;
    public Float price;

}
