package com.project.gymmanagement.service;

import com.project.gymmanagement.dao.Member;
import com.project.gymmanagement.dto.MemberDto;
import com.project.gymmanagement.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public Member createMemberInfo(MemberDto memberDto) {
        Member member = new Member();
        member.setName(memberDto.getName());
        member.setLastName(memberDto.getLastName());
        member.setAge(memberDto.getAge());
        member.setGender(memberDto.getGender());
        member.setEmailId(memberDto.getEmailId());
        member.setMobileNumber(memberDto.getMobileNumber());
        member.setAddress(memberDto.getAddress());
        member.setHeight(memberDto.getHeight());
        member.setWeight(memberDto.getWeight());
        Double heightInMetre = memberDto.getHeight()/100;
        Double heightInMetreSquareHead = heightInMetre*heightInMetre;
        Double bmi = memberDto.getWeight()/heightInMetreSquareHead;
        member.setBmi(bmi);
        member.setBloodGroup(memberDto.getBloodGroup());
        member.setDietPlan(memberDto.getDietPlan());
        member.setWorkoutPlan(memberDto.getWorkoutPlan());
        return memberRepository.save(member);
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
