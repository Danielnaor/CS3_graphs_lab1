/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.graphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carmitnaor
 */
public class GraphRunner{
    
    public static void main(String[] args) {
        try{
                    Scanner file = new Scanner(new File("testCase" + File.separator + "testCases.txt"));

                    int numTestCases = Integer.parseInt(file.nextLine());
                   
                    for(int i = 0; i < numTestCases; i++ ){
                        String ListString = file.nextLine();
                            String[] list1 = ListString.split(" ");
                            
                        String twoLet = file.nextLine();
                        String one = twoLet.substring(0,1);
                                                String two = twoLet.substring(1,2);

                            Graph ref = new Graph(list1,one,two);
                            String ConnectedOrNo;
                            if(ref.check())
                                ConnectedOrNo = "yes";
                            else
                                ConnectedOrNo = "no";
 
                            System.out.println(one + " connects to " + two + " == " + ConnectedOrNo);

                    }

        } catch (FileNotFoundException ex) {    
            Logger.getLogger(GraphRunner.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
        
        
        
        
        
        
        
        
    }
}
