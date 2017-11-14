package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pojo.product;

import dao.productMapper;

@Service("psi")
public class productServiceimpl implements productService{
	@Autowired
	productMapper pm;

	public productMapper getPm() {
		return pm;
	}

	public void setPm(productMapper pm) {
		this.pm = pm;
	}

	@Override
	public List<product> getAll(int begin, int size) {
		// TODO Auto-generated method stub
		return pm.getAll(begin, size);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return pm.count();
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return pm.del(id);
	}

	@Override
	public int add(product p) {
		// TODO Auto-generated method stub
		return pm.add(p);
	}
	
}
