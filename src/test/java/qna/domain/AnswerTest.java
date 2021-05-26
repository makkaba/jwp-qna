package qna.domain;

import org.junit.jupiter.api.Test;

public class AnswerTest {
    public static final Answer A1 = new Answer(UserTest.JAVAJIGI, QuestionTest.Q1, "Answers Contents1");
    public static final Answer A2 = new Answer(UserTest.SANJIGI, QuestionTest.Q1, "Answers Contents2");

    @Test
    void canCrate() {
        Question question1 = new Question(1L, "title", "content");
        new Answer(UserTest.JAVAJIGI, question1, "content");
    }
}
