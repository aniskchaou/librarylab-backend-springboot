package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.TypeMember;
import com.dev.delta.repositories.TypeMemberRepository;

/**
 * TypeMemberService
 * 
 * @author Admin
 *
 */
@Service
public class TypeMemberService {

	/**
	 * TypeMemberRepository
	 */
	@Autowired
	TypeMemberRepository typeMemberRepository;

	/**
	 * saveOrUpdate
	 * 
	 * @param typeMember
	 * @return
	 */
	public TypeMember saveOrUpdate(TypeMember typeMember) {

		return typeMemberRepository.save(typeMember);
	}

	/**
	 * findAll
	 * 
	 * @return
	 */
	public Iterable<TypeMember> findAll() {
		return typeMemberRepository.findAll();
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public TypeMember findById(Long id) {
		return typeMemberRepository.findById(id).orElseThrow();
	}

	/**
	 * TypeMemberRepository
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		TypeMember typeMember = findById(id);
		typeMemberRepository.delete(typeMember);
	}
}
