// Family name, Given name:  Billard, Alexandre
// Student number: 6812210
// Course: ITI 1120 
// Assignment Number: Assignement 3

import java.util.Scanner;

public class A3Q2solution {
 public static void main(String[] args) { 
    
  // part (a) of the main
  
  Scanner keyboard = new Scanner(System.in); 
  
  System.out.println("***************************");
  System.out.println("        Part (a)");
  System.out.println("***************************");
  
  do{
   System.out.println("Enter a word and then press enter:");
   String str=keyboard.next();
   char[] word = str.toCharArray();
  
   isSquareFree(word);
   System.out.println("Do you want to test another word? Press y for yes, or another key for no");
   
  }while(keyboard.next().charAt(0)=='y');
 
  // part (b) of the main
  
  System.out.println();
  System.out.println("***************************");
  System.out.println("        Part (b)");
  System.out.println("***************************");
  
  System.out.println("How long a square free word on letters a, b and c do you want?");
  System.out.println("Enter an integer greater than zero");
  int word_length=keyboard.nextInt();
  
  char[] square_free_word = makeSquareFree(word_length);
     
  System.out.println("Here is a square-free word of length "+ word_length);
  for(int i=0; i<word_length; i++){
   System.out.print(square_free_word[i]);
  }
  System.out.println();
  
  
  /* by uncommenting the method call below, you can call isSquareFree with your created word 
   to verify that indeed it is square free */
  
   // isSquareFree(square_free_word);
  
  /* uncomment the method call below if you want to test if you solution 
   for part b is correct for n=1000. To use it, type in 1000 for the lenght when prompted by the program, 
   the method below will tell you if the word you created is indeed correct word of length 1000 as per Thue procedure. */
  
   test(square_free_word);
 }
  
  
 // part (a) 
 
 public static void isSquareFree(char[] word){  
  for(int i=0; i<word.length; i++)
  {
   int h=1; // h is a length of the subword we are currently testing. We start with subwords of lenght 1.
   while( i+2*h-1 < word.length){ // this tests we are outside of bounds of the array
    boolean subword_repeates=true; //assume the subword of length h starting at i is repated twice in a row
    for(int j=0; j<h; j++){
     if( word[i+j]!= word[i+j+h]){
      subword_repeates=false; // we found two different elements, thus this subword does not repeat.
     }
    }
    if ( subword_repeates ){ // if true, the subword of length h starting at i is repated twice in a row 
                          // thus the word is not squre free. Print the results. 
     System.out.print("The word, ");
      
     for(int j=0; j<word.length; j++){
      System.out.print(word[j]);
     }
      
     System.out.println(", is not square free,"+
      " since it has subword, ");
     for(int j=i; j<=i+h-1; j++){
      System.out.print(word[j]);
     }
     System.out.println(" twice in a row starting at position "+(i+1));
     
     return; // terminate the method since we found the word that repeates
    }
    h++;
   }    
  }
  
  // we tested everthing and no repeated consecutive subwords were found thus print the message and return.  
  System.out.println("The word is square free.");
 }  
  
  
 // part (b)
  
 // a method the produces a square free word of length n based on Thue's construction 
 public static char[] makeSquareFree(int n){
    
  char[] sfword = new char[n];
  
  sfword[0]='a';
  
  int length = 1;
  
  while(length < n){
   char[] tmp = new char[n+6]; 
   
   length=0;
   for(int i=0; sfword[i]!='\u0000' && length<=n; i++){
    if(sfword[i]=='a'){
     //12312
     tmp[length]='a';
     tmp[length+1]='b';
     tmp[length+2]='c';
     tmp[length+3]='a';
     tmp[length+4]='b';
     length=length+5;
    }
    else if(sfword[i]=='b'){
     // 131232
     tmp[length]='a';
     tmp[length+1]='c';
     tmp[length+2]='a';
     tmp[length+3]='b';
     tmp[length+4]='c';
     tmp[length+5]='b';
     length=length+6;
    }
    else{
     //1323132
     tmp[length]='a';
     tmp[length+1]='c';
     tmp[length+2]='b';
     tmp[length+3]='c';
     tmp[length+4]='a';
     tmp[length+5]='c';
     tmp[length+6]='b';
     length=length+7; 
    } 
   }
   for(int i=0; i<n; i++){
    sfword[i]=tmp[i];
   }
  }
  return sfword;
 }
 
 // a method that tests if a given word of length 1000, is a square-free produced as per Thue's construction 
 public static void test (char[] your_sfword){

  if(your_sfword.length != 1000){
   System.out.println("This method only tests if part (b) correctly generates a word of length 1000."+
    "\n Enter 1000 the next time if you want to use this method");
   return;
  }
  
  String s1 = new String(your_sfword);
  String s2 ="abcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabc";
  if(s1.equals(s2)){
   System.out.println("Your Thue-procedure-based square-free word of length 1000 is correct.");
  }
  else {
   System.out.println("Your Thue-procedure-based square-free word of length 1000 is not correct.");
  }
  
 }
 
}
