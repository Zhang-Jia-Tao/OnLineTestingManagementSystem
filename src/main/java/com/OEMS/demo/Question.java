package com.OEMS.demo;



/*+------------+-------------+------+-----+---------+----------------+
| Field      | Type        | Null | Key | Default | Extra          |
+------------+-------------+------+-----+---------+----------------+
| questionId | int         | NO   | PRI | NULL    | auto_increment |
| title      | varchar(50) | YES  |     | NULL    |                |
| optionA    | varchar(20) | YES  |     | NULL    |                |
| optionB    | varchar(20) | YES  |     | NULL    |                |
| optionC    | varchar(20) | YES  |     | NULL    |                |
| optionD    | varchar(20) | YES  |     | NULL    |                |
| answer     | char(1)     | YES  |     | NULL    |                |
+------------+-------------+------+-----+---------+----------------+*/

public class Question {
    private Integer questionId;
    private String style;
    private String title;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answer;

    public Question() {

    }

    public Question(Integer questionId, String title, String optionA,
                    String optionB, String optionC, String optionD, String answer,String style) {
        this.questionId = questionId;
        this.title = title;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.answer = answer;
        this.style = style;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
