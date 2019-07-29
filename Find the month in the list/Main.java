import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.io.*;
import java.util.*;
import java.lang.*;
public class Main{
  public static void main(String args[]) throws Exception
  {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
    int i,j,k;
  String line= br.readLine();
  String[] larr=line.split(",");
  LinkedList<String> l1=new LinkedList<String>();
  for(i=0;i<larr.length;i++)
  {
    l1.add(larr[i]);
  }
  String q=br.readLine();
  System.out.println(l1);
  System.out.println("Size of the linked list: "+l1.size());
  System.out.println("Is LinkedList empty? "+l1.isEmpty());
  System.out.println("Does LinkedList contains "+q+"?");
  System.out.println(l1.contains(q));
}
}
    