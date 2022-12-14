/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;




public class User {

    private int id;
    private String username;
    private String password;
    private String fullname;
    private boolean gender;
    private String address;
    private String email;
    private String phonenumber;
    private int status;
    private Role role;
    private String avatar;


    public User() {
    }

    public User(int id, String username, String password, String fullname, boolean gender, String address, String email, String phonenumber, int status, Role role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.phonenumber = phonenumber;
        this.status = status;
        this.role = role;
    }

    public User(int id, String username, String password, String fullname, boolean gender, String address, String email, String phonenumber, int status, Role role, String avatar) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.phonenumber = phonenumber;
        this.status = status;
        this.role = role;
        this.avatar = avatar;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }


    

  

}
