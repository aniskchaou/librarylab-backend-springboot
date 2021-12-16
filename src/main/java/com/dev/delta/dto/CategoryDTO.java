package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.CategoryBookRepository;
import com.dev.delta.repositoriesi18n.CategoryI18nRepository;

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
		categoryI18nRepository.save(categoryI18n);

		categoryI18n2.setCategory_nameI18n("الفئة");
		categoryI18n2.setLangI18n("AR");
		categoryI18n2.setAddButtonI18n("إنشاء");
		categoryI18n2.setAddTitleI18n("إنشاء فئة");
		categoryI18n2.setAllTitleI18n("الفئات");
		categoryI18n2.setCloseButtonI18n("إغلاق");
		categoryI18n2.setEditButtonI18n("تحرير");
		categoryI18n2.setEditTitleI18n("تحرير الفئة");
		categoryI18nRepository.save(categoryI18n2);

	}

}
