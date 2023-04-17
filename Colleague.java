import java.util.ArrayList;

public class Colleague {
    private String tag;
    private int joinYear;
    private int joinDay;
    private int joinMonth;
    private ArrayList<String> interests = new ArrayList<String>();
    
    public Colleague(String tag, int joinYear, int joinMonth, int joinDay, ArrayList<String> interests) {
        this.tag = tag;
        this.joinYear = joinYear;
        this.joinMonth = joinMonth;
        this.joinDay = joinDay;
        this.interests = interests;
    }

    public String getTag(){
        return tag;
    }

    public String getInterests(){
        return interests.toString();
    }

    public String getDateJoined(){
        return joinYear + "-" + joinMonth + "-" + joinDay;
    }

    public String getUserName(){
        return "HAR@" + tag;
    }

    @Override
    public String toString(){
        return "Colleague{" +
                "tag='" + tag + '\'' +
                ", joinYear=" + joinYear +
                ", joinDay=" + joinDay +
                ", joinMonth=" + joinMonth +
                ", interests=" + interests +
                '}';
    }
}