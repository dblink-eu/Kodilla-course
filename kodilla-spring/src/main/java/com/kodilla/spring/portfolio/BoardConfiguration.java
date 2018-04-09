package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfiguration {
  @Bean(name = "toDoList")
    @Scope("prototype")
    public  TaskList  createtoDoList() {
      return new TaskList();
  }

  @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList createInProgressList() {
      return new TaskList();
  }

    @Bean(name = "doneList")
        @Scope("prototype")
        public TaskList createDoneList() {
          return new TaskList();
    }

    @Bean
    public Board getBoiard() {
      return new Board(createtoDoList(),createInProgressList(), createDoneList());
    }

}
