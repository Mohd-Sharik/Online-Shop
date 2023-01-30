package com.jpa.test.ShopDao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.jpa.test.shopEntity.TbOsUserEntity;

@Repository
public interface ShopTbOsUserDao extends JpaSpecificationExecutor<TbOsUserEntity>, JpaRepository<TbOsUserEntity, Long> {

	Optional<TbOsUserEntity> findByRefId(String refId);
	
}
