package com.cecilio0.parcialwebbackend.baseclass;

import com.cecilio0.parcialwebbackend.baseclass.model.BaseClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBaseClassRepository extends JpaRepository<BaseClass, Long> {
}
