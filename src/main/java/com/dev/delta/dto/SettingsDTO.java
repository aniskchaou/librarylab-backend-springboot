package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.SettingsRepository;
import com.dev.delta.repositoriesi18n.SettingsI18nRepository;

@Service
public class SettingsDTO implements DTO {

	@Autowired
	SettingsRepository settingsRepository;

	@Autowired
	SettingsI18nRepository settingsI18nRepository;

	@Override
	public void populate() {
		settings.setAddress(faker.address().fullAddress());
		settings.setFax(faker.phoneNumber().phoneNumber().toString());
		settings.setLang("AR");
		settings.setName("Libary Lab");
		settings.setTelephone(faker.phoneNumber().phoneNumber().toString());
		settingsRepository.save(settings);

		settingsI18n.setAddressI18n("Address");
		settingsI18n.setFaxI18n("Fax");
		// settingsI18n.setLangI18n("Language");
		settingsI18n.setNameI18n("Library Name");
		settingsI18n.setTelephoneI18n("Phone");
		settingsI18n.setLangI18n("EN");
		settingsI18n.setAddButtonI18n("Create");
		settingsI18n.setAddTitleI18n("Create");
		settingsI18n.setAllTitleI18n("Settings");
		settingsI18n.setCloseButtonI18n("Close");
		settingsI18n.setEditButtonI18n("Edit");
		settingsI18n.setEditTitleI18n("Edit Settings");
		settingsI18n.setLanguageI18n("Language");
		settingsI18nRepository.save(settingsI18n);

		settingsI18n2.setAddressI18n("العنوان");
		settingsI18n2.setFaxI18n("فاكس");
		settingsI18n2.setNameI18n("اسم المكتبة");
		settingsI18n2.setTelephoneI18n("الهاتف");
		settingsI18n2.setAddButtonI18n("إنشاء");
		settingsI18n2.setAddTitleI18n("إنشاء");
		settingsI18n2.setAllTitleI18n("الإعدادات");
		settingsI18n2.setCloseButtonI18n("إغلاق");
		settingsI18n2.setEditButtonI18n("تحرير");
		settingsI18n2.setEditTitleI18n("تحرير الإعدادات");
		settingsI18n2.setLangI18n("AR");
		settingsI18n2.setLanguageI18n("لغة");
		settingsI18nRepository.save(settingsI18n2);

	}

}
