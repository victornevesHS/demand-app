package com.demand.api.respositories;

import com.demand.api.model.SpecialtyPostModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialtyPostRepository extends JpaRepository<SpecialtyPostModel, Long> {
}
