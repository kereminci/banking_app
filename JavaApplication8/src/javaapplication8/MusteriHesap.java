/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Kerem
 */
public class MusteriHesap extends Hesap implements İslemler,Getİslemler,Hesapİslemler {
    

    public MusteriHesap(String ad,String soyad,String TC,String username,String password) {
        this.ad = ad;
        this.soyad = soyad;
        this.TC = TC;
        this.username = username;
        this.password = password;
       
    }
    

    @Override
    public void setTC(String TC) {
        this.TC = TC;
    }

    @Override
    public void setAd(String ad) {
       this.ad = ad;
    }

    @Override
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public String getTC() {
       return TC;
    }

    @Override
    public String getAd() {
        return ad;
    }

    @Override
    public String getSoyad(String soyAd) {
       return soyad;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
       return username;
    }
    
}
