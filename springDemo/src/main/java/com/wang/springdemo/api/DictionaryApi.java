package com.wang.springdemo.api;

import com.wang.springdemo.domain.dto.DictionaryDataDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author huangjun
 */
public interface DictionaryApi {


    @GetMapping("/api/platform/dictionary/{code}/data")
    List<DictionaryDataDTO> listDictionaryDataByCode(@PathVariable(value = "code") String code);

    @GetMapping("/api/platform/dictionary/{code}/data/fuzzy")
    List<DictionaryDataDTO> listDictionaryDataByCodeAndFuzzyName(@PathVariable(value = "code") String code, @RequestParam(value = "name") String name);

    @GetMapping("/api/platform/dictionary/{dictionaryCode}/data/{dataCode}")
    DictionaryDataDTO getDictionaryDataByCode(@PathVariable(value = "dictionaryCode") String dictionaryCode, @PathVariable(value = "dataCode") String dataCode);
}

