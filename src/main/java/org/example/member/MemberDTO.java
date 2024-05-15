package org.example.member;

import lombok.Getter;

import java.util.Random;

@Getter
public class MemberDTO {
    private int memberId;
    private String nickname;
    private String email;
    private ProductDTO productDTO;
    public static MemberDTO random() {
        MemberDTO member = new MemberDTO();
        Random random = new Random();
        member.memberId = random.nextInt();
        member.nickname = "abc" + random.nextInt();
        member.email = "abc@fakemail.com";
        member.productDTO = ProductDTO.random();
        return member;
    }
}
