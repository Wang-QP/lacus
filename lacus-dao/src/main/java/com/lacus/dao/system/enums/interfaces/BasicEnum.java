package com.lacus.dao.system.enums.interfaces;

/**
 * 普通的枚举 接口
 */
public interface BasicEnum<T>{


    /**
     * @return 获取枚举的值
     */
    T getValue();

    /**
     *
     * @return 获取枚举的描述
     */
    String description();


}
