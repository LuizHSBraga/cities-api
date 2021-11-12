package com.github.lhsb.citiesapi.states.repository;

import com.github.lhsb.citiesapi.states.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
