package org.jpa.manytoone.entity;

import javax.persistence.*;

@Entity
public class AnswerData {

    @Id
    @GeneratedValue
    private int id;

    private String answeredBy;
    private String answer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id")
    private QuestionData question;

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnsweredBy() {
        return answeredBy;
    }

    public void setAnsweredBy(String answeredBy) {
        this.answeredBy = answeredBy;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionData getQuestion() {
        return question;
    }

    public void setQuestion(QuestionData question) {
        this.question = question;
    }

	@Override
	public String toString() {
		return "AnswerData [id=" + id + ", answeredBy=" + answeredBy + ", answer=" + answer + ", question=" + question
				+ "]";
	}
    
}