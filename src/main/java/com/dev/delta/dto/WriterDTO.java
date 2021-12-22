package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.WriterRepository;
import com.dev.delta.repositoriesi18n.WriterI18nRepository;

@Service
public class WriterDTO implements DTO {

	@Autowired
	WriterRepository writerRepository;

	@Autowired
	WriterI18nRepository writerI18nRepository;

	@Override
	public void populate() {
		writer.setName(faker.book().author());
		writer.setNote("N/A");
		writerRepository.save(writer);

		writerI18n.setNameI18n("Writer Name");
		writerI18n.setNoteI18n("Note");
		writerI18n.setLangI18n("EN");
		writerI18n.setAddButtonI18n("Create");
		writerI18n.setAddTitleI18n("Create Writer");
		writerI18n.setAllTitleI18n("Writers");
		writerI18n.setCloseButtonI18n("Close");
		writerI18n.setEditButtonI18n("Edit");
		writerI18n.setEditTitleI18n("Edit Writer");
		writerI18nRepository.save(writerI18n);
		
		writerI18n3.setNameI18n ("लेखक का नाम");
		writerI18n3.setNoteI18n ("नोट");
		writerI18n3.setLangI18n ("HN");
		writerI18n3.setAddButtonI18n ("बनाएं");
		writerI18n3.setAddTitleI18n ("लेखक बनाएं");
		writerI18n3.setAllTitleI18n ("लेखक");
		writerI18n3.setCloseButtonI18n ("बंद करें");
		writerI18n3.setEditButtonI18n ("संपादित करें");
		writerI18n3.setEditTitleI18n ("लेखक संपादित करें");
		writerI18nRepository.save(writerI18n3);
		
		writerI18n4.setNameI18n("লেখকের নাম");
		writerI18n4.setNoteI18n("নোট");
		writerI18n4.setLangI18n("BN");
		writerI18n4.setAddButtonI18n("তৈরি করুন");
		writerI18n4.setAddTitleI18n("লেখক তৈরি করুন");
		writerI18n4.setAllTitleI18n("লেখক");
		writerI18n4.setCloseButtonI18n("বন্ধ");
		writerI18n4.setEditButtonI18n("সম্পাদনা");
		writerI18n4.setEditTitleI18n("লেখক সম্পাদনা করুন");
		writerI18nRepository.save(writerI18n4);

		writerI18n2.setNameI18n("اسم الكاتب");
		writerI18n2.setNoteI18n("ملاحظة");
		writerI18n2.setLangI18n("AR");
		writerI18n2.setAddButtonI18n("إنشاء");
		writerI18n2.setAddTitleI18n("إنشاء فئة");
		writerI18n2.setAllTitleI18n("الناشر");
		writerI18n2.setCloseButtonI18n("إغلاق");
		writerI18n2.setEditButtonI18n("تحرير");
		writerI18n2.setEditTitleI18n("تحرير الفئة");
		writerI18nRepository.save(writerI18n2);
	}

	

}
