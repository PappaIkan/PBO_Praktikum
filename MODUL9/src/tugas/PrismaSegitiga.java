/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author lenovo
 */
public class PrismaSegitiga extends AbstraksBangun{
  double alasSegitiga = 8.0;
    double tinggiSegitiga = 9.0;
    double tinggiPrisma = 10.0;


    public double volume() {
        return (0.5 * alasSegitiga * tinggiSegitiga) * tinggiPrisma;
    }


    public double luasPermukaan() {
        return (2 * (0.5 * alasSegitiga * tinggiSegitiga)) + (3 * (alasSegitiga * tinggiPrisma));
    }  
}
