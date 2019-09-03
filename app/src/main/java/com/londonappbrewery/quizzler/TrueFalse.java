package com.londonappbrewery.quizzler;

public class TrueFalse {

    private int questionId;
    private boolean answer;

    public TrueFalse(int questionResourceId, boolean trueOrFalse) {
        questionId = questionResourceId;
        answer = trueOrFalse;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public boolean getAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}

