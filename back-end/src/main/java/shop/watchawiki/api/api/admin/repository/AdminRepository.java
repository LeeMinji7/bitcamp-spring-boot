package shop.watchawiki.api.api.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.watchawiki.api.api.admin.domain.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
