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
		
		typeMemberI18n3.setMember_type_nameI18n("টাইপ মেম্বার");
		typeMemberI18n3.setLangI18n("BN");
		typeMemberI18n3.setAddButtonI18n("তৈরি করুন");
		typeMemberI18n3.setAddTitleI18n("প্রকার সদস্য তৈরি করুন");
		typeMemberI18n3.setAllTitleI18n("টাইপ সদস্য");
		typeMemberI18n3.setCloseButtonI18n("বন্ধ");
		typeMemberI18n3.setEditButtonI18n("সম্পাদনা");
		typeMemberI18n3.setEditTitleI18n("সম্পাদনা প্রকার সদস্য");
		typeMemberI18nRepository.save(typeMemberI18n3);
	
		typeMemberI18n4.setMember_type_nameI18n ("सदस्य टाइप करें");
		typeMemberI18n4.setLangI18n ("HN");
		typeMemberI18n4.setAddButtonI18n ("बनाएं");
		typeMemberI18n4.setAddTitleI18n ("प्रकार सदस्य बनाएं");
		typeMemberI18n4.setAllTitleI18n ("सदस्य टाइप करें");
		typeMemberI18n4.setCloseButtonI18n ("बंद करें");
		typeMemberI18n4.setEditButtonI18n ("संपादित करें");
		typeMemberI18n4.setEditTitleI18n ("टाइप सदस्य संपादित करें");
		typeMemberI18nRepository.save(typeMemberI18n4);

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
