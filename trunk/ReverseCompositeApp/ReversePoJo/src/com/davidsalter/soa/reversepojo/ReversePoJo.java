/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davidsalter.soa.reversepojo;

import org.glassfish.openesb.pojose.api.annotation.Provider;
import org.glassfish.openesb.pojose.api.annotation.Resource;
import org.glassfish.openesb.pojose.api.annotation.Operation;
import org.glassfish.openesb.pojose.api.res.Context;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
@Provider 
public class ReversePoJo {
    
    /**
     * Constructor
     */
    public ReversePoJo() {
    }
    
    /**
     * POJO Operation
     *
     * @param input input of type String input
     * @return String
     */
    @Operation (outMessageTypeQN="{http://reversepojo.soa.davidsalter.com/ReversePoJo/}ReversePoJoOperationResponse")
    public String reverseString(String input) {
        StringBuffer reverse = new StringBuffer();
        for (int i = input.length(); i > 0; i--) {
            reverse.append(input.charAt(i-1));
        }

        return reverse.toString();
    }

    // Logger
    private static final Logger logger = Logger.getLogger(ReversePoJo.class.getName());
    // POJO Context
    @Resource
    private Context jbiCtx;
}