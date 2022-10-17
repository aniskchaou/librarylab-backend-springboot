package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Member;
import com.dev.delta.repositories.MemberRepository;

/**
 * MemberService
 * 
 * @author Admin
 *
 */
@Service
public class MemberService {

	/**
	 * PaymentRepository
	 */
	@Autowired
	MemberRepository memberRepository;

	public long count() {

		return memberRepository.count();
	}

	/**
	 * saveOrUpdate
	 * 
	 * @param member
	 * @return
	 */
	public Member saveOrUpdate(Member member) {
		return memberRepository.save(member);
	}

	/**
	 * findAll
	 * 
	 * @return
	 */
	public Iterable<Member> findAll() {
		return memberRepository.findAll();
	}

	public Iterable<String> findStatus() {
		return memberRepository.getStatus();
	}

	public Iterable<String> findUserType() {
		return memberRepository.getUserType();
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Member findById(Long id) throws Exception {
		return memberRepository.findById(id).orElseThrow(() -> new Exception("not Found"));
	}

	/**
	 * delete
	 * 
	 * @param id
	 * @throws Exception
	 */
	public void delete(Long id) throws Exception {
		Member member = findById(id);
		memberRepository.delete(member);
	}

	public List<Member> filterMemberCriteria(String status, String type_id) throws Exception {
		return memberRepository.filterMemberByCriteria(status, type_id);
	}
}
