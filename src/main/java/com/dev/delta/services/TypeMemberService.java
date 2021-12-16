package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.TypeMember;
import com.dev.delta.repositories.TypeMemberRepository;

@Service
public class TypeMemberService {
	@Autowired
	TypeMemberRepository typeMemberRepository;

	public TypeMember saveOrUpdate(TypeMember typeMember) {

		return typeMemberRepository.save(typeMember);
	}

	public Iterable<TypeMember> findAll() {
		return typeMemberRepository.findAll();
	}

	public TypeMember findById(Long id) {
		return typeMemberRepository.findById(id).orElseThrow();
	}

	public void delete(Long id) {
		TypeMember typeMember = findById(id);
		typeMemberRepository.delete(typeMember);
	}
}
