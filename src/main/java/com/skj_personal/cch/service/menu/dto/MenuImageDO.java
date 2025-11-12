package com.skj_personal.cch.service.menu.dto;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MenuImageDO {

	private long menuImageID;
	private String URI;
	private Timestamp createdAt;
	private String isDelete;
	private long  menuID;
}
