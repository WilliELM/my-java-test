package assignment3;

import java.util.Comparator;

/**
 * 
 * @author easv
 * 
 * Do not modify. Nothing to do.
 * 
 */
public class TeamMember implements Comparable<TeamMember>{
    private int id;
    private String name, role;

    public TeamMember(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getId() {
        return id;
    }




    @Override public int compareTo(TeamMember o) {
    return this.getName().compareTo(o.getName())      ;
    }
    }

    //public int compare(TeamMember o1, TeamMember o2) {
   //     return o1.getName().compareTo(o2.getName());
    //}

