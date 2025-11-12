package com.skj_personal.cch.service.menu;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.skj_personal.cch.service.menu.dto.MenuDO;

@Mapper
public interface MenuRepository {

	Optional<MenuDO> selectOneByMenuId(long menuId);

}
