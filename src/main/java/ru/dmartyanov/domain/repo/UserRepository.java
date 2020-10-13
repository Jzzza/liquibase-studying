package ru.dmartyanov.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dmartyanov.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
