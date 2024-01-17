package com.example.koinonia1.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemberDTO {
    // Lombok 의 @Getter, Setter 로 getter, setter 메소드를 별도로 생성할 필요 x
    // NoArgsConstructor 는 멤버필드를 매개변수로 하는 생성자를 자동 생성
    // ToString 메소드를 자동으로 생성하는 어노테이션

    private Long memberId; // pk
    private String memberEmail; // email = id
    private String memberPassword;
    private String memberName; // 실명
    private String memberNickname; // 닉네임
    private int memberDiv; // 일반회원 0 목회자회원 1

}
