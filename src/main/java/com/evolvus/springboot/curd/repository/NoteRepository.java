package com.evolvus.springboot.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolvus.springboot.curd.domain.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {


}
