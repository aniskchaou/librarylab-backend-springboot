package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.CategoryBookRepository;
import com.dev.delta.repositoriesi18n.CategoryI18nRepository;

/**
 * CategoryDTO
 * 
 * @author Admin
 *
 */
@Service
public class CategoryDTO implements DTO {

	@Autowired
	CategoryBookRepository categoryBookRepository;

	@Autowired
	CategoryI18nRepository categoryI18nRepository;

	@Override
	public void populate() {
		category.setCategory_name(faker.book().genre());
		categoryBookRepository.save(category);
		category1.setCategory_name(faker.book().genre());
		categoryBookRepository.save(category1);
		category2.setCategory_name(faker.book().genre());
		categoryBookRepository.save(category2);
		category3.setCategory_name(faker.book().genre());
		categoryBookRepository.save(category3);

		categoryI18n.setCategory_nameI18n("Category ");
		categoryI18n.setLangI18n("EN");
		categoryI18n.setAddButtonI18n("Create");
		categoryI18n.setAddTitleI18n("Create Category");
		categoryI18n.setAllTitleI18n("Categories");
		categoryI18n.setCloseButtonI18n("Close");
		categoryI18n.setEditButtonI18n("Edit");
		categoryI18n.setEditTitleI18n("Edit Category");
		categoryI18n.setReloadI18n("Reload");
		categoryI18n.setAnalyticsI18n("Analytics");

		categoryI18nRepository.save(categoryI18n);

		categoryI18n3.setCategory_nameI18n("বিভাগ");
		categoryI18n3.setLangI18n("BN");
		categoryI18n3.setAddButtonI18n("তৈরি করুন");
		categoryI18n3.setAddTitleI18n("বিভাগ তৈরি করুন");
		categoryI18n3.setAllTitleI18n("বিভাগ");
		categoryI18n3.setCloseButtonI18n("বন্ধ");
		categoryI18n3.setEditButtonI18n("সম্পাদনা");
		categoryI18n3.setEditTitleI18n("বিভাগ সম্পাদনা করুন");
		categoryI18n3.setReloadI18n("পুনরায় লোড করুন");
		categoryI18n3.setAnalyticsI18n("বিশ্লেষণ");
		categoryI18nRepository.save(categoryI18n3);

		categoryI18n4.setCategory_nameI18n("श्रेणी");
		categoryI18n4.setLangI18n("HN");
		categoryI18n4.setAddButtonI18n("बनाएं");
		categoryI18n4.setAddTitleI18n("श्रेणी बनाएं");
		categoryI18n4.setAllTitleI18n("श्रेणियां");
		categoryI18n4.setCloseButtonI18n("बंद करें");
		categoryI18n4.setEditButtonI18n("संपादित करें");
		categoryI18n4.setEditTitleI18n("श्रेणी संपादित करें");
		categoryI18n4.setReloadI18n("पुनः लोड करें");
		categoryI18n4.setAnalyticsI18n("एनालिटिक्स");
		categoryI18nRepository.save(categoryI18n4);

		categoryI18n2.setCategory_nameI18n("الفئة");
		categoryI18n2.setLangI18n("AR");
		categoryI18n2.setAddButtonI18n("إنشاء");
		categoryI18n2.setAddTitleI18n("إنشاء فئة");
		categoryI18n2.setAllTitleI18n("الفئات");
		categoryI18n2.setCloseButtonI18n("إغلاق");
		categoryI18n2.setEditButtonI18n("تحرير");
		categoryI18n2.setEditTitleI18n("تحرير الفئة");
		categoryI18n2.setReloadI18n("إعادة تحميل");
		categoryI18n2.setAnalyticsI18n("تحليلات");
		categoryI18nRepository.save(categoryI18n2);

	}

}
