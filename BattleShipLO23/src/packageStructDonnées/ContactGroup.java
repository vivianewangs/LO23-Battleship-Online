/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_class;

/**
 *
 * @author siwei
 */
public class ContactGroup {
    private User[] listUser;
    private int rights;
    private String name;
    
    public ContactGroup(){
        listUser = new User[0];
        rights = 0;
        name = "";
    }
}
