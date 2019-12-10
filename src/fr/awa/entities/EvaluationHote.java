/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.awa.entities;

/**
 *
 * @author root
 */

public class EvaluationHote { 
    private int note = 2;
    private String commentaire;

    public EvaluationHote(int note,String commentaire) {
        this.note=note;
        this.commentaire = commentaire;
    }

    public EvaluationHote() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    
    public int getNote() {
        return note;
    }

    public String getCommentaire() {
        return commentaire;
    }
  
    
}
