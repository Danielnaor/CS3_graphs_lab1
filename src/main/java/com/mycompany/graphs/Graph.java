package com.mycompany.graphs;


import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carmitnaor
 */
public class Graph {
    //part 1 get the graph working 
    
    private HashMap<String, String> connections;
    private String start;
        private String end;


    public Graph(String[] connectionsArray, String one, String two) {
        try{
            connections = new HashMap<String, String>();
            for(String item: connectionsArray){
                String let1 = item.substring(0,1);
                String let2 = item.substring(1);

                if(connections.containsKey(let1)){
                   connections.put(let1, connections.get(let1).concat(let2)); 
                } 
                else{
                    connections.put(let1, let2); 
                }
                
                 if(connections.containsKey(let2)){
                   connections.put(let2, connections.get(let2).concat(let1)); 
                } 
                else{
                    connections.put(let2, let1); 
                }
       
                
            }
            start = one;
            end = two;
            
            /*for(String key: connections.keySet()){
                System.out.println(key + ": " + connections.get(key));
            }*/
       }catch (Exception e){
               
       }
        
        
        
        
           
    }
    public boolean check(){
        return check(start,end,"");
    }

    private boolean check(String one, String two, String been){
        
        if(two.contains(one) || two.equals(one)){

            return true;
        }
        else{
            String connectionsString = connections.get(one);
             for(int i = 0; i < connectionsString.length(); i++){
                 String currentLet = (connectionsString.charAt(i) + "");
                 if(been.indexOf(currentLet) == -1){
                     
                        if(check(currentLet,two,been.concat(currentLet))){
                            return true;
                        }
                 }
                 
                         
             }

        }
        return false;

    }

    
}
