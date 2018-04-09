package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

   @Test
    public void testTaskAdd() {
    //Given
      ApplicationContext context =
        new AnnotationConfigApplicationContext(BoardConfiguration.class);
       Board board = context.getBean(Board.class);
      //When
      board.getTodoList().tasks.add("ToDoTask1");
      board.getInProgressList().tasks.add("InProgressTask1");
      board.getDoneList().tasks.add("DoneTask1");
      //Then
       Assert.assertEquals("ToDoTask1", board.getTodoList().getTasks().get(0));
       Assert.assertEquals("InProgressTask1", board.getInProgressList().getTasks().get(0));
       Assert.assertEquals("DoneTask1", board.getDoneList().getTasks().get(0));
   }

}
