package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Member;
import com.dev.delta.repositories.MemberRepository;

@Service
public class MemberService {
	@Autowired
	MemberRepository memberRepository;

	public Member saveOrUpdate(Member member) {

		return memberRepository.save(member);
	}

	public Iterable<Member> findAll() {
		return memberRepository.findAll();
	}

	public Member findById(Long id) {
		return memberRepository.findById(id).orElseThrow();
	}

	public void delete(Long id) {
		Member member = findById(id);
		memberRepository.delete(member);
	}
}
