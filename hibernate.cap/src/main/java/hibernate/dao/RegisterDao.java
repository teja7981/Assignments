package hibernate.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.dto.userDto;
import hibernate.user.entity.User;

public class RegisterDao {

	
	public void saveUser(User user) {
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(User.class);
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
	}
	
	//Create a method which takes id as input and returns the object
	
	public User getUserById(Long id) {
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			return session.get(User.class, id);
	}
	
	public void updateUserDetailsById(Long id, userDto userDto) {
		User userRegistration = getUserById(id);
		if(userRegistration != null) {
			//userDto.getEmail() != null ? userRegistration.setEmail(userDto.getEmail()) :'';
			userRegistration.setMobileNumber(userDto.getMobileNumber());
			userRegistration.setPassword(userDto.getPassword());
			userRegistration.setEmail(userDto.getEmail());
			userRegistration.setUserName(userDto.getUserName());
				
				Configuration cfg = new Configuration();
				cfg.configure();
				SessionFactory sessionFactory = cfg.buildSessionFactory();
				Session session = sessionFactory.openSession();
				Transaction tx = session.beginTransaction();
				session.update(userRegistration);
				tx.commit();
		}else {
			System.out.println("There is no rescord exists for a id : "+ id);
		}
	}
}
