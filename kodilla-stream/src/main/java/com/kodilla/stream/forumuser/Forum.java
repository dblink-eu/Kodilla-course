package com.kodilla.stream.forumuser;

        import java.time.LocalDate;
        import java.util.ArrayList;
        import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList= new ArrayList<>();

    public Forum() {
        this.theForumUserList.add(new ForumUser(1,"jsmith", 'M', LocalDate.of(1979,10,12)  , 7));
        this.theForumUserList.add(new ForumUser(2,"jnowak", 'M', LocalDate.of(1973,9,9)  , 0));
        this.theForumUserList.add(new ForumUser(3,"gjanuszewska", 'F', LocalDate.parse("1999-10-01")  , 1));
        this.theForumUserList.add(new ForumUser(4,"jmalinowska", 'F',  LocalDate.parse("1983-02-01") , 4));
        this.theForumUserList.add(new ForumUser(5,"cbush", 'F', LocalDate.of(1993,3,5)  , 17));
        this.theForumUserList.add(new ForumUser(6,"jsmith2", 'M',LocalDate.of(1991,1,2)   , 37));
        this.theForumUserList.add(new ForumUser(7,"jsmith3", 'M', LocalDate.of(2001,2,22)  , 17));
        this.theForumUserList.add(new ForumUser(8,"jsmith4", 'M', LocalDate.of(2000,6,21)  , 6));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
