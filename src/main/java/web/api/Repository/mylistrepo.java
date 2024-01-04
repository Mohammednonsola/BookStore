package web.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import web.api.Entity.addEntity;

public interface mylistrepo extends JpaRepository<addEntity, Long> {

}
