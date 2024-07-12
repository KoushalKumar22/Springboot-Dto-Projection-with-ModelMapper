package com.example.ProjectionMapper.Repository;

import com.example.ProjectionMapper.DTO.EmployeeDto;
import com.example.ProjectionMapper.DTO.SearchDto;
import com.example.ProjectionMapper.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query("select new com.example.ProjectionMapper.DTO.SearchDto(a.id,a.fname,a.lname) from Employee a where a.id= :id")
    List<SearchDto> getById(@Param("id") int id);

    ///@Query("select new com.example.ProjectionMapper.DTO.EmployeeDto(a.id,a.fname,a.lname) from employee a where a.fname= :fname")
    //    EmployeeDto getByFname(String fname);
}
