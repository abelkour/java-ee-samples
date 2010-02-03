package com.davidsalter.jsf2helloworld;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.Pattern;

/**
 *
 * @author David Salter (david@davidsalter.co.uk)
 */
@ManagedBean(name="helloBean")
@RequestScoped
public class HelloBean {

    @Pattern(regexp="(.+)", message="{constraint.invalid.name}")
    private String name;

    public HelloBean() {
    }

    public String sayHello() {
        return "hi";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
