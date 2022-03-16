package com.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.model.manytomany.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Long> {

}
