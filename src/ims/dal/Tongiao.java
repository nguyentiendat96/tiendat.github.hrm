/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

/**
 *
 * @author TienDat96
 */
public class Tongiao {
    private String matongiao;
    private String tentongiao;

    public Tongiao() {
    }

    public Tongiao(String matongiao, String tentongiao) {
        this.matongiao = matongiao;
        this.tentongiao = tentongiao;
    }

    public String getMatongiao() {
        return matongiao;
    }

    public void setMatongiao(String matongiao) {
        this.matongiao = matongiao;
    }

    public String getTentongiao() {
        return tentongiao;
    }

    public void setTentongiao(String tentongiao) {
        this.tentongiao = tentongiao;
    }
    
}
