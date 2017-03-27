/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m256arrays;

/**
 *
 * @author jackpincombe
 */
public class M256Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    int[] myList = {1,2,3,4,5,6,6,8,6,4};
    boolean sort = true;
    int tmp;
    
    while (sort){
        sort = false;
        for (int i = 0; i < myList.length - 1; i++)
        {
         
            
            if (myList[i] > myList[i + 1])
            {
                tmp = myList[i];
                myList[i] = myList[i + 1];
                myList[i + 1] = tmp;
                sort = true;
                
            }
        }
        
    } 
    
    System.out.println(myList);
    
    for (int i = 0; i < myList.length; i++) {
        System.out.println(myList[i] + " ");
    }
    
    
    
    
    }
    
}
