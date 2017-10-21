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
public class Player {
    private Profile profile;
    private Boat[] listBoats;
    private Shot[] listShots;
    
    public Player(){
        profile = new Profile();
        listBoats = new Boat[0];
        listShots = new Shot[0];
    }
}
