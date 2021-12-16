package com.dev.delta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dev.delta.dto.ArchiveDTO;
import com.dev.delta.dto.BookDTO;
import com.dev.delta.dto.CategoryDTO;
import com.dev.delta.dto.CirculationDTO;
import com.dev.delta.dto.CirculationStatusDTO;
import com.dev.delta.dto.DashboardDTO;
import com.dev.delta.dto.MemberDTO;
import com.dev.delta.dto.MenuDTO;
import com.dev.delta.dto.PublisherDTO;
import com.dev.delta.dto.RequestedBookDTO;
import com.dev.delta.dto.SettingsDTO;
import com.dev.delta.dto.TypeMemberDTO;
import com.dev.delta.dto.WriterDTO;

@ComponentScan({ "com.dev.delta.analytics", "com.dev.delta.security", "com.dev.delta.controllers",
		"com.dev.delta.controllersi18n", "com.dev.delta.services", "com.dev.delta.dto" }) // to scan repository files
@EntityScan({ "com.dev.delta.entities", "com.dev.delta.entitiesi18n" })
@EnableJpaRepositories({ "com.dev.delta.repositories", "com.dev.delta.repositoriesi18n" })
@SpringBootApplication
public class SpringbootlibraryLabCodecanyonApplication implements CommandLineRunner {

	@Autowired
	ArchiveDTO archiveDTO;

	@Autowired
	BookDTO bookDTO;

	@Autowired
	CategoryDTO categoryDTO;

	@Autowired
	CirculationDTO circulationDTO;

	@Autowired
	CirculationStatusDTO circulationStatusDTO;

	@Autowired
	MemberDTO memberDTO;
	@Autowired
	PublisherDTO publisherDTO;
	@Autowired
	RequestedBookDTO requestedBookDTO;
	@Autowired
	TypeMemberDTO typeMemberDTO;
	@Autowired
	WriterDTO writerDTO;

	@Autowired
	SettingsDTO settingsDTO;

	@Autowired
	MenuDTO menuDTO;

	@Autowired
	DashboardDTO dashboardDTO;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootlibraryLabCodecanyonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		memberDTO.populate();
		circulationStatusDTO.populate();
		publisherDTO.populate();
		writerDTO.populate();
		typeMemberDTO.populate();

		categoryDTO.populate();
		bookDTO.populate();
		archiveDTO.populate();
		circulationDTO.populate();
		requestedBookDTO.populate();
		settingsDTO.populate();
		menuDTO.populate();
		dashboardDTO.populate();

	}

}
