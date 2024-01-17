package com.example.koinonia1.service;

import com.example.koinonia1.dto.MemberDTO;
import com.example.koinonia1.entity.MemberEntity;
import com.example.koinonia1.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void save(MemberDTO memberDTO) {
        //  entity 객체로 repository 의 save 메소드 호출
        // 일반회원으로 기본값
        memberDTO.setMemberDiv(0);
        // dto -> entity 변환
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        // repository save 메소드 호출
        memberRepository.save(memberEntity);
    }
}
