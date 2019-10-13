package com.violeta.croatiantestgenerator.service;

import com.violeta.croatiantestgenerator.dto.ExerciseAlternativeDTO;
import com.violeta.croatiantestgenerator.dto.ExerciseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

@Service
public class CroatianQuestionLoaderService {

    private List<ExerciseDTO> listOfQuestions;

    private static final String LINE_BREAK = "\r\n";

    public List<ExerciseDTO> getCroatianQuestionListLoaded() {
        listOfQuestions = new ArrayList<>();

        loadExercise1();
        loadExercise2();
        loadExercise3();
        loadExercise4();
        loadExercise5();
        loadExercise6();
        loadExercise7();
        loadExercise8();
        loadExercise9();
        loadExercise10();
        loadExercise11();
        loadExercise12();
        loadExercise13();
        loadExercise14();
        loadExercise15();
        loadExercise16();
        loadExercise17();
        loadExercise18();
        loadExercise19();
        loadExercise20();
        loadExercise21();
        loadExercise22();
        loadExercise23();
        loadExercise24();
        loadExercise25();
        loadExercise26();
        loadExercise27();
        loadExercise28();
        loadExercise29();
        loadExercise30();
        loadExercise31();
        loadExercise32();
        loadExercise33();
        loadExercise34();
        loadExercise35();
        loadExercise36();
        loadExercise37();
        loadExercise38();
        loadExercise39();
        loadExercise40();
        loadExercise41();
        loadExercise42();
        loadExercise43();
        loadExercise44();
        loadExercise45();
        loadExercise46();
        loadExercise47();
        loadExercise48();
        loadExercise49();
        loadExercise50();
        loadExercise51();
        loadExercise52();
        loadExercise53();
        loadExercise54();
        loadExercise55();
        loadExercise56();
        loadExercise57();
        loadExercise58();
        loadExercise59();
        loadExercise60();
        loadExercise61();
        loadExercise62();
        loadExercise63();
        loadExercise64();
        loadExercise65();
        loadExercise66();
        loadExercise67();
        loadExercise68();
        loadExercise69();
        loadExercise70();
        loadExercise71();
        loadExercise72();
        loadExercise73();
        loadExercise74();
        loadExercise75();
        loadExercise76();
        loadExercise77();
        loadExercise78();
        loadExercise79();
        loadExercise80();
        loadExercise81();
        loadExercise82();
        loadExercise83();
        loadExercise84();
        loadExercise85();
        loadExercise86();
        loadExercise87();
        loadExercise88();
        loadExercise89();
        loadExercise90();
        loadExercise91();
        loadExercise92();
        loadExercise93();
        loadExercise94();
        loadExercise95();
        loadExercise96();
        loadExercise97();
        loadExercise98();
        loadExercise99();

        Collections.shuffle(listOfQuestions);
        return listOfQuestions;
    }

