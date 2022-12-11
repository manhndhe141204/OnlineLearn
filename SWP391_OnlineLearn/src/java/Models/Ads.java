/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author MrTuan
 */
public class Ads {

    private int id;
    private String name_brand;
    private String image;
    private String href;
    private boolean status;

    public Ads() {
    }

    public Ads(int id, String name_brand, String image, String href, boolean status) {
        this.id = id;
        this.name_brand = name_brand;
        this.image = image;
        this.href = href;
        this.status = status;
    }

    public Ads(String name_brand, String image, String href, boolean status) {
        this.name_brand = name_brand;
        this.image = image;
        this.href = href;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_brand() {
        return name_brand;
    }

    public void setName_brand(String name_brand) {
        this.name_brand = name_brand;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
