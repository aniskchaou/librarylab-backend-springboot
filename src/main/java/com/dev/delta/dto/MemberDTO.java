package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.MemberRepository;
import com.dev.delta.repositoriesi18n.MemberI18nRepository;

@Service
public class MemberDTO implements DTO {

	@Autowired
	MemberRepository memberRepository;

	@Autowired
	MemberI18nRepository memberI18nRepository;

	@Override
	public void populate() {
		member.setAddress(faker.address().fullAddress());
		member.setEmail(faker.internet().emailAddress());
		member.setMobile(faker.phoneNumber().cellPhone());
		member.setName(faker.name().fullName());
		member.setPassword("dfzefzee");
		member.setStatus("Active");
		member.setType_id("Student");
		member.setUser_type("Normal");
		memberRepository.save(member);

		memberI18n.setAddressI18n("Address");
		memberI18n.setEmailI18n("Email");
		memberI18n.setMobileI18n("Phone");
		memberI18n.setNameI18n("Name");
		memberI18n.setPasswordI18n("Password ");
		memberI18n.setStatusI18n("Status");
		memberI18n.setType_idI18n("Type");
		memberI18n.setUser_typeI18n("User Type");
		memberI18n.setLangI18n("EN");
		memberI18n.setAddButtonI18n("Create");
		memberI18n.setAddTitleI18n("Create Member");
		memberI18n.setAllTitleI18n("Members");
		memberI18n.setCloseButtonI18n("Close");
		memberI18n.setEditButtonI18n("Edit");
		memberI18n.setEditTitleI18n("Edit Member");
		memberI18nRepository.save(memberI18n);

		memberI18n2.setAddressI18n("العنوان");
		memberI18n2.setEmailI18n("البريد الإلكتروني");
		memberI18n2.setMobileI18n("الهاتف");
		memberI18n2.setNameI18n("الاسم");
		memberI18n2.setPasswordI18n("كلمة المرور");
		memberI18n2.setStatusI18n("الحالة");
		memberI18n2.setType_idI18n("نوع المستخدم");
		memberI18n2.setUser_typeI18n("نوع المستخدم");
		memberI18n2.setLangI18n("AR");
		memberI18n2.setAddButtonI18n("إنشاء");
		memberI18n2.setAddTitleI18n("إنشاء فئة");
		memberI18n2.setAllTitleI18n("الفئات");
		memberI18n2.setCloseButtonI18n("إغلاق");
		memberI18n2.setEditButtonI18n("تحرير");
		memberI18n2.setEditTitleI18n("تحرير الفئة");
		memberI18nRepository.save(memberI18n2);

	}

}
