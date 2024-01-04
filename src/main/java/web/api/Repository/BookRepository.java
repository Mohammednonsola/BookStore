package web.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import web.api.Entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
