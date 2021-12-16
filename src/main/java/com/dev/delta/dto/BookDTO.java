package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.BookRepository;
import com.dev.delta.repositoriesi18n.BookI18nRepository;

@Service
public class BookDTO implements DTO {

	@Autowired
	BookRepository bookRepository;

	@Autowired
	BookI18nRepository bookI18nRepository;

	@Override
	public void populate() {
		book.setWriter(writer);
		book.setEdition(faker.book().publisher());
		book.setEdition_year("2021");
		book.setIsbn("978-3-16-148410-0");
		book.setNotes("N/A");
		book.setNumber_of_pages("1122");
		book.setPhoto("jhvj");
		book.setPublication_place("France");
		book.setPublisher(publisher);
		book.setPublishing_year("2021");
		book.setTitle(faker.book().title());
		book.setCategory(category);
		bookRepository.save(book);

		book2.setWriter(writer);
		book2.setEdition(faker.book().publisher());
		book2.setEdition_year("2011");
		book2.setIsbn("454-3-16-148410-0");
		book2.setNotes("N/A");
		book2.setNumber_of_pages("334");
		book2.setPhoto("jhvj");
		book2.setPublication_place("Fance");
		book2.setPublisher(publisher);
		book2.setPublishing_year("2011");
		book2.setTitle(faker.book().title());
		book2.setCategory(category2);
		bookRepository.save(book2);

		book3.setWriter(writer);
		book3.setEdition(faker.book().publisher());
		book3.setEdition_year("2000");
		book3.setIsbn("767-3-16-148410-0");
		book3.setNotes("N/A");
		book3.setNumber_of_pages("199");
		book3.setPhoto("jhvj");
		book3.setPublication_place("France");
		book3.setPublisher(publisher);
		book3.setPublishing_year("2000");
		book3.setTitle(faker.book().title());
		book3.setCategory(category3);
		bookRepository.save(book3);

		book4.setWriter(writer);
		book4.setEdition(faker.book().publisher());
		book4.setEdition_year("1998");
		book4.setIsbn("212-3-16-148410-0");
		book4.setNotes("N/A");
		book4.setNumber_of_pages("1000");
		book4.setPhoto("jhvj");
		book4.setPublication_place("France");
		book4.setPublisher(publisher);
		book4.setPublishing_year("1998");
		book4.setTitle(faker.book().title());
		book4.setCategory(category);
		bookRepository.save(book4);

		book5.setWriter(writer);
		book5.setEdition(faker.book().publisher());
		book5.setEdition_year("2021");
		book5.setIsbn("000-3-16-148410-0");
		book5.setNotes("N/A");
		book5.setNumber_of_pages("888");
		book5.setPhoto("jhvj");
		book5.setPublication_place("Spain");
		book5.setPublisher(publisher);
		book5.setPublishing_year("2021");
		book5.setTitle(faker.book().title());
		book5.setCategory(category);
		bookRepository.save(book5);

		book6.setWriter(writer);
		book6.setEdition(faker.book().publisher());
		book6.setEdition_year("2001");
		book6.setIsbn("111-3-16-148410-0");
		book6.setNotes("N/A");
		book6.setNumber_of_pages("333");
		book6.setPhoto("jhvj");
		book6.setPublication_place("Germany");
		book6.setPublisher(publisher);
		book6.setPublishing_year("2001");
		book6.setTitle(faker.book().title());
		book6.setCategory(category);
		bookRepository.save(book6);

		book7.setWriter(writer);
		book7.setEdition(faker.book().publisher());
		book7.setEdition_year("2021");
		book7.setIsbn("000-3-16-148410-0");
		book7.setNotes("N/A");
		book7.setNumber_of_pages("120");
		book7.setPhoto("jhvj");
		book7.setPublication_place("USA");
		book7.setPublisher(publisher);
		book7.setPublishing_year("1990");
		book7.setTitle(faker.book().title());
		book7.setCategory(category2);
		bookRepository.save(book7);

		bookI18n.setAuthorI18n("Writer ");
		bookI18n.setEditionI18n("Edition");
		bookI18n.setEdition_yearI18n("Edition Year");
		bookI18n.setIsbnI18n("ISBN");
		bookI18n.setNotesI18n("Note");
		bookI18n.setNumber_of_pagesI18n("Number Of Pages");
		bookI18n.setPhotoI18n("Photo");
		bookI18n.setPublication_placeI18n("Publication Place");
		bookI18n.setPublisherI18n("Publisher");
		bookI18n.setPublishing_yearI18n("Publication Year");
		bookI18n.setTitleI18n("Title");
		bookI18n.setAllTitleI18n("Books");
		bookI18n.setAddTitleI18n("Create Book");
		bookI18n.setAddButtonI18n("Create");
		bookI18n.setEditTitleI18n("Edit Book");
		bookI18n.setResetButtonI18n("Reset");
		bookI18n.setLangI18n("EN");
		bookI18n.setCategoryI18n("Category");
		bookI18n.setAddButtonI18n("Create");
		bookI18n.setEditButtonI18n("Edit");
		bookI18n.setShowButtonI18n("Show/Hide");
		bookI18n.setRefreshButtonI18n("Refresh");
		bookI18n.setFilterI18n("Filter");
		bookI18n.setSummaryButtonI18n("Summary");
		bookI18n.setCloseButtonI18n("Close");
		bookI18nRepository.save(bookI18n);

		bookI18n2.setEditionI18n("الإصدار");
		bookI18n2.setEdition_yearI18n("سنة الإصدار");
		bookI18n2.setIsbnI18n("ISBN");
		bookI18n2.setNotesI18n("ملاحظة");
		bookI18n2.setNumber_of_pagesI18n("عدد الصفحات");
		bookI18n2.setPhotoI18n("Photo");
		bookI18n2.setPublication_placeI18n("مكان النشر");
		bookI18n2.setPublisherI18n("الناشر");
		bookI18n2.setPublishing_yearI18n("سنة النشر");
		bookI18n2.setTitleI18n("عنوان");
		bookI18n2.setAllTitleI18n("كتب");
		bookI18n2.setAddTitleI18n("إنشاء كتاب");
		bookI18n2.setAddButtonI18n("إنشاء");
		bookI18n2.setEditTitleI18n("تحرير الكتاب");
		bookI18n2.setResetButtonI18n("إعادة تعيين");
		bookI18n2.setLangI18n("AR");
		bookI18n2.setCategoryI18n("الفئة");
		bookI18n2.setAddButtonI18n("إنشاء");
		bookI18n2.setEditButtonI18n("تحرير");
		bookI18n2.setShowButtonI18n("إظهار / إخفاء");
		bookI18n2.setRefreshButtonI18n("تحديث");
		bookI18n2.setFilterI18n("عامل التصفية");
		bookI18n2.setSummaryButtonI18n("الملخص");
		bookI18n2.setCloseButtonI18n("إغلاق");
		bookI18nRepository.save(bookI18n2);

	}

}
