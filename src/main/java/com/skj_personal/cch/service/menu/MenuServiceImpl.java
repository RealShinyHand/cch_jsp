package com.skj_personal.cch.service.menu;

import java.util.List;

import com.skj_personal.cch.service.menu.dto.MenuCategoryDO;
import com.skj_personal.cch.service.menu.dto.MenuDO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{

	private final MenuRepository menuRepo;
	
	@Override
	public int insertOrUpdate(MenuDO menu) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MenuDO> selectOne(long menuId) throws Exception {
		// TODO Auto-generated method stub
		
		menuRepo.selectOneByMenuId(menuId);
		
		return null;
	}

	@Override
	public List<MenuDO> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MenuDO> selectByCategory(long categoryId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MenuCategoryDO> selectAllCategory() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MenuCategoryDO> InsertOrUpdate(MenuCategoryDO menuCategoryDO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
