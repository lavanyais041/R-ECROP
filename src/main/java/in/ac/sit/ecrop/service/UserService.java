package in.ac.sit.ecrop.service;

import in.ac.sit.ecrop.db.UserDAO;
import in.ac.sit.ecrop.model.Cultivator;
import in.ac.sit.ecrop.model.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	@Autowired
	  UserDAO dao;
	
	public String findUser(User u)
	{
		return dao.findUser(u);
	}
	
	public List<Cultivator> searchCultivator(int id)
	{
		return dao.searchCultivator(id);
	}

	public List<Cultivator> searchCulticator(int cultivator_id)
	{
		return dao.searchCultivator(cultivator_id);
	}

}
