/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Jyoti
 */
public class User {
    private String gender;
    private String studentname;   
    private String caste;    
    private String minority;
    private String password;
    private int cetscore, ranking;
    
    public User(String studentname, String caste, String minority, String gender, String password, int cetscore, int ranking){
        this.studentname= studentname;
        this.cetscore= cetscore;
        this.ranking= ranking;
        this.caste= caste;
        this.minority= minority;
        this.gender= gender;
               
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getMinority() {
        return minority;
    }

    public void setMinority(String minority) {
        this.minority = minority;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCetscore() {
        return cetscore;
    }

    public void setCetscore(int cetscore) {
        this.cetscore = cetscore;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
     
}
