package com.example.MSFraude.Controller;

import com.example.MSFraude.Entity.Fraude;
import com.example.MSFraude.Service.FraudeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fraudes")
public class FraudeController {

    private final FraudeService fraudeService;

    public FraudeController(FraudeService fraudeService) {
        this.fraudeService = fraudeService;
    }

    @GetMapping("")
    public List<Fraude> getAllFraudes() {
        return fraudeService.getAllFraudes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fraude> getFraudeById(@PathVariable Long id) {
        Fraude fraude = fraudeService.getFraudeById(id);
        if (fraude != null) {
            return new ResponseEntity<>(fraude, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public Fraude saveFraude(@RequestBody Fraude fraude) {
        return fraudeService.saveFraude(fraude);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFraude(@PathVariable Long id) {
        Fraude fraude = fraudeService.getFraudeById(id);
        if (fraude != null) {
            fraudeService.deleteFraude(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{id}")
    public void updateInvestissement(@RequestBody Fraude investissement, @PathVariable Long id) {
        fraudeService.updateFraude(id, investissement);
    }
}

