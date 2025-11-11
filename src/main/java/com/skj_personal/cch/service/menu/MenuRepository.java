package com.skj_personal.cch.service.menu;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface MenuRepository {

	void selectOneByMenuId(long menuId);

}
