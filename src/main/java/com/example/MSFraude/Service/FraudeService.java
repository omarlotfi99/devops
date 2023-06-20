package com.example.MSFraude.Service;

import com.example.MSFraude.Entity.Fraude;

import java.util.List;

public interface FraudeService {
    Fraude saveFraude(Fraude fraude);
    List<Fraude> getAllFraudes();
    Fraude getFraudeById(Long id);
    void deleteFraude(Long id);
    Fraude updateFraude(Long id, Fraude investissement);
}

