package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.PublisherRepository;
import com.dev.delta.repositoriesi18n.PublisherI18nRepository;

@Service
public class PublisherDTO implements DTO {

	@Autowired
	PublisherRepository publisherRepository;

	@Autowired
	PublisherI18nRepository publisherI18nRepository;

	@Override
	public void populate() {
		publisher.setName(faker.book().publisher());
		publisherRepository.save(publisher);

		publisherI18n.setNameI18n("Publisher Name");
		publisherI18n.setLangI18n("EN");
		publisherI18n.setAddButtonI18n("Create");
		publisherI18n.setAddTitleI18n("Create Publisher");
		publisherI18n.setAllTitleI18n("Publishers");
		publisherI18n.setCloseButtonI18n("Close");
		publisherI18n.setEditButtonI18n("Edit");
		publisherI18n.setEditTitleI18n("Edit Publisher");
		publisherI18nRepository.save(publisherI18n);

		publisherI18n2.setNameI18n("اسم الناشر");
		publisherI18n2.setLangI18n("AR");
		publisherI18n2.setAddButtonI18n("إنشاء");
		publisherI18n2.setAddTitleI18n("إنشاء فئة");
		publisherI18n2.setAllTitleI18n("الفئات");
		publisherI18n2.setCloseButtonI18n("إغلاق");
		publisherI18n2.setEditButtonI18n("تحرير");
		publisherI18n2.setEditTitleI18n("تحرير الفئة");
		publisherI18nRepository.save(publisherI18n2);
	}

}
