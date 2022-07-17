package com.dev.delta.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entities.Member;

@RepositoryRestResource
public interface MemberRepository extends JpaRepository<Member, Long> {

	@Query(nativeQuery = true, value = "select  m.status from Member m")
	List<String> getStatus();

	@Query(nativeQuery = true, value = "select  m.user_type from Member m")
	List<String> getUserType();

	@Query(nativeQuery = true, value = "select * from member m where m.status = :status and m.user_type=:type_id")
	List<Member> filterMemberByCriteria(@Param("status") String status, @Param("type_id") String type_id

	);
}
