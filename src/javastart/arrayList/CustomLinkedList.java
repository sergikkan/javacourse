package javastart.arrayList;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CustomLinkedList<Element>  implements Iterable<Element>{
    private Node<Element> first;
    private Node<Element> last;

    private int size;

    public void add(Element element){
         if(first==null){
            Node<Element> node = new Node<>(element, null, null);
            first = node;
            last = node;
            size++;
        }else{
            Node<Element> node=new Node<>(element, null, last);
            last.next = node;
            last = node;
            size++;
        }
    }

    public void addFirst(Element element){
        Node<Element> newFirstElement = new Node<>(element, first, null);
        Node<Element> tmpFirst = first;
        tmpFirst.prev = newFirstElement;
        first=newFirstElement;
        size++;

    }

    public void delete(int index){
        Node<Element> deleteNode = getNodeByIndex(index);
        Node<Element> elementBefore = deleteNode.prev;
        Node<Element> elementAfter = deleteNode.next;
        elementBefore.next = elementAfter;
        elementBefore.prev = elementBefore;
        size--;

    }

    public int size(){
        return size;
    }

    public Element first(){
        return first.item;

    }

    public Element last(){
        return last.item;

    }

    public Element get(int index){
      return getNodeByIndex(index).item;

    }

    private Node<Element> getNodeByIndex(int index){
        Node<Element> result = first;
        for (int i = 0; i< index; i++){
            result = result.next;
        }
        return result;
    }

    @Override
    public Iterator<Element> iterator() {
        return new Iterator<Element>() {

            private Node<Element> current= first;

            @Override
            public boolean hasNext() {
                return current !=null;
            }

            @Override
            public Element next() {
                Node<Element> tmp = current;
                current = current.next;
                return tmp.item;
            }
        };
    }



    private  static class Node<Element>{
        Element item;
        Node<Element> next;
        Node<Element> prev;

        public Node(Element item, Node<Element> next, Node<Element> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}
