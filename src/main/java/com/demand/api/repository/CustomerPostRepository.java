package com.demand.api.repository;

import com.demand.api.entity.CustomerPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerPostRepository extends JpaRepository<CustomerPostEntity, Long> {

}
