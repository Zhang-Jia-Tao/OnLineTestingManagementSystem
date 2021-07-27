package com.OEMS.demo;

public class Score {
    Integer Id;
    String Username;
    Integer Score;
    String Style;

    public Score(){}

    public Score(Integer id, String username, Integer score,String style) {
        Id = id;
        Username = username;
        Score = score;
        Style = style;
    }

    public Integer getId() {
        return Id;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String style) {
        Style = style;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer score) {
        Score = score;
    }
}
