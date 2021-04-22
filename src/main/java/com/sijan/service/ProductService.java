package com.sijan.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sijan.mapper.ProductMapper;
import com.sijan.model.Product;
import com.sijan.util.MyBatisUtil;

public class ProductService {
	
	public void insertProduct(Product product) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		productMapper.insertProduct(product);
		sqlSession.commit();
		sqlSession.close();
	}
	
	public List<Product> getAllProducts(){
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> products = productMapper.getAllProducts();
		sqlSession.close();
		return products;
	}
}
