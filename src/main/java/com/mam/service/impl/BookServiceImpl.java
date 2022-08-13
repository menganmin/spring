package com.mam.service.impl;

import com.mam.mapper.BookMapper;
import com.mam.service.BookService;

public class BookServiceImpl implements BookService {
    private BookMapper bookMapper;
    public void save(){
        bookMapper.save();
        System.out.println("BookService");
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
}
