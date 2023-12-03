package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Output {

    int userId = 5;

    int id = 5;

    String title = "King at turn";

    boolean completed = false;

    String body = "King at turn, is an topic that anybody talks est rerrum nulla";


    public String toString()
    {
        return "{ userId: " + userId + ", id: " + id + ", title: " + title + ", completed: " + completed + ", body: " + body + "}" ;
    }
}
