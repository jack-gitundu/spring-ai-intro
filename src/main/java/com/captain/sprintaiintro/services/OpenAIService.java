package com.captain.sprintaiintro.services;

import com.captain.sprintaiintro.model.*;

/**
 * Created by Jackson G. Mwaniki
 */
public interface OpenAIService {

    String getAnswer(String question);

    Answer getAnswer(Question question);

    GetCapitalResponse getCapital(GetCapitalRequest getCapitalRequest);

    GetCapitalWithInfoResponse getCapitalWithInfo(GetCapitalRequest getCapitalRequest);
}
