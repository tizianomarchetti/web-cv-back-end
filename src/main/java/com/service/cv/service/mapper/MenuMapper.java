package com.service.cv.service.mapper;

import com.service.cv.model.dto.MenuDto;
import com.service.cv.model.entity.Menu;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MenuMapper {
	public Menu toEntity(MenuDto dto) {
		Menu menu = new Menu();
		BeanUtils.copyProperties(dto, menu);
		return menu;
	}

	public MenuDto toDto(Menu menu) {
		MenuDto dto = new MenuDto();
		BeanUtils.copyProperties(menu, dto);
		return dto;
	}
}
