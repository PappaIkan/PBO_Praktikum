/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hewandemo;

/**
 *
 * @author lenovo
 */
public class HewanDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hewan hewan1 = new hewan();
        hewan hewan2 = new hewan();

        hewan1.tetapkanNama("panda");
        hewan1.tetapkanJumlahKaki(4);
        hewan1.tetapkanMakanan("tumbuhan");
        hewan1.tetapkanTipe("herbivora");
        hewan1.tampilkanInfo();

        System.out.println();

        hewan2.tetapkanNama("Kerbau");
        hewan2.tetapkanJumlahKaki(4);
        hewan2.tetapkanMakanan("Rumput");
        hewan2.tetapkanTipe("Herbivora");
        hewan2.tampilkanInfo();
    }
}
