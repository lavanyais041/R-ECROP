package in.ac.sit.ecrop.service;

public class DateConvertion {

	public static java.sql.Date convertJavaDateToSqlDate(java.util.Date date)
	{
	    return new java.sql.Date(date.getTime());
	}
}
