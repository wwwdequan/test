package com.wang.springdemo.domain.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.util.List;

@Data
public class DictionaryDataDTO {


    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    private String code;

    private String name;

    private String description;

    private String dictionaryCode;

    private String dictionaryName;

    private String sortValue;

    private String parentCode;

    private List<DictionaryDataDTO> children;
}
