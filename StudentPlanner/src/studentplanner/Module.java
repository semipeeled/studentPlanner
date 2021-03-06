
package studentplanner;
import java.util.*;
/**
 *
 * @author phillipperks
 */
public class Module {
    private String moduleCode;
    private String moduleName;
    private Admin moduleOrganiser;
    private ArrayList<Assessment> assessments;
    private double currentGrade;
    private boolean moduleCompleted;
    private String notes;
    
    public Module(String moduleCode, String moduleTitle, Admin moduleOrganiser, Double grade, boolean completed, String notes){
        this.moduleCode = moduleCode;
        this.moduleName = moduleTitle;
        this.moduleOrganiser = moduleOrganiser;
        this.assessments = new ArrayList<>();
        this.currentGrade = grade;
        this.moduleCompleted = completed;
        this.notes = notes;
    }
    
    public String getModuleCode(){
        return moduleCode;
    }
    
    public void calculateCurrentGrade(){
        double grade = 0;
        for(Assessment assessment: assessments){
            grade += (assessment.getGrade()*(assessment.getWeighting()/100));
        }
        this.currentGrade = grade;
    }
    
    public String getModuleName(){
        return moduleName;
    }
    
    public Admin getModuleOrganiser(){
        return moduleOrganiser;
    }
    
    public ArrayList<Assessment> getAssessments(){
        return assessments;
    }
    
    public Assessment getAssessmentByIndex(int i){
        return assessments.get(i);
    }
    
    public Assessment getAssessmentByCode(String assessmentCode){
        for(Assessment currentAssessment: assessments){
            if(currentAssessment.getAssessmentCode().equals(assessmentCode)){
                return currentAssessment;
            }
        }
        return null;
    }
    
    public double getProgress(){
        double percentage = 0;
        if(assessments.size()!= 0){
            for(Assessment assessment : assessments){
                if(assessment.isCompleted()){
                    percentage += assessment.getWeighting();
                }
            }
            System.out.println(percentage);
        return percentage;
        }
        else{
            return 0;
        }
    }
    
    public double getCurrentGrade(){
        return currentGrade;
    }
    
    public boolean getModuleCompleted(){
        return moduleCompleted;
    }
    
    public String getNotes(){
        return notes;
    }
    
    public void addNote(String note){
        notes+=note;
        notes+="\n";
    }
    
    public void setModuleCompleted(boolean c){
        moduleCompleted = c;
    }
    
    public void addAssessment(Assessment assessment){
        assessments.add(assessment);
    }
    
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(moduleName).append("\n");
        return str.toString();
    }
}
