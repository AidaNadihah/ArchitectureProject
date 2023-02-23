package com.example.archi.service;

import com.example.archi.model.Tekateki;

import java.util.List;

public interface TekatekiService {
    List<Tekateki> getTekateki();

    Tekateki getTekateki(Long id);

    void createTekateki(Long id, String question, String answer);
    void updateTekateki(Tekateki tekateki);
    void deleteTekateki(Long id);
}
