package com.webapp.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.framework.base.controller.BaseController;
import com.webapp.framework.core.cache.redis.JedisClusterFactory;

import redis.clients.jedis.JedisCluster;

@Controller
@RequestMapping("/session/*")
public class SessionController extends BaseController{
	
	@Autowired
	private JedisClusterFactory jedisClusterFactory;
	
	@RequestMapping(value = "login")
    public String login(){

        this.getRequest().getSession().setAttribute("str", "你你你你你你你你");

        return "session/login";
    }

    @RequestMapping(value = "index")
    public String index(){

//        String str = String.valueOf(this.getRequest().getSession().getAttribute("str"));
//        this.setBean("str", str);
    	try {
			JedisCluster jedisCluster = jedisClusterFactory.getObject();
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return "session/index";
    }
	

}









