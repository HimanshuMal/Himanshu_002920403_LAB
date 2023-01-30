/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author 18572
 */
public class DeliveryPackage {
    int packageId ;
    double packageWeight ;
    ArrayList<Product> productlist ;
    Customer customer ;
    

    public ArrayList<Product> getProductlist() {
        return productlist;
    }

    public void setProductlist(ArrayList<Product> productlist) {
        this.productlist = productlist;
    }
    
   
    
    
    public DeliveryPackage()
    {
    this.productlist = new ArrayList<Product>() ;
    this.customer = new Customer() ;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
     public Product createProduct(int productId, String productName, double price) {
       
        Product product = new Product() ;
        product.setProductId(productId);
        product.setProductName(productName);
        product.setProductPrice(price);
        this.productlist.add(product);

        return product;
    }

    public Product findProduct(int pid) {
        for (Product prod : this.productlist) {
            if (prod.getProductId() == pid) {
                return prod;
            }
        }
        return null;
    }
    
}
