/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naqib
 */
public class Product {
    private String nameStart;
    private double priceStart;
    private int amountStart;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
    this.nameStart = nameAtStart;
    this.priceStart = priceAtStart;
    this.amountStart = amountAtStart;    
    
}
    
    public void printProduct (){
        System.out.println(this.nameStart + ", price " + this.priceStart + ",amount " + this.amountStart);
    }
    
    
    
}
