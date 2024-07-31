package br.com.alura.geradorFrases.Repository;

import br.com.alura.geradorFrases.Model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FrasesRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    public Frase buscarFraseAleatoria();
}
