package com.dev.delta.controllersi18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.delta.entitiesi18n.BookI18n;
import com.dev.delta.entitiesi18n.CategoryI18n;
import com.dev.delta.entitiesi18n.CirculationI18n;
import com.dev.delta.entitiesi18n.CirculationStatusI18n;
import com.dev.delta.entitiesi18n.DashboardI18n;
import com.dev.delta.entitiesi18n.MemberI18n;
import com.dev.delta.entitiesi18n.MenuI18n;
import com.dev.delta.entitiesi18n.PublisherI18n;
import com.dev.delta.entitiesi18n.RequestedBookI18n;
import com.dev.delta.entitiesi18n.SettingsI18n;
import com.dev.delta.entitiesi18n.TypeMemberI18n;
import com.dev.delta.entitiesi18n.WriterI18n;
import com.dev.delta.repositories.DashboardRepository;
import com.dev.delta.repositoriesi18n.BookI18nRepository;
import com.dev.delta.repositoriesi18n.CategoryI18nRepository;
import com.dev.delta.repositoriesi18n.CirculationI18nRepository;
import com.dev.delta.repositoriesi18n.CirculationStatusI18nRepository;
import com.dev.delta.repositoriesi18n.MemberI18nRepository;
import com.dev.delta.repositoriesi18n.MenuI18nRepository;
import com.dev.delta.repositoriesi18n.PublisherI18nRepository;
import com.dev.delta.repositoriesi18n.RequestedBookI18nRepository;
import com.dev.delta.repositoriesi18n.SettingsI18nRepository;
import com.dev.delta.repositoriesi18n.TypeMemberI18nRepository;
import com.dev.delta.repositoriesi18n.WriterI18nRepository;

@RestController
@RequestMapping("i18n")
@CrossOrigin
public class LanguageI18nController {

	@Autowired
	CategoryI18nRepository categoryI18nRepository;

	@Autowired
	BookI18nRepository bookI18nRepository;

	@Autowired
	CirculationStatusI18nRepository circulationStatusI18nRepository;

	@Autowired
	CirculationI18nRepository circulationI18nRepository;

	@Autowired
	MemberI18nRepository memberI18nRepository;

	@Autowired
	PublisherI18nRepository publisherI18nRepository;

	@Autowired
	SettingsI18nRepository settingsI18nRepository;

	@Autowired
	RequestedBookI18nRepository requestedBookI18nRepository;

	@Autowired
	TypeMemberI18nRepository typeMemberI18nRepository;

	@Autowired
	WriterI18nRepository writerI18nRepository;

	@Autowired
	RequestedBookI18nRepository requestedBookI18nRepository2;

	@Autowired
	MenuI18nRepository menuI18nRepository;

	@Autowired
	DashboardRepository dashboardRepository;

	@GetMapping("/dashboard/{lang}")
	public ResponseEntity<DashboardI18n> getDashboard(@PathVariable String lang) {
		DashboardI18n dashboardI18n = dashboardRepository.findByLangI18n(lang);
		return new ResponseEntity<DashboardI18n>(dashboardI18n, HttpStatus.OK);
	}

	@GetMapping("/menu/{lang}")
	public ResponseEntity<MenuI18n> getMenu(@PathVariable String lang) {
		MenuI18n menuI18n = menuI18nRepository.findByLangI18n(lang);
		return new ResponseEntity<MenuI18n>(menuI18n, HttpStatus.OK);
	}

	@GetMapping("/requestedbook/{lang}")
	public ResponseEntity<RequestedBookI18n> getRequestedBookByLang(@PathVariable String lang) {
		RequestedBookI18n requestedBookI18n = requestedBookI18nRepository2.findByLangI18n(lang);
		return new ResponseEntity<RequestedBookI18n>(requestedBookI18n, HttpStatus.OK);
	}

	@GetMapping("/category/{lang}")
	public ResponseEntity<CategoryI18n> getcategoryByLang(@PathVariable String lang) {
		CategoryI18n categoryI18n = categoryI18nRepository.findByLangI18n(lang);
		return new ResponseEntity<CategoryI18n>(categoryI18n, HttpStatus.OK);
	}

	@GetMapping("/book/{lang}")
	public ResponseEntity<BookI18n> getbookByLang(@PathVariable String lang) {
		BookI18n bookI18n = bookI18nRepository.findByLangI18n(lang);
		return new ResponseEntity<BookI18n>(bookI18n, HttpStatus.OK);
	}

	@GetMapping("/circulation/{lang}")
	public ResponseEntity<CirculationI18n> getCirculationByLang(@PathVariable String lang) {
		CirculationI18n circulationI18n = circulationI18nRepository.findByLangI18n(lang);
		return new ResponseEntity<CirculationI18n>(circulationI18n, HttpStatus.OK);
	}

	@GetMapping("/circulationstatus/{lang}")
	public ResponseEntity<CirculationStatusI18n> getCirculationStatusByLang(@PathVariable String lang) {
		CirculationStatusI18n circulationStatusI18n = circulationStatusI18nRepository.findByLangI18n(lang);
		return new ResponseEntity<CirculationStatusI18n>(circulationStatusI18n, HttpStatus.OK);
	}

	@GetMapping("/member/{lang}")
	public ResponseEntity<MemberI18n> getMemberByLang(@PathVariable String lang) {
		MemberI18n memberI18n = memberI18nRepository.findByLangI18n(lang);
		return new ResponseEntity<MemberI18n>(memberI18n, HttpStatus.OK);
	}

	@GetMapping("/publisher/{lang}")
	public ResponseEntity<PublisherI18n> getPublisherByLang(@PathVariable String lang) {
		PublisherI18n publisherI18n = publisherI18nRepository.findByLangI18n(lang);
		return new ResponseEntity<PublisherI18n>(publisherI18n, HttpStatus.OK);
	}

	@GetMapping("/settings/{lang}")
	public ResponseEntity<SettingsI18n> getSettingsByLang(@PathVariable String lang) {
		SettingsI18n settingsI18n = settingsI18nRepository.findByLangI18n(lang);
		return new ResponseEntity<SettingsI18n>(settingsI18n, HttpStatus.OK);
	}

	@GetMapping("/typemember/{lang}")
	public ResponseEntity<TypeMemberI18n> getTypeMemberyLang(@PathVariable String lang) {
		TypeMemberI18n typeMemberI18n = typeMemberI18nRepository.findByLangI18n(lang);
		return new ResponseEntity<TypeMemberI18n>(typeMemberI18n, HttpStatus.OK);
	}

	@GetMapping("/writer/{lang}")
	public ResponseEntity<WriterI18n> getWriterByLang(@PathVariable String lang) {
		WriterI18n writerI18n = writerI18nRepository.findByLangI18n(lang);
		return new ResponseEntity<WriterI18n>(writerI18n, HttpStatus.OK);
	}
}
