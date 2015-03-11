package me.letsplaywith.geoquiz;

/**
 * Created by jinyong on 3/11/15.
 */
public class TrueFalse {

    private int mQuestion;

    private boolean mTrueQuestion;

    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    /* By setting preference > codestyle > prefix of member variables
     * Getter & Setter function name is generated without 'm' prefix
     */

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int $Question) {
        mQuestion = $Question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean $TrueQuestion) {
        mTrueQuestion = $TrueQuestion;
    }
}
