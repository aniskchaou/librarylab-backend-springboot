package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositoriesi18n.MenuI18nRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class MenuDTO implements DTO {

	@Autowired
	MenuI18nRepository menuI18nRepository;

	@Override
	public void populate() {
		menuI18n.setArchivesI18n("Archives");
		menuI18n.setBooksI18n("Books");
		menuI18n.setBooksMenuI18n("Books");
		menuI18n.setCategoriesI18n("Categories");
		menuI18n.setCirculationsI18n("Issued Books");
		menuI18n.setCirculationsMenuI18n("Circulations");
		menuI18n.setCirculationStatusI18n("Circulation status");
		menuI18n.setDashboardI18n("Dashboard");
		menuI18n.setLogOutI18n("log out");
		menuI18n.setMembersI18n("Members");
		menuI18n.setMembersMenuI18n("Members");
		menuI18n.setPublishersI18n("Publishers");
		menuI18n.setRequesredBooksI18n("Requested Books");
		menuI18n.setSettingsI18n("Settings");
		menuI18n.setTypeMembersI18n("Member Types");
		menuI18n.setWeitersI18n("Writers");
		menuI18n.setLangI18n("EN");
		menuI18nRepository.save(menuI18n);

		menuI18n2.setArchivesI18n("المحفوظات");
		menuI18n2.setBooksI18n("الكتب");
		menuI18n2.setBooksMenuI18n("الكتب");
		menuI18n2.setCategoriesI18n("الفئات");
		menuI18n2.setCirculationsI18n("الكتب المصدرة");
		menuI18n2.setCirculationsMenuI18n("التدفقات");
		menuI18n2.setCirculationStatusI18n("حالة الإعارة");
		menuI18n2.setDashboardI18n("لوحة المعلومات");
		menuI18n2.setLogOutI18n("تسجيل الخروج");
		menuI18n2.setMembersI18n("الأعضاء");
		menuI18n2.setMembersMenuI18n("الأعضاء");
		menuI18n2.setPublishersI18n("الناشرون");
		menuI18n2.setRequesredBooksI18n("الكتب المطلوبة");
		menuI18n2.setSettingsI18n("الإعدادات");
		menuI18n2.setTypeMembersI18n("أنواع الأعضاء");
		menuI18n2.setWeitersI18n("الكتاب");
		menuI18n2.setLangI18n("AR");
		menuI18nRepository.save(menuI18n2);

		menuI18n4.setArchivesI18n("আর্কাইভস");
		menuI18n4.setBooksI18n("বই");
		menuI18n4.setBooksMenuI18n("বই");
		menuI18n4.setCategoriesI18n("বিভাগ");
		menuI18n4.setCirculationsI18n("ইস্যু করা বই");
		menuI18n4.setCirculationsMenuI18n("পরিচলন");
		menuI18n4.setCirculationStatusI18n("পরিচলন অবস্থা");
		menuI18n4.setDashboardI18n("ড্যাশবোর্ড");
		menuI18n4.setLogOutI18n("লগ আউট");
		menuI18n4.setMembersI18n("সদস্য");
		menuI18n4.setMembersMenuI18n("সদস্য");
		menuI18n4.setPublishersI18n("প্রকাশকরা");
		menuI18n4.setRequesredBooksI18n("অনুরোধ করা বই");
		menuI18n4.setSettingsI18n("সেটিংস");
		menuI18n4.setTypeMembersI18n("সদস্যের ধরন");
		menuI18n4.setWeitersI18n("লেখক");
		menuI18n4.setLangI18n("BN");
		menuI18nRepository.save(menuI18n4);

		menuI18n3.setArchivesI18n("अभिलेखागार");
		menuI18n3.setBooksI18n("किताबें");
		menuI18n3.setBooksMenuI18n("पुस्तकें");
		menuI18n3.setCategoriesI18n("श्रेणियां");
		menuI18n3.setCirculationsI18n("जारी की गई पुस्तकें");
		menuI18n3.setCirculationsMenuI18n("परिसंचरण");
		menuI18n3.setCirculationStatusI18n("परिसंचरण स्थिति");
		menuI18n3.setDashboardI18n("डैशबोर्ड");
		menuI18n3.setLogOutI18n("लॉग आउट");
		menuI18n3.setMembersI18n("सदस्य");
		menuI18n3.setMembersMenuI18n("सदस्य");
		menuI18n3.setPublishersI18n("प्रकाशक");
		menuI18n3.setRequesredBooksI18n("अनुरोधित पुस्तकें");
		menuI18n3.setSettingsI18n("सेटिंग्स");
		menuI18n3.setTypeMembersI18n("सदस्य प्रकार");
		menuI18n3.setWeitersI18n("राइटर्स");
		menuI18n3.setLangI18n("HN");
		menuI18nRepository.save(menuI18n3);

	}

}
