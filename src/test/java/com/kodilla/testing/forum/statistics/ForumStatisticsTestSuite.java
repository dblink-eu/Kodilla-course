package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Matchers.booleanThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumStatisticsTestSuite {

    @Test
    public void testGetAvgPost0PerUser0() {

        //Given
        Statistics statisticMock = mock(Statistics.class);
        int postCounts = 0;
        ArrayList<String> usersNames = new ArrayList<>();
        when(statisticMock.postsCount()).thenReturn(postCounts);
        ForumStats forumStatsTest = new ForumStats(statisticMock);

        //when
        int avgPostsPerUser = forumStatsTest.getAvgPostPerUser();

        //Then
        Assert.assertEquals(0,avgPostsPerUser);
    }

    @Test
    public void testGetAvgComments0PerUser100() {

        //Given
        Statistics statisticMock = mock(Statistics.class);
        int commentsCountTest = 0;
        ArrayList<String> usersNames = new ArrayList<>();
        for (int i=0; i<100; i++) {
            usersNames.add("User");
        }
        when(statisticMock.commentsCount()).thenReturn(commentsCountTest);
        when(statisticMock.usersNames()).thenReturn(usersNames);
        ForumStats forumStatTest = new ForumStats(statisticMock);

        //When
        int avgComment0PerUser100 = forumStatTest.getAvgCommentsPerUser();

        //Then
        Assert.assertEquals(0,avgComment0PerUser100);
    }

    @Test
    public void testGetAvgPostAmountIsBiggerThanCommentsAmmount() {

        //Given
        Statistics statisticMock = mock(Statistics.class);
        int postAmmountTest = 30;
        int commentsAmmountTest = 20;
        when(statisticMock.commentsCount()).thenReturn(commentsAmmountTest);
        when(statisticMock.postsCount()).thenReturn(postAmmountTest);
        ForumStats forumStatTest = new ForumStats(statisticMock);

        //When
        boolean avgMorePostThanComments = forumStatTest.getPostAmounts()>forumStatTest.getCommentsAmount();

        //Then
        Assert.assertTrue(avgMorePostThanComments);

    } @Test
    public void testGetAvgCommentsAmountIsBiggerThanPostsAmmount() {

        //Given
        Statistics statisticMock = mock(Statistics.class);
        int postAmmountTest = 2;
        int commentsAmmountTest = 4;
        when(statisticMock.commentsCount()).thenReturn(commentsAmmountTest);
        when(statisticMock.postsCount()).thenReturn(postAmmountTest);
        ForumStats forumStatTest = new ForumStats(statisticMock);

        //When
        boolean avgMoreCommentsThanPosts = forumStatTest.getCommentsAmount() > forumStatTest.getPostAmounts();

        //Then
        Assert.assertTrue(avgMoreCommentsThanPosts);
    }

    @Test
    public void testCalculateStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmountTest = 1000;
        int commentsAmountTest = 0;
        ArrayList<String> userList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            userList.add("user");
        }

        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        when(statisticsMock.usersNames()).thenReturn(userList);
        ForumStats forumStatsTest = new ForumStats(statisticsMock);

        int averagePostAmountPerUserTest = forumStatsTest.getAvgPostPerUser();
        int averageCommentsAmountPerUserTest = forumStatsTest.getAvgCommentsPerUser();
        int averageCommentsAmountPerPostTest = forumStatsTest.getAvgCommentsPerPost();

        Assert.assertEquals(averageCommentsAmountPerPostTest,forumStatsTest.getAvgCommentsPerPost());
        Assert.assertEquals(averageCommentsAmountPerUserTest,forumStatsTest.getAvgCommentsPerUser());
        Assert.assertEquals(averagePostAmountPerUserTest,forumStatsTest.getAvgPostPerUser());
    }
}
