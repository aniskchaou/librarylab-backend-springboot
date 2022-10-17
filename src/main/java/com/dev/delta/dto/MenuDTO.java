package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositoriesi18n.MenuI18nRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class MenuDTO implements DTO {

	@Autowired
	MenuI18nRepository menuI18nRepository;

	@Override
	public void populate() {
		menuI18n.setArchivesI18n("Archives");
		menuI18n.setBooksI18n("Books");
		menuI18n.setBooksMenuI18n("Books");
		menuI18n.setCategoriesI18n("Categories");
		menuI18n.setCirculationsI18n("Issued Books");
		menuI18n.setCirculationsMenuI18n("Circulations");
		menuI18n.setCirculationStatusI18n("Circulation status");
		menuI18n.setDashboardI18n("Dashboard");
		menuI18n.setLogOutI18n("log out");
		menuI18n.setMembersI18n("Members");
		menuI18n.setMembersMenuI18n("Members");
		menuI18n.setPublishersI18n("Publishers");
		menuI18n.setRequesredBooksI18n("Requested Books");
		menuI18n.setSettingsI18n("Settings");
		menuI18n.setTypeMembersI18n("Member Types");
		menuI18n.setWeitersI18n("Writers");
		menuI18n.setLangI18n("EN");
		menuI18n.setArchivedBookI18n("Archived Books");
		menuI18n.setDestroyedBookI18n("Destroyed Books");
		menuI18n.setCalendarI18n("Calendar");
		menuI18n.setExpenseI18n("Expenses");
		menuI18n.setIncome18n("Incomes");
		menuI18n.setMembershipI18n("Membership");
		menuI18n.setPaymentI18n("Payment");
		menuI18n.setReportI18n("Reports");
		menuI18n.setBookReportI18n("Book Reports");
		menuI18n.setMemberReportI18n("Member Reports");
		menuI18n.setCirculationReportI18n("Circulation Report");
		menuI18n.setAnalyticsI18n("Analytics");
		menuI18n.setBookAnalayticsI18n("Books Analytics");
		menuI18n.setAccount18n("Account");
		menuI18n.setEmailSettingsI18n("Email Settings");
		menuI18n.setGeneralSettingsI18n("General Settings");
		menuI18n.setAccountAnalyticsI18n("Account Analytics");
		menuI18n.setSettingsI18n("Settings");
		menuI18n.setAnalyticsI18n("Analytics");

		menuI18nRepository.save(menuI18n);

		menuI18n2.setArchivesI18n("المحفوظات");
		menuI18n2.setBooksI18n("الكتب");
		menuI18n2.setBooksMenuI18n("الكتب");
		menuI18n2.setCategoriesI18n("الفئات");
		menuI18n2.setCirculationsI18n("الكتب المصدرة");
		menuI18n2.setCirculationsMenuI18n("التدفقات");
		menuI18n2.setCirculationStatusI18n("حالة الإعارة");
		menuI18n2.setDashboardI18n("لوحة المعلومات");
		menuI18n2.setLogOutI18n("تسجيل الخروج");
		menuI18n2.setMembersI18n("الأعضاء");
		menuI18n2.setMembersMenuI18n("الأعضاء");
		menuI18n2.setPublishersI18n("الناشرون");
		menuI18n2.setRequesredBooksI18n("الكتب المطلوبة");
		menuI18n2.setSettingsI18n("الإعدادات");
		menuI18n2.setTypeMembersI18n("أنواع الأعضاء");
		menuI18n2.setWeitersI18n("الكتاب");
		menuI18n2.setLangI18n("AR");
		menuI18n2.setArchivedBookI18n("الكتب المؤرشفة");
		menuI18n2.setDestroyedBookI18n("الكتب المدمرة");
		menuI18n2.setCalendarI18n("التقويم");
		menuI18n2.setExpenseI18n("المصاريف");
		menuI18n2.setIncome18n("الدخل");
		menuI18n2.setMembershipI18n("العضوية");
		menuI18n2.setPaymentI18n("الدفع");
		menuI18n2.setReportI18n("تقارير");
		menuI18n2.setBookReportI18n("تقارير الكتاب");
		menuI18n2.setMemberReportI18n("تقارير الأعضاء");
		menuI18n2.setCirculationReportI18n("تقرير الإعارة");
		menuI18n2.setAnalyticsI18n("Analytics");
		menuI18n2.setBookAnalayticsI18n("تحليلات الكتب");
		menuI18n2.setAccount18n("الحساب");
		menuI18n2.setEmailSettingsI18n("إعدادات البريد الإلكتروني");
		menuI18n2.setGeneralSettingsI18n("الإعدادات العامة");
		menuI18n2.setAccountAnalyticsI18n("تحليلات الحساب");
		menuI18n2.setSettingsI18n("الإعدادات");
		menuI18n2.setAnalyticsI18n("تحليلات");
		menuI18nRepository.save(menuI18n2);

		menuI18n4.setArchivesI18n("আর্কাইভস");
		menuI18n4.setBooksI18n("বই");
		menuI18n4.setBooksMenuI18n("বই");
		menuI18n4.setCategoriesI18n("বিভাগ");
		menuI18n4.setCirculationsI18n("ইস্যু করা বই");
		menuI18n4.setCirculationsMenuI18n("পরিচলন");
		menuI18n4.setCirculationStatusI18n("পরিচলন অবস্থা");
		menuI18n4.setDashboardI18n("ড্যাশবোর্ড");
		menuI18n4.setLogOutI18n("লগ আউট");
		menuI18n4.setMembersI18n("সদস্য");
		menuI18n4.setMembersMenuI18n("সদস্য");
		menuI18n4.setPublishersI18n("প্রকাশকরা");
		menuI18n4.setRequesredBooksI18n("অনুরোধ করা বই");
		menuI18n4.setSettingsI18n("সেটিংস");
		menuI18n4.setTypeMembersI18n("সদস্যের ধরন");
		menuI18n4.setWeitersI18n("লেখক");
		menuI18n4.setLangI18n("BN");
		menuI18n4.setArchivedBookI18n("আর্কাইভ করা বই");
		menuI18n4.setDestroyedBookI18n("ধ্বংস করা বই");
		menuI18n4.setCalendarI18n("ক্যালেন্ডার");
		menuI18n4.setExpenseI18n("ব্যয়");
		menuI18n4.setIncome18n("আয়");
		menuI18n4.setMembershipI18n("সদস্যতা");
		menuI18n4.setPaymentI18n("পেমেন্ট");
		menuI18n4.setReportI18n("রিপোর্ট");
		menuI18n4.setBookReportI18n("বুক রিপোর্ট");
		menuI18n4.setMemberReportI18n("সদস্য রিপোর্ট");
		menuI18n4.setCirculationReportI18n("সার্কুলেশন রিপোর্ট");
		menuI18n4.setAnalyticsI18n("Analytics");
		menuI18n4.setBookAnalayticsI18n("বই অ্যানালাইটিকস");
		menuI18n4.setAccount18n("অ্যাকাউন্ট");
		menuI18n4.setEmailSettingsI18n("ইমেল সেটিংস");
		menuI18n4.setGeneralSettingsI18n("সাধারণ সেটিংস");
		menuI18n4.setAccountAnalyticsI18n("অ্যাকাউন্ট অ্যানালিটিক্স");
		menuI18n4.setSettingsI18n("সেটিংস");
		menuI18n4.setAnalyticsI18n("বিশ্লেষণ");
		menuI18nRepository.save(menuI18n4);

		menuI18n3.setArchivesI18n("अभिलेखागार");
		menuI18n3.setBooksI18n("किताबें");
		menuI18n3.setBooksMenuI18n("पुस्तकें");
		menuI18n3.setCategoriesI18n("श्रेणियां");
		menuI18n3.setCirculationsI18n("जारी की गई पुस्तकें");
		menuI18n3.setCirculationsMenuI18n("परिसंचरण");
		menuI18n3.setCirculationStatusI18n("परिसंचरण स्थिति");
		menuI18n3.setDashboardI18n("डैशबोर्ड");
		menuI18n3.setLogOutI18n("लॉग आउट");
		menuI18n3.setMembersI18n("सदस्य");
		menuI18n3.setMembersMenuI18n("सदस्य");
		menuI18n3.setPublishersI18n("प्रकाशक");
		menuI18n3.setRequesredBooksI18n("अनुरोधित पुस्तकें");
		menuI18n3.setSettingsI18n("सेटिंग्स");
		menuI18n3.setTypeMembersI18n("सदस्य प्रकार");
		menuI18n3.setWeitersI18n("राइटर्स");
		menuI18n3.setLangI18n("HN");
		menuI18n3.setArchivedBookI18n("संग्रहीत पुस्तकें");
		menuI18n3.setDestroyedBookI18n("नष्ट पुस्तकें");
		menuI18n3.setCalendarI18n("कैलेंडर");
		menuI18n3.setExpenseI18n("व्यय");
		menuI18n3.setIncome18n("आय");
		menuI18n3.setMembershipI18n("सदस्यता");
		menuI18n3.setPaymentI18n("भुगतान");
		menuI18n3.setReportI18n("रिपोर्ट");
		menuI18n3.setBookReportI18n("पुस्तक रिपोर्ट");
		menuI18n3.setMemberReportI18n("सदस्य रिपोर्ट");
		menuI18n3.setCirculationReportI18n("परिसंचरण रिपोर्ट");
		menuI18n3.setAnalyticsI18n("एनालिटिक्स");
		menuI18n3.setBookAnalayticsI18n("पुस्तक विश्लेषिकी");
		menuI18n3.setAccount18n("खाता");
		menuI18n3.setEmailSettingsI18n("ईमेल सेटिंग्स");
		menuI18n3.setGeneralSettingsI18n("सामान्य सेटिंग्स");
		menuI18n3.setAccountAnalyticsI18n("खाता विश्लेषण");
		menuI18n3.setSettingsI18n("सेटिंग्स");
		menuI18n3.setAnalyticsI18n("एनालिटिक्स");
		menuI18nRepository.save(menuI18n3);

	}

}