    private void loadExercise1() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Eufrazijeva bazilika poznata je znamenitost grada u Istri");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Poreča"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Koprivnice"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Biograda"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Gospića"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise2() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Jedna od poznatih znamenitosti Zagreba, glavnog grada Republike Hrvatske je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("katedrala"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("amfiteatar"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("dvorac Trakošćan"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("morske orgulje"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise3() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Katedrala sv. Jakova 2000. godine uvrštena u UNESCO-ov popis svjetskog kulturnog nasljeđa nalazi se u");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Splitu"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Zagrebu"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Puli"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Šibeniku"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise4() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Povijesna građevina, najveći rimski amfiteatar na području današnje Hrvatske nalazi se u");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Puli"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Zagrebu"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Osijeku"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Zadru"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise5() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Morske orgulje jedna su od znamenitosti grada");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Zadra"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Osijeka"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Varaždina"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Pule"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise6() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Jedan od najpoznatijih dvoraca u sjevernom dijelu Republike Hrvatske je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Stari Grad"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Trakošćan"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Dioklecijanova palača"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Eufrazijeva bazilika"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise7() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Hrvatski grad kroz koji prolaze četiri rijeke (Korana, Kupa, Mrežnica i Dobra) zove se");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Karlovac"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Dubrovnik"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Varaždin"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Rijeka"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise8() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Koji je glavni grad Republike Hrvatske?");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise9() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("U studenome 1991. godine, nakon što su tri mjeseca stotinama artiljerijskih granata svakodnevno razarali mjesto, jugoslavenska vojska i paravojne formacije okupirali su grad. Ubijeno je preko 2.000 građana i branitelja, a 800 osoba je nestalo i do danas se ne zna njihova sudbina. Taj grad je:");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise10() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Kako se zove najveći grad u Slavoniji, četvrti po veličini grad u Republici Hrvatskoj?");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise11() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Početkom 4. stoljeća rimski car Dioklecijan izgradio je svoju palaču na području Dalmacije. Kako se danas zove grad čija je povijesna jezgra Dioklecijanova palača?");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise12() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Brončane kipove biskupa Grgura Ninskog, koji se nalaze u gradovima Ninu, Splitu i Varaždinu, izradio je poznati hrvatski kipar");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Robert Frangeš"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ivan Meštrović"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Antun Augustinčić"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Frano Kršinić"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise13() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Dekorativni odjevni predmet, oblika vrpce, koji se nosi oko vrata i smatra se izvornim hrvatskim proizvodom je");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise14() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Lijepa naša domovino…, je početak teksta:");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise15() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Himna Republike Hrvatske je");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise16() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        StringJoiner question = new StringJoiner(LINE_BREAK);
        question.add("Dopunite tekst himne Republike Hrvatske:");
        question.add("1 Lijepa naša domovino");
        question.add("2 ____________________");
        question.add("3 ____________________");
        question.add("4 Da bi vazda sretna bila.");
        exerciseDTO.setQuestion(question.toString());
        exerciseDTO.setToComplete(true);
        exerciseDTO.setPrintJustTheQuestion(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise17() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Navedite nazive barem tri županije u Republici Hrvatskoj:");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise18() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Središnja banka Republike Hrvatske je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Hrvatska banka za obnovu i razvoj"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Hrvatska gospodarska banka"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Hrvatska narodna banka"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Hrvatska poštanska banka"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise19() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Dalmacija je poznata po uzgoju");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("maslina i smokvi"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("šljiva i jabuka"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("ananasa i banana"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("jagoda i malina"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise20() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Svjetski poznati izvozni proizvod hrvatske prehrambene industrije je začin");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("mažuran"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("vegeta"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("papar"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("origano"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise21() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        StringJoiner question = new StringJoiner(LINE_BREAK);
        question.add("Opišite zastavu Republike Hrvatske:");
        question.add("Sastoji se od tri boje koje su položene vodoravno i to ovim redom (odozgo prema dolje):");
        question.add("______________, _____________ i _____________, a u sredini zastave nalazi \n" +
                "se__________________________.\n");

        exerciseDTO.setQuestion(question.toString());
        exerciseDTO.setToComplete(true);
        exerciseDTO.setPrintJustTheQuestion(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise22() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        StringJoiner question = new StringJoiner(LINE_BREAK);
        question.add("U Republici Hrvatskoj u uporabi je _____________ jezik i _________________ pismo.");

        exerciseDTO.setQuestion(question.toString());
        exerciseDTO.setToComplete(true);
        exerciseDTO.setPrintJustTheQuestion(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise23() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        StringJoiner question = new StringJoiner(LINE_BREAK);
        question.add("U Republici Hrvatskoj novčana jedinica zove se ____________, a njezin stoti dio je \n" +
                "___________ .\n");

        exerciseDTO.setQuestion(question.toString());
        exerciseDTO.setToComplete(true);
        exerciseDTO.setPrintJustTheQuestion(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise24() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Ivo Robić, Mišo Kovač i Oliver Dragojević, poznati su hrvatski");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("pisci"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("pjevači"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("slikari"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("sportaši"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise25() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Nacionalni park koji je dobio ime po rijeci, a smješten je nedaleko Šibenika je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Cetina"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Krka"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Biokovo"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Kopački ritx"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise26() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Godine 1999., zbog izrazite raznolikosti krških fenomena, živog svijeta i iznimnih prirodnih ljepota na relativno malom prostoru, nacionalnim parkom proglašen je dio jedne planine. To je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("sjeverni Velebit"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("sjeverno Biokovo"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("sjeverna Medvednica"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("sjeverna Plješivica"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise27() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Poznati nacionalni park koji čine 16 međusobno povezanih jezera, pod zaštitom    UNESCO-a, je:");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise28() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Hrvatski redarstvenik Josip Jović, prva hrvatska žrtva u Domovinskom ratu, poginuo je 1991. godine");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise29() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Poznati park prirode u Baranji je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Velebit"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Kopački rit"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Brijuni"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Kornati"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise30() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Najpoznatija vrsta ugroženih ptica, koje obitavaju na hrvatskim otocima (pretežno na Cresu) jest");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("galeb"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("golub"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("roda"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("bjeloglavi sup"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise31() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Kako se zove rijeka koja je, prema ukupnoj duljini vodotoka, najdulja rijeka u Republici Hrvatskoj (562 km)?");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise32() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Druga najduža europska rijeka koja protječe kroz istočni dio Republike Hrvatske zove se");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise33() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Najviša planina u Hrvatskoj, s najvišim vrhom od 1.831 m, jest");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Medvednica"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ivančica"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Plješivica"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Dinara"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise34() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("S kojom državom Republika Hrvatska ima najkraću kopnenu granicu, dugu svega 14 kilometara?");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise35() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("S kojom državom Republika Hrvatska ima najdužu kopnenu granicu?");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise36() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Republika Hrvatska ima dugu morsku granicu na moru, koje se na hrvatskom jeziku zove");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise37() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Dana 1. svibnja u Republici Hrvatskoj je blagdan");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Praznik rada"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Dan neovisnosti"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Svi Sveti"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Dan antifašističke borbe"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise38() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Dana 25. lipnja u Republici Hrvatskoj je blagdan");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Praznik rada"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Dan neovisnosti"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Svi Sveti"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Dan državnosti"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise39() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Dana 5. kolovoza u Republici Hrvatskoj je blagdan");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Praznik rada"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Dan pobjede i domovinske zahvalnosti"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Svi Sveti"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Dan antifašističke borbe"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise40() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Dan antifašističke borbe u Republici Hrvatskoj je dan");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("9. svibnja"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("15. svibnja"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("22. lipnja"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("5. kolovoza"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise41() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Ustav Republike Hrvatske proglašen je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("29. svibnja 1990"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("22. prosinca 1990"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("25. lipnja 1991"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("15. siječnja 1992"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise42() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Hrvatski ban, po čijem imenu naziv nosi glavni trg u gradu Zagrebu, zvao se");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise43() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Vođa seljačke bune 1573. godine na području današnje sjeverozapadne Hrvatske bio je");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise44() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Prvi hrvatski kralj, vladao je u prvoj polovini 10. stoljeća. Njegov se spomenik nalazi na istoimenom trgu, preko puta glavnog željezničkog kolodvora u Zagrebu. To je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Trpimir"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Zdeslav"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Tomislav"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Držislav"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise45() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Poznati hrvatski političar, ubijen u atentatu 1928. godine u beogradskoj skupštini, bio je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Stjepan Radić"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Josip Jelačić"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Petar Zrinski"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Franjo Rački"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise46() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Osnivač Hrvatske akademije znanosti i umjetnosti bio je đakovačko-srijemski biskup");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Juraj Dobrila"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Josip Jelačić"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Josip Juraj Strossmayer"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Juraj Jezerinac"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise47() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Vatroslav Lisinski skladao je prve hrvatske opere");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("»Ljubav i zloba« i »Porin«"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("»Ero s onoga svijeta« i »Hasanaginica«"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("»Gubec beg« i »Nikola Šubić Zrinski«"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("»Još Horvatska nij’ propala« i »Lijepa naša domovino«"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise48() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Katolički svećenik, zagrebački nadbiskup koji je bio proganjan u bivšoj državi, nakon II. svjetskog rata, zvao se");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Josip Juraj Strossmayer"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Alojzije Stepinac"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Maksimilijan Vrhovac"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Franjo Kuharić"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise49() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Prvi papa koji je posjetio Republiku Hrvatsku bio je");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise50() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Poznati hrvatski matematičar, astronom, geodet i fizičar po kome je nazvan Institut koji predstavlja stožernu znanstvenu ustanovu u Republici Hrvatskoj u području prirodnih i biomedicinskih znanosti te istraživanju mora i okoliša je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Juraj Dobrila"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ruđer Bošković"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Lavoslav Ružička"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ivan Vučetić"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise51() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Svjetski poznat izumitelj, fizičar i elektrotehničar rođen 1856. godine u Smiljanima kod Gospića po kome je nazvana mjerna jedinica magnetskog polja je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ruđer Bošković"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Nikola Tesla"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ivan Supek"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Slavoljub Penkala"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise52() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Prvi hrvatski roman Planine 1536. godine napisao je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Silvije Strahimir Kranjčević"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("August Šenoa"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Petar Zoranić"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Petar Preradović"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise53() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Vođa hrvatskog narodnog preporoda pokrenuo je na hrvatskom jeziku 1835. godine »Novine horvatzke«. Njegovo ime je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ranko Marinković"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Dimitrije Demeter"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ljudevit Gaj"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Antun Šoljan"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise54() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Pejzaž I i II djela su poznatog hrvatskog lirika");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Hanibala Lucića"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Šiška Menčetića"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Andrije Kačića Miošića"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Vladimira Vidrića"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise55() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Književnost baroka u Republici Hrvatskoj obilježio je svojim epovima Ivan Gundulić. Njegova poznata djela su");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("»Osman« i »Dubravka«"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("»Zlatarevo zlato« i »Čuvaj se senjske ruke«"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("»Smrt Smail-age Čengića« i »Ribanje i ribarsko prigovaranje«"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("»Zagrepčanka« i »Na Drini ćuprija«"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise56() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Renesansni dubrovački dramski pisac i komediograf, koji je živio 1508. – 1567. godine, autor je poznatih djela: »Dundo Maroje«, »Skup« i »Novela od Stanca«. Njegovo ime je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Matija Vlačić"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ruđer Bošković"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Marin Držić"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Marin Getaldić"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise57() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Poznati hrvatski pjesnik, pripovjedač i esejist, autor poeme Jama , je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Miroslav Krleža"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ivan Goran Kovačić"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Mate Lovrak"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ivan Meštrović"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise58() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Marija Jurić Zagorka bila je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("prva profesionalna novinarka i poznata hrvatska književnica"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("operna pjevačica"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("sportašica"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("skladateljica"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise59() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Ivana Brlić Mažuranić bila je poznata hrvatska");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("književnica"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("glumica"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("slikarica"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("liječnica"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise60() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Slava Raškaj bila je poznata hrvatska");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("književnica"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("balerina"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("slikarica"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("liječnica"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise61() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Poznatu slikarsku školu osnovao je, u podravskom selu Hlebine, slikar");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Josip Račić"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Hrvoje Hegedušić"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Krsto Hegedušić"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ljubo Babić"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise62() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Svjetski afirmirani slikar, koji je studirao u Parizu, a slikao je alegorijske i povijesne kompozicije i portrete te je izradio svečani zastor Hrvatskog narodnog kazališta u Zagrebu »Hrvatski narodni preporod«, zvao se");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Edo Murtić"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Julije Klović"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Vlaho Bukovac"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ivan Lacković Croata"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise63() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Bojni ples s mačevima koji se od 15. stoljeća tradicionalno održava na Korčuli zove se");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise64() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Hrvatska viteška igra koja se održava svake godine u prvoj nedjelji mjeseca kolovoza u Sinju, na godišnjicu pobjede nad turskim osvajačima 14. kolovoza 1715. godine, zove se");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise65() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Hrvatska je 1987. godine bila domaćin mladim sportašima iz cijeloga svijeta, na natjecanju");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Svjetsko nogometno prvenstvo za mlade igrače do 21 godine"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Univerzijada"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Svjetsko atletsko prvenstvo"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Olimpijske igre mladih"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise66() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Najpoznatija hrvatska skijašica, osvajačica 4 zlatne i 2 srebrne olimpijske medalje u alpskom skijanju, zove se");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Sanda Dubravčić Šimunjak"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Janica Kostelić"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ana Jelušić"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Nika Fleiss"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise67() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Na Olimpijskim igrama u Atlanti 1996. godine Republika Hrvatska osvojila je zlatnu medalju u");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("nogometu"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("vaterpolu"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("rukometu"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("odbojci"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise68() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Kako se zove uspješna hrvatska atletičarka, dvostruka svjetska prvakinja u skoku u vis?");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise69() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Dražen Petrović, Toni Kukoč i Dino Rađa natjecali su se u istom sportu i postizali zapažene rezultate. Oni su se bavili");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("tenisom"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("skijanjem"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("atletikom"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("košarkom"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise70() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Krešimir Ćosić, velikan hrvatskog sporta ‘60-ih, ‘70-ih i početka ‘80-ih godina prošlog stoljeća, poznat je izvan granica Republike Hrvatske. Kojim se sportom bavio?");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise71() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("U parku Olimpijskog muzeja u Lausanni postavljena je skulptura poznatog hrvatskog i, u vrijeme dok je igrao, ponajboljeg europskog košarkaša. To je skulptura");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise72() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Mate Parlov, Damir Škaro i Željko Mavrović natjecali su se u istom sportu, ali u različito vrijeme i postizali zapažene rezultate. Oni su se bavili");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("tenisom"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("skijanjem"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("atletikom"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("boksom"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise73() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Ime poznate hrvatske glumice tragično preminule 15. 8. 2000. godine, koja je glumila u poznatim hrvatskim filmovima: Glembajevi, Treća žena i Tri muškarca Melite Žganjer, je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Mia Oremović"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Vida Jerman"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ena Begović"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Zdravka Krstulović"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise74() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("»Tko pjeva zlo ne misli«, antologijsku »ljubavnu komediju s pjevanjem«, na temelju »Dnevnika malog Perice« Vjekoslava Majera, režirao je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Boris Papandopulo"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Krešo Golik"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Vatroslav Lisinski"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Krsto Hegedušić"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise75() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Od 1972. godine Grad Zagreb i produkcijska kuća »Zagreb film«, kao osnivači, pokrenuli svjetski filmski festival");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("igranog filma"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("dokumentarnog filma"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("kratkometražnog filma"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("animiranog filma"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise76() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Jedan od najstarijih spomenika hrvatske pismenosti, iz razdoblja oko 1100. godine, sačuvan je na otoku Krku. Pisan je glagoljskim pismom. To je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ljetopis popa Dukljanina"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Baščanska ploča"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Vinodolski zakonik"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Judita"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise77() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Godine 1993. Hrvatska vojska izvela je munjevitu vojnu akciju kojom je, kopnenim putem, povezala sjever i jug Hrvatske, koji je agresor okupacijom prostora razdvojio. To je bila akcija");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Maslenica"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Bljesak"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Oluja"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Ljeto"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise78() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Bitka na Mohačkom polju, između Hrvatsko-ugarskog kraljevstva i Osmanskog carstva, bila je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("426. godine"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("1026. godine"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("1526. godine"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("1926. Godine"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise79() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Banovina Hrvatska postaje sporazumom Cvetković");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Tito"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Trumbić"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Tuđman"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Maček"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise80() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Koje najviše tijelo antifašističkog pokreta je 1943. godine donijelo odluku o priključenju Istre, Rijeke, Zadra i ostalih okupiranih krajeva Hrvatskoj?");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise81() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("U Republici Hrvatskoj državna je vlast ustrojena na načelu diobe vlasti na");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("zakonodavnu, izvršnu i sudbenu"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("izvršnu i sudbenu"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("zakonodavnu i sudbenu"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("zakonodavnu i izvršnu"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise82() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Nositelj izvršne vlasti u Republici Hrvatskoj je");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Vlada Republike Hrvatske"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Vrhovni sud Republike Hrvatske"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Hrvatski sabor"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Pučki pravobranitelj"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise83() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Jedinstvenu  primjenu zakona i ravnopravnost građana osigurava");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Visoki upravni sud Republike Hrvatske"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Vrhovni sud Republike Hrvatske"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Vlada Republike Hrvatske"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("Pučki pravobranitelj"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise84() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Nositelj zakonodavne vlasti u Republici Hrvatskoj je");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise85() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Zastupnici u Hrvatskom saboru biraju se na vrijeme od");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("2 godine"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("3 godine"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("4 godine"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("5 godine"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise86() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Pravo predlagati zakone u Hrvatskom saboru ima");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("samo predsjednik Republike Hrvatske"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("samo političke stranke zastupljene u Hrvatskom saboru"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("svaki državljanin Republike Hrvatske"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("svaki zastupnik u Hrvatskom saboru"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise87() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Prvi predsjednik Republike Hrvatske bio je");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise88() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Republiku Hrvatsku zastupa i predstavlja u zemlji i inozemstvu");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise89() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Kojim je zakonom regulirano stjecanje hrvatskog državljanstva?");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise90() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Opunomoćenik Hrvatskog sabora koji štiti ustavna i zakonska prava građana u postupku pred državnom upravom i tijelima – Ombudsman, na hrvatskom jeziku naziva se");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise91() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Hrvatski državljani stječu opće i jednako biračko pravo");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("s navršenih 16 godina života"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("muškarci s navršenih 16, a žene s navršenih 18 godina života"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("s navršenih 18 godina života"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("s navršenom 21 godinom života"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise92() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("O udruživanju u saveze s drugim državama prethodno");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("odlučuju građani putem referenduma"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("odlučuje Predsjednik Republike Hrvatske"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("odlučuje Hrvatski sabor"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("odlučuje Vlada Republike Hrvatske"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise93() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Zaštita ljudskih prava i temeljnih sloboda zajamčena je najvišim državnim aktom. To je");
        exerciseDTO.setToComplete(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise94() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Najviše vrednote  ustavnog poretka su");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("vladavina radnika, državno vlasništvo, jednostranački sustav"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("načelo samoodrživosti, nesvrstanosti, oslonca na vlastite snage i radničko samoupravljanje"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("sloboda, jednakost, nacionalna ravnopravnost, nepovredivost vlasništva"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("univerzalnost Katoličke crkve, kršćanski odgoj, jednakost pred Bogom i narodom, solidarnost s drugim kršćanskim narodima"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise95() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("U Republici Hrvatskoj jamči se ravnopravnost pripadnicima svih ____________________ manjina");
        exerciseDTO.setToComplete(true);
        exerciseDTO.setPrintJustTheQuestion(true);

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise96() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("U Republici Hrvatskoj svatko je dužan");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("držati se Ustava i zakona i poštivati pravni poredak Republike Hrvatske"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("držati se samo zakona"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("držati se samo Ustava"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("samo poštivati pravni poredak Republike Hrvatske"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise97() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Međunarodni ugovori koji su sklopljeni i potvrđeni u skladu s Ustavom Republike Hrvatske i objavljeni te su na snazi, po pravnoj su snazi");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("iznad zakona Republike Hrvatske"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("izjednačeni s pravnom snagom zakona, a Hrvatski sabor arbitrira kod primjene ako su im odredbe u suprotnosti"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("ispod zakona Republike Hrvatske"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("primjenjuju se samo ako to zakonom nije drugačije uređeno"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise98() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("Osnivanje političkih stranaka u Republici Hrvatskoj je slobodno. To u praksi znači da se mogu osnivati sve političke stranke");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("koje prikupe dovoljan broj osnivača, bez ikakvih zakonskih ograničenja"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("koje prikupe dovoljna financijska sredstva za ostvarivanje programa i djelovanja"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("koje svojim programom jamče da će moći sudjelovati u parlamentu"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("osim onih koje svojim programom ili nasilnim djelovanjem smjeraju podrivanju slobodnog demokratskog poretka"));

        listOfQuestions.add(exerciseDTO);
    }

    private void loadExercise99() {
        ExerciseDTO exerciseDTO = ExerciseDTO.getInstance();
        exerciseDTO.setQuestion("U Republici Hrvatskoj smrtna kazna");
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("ne postoji"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("postoji, ali se ne primjenjuje"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("postoji samo za ratni zločin i zločin protiv čovječnosti"));
        exerciseDTO.getAlternativeDTOList().add(new ExerciseAlternativeDTO("postoji samo za djelo veleizdaje, u situaciji neposredne ratne opasnosti"));

        listOfQuestions.add(exerciseDTO);
    }

}
