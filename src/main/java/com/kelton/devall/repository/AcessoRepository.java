package com.kelton.devall.repository;

import com.kelton.devall.model.Acesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcessoRepository extends JpaRepository<Acesso, Integer> {
}
