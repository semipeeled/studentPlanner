package studentplanner;

import java.util.ArrayList;

/**
 *
 * @author phillipperks
 */
public class ModuleController {
    private DashboardController dashboard;
    private Module module;
    
    public Module getModule(){
        return module;
    }
    //needs improving
    public Assessment viewAssessment(int i){
        return module.getAssessments().get(i);
    }
    public String getModuleCode(){
       return module.getModuleCode();
    }
    
    public String getModuleTitle(){
        return module.getModuleTitle();
    }
    
    public Admin getModuleOrganiser(){
        return module.getModuleOrganiser();
    }
    
    public ArrayList<Assessment> getAssessments(){
        return module.getAssessments();
    }
    
    public ArrayList<Double> getAssessmentGrades(){
        return module.getAssessmentGrades();
    }
    
    public double getCurrentGrade(){
        return module.getCurrentGrade();
    }
    
    public boolean getModuleCompleted(){
        return module.getModuleCompleted();
    }
    
    public String getNotes(){
        return module.getNotes();
    }
    
    public void addNote(String note){
        module.addNote(note);
    }
    
    public void setModuleCompleted(boolean c){
        module.setModuleCompleted(c);
    }
    
    public DashboardController getDashboardController(){
        return dashboard;
    }
}