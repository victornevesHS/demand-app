package com.demand.api.respositories;

import com.demand.api.model.CustomerPostModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerPostRepository extends JpaRepository<CustomerPostModel, Long> {

}
