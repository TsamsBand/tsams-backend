package com.vinylist.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.sql.Date;


@NoArgsConstructor
@Getter
@Entity
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger user_id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private Upload profileImage; // TODO: 파일 저장하는 서비스를 구현해서 파일 업로드 된 걸 자료형으로 사용 - 수정예정

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private Date birthday; // TODO: 자료형 String 쓸 지 Date 쓸 지 프론트하고 상의하기

    @Column(nullable = false)
    private Gender gender;

    private Genre genre;


}

