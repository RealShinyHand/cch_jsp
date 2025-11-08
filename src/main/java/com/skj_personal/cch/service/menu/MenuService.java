package com.skj_personal.cch.service.menu;

import java.util.List;

import com.skj_personal.cch.service.menu.dto.MenuCategoryDO;
import com.skj_personal.cch.service.menu.dto.MenuDO;

public interface MenuService {

	/**
	 * @param menu 입력할 menu
	 * @return 적용된 행 갯수
	 * @throws Exception
	 */
	int insertOrUpdate(MenuDO menu) throws Exception;
	
	/**
	 * 
	 * @param menuId 상세 조회 메뉴 ID
	 * @return
	 * @throws Exception
	 */
	List<MenuDO> selectOne(long menuId) throws Exception;
	
	List<MenuDO> selectAll() throws Exception;
	
	/**
	 * 특정 Category ID를 가진 메뉴만 반환한다.
	 * @param categoryId
	 * @return
	 * @throws Exception
	 */
	List<MenuDO> selectByCategory(long categoryId) throws Exception;
	
	
	/**
	 * 존재하는 모든 카테고리를 반환한다.
	 * @return
	 * @throws Exception
	 */
	List<MenuCategoryDO> selectAllCategory() throws Exception;
	
	/**
	 * 카테고리 정보를 삽입 혹은 Update한다.
	 * @return
	 * @throws Exception
	 */
	List<MenuCategoryDO> InsertOrUpdate(MenuCategoryDO menuCategoryDO) throws Exception;
	
}
