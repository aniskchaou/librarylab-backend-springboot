package com.dev.delta.dto;

import com.dev.delta.entities.Publisher;
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

		for (int i = 0; i < 55; i++) {
			Publisher publisher4 = new Publisher();

			publisher4.setName(faker.book().publisher());
			publisher4.setAddress(faker.address().streetAddress());
			publisher4.setEmail(faker.internet().emailAddress());
			publisher4.setPhone(faker.phoneNumber().phoneNumber());
			publisher4.setCountry(faker.address().country());
			publisher4.setWebsite(faker.internet().url());

			publisherRepository.save(publisher4);
		}


		publisher.setName(faker.book().publisher());
		publisher.setAddress(faker.address().streetAddress());
		publisher.setEmail(faker.internet().emailAddress());
		publisher.setPhone(faker.phoneNumber().phoneNumber());
		publisher.setCountry(faker.address().country());
		publisher.setWebsite(faker.internet().url());

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

		publisherI18n3.setNameI18n("प्रकाशक का नाम");
		publisherI18n3.setLangI18n("HN");
		publisherI18n3.setAddButtonI18n("बनाएं");
		publisherI18n3.setAddTitleI18n("प्रकाशक बनाएं");
		publisherI18n3.setAllTitleI18n("प्रकाशक");
		publisherI18n3.setCloseButtonI18n("बंद करें");
		publisherI18n3.setEditButtonI18n("संपादित करें");
		publisherI18n3.setEditTitleI18n("प्रकाशक संपादित करें");
		publisherI18nRepository.save(publisherI18n3);

		publisherI18n4.setNameI18n("প্রকাশকের নাম");
		publisherI18n4.setLangI18n("BN");
		publisherI18n4.setAddButtonI18n("তৈরি করুন");
		publisherI18n4.setAddTitleI18n("প্রকাশক তৈরি করুন");
		publisherI18n4.setAllTitleI18n("প্রকাশকরা");
		publisherI18n4.setCloseButtonI18n("বন্ধ");
		publisherI18n4.setEditButtonI18n("সম্পাদনা");
		publisherI18n4.setEditTitleI18n("সম্পাদনা প্রকাশক");
		publisherI18nRepository.save(publisherI18n4);

	}

}
