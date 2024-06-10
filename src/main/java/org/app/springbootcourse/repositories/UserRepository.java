package org.app.springbootcourse.repositories;


import org.app.springbootcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
