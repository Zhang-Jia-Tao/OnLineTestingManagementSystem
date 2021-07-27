package com.OEMS.dao_exam;

import com.OEMS.demo.Question;
import com.OEMS.demo.Score;
import com.OEMS.util.util;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ExamDaoImpl implements ExamDao{


    @Override
    //添加试题
    public Integer Add_Exam(Question question) {
        SqlSession session = util.getSqlSession();
        ExamDao dao = session.getMapper(ExamDao.class);
        int res = dao.Add_Exam(question);
        return res;
    }

    //添加试题
    public List<Question> Query_Exam(){
        SqlSession session = util.getSqlSession();
        ExamDao dao = session.getMapper(ExamDao.class);
        List<Question> questions = dao.Query_Exam();
        return questions;
    }

    //删除试题
    public Integer Delete_Exam(Integer id){
        SqlSession session = util.getSqlSession();
        ExamDao dao = session.getMapper(ExamDao.class);
        int res = dao.Delete_Exam(id);
        return res;
    }

    @Override
    public Question FindById_Exam(Integer id) {
        SqlSession session = util.getSqlSession();
        ExamDao dao = session.getMapper(ExamDao.class);
        Question question = dao.FindById_Exam(id);
        return question;
    }

    public List<Question> Online_Exam(String style){
        SqlSession session = util.getSqlSession();
        ExamDao dao = session.getMapper(ExamDao.class);
        List<Question> questions = dao.Online_Exam(style);
        return questions;
    }

    @Override
    public Integer Update_Exam(Question question) {
        SqlSession session = util.getSqlSession();
        ExamDao dao = session.getMapper(ExamDao.class);
        Integer res = dao.Update_Exam(question);
        return res;
    }

    //导入成绩
    public Integer Insert_Score(Score score){
        SqlSession session = util.getSqlSession();
        ExamDao dao = session.getMapper(ExamDao.class);
        Integer res = dao.Insert_Score(score);
        return res;
    }

    //查询分数
    public List<Score> Query_Score(){
        SqlSession session = util.getSqlSession();
        ExamDao dao = session.getMapper(ExamDao.class);
        List<Score> scores = dao.Query_Score();
        return scores;
    }
}
