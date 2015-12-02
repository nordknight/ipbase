package dao;

import java.sql.SQLException;

public interface IComputerDao {
	public void createComputer() throws SQLException;
	public void readComputer() throws SQLException;
	public void updateComputer() throws SQLException;
	public void deleteComputer() throws SQLException;
	
}
