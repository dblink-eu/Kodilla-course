package com.kodilla.testing.forum.statistics;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.List;

public class ForumStats {

    private Statistics statistics;
    private int avgCommentsPerUser;

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
        int commentsAmount = statistics.commentsCount();
        return commentsAmount;
    }

    private int countAvgPostPerUser() {
        int avgPostPerUser;
        if (getUserAmount()>0){
            avgPostPerUser = getPostAmounts() / getUserAmount();
        } else {
            System.out.println("Dev by 0!");
            avgPostPerUser=0;
        }
        return avgPostPerUser;
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
            int avgCommentsPerPost = getCommentsAmount() / getPostAmounts();
            return avgCommentsPerPost;
        }
    }

    public void calculateAdvStatistics(Statistics statistics) {
        avgCommentsPerUser = countAvgCommentsPerUser();

      /*  statisticsList.add(getUserAmount());
        statisticsList.add(getPostAmounts());
        statisticsList.add(getCommentsAmount());
        statisticsList.add(getAvgPostPerUser());
        statisticsList.add(getAvgCommentsPerUser());
        statisticsList.add(getAvgCommentsPerPost());*/
    }

}
