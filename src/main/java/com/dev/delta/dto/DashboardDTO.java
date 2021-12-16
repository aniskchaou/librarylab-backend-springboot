package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.DashboardRepository;

@Service
public class DashboardDTO implements DTO {

	@Autowired
	DashboardRepository dashboardRepository;

	@Override
	public void populate() {
		dashboardI18n.setBooksI18n("Books");
		dashboardI18n.setBooksNumberI18n("Books");
		dashboardI18n.setCategoriesI18n("Categories");
		dashboardI18n.setCategoriesNumberI18n("Categories");
		dashboardI18n.setIssueBookNumberI18n("Issue Books");
		dashboardI18n.setMembersNumberI18n("Members");
		dashboardI18n.setLangI18n("EN");
		dashboardI18n.setTitleI18n("Dashboard");
		dashboardRepository.save(dashboardI18n);

		dashboardI18n2.setBooksI18n("الكتب");
		dashboardI18n2.setBooksNumberI18n("الكتب");
		dashboardI18n2.setCategoriesI18n("الفئات");
		dashboardI18n2.setCategoriesNumberI18n("الفئات");
		dashboardI18n2.setIssueBookNumberI18n("إصدار الكتب");
		dashboardI18n2.setMembersNumberI18n("الأعضاء");
		dashboardI18n2.setLangI18n("AR");
		dashboardI18n2.setTitleI18n("لوحة المعلومات");
		dashboardRepository.save(dashboardI18n2);
	}

}
