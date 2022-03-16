package com.hibernate.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.model.manytomany.Student;

public interface StudentInterface extends JpaRepository<Student, Long> {
/*List<Student> findByName(String name);
List<Student> findByGrade(String grade);
List<Student> findByGradeAndName(String grade,String name);
*/
//Optional<Student> findById(long id); // retourne un seule étudiant
// Optional => soit une instance soit null
}
