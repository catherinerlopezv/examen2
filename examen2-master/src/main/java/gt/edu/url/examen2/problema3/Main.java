/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema3;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
		
		PositionalList<String> lista = new LinkedPositionalList();
		Position<String> c1,c2,c3;
		c1 = lista.addFirst("Cathy");
		c2 = lista.addAfter(c1, "Isabel");

		lista.mostrar();
		lista.swap(c1, c2);
		 System.out.println("****-*-*-****"); 
		lista.mostrar();

	}
}
