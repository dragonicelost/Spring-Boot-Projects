package com.SpringBootPractice.Practice1.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.SpringBootPractice.Practice1.Model.Customer;

@Repository
public class SampleDao {

	public  List<Customer> getCustomerlist()
	{
		ArrayList<Customer> arr = new ArrayList<Customer>();
		Customer c = new Customer();
		arr.add(c);
		System.out.println(arr.isEmpty());
		return arr;
	}
}
