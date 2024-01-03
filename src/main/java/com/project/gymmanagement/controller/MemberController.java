package com.project.gymmanagement.controller;

import com.project.gymmanagement.dao.Member;
import com.project.gymmanagement.dto.MemberDto;
import com.project.gymmanagement.response.GymManagementResponse;
import com.project.gymmanagement.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;


    @PostMapping("")
    public ResponseEntity<GymManagementResponse> createMember(@RequestBody MemberDto memberDto) {
        Member member = this.memberService.createMemberInfo(memberDto);
        GymManagementResponse response = new GymManagementResponse();
        response.setData(member);
        response.setMessage("Created Member");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<GymManagementResponse> getMembersList() {
        List<Member> allMembers = this.memberService.getAllMembers();
        GymManagementResponse response = new GymManagementResponse();
        response.setData(allMembers);
        response.setMessage("Gathered all Members list");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
