package com.OEMS.dao_exam;

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

import com.OEMS.demo.Question;
import com.OEMS.demo.Score;

import java.util.List;

public interface ExamDao {
    //添加试题
    public Integer Add_Exam(Question question);

    //查询试题
    public List<Question> Query_Exam();

    //删除试题
    public Integer Delete_Exam(Integer id);

    //查询详细试题信息
    public Question FindById_Exam(Integer id);

    //在线考试
    public List<Question> Online_Exam(String style);

    //更新试题
    public Integer Update_Exam(Question question);

    //导入分数
    public Integer Insert_Score(Score score);

    //查询分数
    public List<Score> Query_Score();
}
