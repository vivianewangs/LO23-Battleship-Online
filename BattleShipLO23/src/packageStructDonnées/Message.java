/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_class;

import java.util.Date;

/**
 *
 * @author siwei
 */
public class Message {
    private User profile;
    private String content;
    private Date time;
    
    public Message(){
        profile = new User();
        content = "";
        time = new Date();
    }
}
