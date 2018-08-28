package ru.job4j.condition;

/**
 * Class DummyBot is intended to answer on three simple phrases.
 *
 * @author Infanatum
 * @version 1
 * @since 28.08.2018
 */
public class DummyBot {
    /**
     * Answering questions
     *
     * @param question User question.
     * @return Answer.
     */
    public String answer(String question) {
        String rsl = "This confuses me. Ask another question.";
        if ("Hi, Bot.".equals(question)) {
            rsl = "Hi, nerd.";
        } else if ("Bye.".equals(question)) {
            rsl = "See you soon.";
        }
        return rsl;
    }
}
