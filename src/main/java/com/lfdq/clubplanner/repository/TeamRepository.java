package com.lfdq.clubplanner.repository;

import com.lfdq.clubplanner.domain.Team;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Team entity.
 */
@SuppressWarnings("unused")
public interface TeamRepository extends JpaRepository<Team,Long> {

}
