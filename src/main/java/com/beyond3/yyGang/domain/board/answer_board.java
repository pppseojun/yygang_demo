package com.beyond3.yyGang.domain.board;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "answer_board")
public class answer_board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_board_id")
    private Long answerBoardId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;


    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "qboard_id")
    private question_board qboard;

    @Column(columnDefinition = "text", nullable = false)
    private String answerBoradContents;

    @Column(name = "answer_board_date", nullable = false)
    private LocalDateTime answerBoardDate;

    @Column(name = "answer_board_mdate")
    private LocalDateTime answerBoardMdate;

    @Column(name = "answer_board_del", nullable = false, length = 1)
    private char answerBoardDel;

}