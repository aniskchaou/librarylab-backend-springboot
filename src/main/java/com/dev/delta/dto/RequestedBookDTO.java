package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.RequestedBookRepository;
import com.dev.delta.repositoriesi18n.RequestedBookI18nRepository;

@Service
public class RequestedBookDTO implements DTO {

	@Autowired
	RequestedBookRepository requestedBookRepository;

	@Autowired
	RequestedBookI18nRepository requestedBookI18nRepository;

	@Override
	public void populate() {
		// TODO Auto-generated method stub
		requestedBook.setBook(book);
		requestedBook.setCtagory(category);
		requestedBook.setEdition("2004");
		requestedBook.setMember(member);
		requestedBook.setNote("N/A");
		requestedBook.setWriter(writer);
		requestedBookRepository.save(requestedBook);

		requestedBookI18n.setBookI18n("Book");
		requestedBookI18n.setCtagoryI18n("Category");
		requestedBookI18n.setEditionI18n("Edition");
		requestedBookI18n.setMemberI18n("Member");
		requestedBookI18n.setNoteI18n("Note");
		requestedBookI18n.setWriterI18n("Writer");
		requestedBookI18n.setLangI18n("EN");
		requestedBookI18n.setAddButtonI18n("Create");
		requestedBookI18n.setAddTitleI18n("Create Requested Book");
		requestedBookI18n.setAllTitleI18n("Requested Books");
		requestedBookI18n.setCloseButtonI18n("Close");
		requestedBookI18n.setEditButtonI18n("Edit");
		requestedBookI18n.setEditTitleI18n("Edit Requested Book");
		requestedBookI18nRepository.save(requestedBookI18n);

		requestBookI18n2.setBookI18n("كتاب");
		requestBookI18n2.setCtagoryI18n("الفئة");
		requestBookI18n2.setEditionI18n("Edition");
		requestBookI18n2.setMemberI18n("عضو");
		requestBookI18n2.setNoteI18n("ملاحظة");
		requestBookI18n2.setWriterI18n("الكاتب");
		requestBookI18n2.setLangI18n("AR");
		requestBookI18n2.setAddButtonI18n("إنشاء");
		requestBookI18n2.setAddTitleI18n("إنشاء كتاب مطلوب");
		requestBookI18n2.setAllTitleI18n("الكتب المطلوبة");
		requestBookI18n2.setCloseButtonI18n("إغلاق");
		requestBookI18n2.setEditButtonI18n("تحرير");
		requestBookI18n2.setEditTitleI18n("تحرير الكتاب المطلوب");
		requestedBookI18nRepository.save(requestBookI18n2);
	}

}
