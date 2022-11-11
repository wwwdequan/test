package com.wang.springdemo.util;

import com.wang.springdemo.api.DictionaryApi;
import com.wang.springdemo.domain.dto.DictionaryDataDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 字典项转换Map工具类
 *
 * @author liujiajie
 * @create 2019-06-28 15:02
 */
public class DicUtil {

    private DicUtil() {

    }

    /**
     * 转换列表类型数据字典为Map类型
     *
     * @param map     需要定义一个map用于存储转换好的数据字典map
     * @param api     数据字典服务类
     * @param dicCode 可变String数组,用于存储数据字典的编码
     */
    public static void initMap(Map<String, Map<String, String>> map, DictionaryApi api, String... dicCode) {
        if (dicCode != null) {
            for (String s : dicCode) {
//                map.put(s, api.listDictionaryDataByCode(s).stream().collect(Collectors.toMap(p -> p.getCode(), p -> p.getName())));
                List<DictionaryDataDTO> list = getDataList(api.listDictionaryDataByCode(s));
                map.put(s, list.stream().collect(Collectors.toMap(p -> p.getCode(), p -> p.getName())));
            }
        }
    }

    /**
     * 转化原始list数组为可供封装的数组（列表、树形数据字典获得的list皆可）
     *@param: list 原始list数组
     *@return:
     *@Author: 林晨
     *@Date: 2020/5/7 17:42
     */
    private static List<DictionaryDataDTO> getDataList(List<DictionaryDataDTO> list) {
        List<DictionaryDataDTO> resultList = new ArrayList<>();
        for (DictionaryDataDTO dictionaryDataDTO : list) {
            getList(dictionaryDataDTO,resultList);
        }
        return resultList;
    }

    /**
     * 转换树形类型数据字典为Map类型
     * @param map       需要定义一个map用于存储转换好的数据字典map
     * @param api       数据字典服务类
     * @param dicCode   可变String数组,用于存储数据字典的编码
     * @return
     * @author liujiajie&zhangqi
     */
    public static void getTreeMap(Map<String, Map<String, String>> map, DictionaryApi api, String... dicCode) {
        List<DictionaryDataDTO> dictionaryDataDTOS = new ArrayList();
        List<DictionaryDataDTO> list = new ArrayList();
        if (dicCode != null) {
            for (String s : dicCode) {
                dictionaryDataDTOS.addAll(api.listDictionaryDataByCode(s));
                for (DictionaryDataDTO dictionaryDataDTO : dictionaryDataDTOS) {
                    getList(dictionaryDataDTO,list);
                }
                map.put(s, list.stream().collect(Collectors.toMap(p -> p.getCode(), p -> p.getName())));
                dictionaryDataDTOS.clear();
                list.clear();
            }
        }
    }

    //递归
    private static void getList(DictionaryDataDTO dictionaryDataDTO,List<DictionaryDataDTO> list) {
        list.add(dictionaryDataDTO);
        if (dictionaryDataDTO.getChildren() != null) {
            List<DictionaryDataDTO> children = dictionaryDataDTO.getChildren();
            for (DictionaryDataDTO child : children) {
                getList(child,list);
            }
        }
    }
}