package com.davidsalter.ejb31test;

import javax.ejb.Stateless;

/**
 *
 * @author David Salter (david@davidsalter.co.uk)
 */
@Stateless
public class HelloSessionBean {
    public String sayHello() {
        return "Hi there !!";
    }
}
