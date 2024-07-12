package com.example.ProjectionMapper.Controller;

import com.example.ProjectionMapper.Configration.EmployeeConfiguration;
import com.example.ProjectionMapper.DTO.EmployeeDto;
import com.example.ProjectionMapper.DTO.SearchDto;
import com.example.ProjectionMapper.Entity.Employee;
import com.example.ProjectionMapper.Repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository erepo;
    @Autowired
    ModelMapper econfi;

    @GetMapping("/test")
    public String test(){
        return "This Is A Test Run";
    }

    @PostMapping("/save")
    public EmployeeDto save(@RequestBody EmployeeDto employeeDto){
        Employee e= new Employee();
        econfi.map(employeeDto, e);
        erepo.save(e);
        return employeeDto;
    }

    @GetMapping("/all")
    public List<EmployeeDto> findAll(){
        return erepo.findAll()
                .stream()
                .map(employee -> econfi.map(employee, EmployeeDto.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/id/{id}")
    public List<SearchDto> findById(@PathVariable int id){
        return erepo.getById(id);
    }
}
