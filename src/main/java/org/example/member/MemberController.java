package org.example.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/member/v1.0")
@RestController
public class MemberController {
    @GetMapping
    public MemberDTO getMember() {
        return MemberDTO.random();
    }
}
