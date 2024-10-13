package com.project.repository;

import com.project.model.CurrentUserSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface CurrentUserSessionDao extends JpaRepository<CurrentUserSession, Integer> {

    public Optional<CurrentUserSession> findById(Integer userId);

    public CurrentUserSession findByUniqueId(String uniqueId);

    @Query("select c.Id from CurrentUserSession c where c.UserId=?1")
    public String findByUserId(Integer userId);


}
