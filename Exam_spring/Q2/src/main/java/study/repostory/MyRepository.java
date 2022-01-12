package study.repostory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import study.entity.BookEntity;

public interface MyRepository extends JpaRepository<BookEntity, Integer> {

	public List<BookEntity> findByBookName(String bname);
	public List<BookEntity> deleteByBookName(String bname);
}
