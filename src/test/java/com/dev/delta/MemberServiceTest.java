package com.dev.delta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.dev.delta.entities.Member;
import com.dev.delta.repositories.MemberRepository;
import com.dev.delta.services.MemberService;

/**
 * MemberServiceTest
 * 
 * @author Admin
 *
 */
@SpringBootTest
class MemberServiceTest {

	@InjectMocks
	MemberService memberService;

	@Mock
	MemberRepository memberRepository;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
	}

	/**
	 * getAllMembersTest
	 */
	@Test
	public void getAllMembersTest() {
		List<Member> list = new ArrayList<Member>();
		Member member1 = new Member(1L, "Student");
		Member member2 = new Member(2L, "Admin");
		Member member3 = new Member(3L, "Librarian");

		list.add(member1);
		list.add(member2);
		list.add(member3);

		when(memberRepository.findAll()).thenReturn(list);

		// test
		List<Member> memberList = (List<Member>) memberService.findAll();

		assertEquals(3, memberList.size());
		verify(memberRepository, times(1)).findAll();
	}

	/**
	 * getMemberByIdTest
	 */
	@Test
	public void getMemberByIdTest() {

		when(memberRepository.findById(1L)).thenReturn(Optional.of(new Member(1L, "admin")));

		Member member = memberService.findById(1L);

		assertEquals("admin", member.getName());

	}

	/**
	 * saveMemberTest
	 */
	@Test
	public void saveMemberTest() {
		Member member1 = new Member(1L, "admin");
		memberService.saveOrUpdate(member1);
		verify(memberRepository, times(1)).save(member1);
	}

}
