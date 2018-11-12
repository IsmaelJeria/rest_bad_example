package com.example.rest.jpadao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.entity.Holamundo;

@Repository
public interface HolamundoRepository extends JpaRepository<Holamundo, Long> {

}
