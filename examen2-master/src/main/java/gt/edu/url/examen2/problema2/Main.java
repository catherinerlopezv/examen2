/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema2;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
		DemosList lista = new DemosList();
		Object[] get = new Object[8];
		for(int i = 0; i < 8; i++) {
			get[i] = lista.crearDemoLista().get(i);
			System.out.println(get[i]);
		
	}
    }
}
