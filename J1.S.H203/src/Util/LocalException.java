/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author longt
 */
public class LocalException extends Exception{
    String message;

    public LocalException(String message){
        super();
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
