/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String  [] args){
    CustomerData cd1 = new CustomerData("joko");
    CustomerData cd2 = new CustomerData("fadhil", "seragen");
    CustomerData cd3 = new CustomerData("gilang", "pati", "14 november 2000");
    CustomerData cd4 = new CustomerData("tuhu", "wonogiri", "30 desember 1999", "programer");
    CustomerData cd5 = new CustomerData("ikan", "purwareja", "14 februari 1880", "softeare engginer", 4000000);
    CustomerData cd6 = new CustomerData("ikhlasul");
    CustomerData cd7 = new CustomerData("garin", "seragen");
    CustomerData cd8 = new CustomerData("faiq", "sidoarjo", "17 oktober 2002");
    CustomerData cd9 = new CustomerData("farhan", "sampit", "10 april 2004", "ui/ux");
    CustomerData cd10 = new CustomerData("rafli", "karangasem", "4 januari 2001", "full stack developer", 8000000);
    
    
    cd1.printinfo();
    cd2.printinfo();
    cd3.printinfo();
    cd4.printinfo();
    cd5.printinfo();
    cd6.printinfo();
    cd7.printinfo();
    cd8.printinfo();
    cd9.printinfo();
    cd10.printinfo();
    
    }
}
