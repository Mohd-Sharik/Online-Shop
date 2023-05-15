package com.onlineShop.example.shopPersistance;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.onlineShop.example.shopDao.ShopTbOsUserDao;
import com.onlineShop.example.shopEntity.TbOsUserEntity;

@Component
@Transactional(readOnly = true)
public class TbOsUSerPersistance {
	
	@Autowired
	private ShopTbOsUserDao userDao;
	
	
	public Optional<TbOsUserEntity> findById(Long id)
	{
		return userDao.findById(id);
	}
	
	
	//save the record of user in the table
	@Transactional
	public TbOsUserEntity save(TbOsUserEntity entity)
	{
		return userDao.save(entity);
	}
	
	
	//count page of User's
	public Long count(Specification<TbOsUserEntity> speci)
	{
		return userDao.count(speci);
	}
	
	//getting list by Page's
	public List<TbOsUserEntity> findAll(Specification<TbOsUserEntity> speci, Pageable page)
	{
		return userDao.findAll(speci, page).getContent();
	}
	
	//getting List of User
	public List<TbOsUserEntity> findAll()
	{
		return userDao.findAll();
	}
	
	public Optional<TbOsUserEntity> findByRefId(String refId)
	{
		return userDao.findByRefId(refId);
	}

}
