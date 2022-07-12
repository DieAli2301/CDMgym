package com.upchiapas.cdmgym.proyectocdmgym2022.models;

import java.util.ArrayList;

public class validateUser {

    private ArrayList<User> user = new ArrayList<>();

    public  validateUser (){
        user.add(new User("Diego Ortiz","Diego O","1234"));
        user.add(new User("Matin Ochoa","Martinoli","22123"));
        user.add(new User("Cristian Ovando","Cristian O","123456"));
    }

    public boolean autenticarUser(String username, String password){
        boolean status = false;
        User user1 = findUser(username);
        if ( user1 != null && user1.getPassword().equals(password))
            status = true;
        return  status;

    }

    private  User findUser(String username){
        User user1 = null;
        boolean status = false;
        int index = 0;
        while (!status && index<user.size()){
            if (user.get(index).getUsername().equals(username)){
                user1 = user.get(index);
                status = true;
            }
            index++;
        }
        return user1;
    }
}
