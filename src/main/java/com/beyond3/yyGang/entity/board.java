package com.beyond3.yyGang.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "board")
public class board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Integer boardId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "board_title", nullable = false)
    private String boardTitle;

    @Column(name = "board_contents", nullable = false, columnDefinition = "text")
    private String boardContents;

    @Column(name = "board_date", nullable = false, updatable = false)
    private LocalDateTime boardDate;

    @Column(name = "board_mdate")
    private LocalDateTime boardMdate;

    @Column(name = "board_good")
    private Integer boardGood;

    @Column(name = "board_del", nullable = false, length = 1)
    private char boardDel;

}
