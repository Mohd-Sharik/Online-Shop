package com.onlineShop.example.shopPersistance;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.onlineShop.example.shopDao.ShopTbOsDbErrDao;
import com.onlineShop.example.shopEntity.TbOsDbErrEntity;

@Component
@Transactional(readOnly = true)
public class TbOsDbErrPersistance {
	
	@Autowired
	private ShopTbOsDbErrDao shopTbOsDbErrDao;
	
	// getting an list of all DdErr
	public List<TbOsDbErrEntity> findAll(Specification<TbOsDbErrEntity> speci, Pageable page)
	{
		return shopTbOsDbErrDao.findAll(speci, page).getContent();
	}
	
	
	//count all record that available int BdErr Table
	public Long count(Specification<TbOsDbErrEntity> speci)
	{
		return shopTbOsDbErrDao.count(speci);
	}
	
	@Transactional
	public TbOsDbErrEntity save(TbOsDbErrEntity entity)
	{
		return shopTbOsDbErrDao.save(entity);
	}

}
