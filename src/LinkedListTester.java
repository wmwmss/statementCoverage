package list;
/**
 * Statement coverage tests for LinkedList class in Java
 * @version 1.0
 */ 
import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.Test;

public class LinkedListTester {
 public static void main(String args[]){
       org.junit.runner.JUnitCore.main("LinkedListTest");
     }

 //constructor test
 @Test
 public void constructorTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  //l1.add("a");
  LinkedList<String> l2 = new LinkedList<String>(l1);
  assertTrue(l2 instanceof LinkedList<?>);  
 }
 
 //addFirst test
 @Test
 public void addFirstTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertEquals("incorrect addFirst", l1.getFirst(), "a"); 
  l1.addFirst("b");
  assertEquals("incorrect addFirst", l1.getFirst(), "b");
 }
 
 //add tests
 @Test
 public void addTest1() {
  LinkedList<String> l1 = new LinkedList<String>();
  String s = "a";
  l1.add(0,s);
  assertTrue("incorrect add", l1.contains(s)); 
 }
 
 @Test
 public void addTest2() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.add("b");
  String s = "a";
  l1.add(0,s);
  assertTrue("incorrect add", l1.contains(s)); 
 }
 
 @Test
 public void addTest3() {
  LinkedList<String> l1 = new LinkedList<String>();
  String s = "a";
  l1.add(s);
  assertTrue("incorrect add", l1.contains(s)); 
 }
 
 //contains test
 @Test
 public void containsTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  String s = "a";
  //l1.add(s);
  assertFalse("incorrect add", l1.contains(s)); 
 }
 
 //addLast test
 @Test
 public void addLastTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  l1.addLast("b");
  assertEquals("incorrect addLast", l1.getLast(), "b"); 
 }
 
 //getFirst tests
 @Rule public ExpectedException exceptionRule = ExpectedException.none();
 @Test(expected = NoSuchElementException.class)
 public void getFirstTest1() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  l1.clear();
  l1.getFirst();
  //exceptionRule.expect(NoSuchElementException.class);
 }
 
 @Test
 public void getFirstTest2() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  l1.addFirst("b");
  assertEquals("incorrect getFirst", l1.getFirst(), "b"); 
 }
 
 //getLast tests
 @Test(expected = NoSuchElementException.class)
 public void getLastTest1() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  l1.clear();
  l1.getLast();
  //exceptionRule.expect(NoSuchElementException.class); 
 }
 
 @Test
 public void getLastTest2() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  l1.addLast("b");
  assertEquals("incorrect getLast", l1.getLast(), "b");  
 }
 
 //addAll tests
 @Test
 public void addAllTest1() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  LinkedList<String> l2 = new LinkedList<String>(l1);
  assertTrue("incorrect addAll", l2.contains("a"));  
 }
 
 @Test(expected = IndexOutOfBoundsException.class)
 public void addAllTest2() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  LinkedList<String> l2 = new LinkedList<String>();
  l2.addAll(-1, l1);
  //assertTrue("incorrect addAll", l2.contains("a"));  
 }
 
 @Test
 public void addAllTest3() {
  LinkedList<String> l1 = new LinkedList<String>();
  LinkedList<String> l2 = new LinkedList<String>();
  assertFalse("incorrect addAll", l2.addAll(0, l1));  
 }
 
 @Test
 public void addAllTest4() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  LinkedList<String> l2 = new LinkedList<String>();
  l2.addFirst("b");
  assertTrue("incorrect addAll", l2.addAll(0, l1));  
 }
 
 //size test
 @Test
 public void sizeTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  assertEquals("incorrect size", l1.size(),0);  
 }
 
 //remove tests
 @Test
 public void removeTest1() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertTrue("incorrect remove", l1.remove("a"));  
 }
 
 @Test
 public void removeTest2() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertFalse("incorrect remove", l1.remove(null));  
 }
 
 @Test
 public void removeTest3() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst(null);
  assertTrue("incorrect remove", l1.remove(null));  
 }
 
 @Test
 public void removeTest4() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertFalse("incorrect remove", l1.remove("b"));  
 }
 
 @Test(expected = IndexOutOfBoundsException.class)
 public void removeTest5() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  l1.remove(-1);  
 }
 
 @Test
 public void removeTest6() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertEquals("incorrect remove", l1.remove(0),"a");  
 }
 
 @Test
 public void removeTest7() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertEquals("incorrect remove", l1.remove(),"a");  
 }
 
 //removeFirstOccurrence test
 @Test
 public void removeFirstOccurrenceTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertTrue("incorrect removeFirstOccurrence", l1.removeFirstOccurrence("a"));  
 }
 
 //removeLastOccurrence tests
 @Test
 public void removeLastOccurrenceTest1() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst(null);
  assertTrue("incorrect removeLastOccurrence", l1.removeLastOccurrence(null));  
 }
 
 @Test
 public void removeLastOccurrenceTest2() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertFalse("incorrect removeLastOccurrence", l1.removeLastOccurrence(null));  
 }
 
 @Test
 public void removeLastOccurrenceTest3() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertTrue("incorrect removeLastOccurrence", l1.removeLastOccurrence("a"));  
 }
 
 @Test
 public void removeLastOccurrenceTest4() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertFalse("incorrect removeLastOccurrence", l1.removeLastOccurrence("b"));  
 }
 
 //indexOf test
 @Test
 public void indexOfTest1() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst(null);
  assertEquals("incorrect indexOf", l1.indexOf(null),0);  
 }
 
 @Test
 public void indexOfTest2() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertEquals("incorrect indexOf", l1.indexOf(null),-1);  
 }
 
 @Test
 public void indexOfTest3() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertEquals("incorrect indexOf", l1.indexOf("b"),-1);  
 }
 
 //lastIndexOf tests
 @Test
 public void lastIndexOfTest1() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst(null);
  assertEquals("incorrect lastIndexOf", l1.lastIndexOf(null),0);  
 }
 
 @Test
 public void lastIndexOfTest2() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertEquals("incorrect lastIndexOf", l1.lastIndexOf(null),-1);  
 }
 
 @Test
 public void lastIndexOfTest3() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertEquals("incorrect lastIndexOf", l1.lastIndexOf("b"),-1);  
 }
 
 @Test
 public void lastIndexOfTest4() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertEquals("incorrect lastIndexOf", l1.lastIndexOf("a"),0);  
 }
 
 //element test
 @Test
 public void elementTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertEquals("incorrect element", l1.element(),"a");  
 }
 
 //get test
 @Test
 public void getTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertEquals("incorrect get", l1.get(0),"a");  
 }
 
 //set test
 @Test
 public void setTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertEquals("incorrect set", l1.set(0,"b"),"a"); 
  assertEquals("incorrect set", l1.get(0),"b");  
 }
 
 //peek tests
 @Test
 public void peekTest1() {
  LinkedList<String> l1 = new LinkedList<String>();
  assertEquals("incorrect peek", l1.peek(),null);   
 }
 
 @Test
 public void peekTest2() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertEquals("incorrect peek", l1.peek(),"a");  
 }

 //poll tests
 @Test
 public void pollTest1() {
  LinkedList<String> l1 = new LinkedList<String>();
  assertEquals("incorrect poll", l1.poll(),null);   
 }
 
 @Test
 public void pollTest2() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.addFirst("a");
  assertEquals("incorrect poll", l1.poll(),"a");  
 }
 
 //offer test
 @Test
 public void offerTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.offer("a");
  assertEquals("incorrect offer", l1.getFirst(),"a");  
 }
 
 //offerFirst test
 @Test
 public void offerFirstTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  assertTrue("incorrect offerFirst", l1.offerFirst("a"));
  assertEquals("incorrect offerFirst", l1.getFirst(),"a");  
 }
 
 //offerLast test
 @Test
 public void offerLastTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  assertTrue("incorrect offerLast", l1.offerLast("a"));
  assertEquals("incorrect offerLast", l1.getLast(),"a");  
 }
 
 //peekFirst test
 @Test
 public void peekFirstTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  assertEquals("incorrect peekFirst", l1.peekFirst(),null); 
  l1.add("a");
  assertEquals("incorrect peekFirst", l1.peekFirst(),"a");  
 }
 
 //peekLast test
 @Test
 public void peekLastTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  assertEquals("incorrect peekLast", l1.peekLast(),null); 
  l1.add("a");
  assertEquals("incorrect peekLast", l1.peekLast(),"a");  
 }
 
 //pollFirst test
 @Test
 public void pollFirstTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  assertEquals("incorrect pollFirst", l1.pollFirst(),null); 
  l1.add("a");
  assertEquals("incorrect pollFirst", l1.pollFirst(),"a");  
 }
 
 //pollLast test
 @Test
 public void pollLastTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  assertEquals("incorrect pollLast", l1.pollLast(),null); 
  l1.add("a");
  assertEquals("incorrect pollLast", l1.pollLast(),"a");  
 }
 
 //pop test
 @Test
 public void popTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.add("a");
  assertEquals("incorrect pop", l1.pop(),"a");  
 }
 
 //push test
 @Test
 public void pushTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.push("a");
  assertEquals("incorrect push", l1.getFirst(),"a");  
 }
 
 //toArray test
 @SuppressWarnings("deprecation")
 @Test
 public void toArrayTest() {
  LinkedList<String> l1 = new LinkedList<String>();
  l1.push("a");
  l1.push("b");
  String[] array1 = {};
  l1.toArray(array1);
  
  String[] array2 = {"c","d","e"};
  l1.toArray(array2);
  
  String[] array3 = {"f","g"};
  assertEquals("incorrect toArray", l1.toArray(array3),array3);  
 }
 
}
