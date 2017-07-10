package com.webapp.platform.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class ClusterJob {
	private static Logger log = LogManager.getLogger(ClusterJob.class);
	private static boolean isStart = false;
	    
    /**
     * 按金豆发放红包
     */
    @Autowired 
    public void executeTest(){
        
        if( isStart == true ){
        	log.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"集群定时任务开始");
        	
        	
        	log.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"集群定时任务结束");
        }
        isStart = true;
    }
	
	

}
