package com.myproject.repository;

import com.myproject.entity.MyCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyCarRepository extends JpaRepository<MyCar,Long> {
}
