package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.CirculationRepository;
import com.dev.delta.repositoriesi18n.CirculationI18nRepository;

/**
 * CirculationDTO
 * 
 * @author Admin
 *
 */
@Service
public class CirculationDTO implements DTO {

	@Autowired
	CirculationRepository circulationRepository;

	@Autowired
	CirculationI18nRepository circulationnRepositoryI18n;

	@Override
	public void populate() {

		circulation.setBookName(book);
		circulation.setIssueDate("11/11/2021");
		circulation.setLastDate("12/12/2021");
		circulation.setMemberName(member);
		circulation.setPenalty("5");
		circulation.setReturnDate("11/9/2021");
		circulation.setReturnStatus(circulationStatus);
		circulation.setToReturn("11/9/2021");
		circulation.setWriter(writer);
		circulationRepository.save(circulation);

		circulation2.setBookName(book3);
		circulation2.setIssueDate("01/04/2022");
		circulation2.setLastDate("01/05/2022");
		circulation2.setMemberName(member);
		circulation2.setPenalty("5");
		circulation2.setReturnDate("11/9/2021");
		circulation2.setReturnStatus(circulationStatus);
		circulation2.setToReturn("11/9/2021");
		circulation2.setWriter(writer);
		circulationRepository.save(circulation2);

		circulation3.setBookName(book4);
		circulation3.setIssueDate("10/03/2022");
		circulation3.setLastDate("12/03/2022");
		circulation3.setMemberName(member);
		circulation3.setPenalty("5");
		circulation3.setReturnDate("11/9/2021");
		circulation3.setReturnStatus(circulationStatus);
		circulation3.setToReturn("11/9/2021");
		circulation3.setWriter(writer);
		circulationRepository.save(circulation3);

		circulation4.setBookName(book6);
		circulation4.setIssueDate("01/04/2022");
		circulation4.setLastDate("02/04/2022");
		circulation4.setMemberName(member);
		circulation4.setPenalty("5");
		circulation4.setReturnDate("11/9/2021");
		circulation4.setReturnStatus(circulationStatus);
		circulation4.setToReturn("11/9/2021");
		circulation4.setWriter(writer);
		circulationRepository.save(circulation4);

		circulation5.setBookName(book5);
		circulation5.setIssueDate("01/01/2022");
		circulation5.setLastDate("02/06/2022");
		circulation5.setMemberName(member);
		circulation5.setPenalty("5");
		circulation5.setReturnDate("11/9/2021");
		circulation5.setReturnStatus(circulationStatus);
		circulation5.setToReturn("11/9/2021");
		circulation5.setWriter(writer);
		circulationRepository.save(circulation5);

		circulation6.setBookName(book2);
		circulation6.setIssueDate("03/02/2022");
		circulation6.setLastDate("04/03/2022");
		circulation6.setMemberName(member);
		circulation6.setPenalty("5");
		circulation6.setReturnDate("11/9/2021");
		circulation6.setReturnStatus(circulationStatus);
		circulation6.setToReturn("11/9/2021");
		circulation6.setWriter(writer);
		circulationRepository.save(circulation6);

		circulation.setBookName(book3);
		circulation.setIssueDate("02/01/2022");
		circulation.setLastDate("02/05/2022");
		circulation.setMemberName(member);
		circulation.setPenalty("5");
		circulation.setReturnDate("11/9/2021");
		circulation.setReturnStatus(circulationStatus);
		circulation.setToReturn("11/9/2021");
		circulation.setWriter(writer);
		circulationRepository.save(circulation);

		circulationI18n2.setBookNameI18n("اسم الكتاب");
		circulationI18n2.setIssueDateI18n("تاريخ الإصدار");
		circulationI18n2.setLastDateI18n("آخر تاريخ");
		circulationI18n2.setMemberNameI18n("اسم العضو");
		circulationI18n2.setPenaltyI18n("عقوبة");
		circulationI18n2.setReturnDateI18n("تاريخ العودة");
		circulationI18n2.setReturnStatusI18n("حالة الإرجاع");
		circulationI18n2.setToReturnI18n("To Return");
		circulationI18n2.setWriterI18n("الكاتب");
		circulationI18n2.setLangI18n("AR");
		circulationI18n2.setAddButtonI18n("إنشاء");
		circulationI18n2.setAddTitleI18n("إنشاء إعارة");
		circulationI18n2.setAllTitleI18n("توزيع الكتاب");
		circulationI18n2.setCloseButtonI18n("إغلاق");
		circulationI18n2.setEditButtonI18n("تحرير");
		circulationI18n2.setEditTitleI18n("تحرير التدوير");
		circulationI18n2.setSendEmailI18n("إرسال");
		circulationI18n2.setContactMemberTitleI18n("عضو الاتصال");
		circulationI18n2.setMessageI18n("رسالة");
		circulationnRepositoryI18n.save(circulationI18n2);

		circulationI18n.setBookNameI18n("Book Name");
		circulationI18n.setIssueDateI18n("Issue Date");
		circulationI18n.setLastDateI18n("Last Date");
		circulationI18n.setMemberNameI18n("Member Name");
		circulationI18n.setPenaltyI18n("Penalty");
		circulationI18n.setReturnDateI18n("Return Date");
		circulationI18n.setReturnStatusI18n("Return Status");
		circulationI18n.setToReturnI18n("To Return");
		circulationI18n.setWriterI18n("Writer");
		circulationI18n.setLangI18n("EN");
		circulationI18n.setAddButtonI18n("Create");
		circulationI18n.setAddTitleI18n("Create Circulation");
		circulationI18n.setAllTitleI18n("Book Circulations");
		circulationI18n.setCloseButtonI18n("Close");
		circulationI18n.setEditButtonI18n("Edit");
		circulationI18n.setEditTitleI18n("Edit Circulation");
		circulationI18n.setSendEmailI18n("Send");
		circulationI18n.setContactMemberTitleI18n("Contact member");
		circulationI18n.setMessageI18n("Message");
		circulationnRepositoryI18n.save(circulationI18n);

		circulationI18n3.setBookNameI18n("पुस्तक का नाम");
		circulationI18n3.setIssueDateI18n("इश्यू डेट");
		circulationI18n3.setLastDateI18n("अंतिम तिथि");
		circulationI18n3.setMemberNameI18n("सदस्य का नाम");
		circulationI18n3.setPenaltyI18n("जुर्माना");
		circulationI18n3.setReturnDateI18n("रिटर्न डेट");
		circulationI18n3.setReturnStatusI18n("रिटर्न स्टेटस");
		circulationI18n3.setToReturnI18n("वापसी करने के लिए");
		circulationI18n3.setWriterI18n("लेखक");
		circulationI18n3.setLangI18n("HN");
		circulationI18n3.setAddButtonI18n("बनाएं");
		circulationI18n3.setAddTitleI18n("परिसंचरण बनाएँ");
		circulationI18n3.setAllTitleI18n("बुक सर्कुलेशन");
		circulationI18n3.setCloseButtonI18n("बंद करें");
		circulationI18n3.setEditButtonI18n("संपादित करें");
		circulationI18n3.setEditTitleI18n("परिसंचरण संपादित करें");
		circulationI18n3.setSendEmailI18n("भेजना");
		circulationI18n3.setContactMemberTitleI18n("सदस्य संपर्क");
		circulationI18n3.setMessageI18n("संदेश");
		circulationnRepositoryI18n.save(circulationI18n3);

		circulationI18n4.setBookNameI18n("বইয়ের নাম");
		circulationI18n4.setIssueDateI18n("ইস্যু তারিখ");
		circulationI18n4.setLastDateI18n("শেষ তারিখ");
		circulationI18n4.setMemberNameI18n("সদস্যের নাম");
		circulationI18n4.setPenaltyI18n("পেনাল্টি");
		circulationI18n4.setReturnDateI18n("রিটার্ন ডেট");
		circulationI18n4.setReturnStatusI18n("রিটার্ন স্ট্যাটাস");
		circulationI18n4.setToReturnI18n("ফিরতে");
		circulationI18n4.setWriterI18n("লেখক");
		circulationI18n4.setLangI18n("BN");
		circulationI18n4.setAddButtonI18n("তৈরি করুন");
		circulationI18n4.setAddTitleI18n("সঞ্চালন তৈরি করুন");
		circulationI18n4.setAllTitleI18n("বুক সার্কুলেশন");
		circulationI18n4.setCloseButtonI18n("বন্ধ");
		circulationI18n4.setEditButtonI18n("সম্পাদনা");
		circulationI18n4.setEditTitleI18n("পরিচলন সম্পাদনা করুন");
		circulationI18n4.setSendEmailI18n("পাঠান");
		circulationI18n4.setContactMemberTitleI18n("সদস্য যোগাযোগ");
		circulationI18n4.setMessageI18n("বার্তা");
		circulationnRepositoryI18n.save(circulationI18n4);
	}

}
