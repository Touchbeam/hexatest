package com.example.hexaqna.repository;

import com.example.hexaqna.domain.HexaMember;
import com.example.hexaqna.domain.Qna;
import com.example.hexaqna.repository.search.QnaSearch;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QnaRepository extends JpaRepository<Qna, Long>, QnaSearch {

}
