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
	 * @throws Exception
	 */
	public TypeMember findById(Long id) throws Exception {
		return typeMemberRepository.findById(id).orElseThrow(() -> new Exception("not Found"));
	}

	/**
	 * TypeMemberRepository
	 * 
	 * @param id
	 * @throws Exception
	 */
	public void delete(Long id) throws Exception {
		TypeMember typeMember = findById(id);
		typeMemberRepository.delete(typeMember);
	}
}
