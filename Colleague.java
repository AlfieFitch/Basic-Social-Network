/**
 * 
 * A class that implements a Colleague.
 * @author AFitchMay
 */


import java.util.ArrayList;

public class Colleague {
    /**
     * private attributes linked to the Colleague class.
     */
    private String tag;
    private int joinYear;
    private int joinDay;
    private int joinMonth;
    private String uniqueUserName;
    private String joinedDate;
    private String username;
    private ArrayList<String> interests = new ArrayList<String>();
    public static int nextUNN = 100;
    public ArrayList<Colleague> friends = new ArrayList<Colleague>();


    /**
     * Constructor for the Colleague class.
     * @param tag - the tag of the colleague
     * @param joinYear - the year the colleague joined
     * @param joinMonth - the month the colleague joined
     * @param joinDay - the day the colleague joined
     * @param interests - the interests of the colleague
     */
    public Colleague(String tag, int joinYear, int joinMonth, int joinDay, ArrayList<String> interests) {
        this.tag = tag;
        this.joinYear = joinYear;
        this.joinMonth = joinMonth;
        this.joinDay = joinDay;
        this.interests = interests;
        this.username = "HAR@" + tag;
        joinedDate = joinYear + "-" + joinMonth + "-" + joinDay;
        this.uniqueUserName = this.username + "#" + nextUNN++;
    }

    public void setTage(String tag){
        this.tag = tag;
    }

    public void setJoinYear(int joinYear){
        this.joinYear = joinYear;
    }

    public void setJoinMonth(int joinMonth){
        this.joinMonth = joinMonth;
    }

    public void setJoinDay(int joinDay){
        this.joinDay = joinDay;
    }

    public void setInterests(ArrayList<String> interests){
        this.interests = interests;
    }

    /**
     * Getter method for the tag attribute.
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * Getter method for the joinYear attribute.
     * @return joinYear
     */
    public int getJoinYear() {
        return joinYear;
    }

    /**
     * Getter method for the joinDay attribute.
     * @return joinDay
     */
    public int getJoinDay() {
        return joinDay;
    }

    /**
     * Getter method for the joinMonth attribute.
     * @return joinMonth
     */
    public int getJoinMonth() {
        return joinMonth;
    }

    /**
     * Getter method for the interests attribute.
     * @return interests
     */
    public String getInterests() {
        return interests.toString();
    }

    /**
     * Getter method for the dateJoined attribute.
     * @return dateJoined
     */
    public String getDateJoined() {
        return joinedDate;
    }

    /**
     * Getter method for the username attribute.
     * @return username
     */
    public String getUserName() {
        return username;
    }

    /**
     * Getter method for the uniqueUserName attribute.
     * @return uniqueUserName
     */
    public String getUniqueUserName() {
        return uniqueUserName;
    }

    /**
     * Adds a friend to the friend arraylist.
     * @param Friend - Colleague object of friend.
     */
    public void addFriend(Colleague friend) {
        friends.add(friend);
    }

    /**
     * Returns true if the friend object is present in the friend list, false if not.
     * @return boolean
     */
    public boolean isFriend(Colleague friend) {
        return friends.contains(friend);
    }

    /**
     * Returns the number of friends the colleague has.
     * @return int
     */
    public int numFriends() {
        return friends.size();
    }

    @Override
    public String toString() {
        return "Colleague{" +
                "tag='" + tag + '\'' +
                ", joinYear=" + joinYear +
                ", joinDay=" + joinDay +
                ", joinMonth=" + joinMonth +
                ", interests=" + interests +
                ", username='" + username  +
                ", uniqueUserName='" + uniqueUserName +
                '}';
    }
}