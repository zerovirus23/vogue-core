package co.zero.vogue.service;

import co.zero.vogue.model.Employee;
import co.zero.vogue.persistence.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

/**
 * Created by htenjo on 6/2/16.
 */
@Service
//TODO: Add basic validations to all methods (Not null, required, etc)
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository repository;

    @Override
    public Page<Employee> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee find(long id) {
        return repository.findOne(id);
    }

    @Override
    public Employee findByName(String name) {
        Employee employee = repository.findFirstByNameIgnoreCase(name);

        if(employee != null){
            return employee;
        }else{
            throw new EntityNotFoundException("Employee not found with name = " + name);
        }
    }
}
