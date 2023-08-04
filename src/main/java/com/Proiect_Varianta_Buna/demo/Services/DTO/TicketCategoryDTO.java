package com.Proiect_Varianta_Buna.demo.Services.DTO;

public class TicketCategoryDTO {
    private String description;
    private float price;

    public TicketCategoryDTO() {
    }

    public TicketCategoryDTO(String description, float price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
