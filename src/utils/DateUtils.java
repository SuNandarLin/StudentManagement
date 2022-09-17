package utils;

import java.text.SimpleDateFormat;

import java.util.Date;

public class DateUtils {
	public  String FORMAT="YYYY-MM-DD";
	public  SimpleDateFormat SDF=new SimpleDateFormat(FORMAT);
	public String convertDateToString(Date d){
		return SDF.format(d);
	}
	public Date convertStringToDate(String str){
		try{
			return SDF.parse(str);
		}catch(Exception e){}
		return null;
	}	
}
