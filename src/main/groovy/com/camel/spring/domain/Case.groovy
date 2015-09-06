package com.camel.spring.domain

/**
 * Created by Mohsan on 03-09-2015.
 */
class Case {

    String title
    String type
    String status


    @Override
    public String toString() {
        return "CaseCommand{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
