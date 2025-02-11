package com.beyond3.yyGang.domain.board;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Comment")
public class comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Integer commentId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "board_id", nullable = false)
    private Integer boardId;

    @Column(name = "qboard_id", nullable = false)
    private Integer qboardId;

    @Enumerated(EnumType.STRING)
    @Column(name = "comment_type", nullable = false)
    private CommentType commentType;

    @Column(name = "comment_contents", nullable = false, columnDefinition = "text")
    private String contentContents;

    @Column(name = "comment_date", nullable = false, updatable = false)
    private LocalDateTime commentDate = LocalDateTime.now();

    @Column(name = "comment_mdate")
    private LocalDateTime commentMdate;

    @Column(name = "comment_del", nullable = false, length = 1)
    private char commentDel;

    public enum CommentType {
        answer, comment
    }

}
