package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositoriesi18n.MenuI18nRepository;

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

	}

}
