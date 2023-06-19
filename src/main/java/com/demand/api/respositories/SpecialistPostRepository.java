package com.demand.api.respositories;


import com.demand.api.model.SpecialistPostModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialistPostRepository extends JpaRepository<SpecialistPostModel, Long> {
}
