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

        String str = String.valueOf(this.getRequest().getSession().getAttribute("str"));
        this.setBean("str", str);
    	
        return "session/index";
    }
    
    @RequestMapping(value = "add")
    public String add(){
    	try {
			JedisCluster jedisCluster = jedisClusterFactory.getObject();
			
			jedisCluster.set("name", "lixing4");
		} catch (Exception e) {
			e.printStackTrace();
		}
        return "session/index";
    }
    
    @RequestMapping(value = "get")
    public String get(){
    	JedisCluster jedisCluster ;
    	try {
    		jedisCluster = jedisClusterFactory.getObject();
			String name = jedisCluster.get("name");
			
			this.setBean("name", name);
			jedisCluster.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
        return "session/index";
    }
	
    @RequestMapping(value = "del")
    public String del(){
    	JedisCluster jedisCluster ;
    	try {
    		jedisCluster = jedisClusterFactory.getObject();
			jedisCluster.del("name");
			jedisCluster.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
        return "session/index";
    }

}









