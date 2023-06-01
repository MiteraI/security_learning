package srsec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import srsec.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
