package com.beyond3.yyGang.domain.board;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "question_board")
public class question_board {
    //약 질문 게시판

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qboard_id")
    private Long qboardId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "qboard_title", nullable = false)
    private char qboardTitle;

    @Column(name = "qboard_contents", nullable = false, columnDefinition = "text")
    private String qboardContents;

    @Column(name = "qboard_date", nullable = false, updatable = false)
    private LocalDateTime qboradDate;

    @Column(name = "qboard_mdate")
    private LocalDateTime qboardMdate;

    // 좋아요 기능 보류
    // @Column(name = "qboard_good")
    // private Integer qboardGood;

    @Column(name = "qboard_del", nullable = false, length = 1)
    private char qboardDel;

}
