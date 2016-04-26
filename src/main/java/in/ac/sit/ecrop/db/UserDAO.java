package in.ac.sit.ecrop.db;

import in.ac.sit.ecrop.model.Cultivator;
import in.ac.sit.ecrop.model.User;

import java.util.List;


public interface UserDAO {
	
	public String findUser(User u);
	
	public List<Cultivator> searchCultivator(int id);

}
