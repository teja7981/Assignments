package hibernate.hibernate.cap;

import java.util.List;

import hibernate.dao.RegisterDao;
import hibernate.dto.userDto;
import hibernate.user.entity.User;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
        User registration = new User();
       registration.setId(125L);
        registration.setUserName("amith");
        registration.setPassword("passwroed");
        registration.setEmail("amith@gmail.com");
        registration.setMobileNumber("134567");
        
        RegisterDao registerDao = new RegisterDao();
        registerDao.saveUser(registration);
       
       User user = registerDao.getUserById(124L);
        System.out.println(user);
        
        		userDto userDto = new userDto();
        		userDto.setUserName("ravi t");
        		userDto.setPassword("pwd@123");
        		userDto.setMobileNumber("1234567890");
        		userDto.setEmail("rt@outlook.com");
        		
        		registerDao.updateUserDetailsById(124L, userDto);
        		 
        
       // RegisterHqlDao hqlDao = new RegisterHqlDao();
        /*
        List<UserRegistration> list = hqlDao.getUsers();
        list.forEach( user ->{
        		System.out.println(user);
        });
        */
        /*
        UserRegistration userRegistration = hqlDao.getUserByEmail("rt@outlook.com");
        System.out.println(userRegistration);
        */
       // hqlDao.updateMobileNumberById("8951606106", 124L);
       // hqlDao.deleteUserById(125L);
        
        		
}
}

