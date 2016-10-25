package com.li.it.proxy.test;

import com.li.it.proxy.BookFacadeCglib;
import com.li.it.proxy.BookFacadeSupport;

public class TestCglib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookFacadeCglib cglib=new BookFacadeCglib();  
        BookFacadeSupport bookCglib=(BookFacadeSupport)cglib.getInstance(new BookFacadeSupport());  
        bookCglib.look();  
	}

}
