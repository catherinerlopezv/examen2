/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema4;

import java.util.ArrayList;

/**
 *
 * @author user
 */
   class implementacion<E> implements PositionalList {
 
    java.util.List<E> positionalList=  new ArrayList<E>(); 
    java.util.List<E> posicion=new ArrayList<E>();
    @Override
    public int size() {
        return positionalList.size();
    }

    @Override
    public boolean isEmpty() {
        if(positionalList.size()==0)
        {
          return positionalList.isEmpty()==true;
        }
      return  positionalList.isEmpty()==false;
    }

    @Override
    public Position first() {
        return (Position)positionalList.get(0);
    }

    @Override
    public Position last() {
        return (Position)positionalList.get(positionalList.size()-1);
    }

    @Override
    public Position addFirst(Object e) {
        positionalList.add(0, (E)e);
        return (Position) e;
    }

    @Override
    public Position addLast(Object e) {
        positionalList.add((E)e);
        return (Position) e;
    }

    @Override
    public Position before(Position p) throws IllegalArgumentException {
        return (Position) positionalList.get(positionalList.indexOf(p)-1);
    }

    @Override
    public Position after(Position p) throws IllegalArgumentException {
        return (Position) positionalList.get(positionalList.indexOf(p)+1);
    }

    @Override
    public Position addBefore(Position p, Object e) throws IllegalArgumentException {
        positionalList.add(positionalList.indexOf(p)-1,(E)e);
        return (Position) e;
    }

    @Override
    public Position addAfter(Position p, Object e) throws IllegalArgumentException {
        positionalList.add(positionalList.indexOf(p)+1,(E)e);
        return (Position) e;
    }

    @Override
    public Object set(Position p, Object e) throws IllegalArgumentException {
        positionalList.set(positionalList.indexOf(p),(E)e);
        return (Position) e;
    }

    @Override
    public Object remove(Position p) throws IllegalArgumentException {
        positionalList.remove(p);
        return (Position) p;
    }

    @Override
    public Position positionAtIndex(int i) {
        for (int j = 0; j < positionalList.size(); j++) {
            E get = positionalList.get(j);
            if (j == i) {
                return (Position)get;
            }
            
        }
        return null;
    }

      
      

}
