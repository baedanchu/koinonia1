package com.example.koinonia1.controller;

import com.example.koinonia1.dto.MemberDTO;
import com.example.koinonia1.dto.Message;
import com.example.koinonia1.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    // 회원가입 페이지 출력 요청
    @GetMapping("/member/save")
    public String saveForm(){
        return "member/save";
    }
    // 회원가입 처리
    @PostMapping("/member/save")
    public String save(@ModelAttribute MemberDTO memberDTO, Model model){
        // 회원가입
        memberService.save(memberDTO);
        // 메세지
        model.addAttribute("data", new Message("회원가입성공","/"));
        return "message";
    }
}
