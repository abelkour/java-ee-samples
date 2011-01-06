package com.davidsalter.ejb31test;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;

/**
 *
 * @author David Salter (david@davidsalter.co.uk)
 */
@Singleton
public class SingletonSessionBean {

    private String creationDate;
    
    @PostConstruct
    public void init() {
        System.out.println("Initialize singleton");
        creationDate = new Date().toString();
    }

    @PreDestroy
    public void shutdown() {
        System.out.println("Shutting down singleton");
    }
    
    public String getDate() {
        return creationDate;
    }
}
