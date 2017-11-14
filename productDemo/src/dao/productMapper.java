package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.product;

public interface productMapper {
	public List<product> getAll(@Param("b")int begin,@Param("s")int size);
	
	public int count();
	
	public int del(@Param("id")int id);
	
	public int add(product p);
}
