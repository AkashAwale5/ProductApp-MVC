package com.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.product.model.Product;

@Repository
public class ProductDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void saveUser(Product product)
	{	
		this.hibernateTemplate.saveOrUpdate(product);
//		return id;		
	}
	
	//getall
	public List<Product> getAll()
	{
		return this.hibernateTemplate.loadAll(Product.class);
	}
	//delete
	@Transactional
	public void deleteSingle(int pid)
	{
		Product p = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
	}
	//single
	public Product getSingle(int pid)
	{
//		Product load = this.hibernateTemplate.load(Product.class, pid);
		Product product = hibernateTemplate.get(Product.class, pid);
		
		return product;
	}
}
