package com.example.MSFraude.Repository;

import com.example.MSFraude.Entity.Fraude;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudeRepository extends JpaRepository<Fraude,Long> {
}
