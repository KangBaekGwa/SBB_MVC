package baekgwa.sbb.domain.answer.service;

import baekgwa.sbb.model.question.entity.Question;

public interface AnswerService {
    void create(Integer id, String content);

    Question getQuestionByIdAndAnswers(Integer id);
}