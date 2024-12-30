package com.example.hexaqna.controller;

import com.example.hexaqna.domain.Qna;
import com.example.hexaqna.dto.QnaDTO;
import com.example.hexaqna.repository.QnaRepository;
import com.example.hexaqna.service.QnaService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Hibernate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootTest
@Slf4j
class QnaControllerTest {

    @Autowired
    QnaService qnaService;

    @Autowired
    QnaRepository qnaRepository;

    @Test

    void 리플달기(){
        Optional<Qna> reply =  qnaRepository.findById(1l);
        Qna qna = reply.orElseThrow();


        qna.setReply("감사합니다.");
        qna.setReply_at(1);
        qna.setReply_Date(LocalDateTime.now());
        qna.setReply_id("관리자");
        log.info("qna {}" ,qna);

        qnaRepository.save(qna);
    }
}