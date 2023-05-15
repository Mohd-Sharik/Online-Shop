package com.onlineShop.example.shopDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.onlineShop.example.shopEntity.TbOsDbErrEntity;

@Repository
public interface ShopTbOsDbErrDao extends JpaSpecificationExecutor<TbOsDbErrEntity>, JpaRepository<TbOsDbErrEntity, Long> {

}
