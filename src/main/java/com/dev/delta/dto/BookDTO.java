package com.dev.delta.dto;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.ImageModel;
import com.dev.delta.repositories.BookRepository;
import com.dev.delta.repositories.ImageModelrepository;
import com.dev.delta.repositoriesi18n.BookI18nRepository;
import com.dev.delta.util.ImageUtil;

/**
 * BookDTO
 * @author Admin
 *
 */
@Service
public class BookDTO implements DTO {

	@Autowired
	BookRepository bookRepository;

	@Autowired
	BookI18nRepository bookI18nRepository;
	
	@Autowired
	ImageModelrepository  imageRepository;

	@Override
	public void populate() {
		book.setWriter(writer);
		book.setEdition(faker.book().publisher());
		book.setEdition_year("2021");
		book.setIsbn("978-3-16-148410-0");
		book.setNotes("N/A");
		book.setNumber_of_pages("1122");
		book.setPhoto("2.jpg");
		book.setPublication_place("France");
		book.setPublisher(publisher);
		book.setPublishing_year("2021");
		book.setTitle(faker.book().title());
		book.setCategory(category);
		insertImage(book.getPhoto());
		bookRepository.save(book);

		book2.setWriter(writer);
		book2.setEdition(faker.book().publisher());
		book2.setEdition_year("2011");
		book2.setIsbn("454-3-16-148410-0");
		book2.setNotes("N/A");
		book2.setNumber_of_pages("334");
		book2.setPhoto("3.jpg");
		book2.setPublication_place("Fance");
		book2.setPublisher(publisher);
		book2.setPublishing_year("2011");
		book2.setTitle(faker.book().title());
		book2.setCategory(category2);
		insertImage(book2.getPhoto());
		bookRepository.save(book2);

		book3.setWriter(writer);
		book3.setEdition(faker.book().publisher());
		book3.setEdition_year("2000");
		book3.setIsbn("767-3-16-148410-0");
		book3.setNotes("N/A");
		book3.setNumber_of_pages("199");
		book3.setPhoto("4.jpg");
		book3.setPublication_place("France");
		book3.setPublisher(publisher);
		book3.setPublishing_year("2000");
		book3.setTitle(faker.book().title());
		book3.setCategory(category3);
		insertImage(book3.getPhoto());
		bookRepository.save(book3);

		book4.setWriter(writer);
		book4.setEdition(faker.book().publisher());
		book4.setEdition_year("1998");
		book4.setIsbn("212-3-16-148410-0");
		book4.setNotes("N/A");
		book4.setNumber_of_pages("1000");
		book4.setPhoto("5.jpg");
		book4.setPublication_place("France");
		book4.setPublisher(publisher);
		book4.setPublishing_year("1998");
		book4.setTitle(faker.book().title());
		book4.setCategory(category);
		insertImage(book4.getPhoto());
		bookRepository.save(book4);

		book5.setWriter(writer);
		book5.setEdition(faker.book().publisher());
		book5.setEdition_year("2021");
		book5.setIsbn("000-3-16-148410-0");
		book5.setNotes("N/A");
		book5.setNumber_of_pages("888");
		book5.setPhoto("6.jpg");
		book5.setPublication_place("Spain");
		book5.setPublisher(publisher);
		book5.setPublishing_year("2021");
		book5.setTitle(faker.book().title());
		book5.setCategory(category);
		insertImage(book5.getPhoto());
		bookRepository.save(book5);

		book6.setWriter(writer);
		book6.setEdition(faker.book().publisher());
		book6.setEdition_year("2001");
		book6.setIsbn("111-3-16-148410-0");
		book6.setNotes("N/A");
		book6.setNumber_of_pages("333");
		book6.setPhoto("7.jpg");
		book6.setPublication_place("Germany");
		book6.setPublisher(publisher);
		book6.setPublishing_year("2001");
		book6.setTitle(faker.book().title());
		book6.setCategory(category);
		insertImage(book6.getPhoto());
		bookRepository.save(book6);

		book7.setWriter(writer);
		book7.setEdition(faker.book().publisher());
		book7.setEdition_year("2021");
		book7.setIsbn("000-3-16-148410-0");
		book7.setNotes("N/A");
		book7.setNumber_of_pages("120");
		book7.setPhoto("1.jpg");
		book7.setPublication_place("USA");
		book7.setPublisher(publisher);
		book7.setPublishing_year("1990");
		book7.setTitle(faker.book().title());
		book7.setCategory(category2);
		insertImage(book7.getPhoto());
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
		
		bookI18n3.setAuthorI18n ("लेखक");
		bookI18n3.setEditionI18n ("संस्करण");
		bookI18n3.setEdition_yearI18n ("संस्करण वर्ष");
		bookI18n3.setIsbnI18n ("आईएसबीएन");
		bookI18n3.setNotesI18n ("नोट");
		bookI18n3.setNumber_of_pagesI18n ("पृष्ठों की संख्या");
		bookI18n3.setPhotoI18n ("फोटो");
		bookI18n3.setPublication_placeI18n ("प्रकाशन स्थान");
		bookI18n3.setPublisherI18n ("प्रकाशक");
		bookI18n3.setPublishing_yearI18n ("प्रकाशन वर्ष");
		bookI18n3.setTitleI18n ("शीर्षक");
		bookI18n3.setAllTitleI18n ("किताबें");
		bookI18n3.setAddTitleI18n ("पुस्तक बनाएं");
		bookI18n3.setAddButtonI18n ("बनाएं");
		bookI18n3.setEditTitleI18n ("पुस्तक संपादित करें");
		bookI18n3.setResetButtonI18n ("रीसेट");
		bookI18n3.setLangI18n ("HN");
		bookI18n3.setCategoryI18n ("श्रेणी");
		bookI18n3.setAddButtonI18n ("बनाएं");
		bookI18n3.setEditButtonI18n ("संपादित करें");
		bookI18n3.setShowButtonI18n ("दिखाएँ / छिपाएँ");
		bookI18n3.setRefreshButtonI18n ("ताज़ा करें");
		bookI18n3.setFilterI18n ("फ़िल्टर");
		bookI18n3.setSummaryButtonI18n ("सारांश");
		bookI18n3.setCloseButtonI18n ("बंद करें");
		bookI18nRepository.save(bookI18n3);
		
		bookI18n4.setAuthorI18n("লেখক");
		bookI18n4.setEditionI18n("সংস্করণ");
		bookI18n4.setEdition_yearI18n("সংস্করণের বছর");
		bookI18n4.setIsbnI18n("ISBN");
		bookI18n4.setNotesI18n("নোট");
		bookI18n4.setNumber_of_pagesI18n("পৃষ্ঠা সংখ্যা");
		bookI18n4.setPhotoI18n("ফটো");
		bookI18n4.setPublication_placeI18n("প্রকাশনের স্থান");
		bookI18n4.setPublisherI18n("প্রকাশক");
		bookI18n4.setPublishing_yearI18n("প্রকাশের বছর");
		bookI18n4.setTitleI18n("শিরোনাম");
		bookI18n4.setAllTitleI18n("বই");
		bookI18n4.setAddTitleI18n("বই তৈরি করুন");
		bookI18n4.setAddButtonI18n("তৈরি করুন");
		bookI18n4.setEditTitleI18n("বই সম্পাদনা করুন");
		bookI18n4.setResetButtonI18n("রিসেট");
		bookI18n4.setLangI18n("BN");
		bookI18n4.setCategoryI18n("বিভাগ");
		bookI18n4.setAddButtonI18n("তৈরি করুন");
		bookI18n4.setEditButtonI18n("সম্পাদনা");
		bookI18n4.setShowButtonI18n("দেখা/লুকান");
		bookI18n4.setRefreshButtonI18n("রিফ্রেশ");
		bookI18n4.setFilterI18n("ফিল্টার");
		bookI18n4.setSummaryButtonI18n("সারাংশ");
		bookI18n4.setCloseButtonI18n("বন্ধ");
		bookI18nRepository.save(bookI18n4);

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

	private void insertImage(String photo) {
		File resource;
		try {
			resource = new ClassPathResource("books/"+photo).getFile();
			Files.readAllBytes(resource.toPath());
			ImageModel img = new ImageModel(photo, "image/jpeg",

					ImageUtil.compressBytes(Files.readAllBytes(resource.toPath())));
			imageRepository.save(img);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
