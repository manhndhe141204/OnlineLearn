/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.Impl;

import DAO.AdsDAO;
import Models.Ads;
import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MrTuan
 */
public class AdsDAOImpl implements AdsDAO{

    @Override
    public Ads get(int id) {
        DBContext dbContext = new DBContext();
        Ads ads = new Ads();
        try {
            Connection connection = dbContext.getConnection();
            String sql = "select * from onlinelearn.ads a\n"
                    + "where a.id=?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                ads.setId(rs.getInt("id"));
                ads.setImage(rs.getString("image"));
                ads.setHref(rs.getString("href"));
                ads.setStatus(rs.getBoolean("status"));
                return ads;
            }
            dbContext.closeConnection(connection, stm, rs);
        } catch (SQLException e) {
            Logger.getLogger(Ads.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    @Override
    public List<Ads> getAll() {
        DBContext dbContext = new DBContext();
        List<Ads> listAds = new ArrayList<>();
        try {
            Connection connection = dbContext.getConnection();
            String sql = "SELECT * FROM onlinelearn.ads;";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Ads ads = new Ads();
                ads.setId(rs.getInt("id"));
                ads.setImage(rs.getString("image"));
                ads.setHref(rs.getString("href"));
                ads.setStatus(rs.getBoolean("status"));
                listAds.add(ads);
            }
            dbContext.closeConnection(connection, stm, rs);
        } catch (SQLException ex) {
            Logger.getLogger(Ads.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listAds;
    }

    @Override
    public boolean insert(Ads t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Ads t) {
        DBContext dbContext = new DBContext();
        try {
            Connection connection = dbContext.getConnection();
            String sql = "UPDATE onlinelearn.ads\n"
                    + "SET \n"
                    + "image = ?, \n"
                    + "href = ?,\n"
                    + "status=?,\n"
                    + "WHERE id=?;";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, t.getImage());
            stm.setString(2, t.getHref());
            stm.setBoolean(3, t.isStatus());
            stm.setInt(4, t.getId());
            stm.executeUpdate();
            dbContext.closeConnection(connection, stm);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Ads.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args) {
        AdsDAOImpl db= new AdsDAOImpl();
        System.out.println(db.get(1).isStatus());
//        List<Ads> listAds=db.getAll();
//        for (Ads listAd : listAds) {
//            System.out.println(listAd.getHref());
//        }
    }
    
}