/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentplanner;

import java.util.ArrayList;

/**
 *
 * @author Michael Meyne
 */
public class Assignment extends Assessment {
    
    private String handInProcedure;
    private String assignmentType;
    private boolean isSummative;

    public Assignment(String handInProcedure, String assignmentType, boolean isSummative, String assessmentCode, String assessmentTitle, double weighting, double grade, Deadline deadline, ArrayList<Task> taskList, String notes) {
        super(assessmentCode, assessmentTitle, weighting, grade, deadline, taskList, notes);
        this.handInProcedure = handInProcedure;
        this.assignmentType = assignmentType;
        this.isSummative = isSummative;
    }

    
    
    
}
