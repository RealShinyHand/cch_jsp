package com.skj_personal.cch.service.menu.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class MenuDO {

	private long menuId;
	private long menuCategoryId;
	private String name;
	private String price;
	private String desc;
	private int ordering;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	/***
	 * @param name 등록될 메뉴 이름(필수)
	 * @return 빌더 객체
	 */
	public Builder builder(String name) {
		Builder temp = new Builder();
		temp.target.name = name;
		return temp;
	}
	
	
	public static class Builder{
		MenuDO target = null;
		
		public Builder() {
			target = new MenuDO();
		}
		
		public Builder menuCategoryId(long menuCategoryId) {
			target.setMenuCategoryId(menuCategoryId); 
			return this;
		}
		
		public Builder name(String name) {
			target.setName(name);
			return this;
		}
		
		public Builder price(String price) {
			target.setPrice(price);
			return this;
		}
		
		public Builder desc(String desc) {
			target.setDesc(desc);
			return this;
		}
		
		public Builder desc(int ordering) {
			target.setOrdering(ordering);
			return this;
		}
		
		public Builder createdAt(LocalDateTime createdAt) {
			target.setCreatedAt(createdAt);
			return this;
		}
		
		public Builder updatedAt(LocalDateTime updatedAt) {
			target.setUpdatedAt(updatedAt);
			return this;
		}
		
		public MenuDO build() {
			return target;
		}
		
	}
}
