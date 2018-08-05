package com.github.stanislavnikles.springangular.persistance;

import com.github.stanislavnikles.springangular.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
