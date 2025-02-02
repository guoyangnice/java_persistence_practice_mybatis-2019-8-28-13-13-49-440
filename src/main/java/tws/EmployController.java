package tws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployController {
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void addEmployee(@RequestBody EmployeeBean employeeBean) {
		employeeMapper.insertUser(employeeBean);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<EmployeeBean> getEmployees() {
		return employeeMapper.getEmployees();
	}
}
