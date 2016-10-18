package com.li.it.rpc.service.support;

import com.li.it.rpc.annotation.RpcService;
import com.li.it.rpc.service.HelloService;

@RpcService(HelloService.class)
public class HelloServiceSupport implements HelloService {

	public String hello(String name) {
		// TODO Auto-generated method stub
		return "Hello! " + name;
	}

}
