/* Audrey Williams CS2003 */

package lab7;

import java.util.LinkedList;
import java.util.ListIterator;



public class ListA {
	
	public static void main(String[] args) {
// new list called a
		LinkedList<String> a = new LinkedList<String>();
// adding elements
		a.add("Tulsa");
		a.add("Ada");
		a.add("Broken Arrow");
		a.addLast("Owasso");
// adds OKC to second position
		a.add(1, "OKC");
// prints out the list
		System.out.println(a);
		
// new list called b
		LinkedList<String> b = new LinkedList<String>();
// adds elements
		b.add("74104");
		b.add("74135");
		b.add("foo");
		b.add("hello world");
		b.add("777");
// prints list
		System.out.println(b);
		
// adds list b to list a and prints
		a.addAll(b);
		System.out.println(a);


// makes iterator	
ListIterator<String> aIter = a.listIterator();
// removes every other
while( aIter.hasNext()) {
	aIter.next();
	aIter.next();
	aIter.remove();
}
// prints it out
System.out.println(a);
}}





