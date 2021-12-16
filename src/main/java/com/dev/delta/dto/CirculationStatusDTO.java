package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.CirculationStatusRepository;
import com.dev.delta.repositoriesi18n.CirculationStatusI18nRepository;

@Service
public class CirculationStatusDTO implements DTO {

	@Autowired
	CirculationStatusRepository circulationRepository;

	@Autowired
	CirculationStatusI18nRepository circulationI18nRepository;

	@Override
	public void populate() {
		// TODO Auto-generated method stub
		circulationStatus.setName("Issued");
		circulationRepository.save(circulationStatus);
		circulationStatus2.setName("Returned");
		circulationRepository.save(circulationStatus2);

		circulationStatusI18n.setNameI18n("Circulation Status");
		circulationStatusI18n.setLangI18n("EN");
		circulationStatusI18n.setAddButtonI18n("Create");
		circulationStatusI18n.setAddTitleI18n("Create Circulation Status");
		circulationStatusI18n.setAllTitleI18n("Circulation Status");
		circulationStatusI18n.setCloseButtonI18n("Close");
		circulationStatusI18n.setEditButtonI18n("Edit");
		circulationStatusI18n.setEditTitleI18n("Edit Circulation Status");
		circulationI18nRepository.save(circulationStatusI18n);

		circulationStatusI18n2.setNameI18n("حالة الإعارة");
		circulationStatusI18n2.setLangI18n("AR");
		circulationStatusI18n2.setAddButtonI18n("إنشاء");
		circulationStatusI18n2.setAddTitleI18n("إنشاء حالة الإعارة");
		circulationStatusI18n2.setAllTitleI18n("حالة الإعارة");
		circulationStatusI18n2.setCloseButtonI18n("إغلاق");
		circulationStatusI18n2.setEditButtonI18n("تحرير");
		circulationStatusI18n2.setEditTitleI18n("تحرير حالة الإعارة");
		circulationI18nRepository.save(circulationStatusI18n2);
	}

}
