package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Team {
   private ArrayList<TeamMember> members = new ArrayList<>();

    /**
     * 
     * @param m an instance of TeamMember
     * Adds a teammember to the instance field members
     */
    public void addTeamMember(TeamMember m) {
        //TODO Delete line below, and implement this method
    members.add(m);
    }
    
    // Nothing to do here!
    public void addTeamMembers(ArrayList<TeamMember> t) {
        members.addAll(t);
    }
    
    // Nothing to do here!
    public ArrayList<TeamMember> getAllMembers() {
        return members;
    }
    
    /**
     * 
     * @param m the TeamMember to remove
     * @return if a TeamMember was removed
     */
    public boolean removeTeamMember(TeamMember m){
        //TODO Delete line below, and implement this method
        members.remove(m);
        return true;
    }

    /**
     * 
     * @return the next available id
     * The id must start at 0. If a member is removed from the list,
     * the id must be freed for the next member.
     * The next id must always be the smallest possible id number
     * 
     * * This is hard. Skip this for now if you don't know how to do it
     */
    
    public int getNextId() {
        //TODO Delete line below, and implement this method
        Integer largestid = 0;
        for (int i = 0; i < members.size(); i++) {
            for (int j = i+1; j < members.size(); j++) {
                if (getAllMembers().get(j).getId() != getAllMembers().get(j-1).getId()+1 ){
                    return getAllMembers().get(j-1).getId() + 1;
                }
                else if (getAllMembers().get(i).getId() < getAllMembers().get(j).getId()){
                    largestid = getAllMembers().get(j).getId();
                }
            }
        }
        return largestid+1;
    }

    /**
     * 
     * @param role, a String representing the role of the TeamMember
     * @return an ArrayList of all TeamMember that has the specified role
     */
    public ArrayList<TeamMember> retriveMembersByRole(String role) {
        //TODO Delete line below, and implement this method
        ArrayList<TeamMember> newList = new ArrayList<>();
        for (int i = 0; i < members.size(); i++) {
            if (getAllMembers().get(i).getRole() == role){
                newList.add(getAllMembers().get(i));
            }
        }
        return newList;
    }

    /**
     * Sort the TeamMember list in ascending order by name
     * * This is hard. Skip this for now if you don't know how to do it
     */
    public void sortByNameAsc() {
        //TODO Delete line below, and implement this method
        Collections.sort(members);
    }

    /**
     * Sort the TeamMember list in descending order by role
     * 
     * * This is hard. Skip this for now if you don't know how to do it
     */
    public void sortByRoleDesc() {
        //TODO Delete line below, and implement this method
    }
    
}
