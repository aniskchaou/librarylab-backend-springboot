package com.dev.delta.dto;

import com.dev.delta.entities.Archive;
import com.dev.delta.entities.Book;
import com.dev.delta.entities.Category;
import com.dev.delta.entities.Circulation;
import com.dev.delta.entities.CirculationStatus;
import com.dev.delta.entities.EBook;
import com.dev.delta.entities.Member;
import com.dev.delta.entities.Publisher;
import com.dev.delta.entities.RequestedBook;
import com.dev.delta.entities.Settings;
import com.dev.delta.entities.Tag;
import com.dev.delta.entities.TypeMember;
import com.dev.delta.entities.Wastage;
import com.dev.delta.entities.Writer;
import com.dev.delta.entitiesi18n.BookI18n;
import com.dev.delta.entitiesi18n.CategoryI18n;
import com.dev.delta.entitiesi18n.CirculationI18n;
import com.dev.delta.entitiesi18n.CirculationStatusI18n;
import com.dev.delta.entitiesi18n.DashboardI18n;
import com.dev.delta.entitiesi18n.EBookI18n;
import com.dev.delta.entitiesi18n.MemberI18n;
import com.dev.delta.entitiesi18n.MenuI18n;
import com.dev.delta.entitiesi18n.PublisherI18n;
import com.dev.delta.entitiesi18n.RequestedBookI18n;
import com.dev.delta.entitiesi18n.SearchI18n;
import com.dev.delta.entitiesi18n.SettingsI18n;
import com.dev.delta.entitiesi18n.TypeMemberI18n;
import com.dev.delta.entitiesi18n.WriterI18n;
import com.github.javafaker.Faker;

public interface DTO {

	public Faker faker = new Faker();
	public Archive archive = new Archive();
	public Book book = new Book();
	public Book book1 = new Book();
	public Book book2 = new Book();
	public Book book3 = new Book();
	public Book book4 = new Book();
	public Book book5 = new Book();
	public Book book6 = new Book();
	public Book book7 = new Book();
	public Category category = new Category();
	public Category category1 = new Category();
	public Category category2 = new Category();
	public Category category3 = new Category();
	public Circulation circulation = new Circulation();
	public Circulation circulation2 = new Circulation();
	public Circulation circulation3 = new Circulation();
	public Circulation circulation4 = new Circulation();
	public Circulation circulation5 = new Circulation();
	public Circulation circulation6 = new Circulation();
	public CirculationStatus circulationStatus = new CirculationStatus();
	public CirculationStatus circulationStatus2 = new CirculationStatus();
	public EBook eBook = new EBook();
	public Member member = new Member();
	public Publisher publisher = new Publisher();
	public RequestedBook requestedBook = new RequestedBook();
	public Tag tag = new Tag();
	public TypeMember typeMember = new TypeMember();
	public Wastage wastage = new Wastage();
	public Writer writer = new Writer();
	public Settings settings = new Settings();

	// EN
	public BookI18n bookI18n = new BookI18n();
	public CategoryI18n categoryI18n = new CategoryI18n();
	public CirculationI18n circulationI18n = new CirculationI18n();
	public CirculationStatusI18n circulationStatusI18n = new CirculationStatusI18n();
	public EBookI18n eBookI18n = new EBookI18n();
	public MemberI18n memberI18n = new MemberI18n();
	public PublisherI18n publisherI18n = new PublisherI18n();
	public RequestedBookI18n requestedBookI18n = new RequestedBookI18n();
	public TypeMemberI18n typeMemberI18n = new TypeMemberI18n();
	public WriterI18n writerI18n = new WriterI18n();
	public SettingsI18n settingsI18n = new SettingsI18n();
	public MenuI18n menuI18n = new MenuI18n();
	public DashboardI18n dashboardI18n = new DashboardI18n();

	// AR
	public BookI18n bookI18n2 = new BookI18n();
	public CategoryI18n categoryI18n2 = new CategoryI18n();
	public CirculationI18n circulationI18n2 = new CirculationI18n();
	public CirculationStatusI18n circulationStatusI18n2 = new CirculationStatusI18n();
	public EBookI18n eBookI18n2 = new EBookI18n();
	public MemberI18n memberI18n2 = new MemberI18n();
	public PublisherI18n publisherI18n2 = new PublisherI18n();
	public RequestedBookI18n requestBookI18n2 = new RequestedBookI18n();;
	public TypeMemberI18n typeMemberI18n2 = new TypeMemberI18n();
	public WriterI18n writerI18n2 = new WriterI18n();
	public SettingsI18n settingsI18n2 = new SettingsI18n();
	public MenuI18n menuI18n2 = new MenuI18n();
	public DashboardI18n dashboardI18n2 = new DashboardI18n();
	public SearchI18n searchI18n = new SearchI18n();
	public SearchI18n searchI18n2 = new SearchI18n();

	// HN
	public BookI18n bookI18n3 = new BookI18n();
	public CategoryI18n categoryI18n3 = new CategoryI18n();
	public CirculationI18n circulationI18n3 = new CirculationI18n();
	public CirculationStatusI18n circulationStatusI18n3 = new CirculationStatusI18n();
	public EBookI18n eBookI18n3 = new EBookI18n();
	public MemberI18n memberI18n3 = new MemberI18n();
	public PublisherI18n publisherI18n3 = new PublisherI18n();
	public RequestedBookI18n requestedBookI18n3 = new RequestedBookI18n();
	public TypeMemberI18n typeMemberI18n3 = new TypeMemberI18n();
	public WriterI18n writerI18n3 = new WriterI18n();
	public SettingsI18n settingsI18n3 = new SettingsI18n();
	public MenuI18n menuI18n3 = new MenuI18n();
	public DashboardI18n dashboardI18n3 = new DashboardI18n();
	public SearchI18n searchI18n3 = new SearchI18n();

	// BN
	public BookI18n bookI18n4 = new BookI18n();
	public CategoryI18n categoryI18n4 = new CategoryI18n();
	public CirculationI18n circulationI18n4 = new CirculationI18n();
	public CirculationStatusI18n circulationStatusI18n4 = new CirculationStatusI18n();
	public EBookI18n eBookI18n4 = new EBookI18n();
	public MemberI18n memberI18n4 = new MemberI18n();
	public PublisherI18n publisherI18n4 = new PublisherI18n();
	public RequestedBookI18n requestBookI18n4 = new RequestedBookI18n();
	public TypeMemberI18n typeMemberI18n4 = new TypeMemberI18n();
	public WriterI18n writerI18n4 = new WriterI18n();
	public SettingsI18n settingsI18n4 = new SettingsI18n();
	public MenuI18n menuI18n4 = new MenuI18n();
	public DashboardI18n dashboardI18n4 = new DashboardI18n();
	public SearchI18n searchI18n4 = new SearchI18n();

	public void populate();
}
