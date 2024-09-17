package com.semicolon.africa.ObiMots.repositories;
import com.semicolon.africa.ObiMots.model.AppUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUsers,Long> {
    AppUsers findAppUserByEmail(String email);
}
