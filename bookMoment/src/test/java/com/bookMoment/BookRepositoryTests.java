package com.bookMoment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookMoment.bookDatabase.domain.Book;
import com.bookMoment.bookDatabase.repository.BookRepository;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class BookRepositoryTests {
	@Setter(onMethod_ = @Autowired)
	private BookRepository bookRepository;

	//책 등록 - save() : 주어진 엔티티를 저장
	@Test
	public void bookSaveTest() {
		Book book1 = new Book();
		book1.setBookName("죄와벌");
		book1.setGene("소설");
		book1.setPage(717);
		book1.setPrice(27000);
		book1.setPublicationYear("2018년");
		book1.setPublisher("열린책들");
		log.info("##### Book 테이블에 첫번째 데이터 입력 #####");
		bookRepository.save(book1);
	}

}