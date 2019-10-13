package com.violeta.croatiantestgenerator.service;

import com.violeta.croatiantestgenerator.dto.ExerciseDTO;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;

@Service
public class CroatianTestGeneratorService {

    private static final String LINE_BREAK = "\r\n";
    private static final int ITERACIONES = 2;
    private static final int NRO_PREGUNTAS = 15;

    private CroatianQuestionLoaderService loaderService;

    private Iterator<ExerciseDTO> exerciseDTOList;

    public void generateTests() {
        loaderService = new CroatianQuestionLoaderService();
        exerciseDTOList = loaderService.getCroatianQuestionListLoaded().iterator();
        int iteracionActual = 0;
        int nroArchivos = 1;

        while (exerciseDTOList.hasNext() || iteracionActual < ITERACIONES) {
            if (iteracionActual == ITERACIONES) {
                return;
            }
            List<ExerciseDTO> tempList = new ArrayList<>(NRO_PREGUNTAS);
            int contPreguntas = 0;
            while (contPreguntas < NRO_PREGUNTAS) {
                if (!exerciseDTOList.hasNext()) {
                    exerciseDTOList = loaderService.getCroatianQuestionListLoaded().iterator();
                    iteracionActual++;
                }
                ExerciseDTO dto = exerciseDTOList.next();
                if (tempList.contains(dto)) {
                    continue;
                }
                tempList.add(dto);
                contPreguntas++;
            }
            generarArchivo(tempList, nroArchivos);
            nroArchivos++;
        }
    }

    private void generarArchivo(List<ExerciseDTO> exercises, int nroArchivos) {
        StringJoiner joiner = new StringJoiner(LINE_BREAK);

        joiner.add("REPUBLIKA HRVATSKA");
        joiner.add("MINISTARSTVO UNUTARNJIH POSLOVA  PU/PP.....");
        joiner.add("DMU/KU ...........VRH");
        joiner.add("_______________________________________________________________");
        joiner.add("");
        joiner.add("STRANAC   POPUNJAVA  VLASTORUČNO");
        joiner.add("");
        joiner.add("IME I PREZIME:.............................................");
        joiner.add("DATUM ROĐENJA: .........................................");
        joiner.add("DRŽAVLJANSTVO:......................................");
        joiner.add("");
        joiner.add("UPITNIK O POZNAVANJU");
        joiner.add("");

        int index = 1;
        for (ExerciseDTO exerciseDTO : exercises) {
            try {
                joiner.add(index + ") " + exerciseDTO.getQuestion());
                if (!exerciseDTO.isToComplete()) {
                    joiner.add("  A) " + exerciseDTO.getAlternativeDTOList().get(0).getChoice());
                    joiner.add("  B) " + exerciseDTO.getAlternativeDTOList().get(1).getChoice());
                    joiner.add("  C) " + exerciseDTO.getAlternativeDTOList().get(2).getChoice());
                    joiner.add("  D) " + exerciseDTO.getAlternativeDTOList().get(3).getChoice());

                } else if (!exerciseDTO.isPrintJustTheQuestion()) {
                    joiner.add("");
                    joiner.add("____________________________________________________________");

                }
            } finally {
                joiner.add("");
                joiner.add("");
                index++;

            }
        }

        joiner.add("");
        joiner.add("");
        joiner.add("");
        joiner.add("");
        joiner.add("");
        joiner.add("       VLASTORUČNI POTPIS  STRANCA / POTPIS PODNOSITELJA ZAHTJEVA");
        joiner.add("");
        joiner.add("");
        joiner.add("                    DATUM I MJESTO ZAHTJEVA");

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("..\\Archivo" + nroArchivos + ".txt"));
            writer.write(joiner.toString());

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (writer != null) {
                try {
                    writer.close();

                } catch (IOException e) {
                    e.printStackTrace();

                }
            }

        }

    }

}
