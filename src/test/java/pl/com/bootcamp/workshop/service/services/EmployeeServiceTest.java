package pl.com.bootcamp.workshop.service.services;

import pl.com.bootcamp.workshop.service.employee.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Raynor on 2017-07-04.
 */
public class EmployeeServiceTest {

    private EmployeeService employeeService;


    @Test
    public void shouldReturnAllWorkers()throws Exception{
        //given
        List<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(new Employee("Wacuś")));
        //when
        List<Employee> expectedList = employeeService.findAll(employeeList);
        //then
        assertEquals(expectedList, employeeList);
    }

    @Test
    public void shouldAddNewWorker()throws Exception{

    }

    @Test
    public void shouldFindWorkerById()throws Exception{

    }

    @Test
    public void shouldEditWorker()throws Exception{

    }

}