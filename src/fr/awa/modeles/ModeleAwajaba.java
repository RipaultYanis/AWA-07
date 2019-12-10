/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.awa.modeles;

import fr.awa.entities.EvaluationHote;

/**
 *
 * @author root
 */
public class ModeleAwajaba  {
    private ModeleAwajaba modele = null;
    private EvaluationHote Eval;

    public ModeleAwajaba(EvaluationHote Eval) {
        this.Eval = Eval;
    }
    
    

    public ModeleAwajaba getModele() {
        return modele;
    }
    
    public EvaluationHote getEvaluations() {
        return this.getEvaluations();
    }
    
    public void setEvaluations(EvaluationHote uneEvaluation) {
        this.Eval.setNote(uneEvaluation.getNote());
        this.Eval.setCommentaire(uneEvaluation.getCommentaire());
        
    }
}
