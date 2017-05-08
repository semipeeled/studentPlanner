/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentplanner;
import java.util.*;
import java.time.*;
/**
 *
 * @author phillipperks
 */
public class DashboardController {
    private DashBoard dashboard;
    
    public ArrayList<Module> viewModules(){
        return dashboard.getModules();
    }
    
    public ArrayList<Milestone> viewMilestones(){
        return dashboard.getMilestones();
    }
    
    public ArrayList<Assessment> viewUpComingIncompleteAssessments(){
        ArrayList<Assessment> upComingAssessments = new ArrayList<>();
        
        Date today = new Date();
        
        for(int i=0; i<dashboard.getModules().size(); i++){
           for(int j=0; j<dashboard.getModule(i).getAssessments().size(); j++){
               if(!dashboard.getModule(i).getAssessmentByIndex(j).isComplete()){
                   Calendar calendar = Calendar.getInstance();
                    calendar.setTime(dashboard.getModule(i).getAssessmentByIndex(j).getDeadline());            
                    calendar.add(Calendar.DAY_OF_YEAR, -7);
                    Date previousWeek = calendar.getTime();
                   if(!(today.before(previousWeek) 
                           || today.after(dashboard.getModule(i).getAssessmentByIndex(j).getDeadline()))){
                       upComingAssessments.add(dashboard.getModule(i).getAssessmentByIndex(j));
                    }
               }
           }
       }
        
       return upComingAssessments;
    }
//    public Module viewModule(String moduleName){
//       for(int i=0; i<dashboard.getModules().size(); i++){
//           if(dashboard.getModule(i).getModuleName().equals(moduleName)){
//               return dashboard.getModule(i);
//           }
//       }
//    }
}