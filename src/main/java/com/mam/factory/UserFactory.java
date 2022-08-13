package com.mam.factory;

import com.mam.mapper.BookMapper;
import com.mam.mapper.impl.BookMapperImpl;

/**
 * 实例工厂创建对象
 */
public class UserFactory {

    public BookMapper getBookMapper(){
        return new BookMapperImpl();
    }
}
