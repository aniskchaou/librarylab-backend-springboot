package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.MemberRepository;
import com.dev.delta.repositoriesi18n.MemberI18nRepository;

/**
 * 
 * @author Admin
 *
 */
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
		
		
		memberI18n3.setAddressI18n ("पता");
		memberI18n3.setEmailI18n ("ईमेल");
		memberI18n3.setMobileI18n ("फोन");
		memberI18n3.setNameI18n ("नाम");
		memberI18n3.setPasswordI18n ("पासवर्ड");
		memberI18n3.setStatusI18n ("स्थिति");
		memberI18n3.setType_idI18n ("टाइप");
		memberI18n3.setUser_typeI18n ("उपयोगकर्ता प्रकार");
		memberI18n3.setLangI18n ("HN");
		memberI18n3.setAddButtonI18n ("बनाएं");
		memberI18n3.setAddTitleI18n ("सदस्य बनाएं");
		memberI18n3.setAllTitleI18n ("सदस्य");
		memberI18n3.setCloseButtonI18n ("बंद करें");
		memberI18n3.setEditButtonI18n ("संपादित करें");
		memberI18n3.setEditTitleI18n ("सदस्य संपादित करें");
		memberI18nRepository.save(memberI18n3);
		
		memberI18n4.setAddressI18n("ঠিকানা");
		memberI18n4.setEmailI18n("ইমেল");
		memberI18n4.setMobileI18n("ফোন");
		memberI18n4.setNameI18n("নাম");
		memberI18n4.setPasswordI18n("পাসওয়ার্ড");
		memberI18n4.setStatusI18n("স্থিতি");
		memberI18n4.setType_idI18n("টাইপ");
		memberI18n4.setUser_typeI18n("ব্যবহারকারীর ধরন");
		memberI18n4.setLangI18n("BN");
		memberI18n4.setAddButtonI18n("তৈরি করুন");
		memberI18n4.setAddTitleI18n("সদস্য তৈরি করুন");
		memberI18n4.setAllTitleI18n("সদস্য");
		memberI18n4.setCloseButtonI18n("বন্ধ");
		memberI18n4.setEditButtonI18n("সম্পাদনা");
		memberI18n4.setEditTitleI18n("সদস্য সম্পাদনা করুন");
		memberI18nRepository.save(memberI18n4);

	}

}
