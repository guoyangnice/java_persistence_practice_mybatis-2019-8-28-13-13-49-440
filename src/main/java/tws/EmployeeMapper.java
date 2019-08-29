package tws;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {
	@Insert("Insert into employee(id,name,age) values(#{id},#{name},#{age})")
	void insertUser(EmployeeBean employeeBean);
	
	@Select("select * from employee")
	List<EmployeeBean> getEmployees();
}
