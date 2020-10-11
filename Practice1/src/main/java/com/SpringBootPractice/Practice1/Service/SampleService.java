package com.SpringBootPractice.Practice1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootPractice.Practice1.Dao.SampleDao;
import com.SpringBootPractice.Practice1.Model.Customer;

@Service
public class SampleService {
	
	@Autowired
	private SampleDao dao;
	public  List<Customer> getCustomerList()
	{
		
		List<Customer> l = dao.getCustomerlist();
		if(!l.isEmpty())
		{
			return dao.getCustomerlist();
		}
		return null;
	}

}
