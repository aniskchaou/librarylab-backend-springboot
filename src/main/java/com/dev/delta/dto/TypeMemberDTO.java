package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.TypeMemberRepository;
import com.dev.delta.repositoriesi18n.TypeMemberI18nRepository;

@Service
public class TypeMemberDTO implements DTO {

	@Autowired
	TypeMemberRepository typeMemberRepository;

	@Autowired
	TypeMemberI18nRepository typeMemberI18nRepository;

	@Override
	public void populate() {
		typeMember.setName("Normal");
		typeMemberRepository.save(typeMember);

		typeMemberI18n.setMember_type_nameI18n("Type Member");
		typeMemberI18n.setLangI18n("EN");
		typeMemberI18n.setAddButtonI18n("Create");
		typeMemberI18n.setAddTitleI18n("Create Type Member");
		typeMemberI18n.setAllTitleI18n("Type Members");
		typeMemberI18n.setCloseButtonI18n("Close");
		typeMemberI18n.setEditButtonI18n("Edit");
		typeMemberI18n.setEditTitleI18n("Edit Type Member");
		typeMemberI18nRepository.save(typeMemberI18n);

		typeMemberI18n2.setMember_type_nameI18n("نوع العضو");
		typeMemberI18n2.setLangI18n("AR");
		typeMemberI18n2.setAddButtonI18n("إنشاء");
		typeMemberI18n2.setAddTitleI18n("إنشاء نوع عضو");
		typeMemberI18n2.setAllTitleI18n("أعضاء النوع");
		typeMemberI18n2.setCloseButtonI18n("إغلاق");
		typeMemberI18n2.setEditButtonI18n("تحرير");
		typeMemberI18n2.setEditTitleI18n("تحرير نوع العضو");
		typeMemberI18nRepository.save(typeMemberI18n2);
	}

}
