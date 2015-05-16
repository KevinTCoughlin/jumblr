package com.tumblr.jumblr.types;

/**
 * This class represents a Post of type "answer"
 * @author jc
 */
public class AnswerPost extends Post {

    private String asking_name, asking_url;
    private String question;
    private String answer;

    /**
     * Get the asking URL
     * @return String URL
     */
    public String getAskingUrl() {
        return asking_url;
    }

    /**
     * Get the asking name
     * @return String name
     */
    public String getAskingName() {
        return asking_name;
    }

    /**
     * Get the question
     * @return String question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Get the answer
     * @return String answer;
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * AnswerPost can not be saved
     * @throws IllegalArgumentException
     */
    @Override
    public void save() {
        throw new IllegalArgumentException("Cannot save AnswerPost");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnswerPost)) return false;
        if (!super.equals(o)) return false;

        AnswerPost that = (AnswerPost) o;

        if (asking_name != null ? !asking_name.equals(that.asking_name) : that.asking_name != null) return false;
        if (asking_url != null ? !asking_url.equals(that.asking_url) : that.asking_url != null) return false;
        if (question != null ? !question.equals(that.question) : that.question != null) return false;
        return !(answer != null ? !answer.equals(that.answer) : that.answer != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (asking_name != null ? asking_name.hashCode() : 0);
        result = 31 * result + (asking_url != null ? asking_url.hashCode() : 0);
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        return result;
    }
}