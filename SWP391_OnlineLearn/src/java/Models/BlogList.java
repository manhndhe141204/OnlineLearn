/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


import java.sql.Date;

/**
 *
 * @author Mr Tuan
 */
public class BlogList {
    private int id;
    private String title;
    private int category_id;
    private String postdate;
    private String brief_info;
    private String thumbnail;
    private String blogdetail;

    public BlogList() {
    }

    public BlogList(int id, String title, int category_id, String postdate, String brief_info, String thumbnail, String blogdetail) {
        this.id = id;
        this.title = title;
        this.category_id = category_id;
        this.postdate = postdate;
        this.brief_info = brief_info;
        this.thumbnail = thumbnail;
        this.blogdetail = blogdetail;
    }
    public BlogList( String title, int category_id, String postdate, String brief_info, String thumbnail, String blogdetail) {
        this.title = title;
        this.category_id = category_id;
        this.postdate = postdate;
        this.brief_info = brief_info;
        this.thumbnail = thumbnail;
        this.blogdetail = blogdetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getPostdate() {
        return postdate;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    public String getBrief_info() {
        return brief_info;
    }

    public void setBrief_info(String brief_info) {
        this.brief_info = brief_info;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getBlogdetail() {
        return blogdetail;
    }

    public void setBlogdetail(String blogdetail) {
        this.blogdetail = blogdetail;
    }
}