package ch.csbe.productmanager.resources.products.dto;


import lombok.Data;

@Data
public class ProductShowDto {
    public Long id;
    public String sku;
    public String active;
    public String name;
    public String image;
    public String description;
    public Float price;
    public String stock;

}
