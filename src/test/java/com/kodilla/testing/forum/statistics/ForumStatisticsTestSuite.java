package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumStatisticsTestSuite {

    private static final String USER_NAME = "JohnTest";
    private Statistics statisticMock;
    private ForumStats forumStatTest;


    @Before
    public void setup() {
        statisticMock = mock(Statistics.class);
        forumStatTest = new ForumStats(statisticMock);
    }

    @Test
    public void testGetAvgPost0PerUser0() {

        //Given
        when(statisticMock.postsCount()).thenReturn(0);
        //when
        forumStatTest.calculateAdvStatistics(statisticMock);
        //Then
        assertEquals(0,forumStatTest.getAvgPostPerUser());
    }

    @Test
    public void testGetAvgComments0PerUser100() {

        //Given
        int commentsCountTest = 0;
        ArrayList<String> usersNames = prepareUsers();
        when(statisticMock.commentsCount()).thenReturn(commentsCountTest);
        when(statisticMock.usersNames()).thenReturn(usersNames);
        //When
        int avgComment0PerUser100 = forumStatTest.getAvgCommentsPerUser();
        //Then
        assertEquals(0,avgComment0PerUser100);
    }

    @Test
    public void testGetAvgPostAmountIsBiggerThanCommentsAmmount() {

        //Given
        int postAmmountTest = 30;
        int commentsAmmountTest = 20;
        when(statisticMock.commentsCount()).thenReturn(commentsAmmountTest);
        when(statisticMock.postsCount()).thenReturn(postAmmountTest);


        //When
        boolean avgMorePostThanComments = forumStatTest.getPostAmounts()>forumStatTest.getCommentsAmount();

        //Then
        Assert.assertTrue(avgMorePostThanComments);

    } @Test
    public void testGetAvgCommentsAmountIsBiggerThanPostsAmmount() {

        //Given
        int postAmmountTest = 2;
        int commentsAmmountTest = 4;
        when(statisticMock.commentsCount()).thenReturn(commentsAmmountTest);
        when(statisticMock.postsCount()).thenReturn(postAmmountTest);


        //When
        boolean avgMoreCommentsThanPosts = forumStatTest.getCommentsAmount() > forumStatTest.getPostAmounts();

        //Then
        Assert.assertTrue(avgMoreCommentsThanPosts);
    }

    @Test
    public void testCalculateStatistics() {

        //Given

        int postsAmountTest = 1000;
        int commentsAmountTest = 0;
        ArrayList<String> userList = prepareUsers();

        when(statisticMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticMock.commentsCount()).thenReturn(commentsAmountTest);
        when(statisticMock.usersNames()).thenReturn(userList);

        int averagePostAmountPerUserTest = forumStatTest.getAvgPostPerUser();
        int averageCommentsAmountPerUserTest = forumStatTest.getAvgCommentsPerUser();
        int averageCommentsAmountPerPostTest = forumStatTest.getAvgCommentsPerPost();

        assertEquals(averageCommentsAmountPerPostTest,forumStatTest.getAvgCommentsPerPost());
        assertEquals(averageCommentsAmountPerUserTest,forumStatTest.getAvgCommentsPerUser());
        assertEquals(averagePostAmountPerUserTest,forumStatTest.getAvgPostPerUser());
    }

    private ArrayList<String> prepareUsers() {
        ArrayList<String> userList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            userList.add(USER_NAME);
        }
        return userList;
    }
}
