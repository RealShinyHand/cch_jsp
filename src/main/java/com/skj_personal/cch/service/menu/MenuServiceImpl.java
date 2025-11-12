package com.skj_personal.cch.service.menu;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import com.skj_personal.cch.service.menu.dto.MenuCategoryDO;
import com.skj_personal.cch.service.menu.dto.MenuDO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{

	private final SqlSessionFactory sqlSessionFactory;
	private final MenuRepository menuRepo;
	
	@Override
	public int insertOrUpdate(MenuDO menu) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MenuDO selectOne(long menuId) throws Exception {
		// TODO Auto-generated method stub
		
		for (String name : sqlSessionFactory.getConfiguration().getMappedStatementNames()) {
	        System.out.println("Mapped: " + name);
	    }
		
		var result = menuRepo.selectOneByMenuId(menuId);
		
		var returnValue = result.orElseThrow();
		
		return returnValue ;
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
