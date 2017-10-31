/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema5;

/**
 *
 * @author user
 */
public class DynamicStack<E> implements Stack<E> {
	private static class Node<E>{
		private E element; //Valor
		private Node<E> next; //Puntero en la lista
		private Node<E> previous;
		public Node(E element) {
			super();
		}
		public E getElement() {
			return element;
		}
		public Node<E> getNext() {
			return next;
		}
		
		public Node<E> getPrevious(){
			return previous;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}
		
	}
	private Node<E> head = null;
	private Node<E> tail = null;
	
	public boolean isEmpty() {
		return((head == null) && (tail == null));
	}
	
	public int elementsQuantity(){
        Node<E> pivot = head;
        int Quantity = 0;

        while(pivot != null)
        {
            Quantity++;
            pivot = pivot.next;
        }
        return Quantity;    
    }
	
	public void push(E Value)
    {
  Node<E> newElement = new Node<E>(Value);
        if (isEmpty())
        {
            head = newElement;
            tail = newElement;
        }

        else
        {
            tail.next = newElement;
            tail = newElement;
        }
    }

	public E pop() {
        if (!isEmpty())
        {
            
                if (elementsQuantity() == 1) 
                {
                    E extractedValue = tail.getElement();
                    head = null;
                    tail = null;
                    return extractedValue;
                }
                else 
                {
                    Node<E> pivot = head;
                    E extractedValue = tail.getElement();
                    while (pivot.next != tail)
                    {
                        pivot = pivot.next;
                    }

                    pivot.next = null;
                    tail = pivot;
                    return extractedValue;
                }
            }
        else {
        	return null;
        }
    }
	
}
