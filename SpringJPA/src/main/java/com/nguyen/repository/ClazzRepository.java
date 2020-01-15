package com.nguyen.repository;

import com.nguyen.entity.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClazzRepository extends JpaRepository<Clazz, Integer> {

    @Query("SELECT new Clazz (c.id, c.name) FROM Clazz c WHERE c.id = ?1")
    Optional<Clazz> findById(Integer id);
}
