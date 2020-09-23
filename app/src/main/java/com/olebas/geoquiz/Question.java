package com.olebas.geoquiz;

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mIsSolved;

    public Question(int textResId, boolean answerTrue, boolean isSolved) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mIsSolved = isSolved;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isSolved() {
        return mIsSolved;
    }

    public void setSolved(boolean solved) {
        mIsSolved = solved;
    }
}
