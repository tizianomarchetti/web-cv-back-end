package com.service.cv.service.mapper;

import com.service.cv.model.dto.FormItemsDto;
import com.service.cv.model.entity.FormItems;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class FormItemsMapper {
	public FormItems toEntity(FormItemsDto dto) {
		FormItems formItems = new FormItems();
		BeanUtils.copyProperties(dto, formItems);
		return formItems;
	}

	public FormItemsDto toDto(FormItems formItems) {
		FormItemsDto dto = new FormItemsDto();
		BeanUtils.copyProperties(formItems, dto);
		return dto;
	}
}
