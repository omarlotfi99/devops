package com.example.MSFraude.Service;

import com.example.MSFraude.Entity.Fraude;
import com.example.MSFraude.Repository.FraudeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FraudeServiceImpl implements FraudeService {

    private final FraudeRepository fraudeRepository;

    public FraudeServiceImpl(FraudeRepository fraudeRepository) {
        this.fraudeRepository = fraudeRepository;
    }

    @Override
    public Fraude saveFraude(Fraude fraude) {
        return fraudeRepository.save(fraude);
    }



    @Override
    public List<Fraude> getAllFraudes() {
        return fraudeRepository.findAll();
    }

    @Override
    public Fraude getFraudeById(Long id) {
        return fraudeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteFraude(Long id) {
        fraudeRepository.deleteById(id);
    }

    public Fraude updateFraude(Long id, Fraude investissement) {
        Optional<Fraude> investissementOptional = fraudeRepository.findById(id);
        if (investissementOptional.isPresent()) {
            Fraude existingInvestissement = investissementOptional.get();
            existingInvestissement.setDescription(investissement.getDescription());

            fraudeRepository.save(existingInvestissement);
            return existingInvestissement;
        } else {
            return null;
        }
    }
}
