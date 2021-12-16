package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.CirculationRepository;
import com.dev.delta.repositoriesi18n.CirculationI18nRepository;

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
		circulation.setLastDate("12/03/2022");
		circulation.setMemberName(member);
		circulation.setPenalty("5");
		circulation.setReturnDate("11/9/2021");
		circulation.setReturnStatus(circulationStatus);
		circulation.setToReturn("11/9/2021");
		circulation.setWriter(writer);
		circulationRepository.save(circulation);

		circulation2.setBookName(book);
		circulation2.setIssueDate("11/11/2021");
		circulation2.setLastDate("12/03/2022");
		circulation2.setMemberName(member);
		circulation2.setPenalty("5");
		circulation2.setReturnDate("11/9/2021");
		circulation2.setReturnStatus(circulationStatus);
		circulation2.setToReturn("11/9/2021");
		circulation2.setWriter(writer);
		circulationRepository.save(circulation2);

		circulation3.setBookName(book);
		circulation3.setIssueDate("11/11/2021");
		circulation3.setLastDate("12/03/2022");
		circulation3.setMemberName(member);
		circulation3.setPenalty("5");
		circulation3.setReturnDate("11/9/2021");
		circulation3.setReturnStatus(circulationStatus);
		circulation3.setToReturn("11/9/2021");
		circulation3.setWriter(writer);
		circulationRepository.save(circulation3);

		circulation4.setBookName(book);
		circulation4.setIssueDate("11/11/2021");
		circulation4.setLastDate("12/03/2022");
		circulation4.setMemberName(member);
		circulation4.setPenalty("5");
		circulation4.setReturnDate("11/9/2021");
		circulation4.setReturnStatus(circulationStatus);
		circulation4.setToReturn("11/9/2021");
		circulation4.setWriter(writer);
		circulationRepository.save(circulation4);

		circulation5.setBookName(book);
		circulation5.setIssueDate("13/11/2021");
		circulation5.setLastDate("12/03/2022");
		circulation5.setMemberName(member);
		circulation5.setPenalty("5");
		circulation5.setReturnDate("11/9/2021");
		circulation5.setReturnStatus(circulationStatus);
		circulation5.setToReturn("11/9/2021");
		circulation5.setWriter(writer);
		circulationRepository.save(circulation5);

		circulation6.setBookName(book);
		circulation6.setIssueDate("12/11/2021");
		circulation6.setLastDate("12/03/2022");
		circulation6.setMemberName(member);
		circulation6.setPenalty("5");
		circulation6.setReturnDate("11/9/2021");
		circulation6.setReturnStatus(circulationStatus);
		circulation6.setToReturn("11/9/2021");
		circulation6.setWriter(writer);
		circulationRepository.save(circulation6);

		circulation.setBookName(book);
		circulation.setIssueDate("13/11/2021");
		circulation.setLastDate("12/03/2022");
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
		circulationnRepositoryI18n.save(circulationI18n);

	}

}
