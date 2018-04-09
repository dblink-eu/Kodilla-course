package com.kodilla.testing.forum.statistics;

//import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.List;

public class ForumStats {

    private Statistics statistics;
    private int avgCommentsPerUser;
    private int commentsAmount;
    private int avgPostPerUser;
    private int avgCommentsPerPost;;

    public ForumStats(Statistics statistics) {
        this.statistics = statistics;
    }


    public int getUserAmount() {
        return statistics.usersNames().size();
    }

    public int getPostAmounts() {
        return  statistics.postsCount();

    }

    public int getCommentsAmount() {
        return  statistics.commentsCount();
    }

    public int getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public int getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public int getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        avgCommentsPerUser = countAvgCommentsPerUser();
        avgCommentsPerPost = countAvgCommentsPerPost();
        avgPostPerUser = countAvgPostPerUser();
    }
    private int countAvgPostPerUser() {
        if (getUserAmount()>0){
            return getPostAmounts() / getUserAmount();
        } else {
            System.out.println("Dev by 0!");
            return 0;
        }
    }

    private int countAvgCommentsPerUser() {
        if (getUserAmount()<1){
            System.out.println("Dev by 0!");
            return 0;
        } else {
            return statistics.commentsCount()/getUserAmount();
        }
    }

    private int countAvgCommentsPerPost() {
        if (getPostAmounts()<1) {
            System.out.println("Dev by 0!");
            return 0;
        } else {
            return  getCommentsAmount() / getPostAmounts();
        }
    }
}
