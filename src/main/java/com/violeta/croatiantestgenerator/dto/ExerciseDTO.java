package com.violeta.croatiantestgenerator.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class ExerciseDTO {

    private String question;
    private boolean toComplete;
    private boolean printJustTheQuestion;
    private List<ExerciseAlternativeDTO> alternativeDTOList;

    public ExerciseDTO() {
        alternativeDTOList = new ArrayList<>();
    }

    public static ExerciseDTO getInstance() {
        return new ExerciseDTO();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExerciseDTO that = (ExerciseDTO) o;
        return question.equals(that.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question);
    }
}
