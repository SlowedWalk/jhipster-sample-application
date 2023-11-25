package tech.hidetora.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.hidetora.app.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
