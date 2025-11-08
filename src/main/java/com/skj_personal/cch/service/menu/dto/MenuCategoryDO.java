package com.skj_personal.cch.service.menu.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MenuCategoryDO {

	private long menuCategoryId;
	private String name;
	private int ordering;
}
