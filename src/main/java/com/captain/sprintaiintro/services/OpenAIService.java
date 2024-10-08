package com.captain.sprintaiintro.services;

import com.captain.sprintaiintro.model.Answer;
import com.captain.sprintaiintro.model.Question;

/**
 * Created by Jackson G. Mwaniki
 */
public interface OpenAIService {

    String getAnswer(String question);

    Answer getAnswer(Question question);
}
