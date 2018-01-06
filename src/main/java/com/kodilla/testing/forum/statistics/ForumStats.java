package com.kodilla.testing.forum.statistics;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.List;

public class ForumStats {
    Statistics statistics;
    public ArrayList<Integer> statisticsList = new ArrayList<>();

    public ForumStats(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUserAmount() {
        int userAmount = statistics.usersNames().size();
        return userAmount;
    }

    public int getPostAmounts() {
        int postsAmount = statistics.postsCount();
        return postsAmount;
    }

    public int getCommentsAmount() {
        int commentsAmount = statistics.commentsCount();
        return commentsAmount;
    }

    public int getAvgPostPerUser() {
        int avgPostPerUser;
        if (getUserAmount()>0){
            avgPostPerUser = getPostAmounts() / getUserAmount();
        } else {
            System.out.println("Dev by 0!");
            avgPostPerUser=0;
        }
        return avgPostPerUser;
    }

    public int getAvgCommentsPerUser() {
        if (getUserAmount()<1){
            System.out.println("Dev by 0!");
            return 0;
        } else {
            int avgCommentsPerUser = getCommentsAmount() / getUserAmount();
            return avgCommentsPerUser;
        }
    }

    public int getAvgCommentsPerPost() {
        if (getPostAmounts()<1) {
            System.out.println("Dev by 0!");
            return 0;
        } else {
            int avgCommentsPerPost = getCommentsAmount() / getPostAmounts();
            return avgCommentsPerPost;
        }
    }

    public void calculateAdvStatistics(Statistics statistics) {
        statisticsList.add(getUserAmount());
        statisticsList.add(getPostAmounts());
        statisticsList.add(getCommentsAmount());
        statisticsList.add(getAvgPostPerUser());
        statisticsList.add(getAvgCommentsPerUser());
        statisticsList.add(getAvgCommentsPerPost());
    }

    ArrayList<Integer> showStatistics() {
        return statisticsList;
    }
}
