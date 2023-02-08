package com.CRUD.demo.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.CRUD.demo.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	@Transactional
	@Modifying
	@Query("delete from Student s where studID=:id")
	Integer deleteByID(@Param("id") Integer id);
}
