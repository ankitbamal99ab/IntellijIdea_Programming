package com.company;
////////import java.io.BufferedReader;
////////import java.io.InputStreamReader;
////////import java.util.Scanner;
////////import java.util.StringTokenizer;
////////
//////////package com.company;
////////////
////////////import javax.xml.transform.Source;
////////////import java.lang.reflect.Array;
////////////import java.math.BigInteger;
////////////import java.util.ArrayList;
////////////import java.util.Arrays;
////////////import java.util.Collections;
////////////import java.util.Scanner;
////////////
//////////////import javax.swing.*;
//////////////import java.lang.reflect.GenericArrayType;
//////////////import java.sql.Array;
//////////////import java.util.Arrays;
////////////// import java.sql.SQLOutput;
////////////// import java.util.ArrayList;
////////////// import java.lang.Math;
////////////// import java.util.Scanner;
//////////////
///////////////*public class Main {
//////////////
//////////////    public static void main(String[] strgs) {
//////////////        // write your code here
//////////////     /*   System.out.println("Enter Number of students :");
//////////////        Scanner sc=new Scanner(System.in);
//////////////        int n=sc.nextInt();
//////////////        System.out.println();
//////////////        int avg =0;
//////////////        int [] abc=new int[n];
//////////////        System.out.println("Enter Marks:");
//////////////        for(int i=0;i<n;i++)
//////////////        {
//////////////             abc[i] = sc.nextInt();
//////////////        }
//////////////        for(int i=0;i<n;i++)
//////////////        {
//////////////            avg+=abc[i];
//////////////        }
//////////////        avg=avg/n;
//////////////        System.out.println("The Average of Marks is : "+ avg);
//////////////     Scanner sc=new Scanner(System.in);
//////////////        System.out.println("Enter a Number:");
//////////////     int n=sc.nextInt();
//////////////     int temp=n;
//////////////     int result=0;
//////////////     while(n>0)
//////////////     {
//////////////         result = result * 10 + n % 10;
//////////////         n = n / 10;
//////////////     }
//////////////     if(temp==result)
//////////////     {
//////////////         System.out.println("The Input Number is palindrome Number");
//////////////     }else
//////////////         System.out.println("The Input Number is Not a palindrome Number");
//////////////     Scanner sc=new Scanner(System.in);
//////////////     int n=sc.nextInt();
//////////////     int temp=n;
//////////////     int b;
//////////////     int result=0;
//////////////     while(n>0)
//////////////     {
//////////////         b=n%10;
//////////////         result+=b*b*b*b;
//////////////         n=n/10;
//////////////     }
//////////////        System.out.println(result);
//////////////     if(temp==result)
//////////////     {
//////////////         System.out.println("Number is armstrong");
//////////////     }else
//////////////         System.out.println("Not a Armstrong Number");
//////////////
//////////////            Scanner sc = new Scanner(System.in);
//////////////
//////////////            System.out.println("\n\n1-ASCII TO INTEGER VALUE");
//////////////            System.out.println("2-INTEGER TO ASCII VALUE");
//////////////            System.out.println("3-EXIT");
//////////////            System.out.println("\n*** CHOOSE ENTRY FROM GIVEN MENU ***\n");
//////////////            int choice = sc.nextInt();
//////////////
//////////////            switch (choice) {
//////////////                case 2:
//////////////                    System.out.println("Enter a Number ");
//////////////                    int n = sc.nextInt();
//////////////                    char c = (char) n;
//////////////                    System.out.println("The ASCII value of input NUmber is : "+c);
//////////////                    break;
//////////////                case 1:
//////////////                    System.out.println("Enter a Character");
//////////////                    char input = sc.next().charAt(0);
//////////////                    int a = (int) input;
//////////////                    System.out.println("he Integer value of input Character is : " +a);
//////////////                    break;
//////////////                case 3:
//////////////                    break;
//////////////                default:
//////////////                    System.out.println("Please Enter a  Valid Entry");
//////////////            }
////////////////     String str1[]=new String[] {"a","n","k","i","t"};
////////////////     String str[]=new String[] {"t","i","n","k","a"};
////////////////     if(str1.length==str.length){
////////////////         Arrays.sort(str1);
////////////////         Arrays.sort(str);
////////////////         System.out.println(str.length);
////////////////         for(int i=0;i<str.length;i++){
////////////////             if(str[i]==str1[i])
////////////////             {
////////////////                 System.out.println( i +"  anagram");
////////////////             }
////////////////             else
////////////////             {
////////////////                 System.out.println( i+ "  Not");
////////////////
////////////////             }
////////////////         }
////////////////     }
////////////////
////////////////     else
////////////////         System.out.println("No Anagram");
//////////////
//////////////
////////////////    Scanner sc=new Scanner(System.in);
////////////////        System.out.println("Enter your Choice");
////////////////        int n=sc.nextInt();
////////////////        long [] marks =new long [n];
////////////////        long avg=0;
////////////////        for(int i=0;i<n;i++)
////////////////        {
////////////////            marks[i]=sc.nextLong();
////////////////        }
////////////////        for(int i=0;i<n;i++){
////////////////            avg+=marks [i];
////////////////        }
////////////////        avg=avg/(long)n;
////////////////        System.out.println(avg);
//////////////        //Scanner sc=new Scanner(System.in);
//////////////
////////////////        while (true) {
////////////////            int n = sc.nextInt();
////////////////            if (n > 0) {
////////////////                System.out.println("Input = " + n);
////////////////            } else {
////////////////                System.out.println("You input a wrong Entry ");
////////////////                break;
////////////////            }
////////////////        }
//////////////
////////////////        Scanner sc = new Scanner(System.in);
////////////////        System.out.println("Enter value of rows and columns");
////////////////        System.out.println("Rows");
////////////////        int rows = sc.nextInt();
////////////////        System.out.println("Columns");
////////////////        int cols = sc.nextInt();
////////////////        int a[][] = new int[rows][cols];
////////////////        int b[][] = new int[rows][cols];
////////////////        int c[][] = new int[rows][cols];
////////////////        System.out.println("Enter a value of a array");
////////////////        for (int i = 0; i < rows; i++)
////////////////            for (int j = 0; j < cols; j++) {
////////////////                a[i][j] = sc.nextInt();
////////////////            }
////////////////        System.out.println("Enter a value of b array");
////////////////        for (int i = 0; i < rows; i++) {
////////////////            for (int j = 0; j < cols; j++) {
////////////////                b[i][j] = sc.nextInt();
////////////////            }
////////////////        }
////////////////        System.out.println("Sum process");
////////////////        for (int i = 0; i < rows; i++) {
////////////////            for (int j = 0; j < cols; j++) {
////////////////                c[i][j] =a[i][j]+b[i][j];
////////////////                System.out.print(c[i][j]);
////////////////                System.out.print ("  ");
////////////////            }
////////////////        }
////////////////        Scanner ank=new Scanner(System.in);
////////////////        System.out.println("Enter dimension of Matrix");
////////////////        System.out.println("Enter Value of Rows");
////////////////        int rows=ank.nextInt();
////////////////        System.out.println("Enter value of Column");
////////////////        int cols=ank.nextInt();
////////////////        int a[][]=new int[rows][cols];
////////////////        int b[][]=new int[rows][cols];
////////////////        int c[][]=new int[rows][cols];
////////////////        System.out.println("Enter value for 1st Array");
////////////////        for(int i=0;i<rows;i++)
////////////////        {
////////////////            for(int j=0;j<cols;j++){
////////////////                a[i][j]=ank.nextInt();
////////////////            }
////////////////            //System.out.println("");
////////////////
////////////////        }
////////////////        System.out.println("2nd Array");
////////////////        for(int i=0;i<rows;i++)
////////////////        {
////////////////            for(int j=0;j<cols;j++){
////////////////              //  System.out.print(a[i][j]+"  ");
////////////////                b[i][j]=ank.nextInt();}
////////////////        }
////////////////
////////////////        for(int i=0;i<rows;i++)
////////////////        {
////////////////            for(int j=0;j<cols;j++){
////////////////                c[i][j]=a[i][j]+b[i][j];
////////////////            }
////////////////        }
////////////////        for(int i=0;i<rows;i++)
////////////////        {
////////////////            for(int j=0;j<cols;j++){
////////////////                System.out.print(c[i][j]+" ");
////////////////            }
////////////////            System.out.println("");
////////////////        }
//////////////
////////////////        String a=new String("Ankit,Bamal,Solia,Kshetriya");
////////////////        System.out.println(a.length());
////////////////        System.out.println(a.charAt(3));
////////////////        System.out.println(a.substring(0));
////////////////        System.out.println(a.substring(2,4));
////////////////        System.out.println(a.contains("kit"));
////////////////        System.out.println(a.toUpperCase());
////////////////        System.out.println(a.replace("A","S"));
////////////////        System.out.println(a.indexOf("n"));
////////////////        System.out.println(a.trim());
////////////////        //String [] Str(a.)
////////////////        Scanner sc=new Scanner(System.in);
////////////////        System.out.println("Enter Strings");
////////////////        String str1 = sc.next();
////////////////        String str2 = sc.next();
////////////////        boolean result=true;
////////////////
////////////////        if (str1.length() == str2.length()) {
////////////////
////////////////
////////////////            char[] temp1 = str1.toCharArray();
////////////////            char[] temp2 = str2.toCharArray();
////////////////            Arrays.sort(temp1);
////////////////            Arrays.sort(temp2);
////////////////            for(int i=0;i<str1.length();i++){
////////////////                if(temp1 [i]==temp2 [i])
////////////////                {
////////////////                    System.out.println("A");
////////////////                    result = true;
////////////////                }
////////////////                else{
////////////////                    System.out.println("NA");
////////////////                    break;
////////////////            }}
////////////////
////////////////
////////////////
////////////////        }
////////////////        else
////////////////            System.out.println("Length are not equal");
//////////////    }
//////////////}*/
//////////////
///////////////*
//////////////class Employee implements java.io.Serializable
//////////////{
//////////////private int id;
//////////////private String name;
//////////////public Employee()
//////////////{
//////////////    public void setId(int id)
//////////////    {
//////////////
//////////////    }
//////////////}
//////////////}
//////////////import java.util.*;
//////////////
//////////////public class Main {
//////////////    public static void main(String[] args) {
//////////////        Scanner sc = new Scanner(System.in);
//////////////        int year = sc.nextInt();
//////////////        int b = 0;
////////////////        for (int i = 2000; i < 2018; i++) {
////////////////            Calendar calendar = new GregorianCalendar(i, Calendar.FEBRUARY, 1);
////////////////            int numberOfDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
////////////////            System.out.println("February " + i + ": " + numberOfDays + " days");
////////////////        }
//////////////        if (year % 4 == 0 || year % 400 == 0) {
//////////////            System.out.println("12.09." + year);
//////////////        } else {
//////////////            for (int i = Calendar.JANUARY; i < Calendar.SEPTEMBER; i++) {
//////////////                Calendar calendar = new GregorianCalendar(year, i, 1);
//////////////                int numberOfDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//////////////
//////////////                b = b + numberOfDays;
//////////////            }
//////////////            System.out.println(b);
//////////////            b = 256 - b;
//////////////            System.out.println(b + ".09." + year);
//////////////        }
//////////////    }
//////////////}
//////////////import java.io.*;
//////////////import java.math.*;
//////////////import java.security.*;
//////////////import java.text.*;
//////////////import java.util.*;
//////////////import java.util.concurrent.*;
//////////////import java.util.function.*;
//////////////import java.util.regex.*;
//////////////import java.util.stream.*;
//////////////import static java.util.stream.Collectors.joining;
//////////////import static java.util.stream.Collectors.toList;
//////////////
//////////////public class Main {
//////////////
//////////////    // Complete the bonAppetit function below.
//////////////    static void bonAppetit(List<Integer> bill, int k, int b) {
//////////////        int temp1=0;
//////////////        int temp2=0;
//////////////        for(int i=0;i<bill.size();i++)
//////////////        {
//////////////            temp1=temp1+bill.get(i);
//////////////        }
//////////////        for(int i=0;i<bill.size();i++)
//////////////        {
//////////////            if(i==k)
//////////////            {
//////////////                continue;
//////////////            }
//////////////            temp2=temp2+bill.get(i);
//////////////        }
//////////////        temp1=temp1/2;
//////////////        temp2=temp2/2;
//////////////        if(temp1==b)
//////////////        {
//////////////            int res=temp1-temp2;
//////////////            System.out.println(res);
//////////////        }
//////////////        else if(temp2==b)
//////////////        {
//////////////            System.out.println("Bon Appetit");
//////////////        }
//////////////
//////////////    }
//////////////
//////////////    public static void main(String[] args) throws IOException {
//////////////        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//////////////
//////////////        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//////////////
//////////////        int n = Integer.parseInt(nk[0]);
//////////////
//////////////        int k = Integer.parseInt(nk[1]);
//////////////
//////////////        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//////////////                .map(Integer::parseInt)
//////////////                .collect(toList());
//////////////
//////////////        int b = Integer.parseInt(bufferedReader.readLine().trim());
//////////////
//////////////        bonAppetit(bill, k, b);
//////////////
//////////////        bufferedReader.close();
//////////////    }
//////////////}
//////////////class Main
//////////////{
//////////////    public static void main(String args[]) {
//////////////        Scanner sc = new Scanner(System.in);
//////////////        int n = sc.nextInt();
//////////////        int page = sc.nextInt();
//////////////        int count = 0;
//////////////        int i = 0;
//////////////        int j = 1;
//////////////        int res1=0;
//////////////        int res2=0;
//////////////        while (n >=j) {
//////////////            if (i == page || j == page) {
//////////////              //  System.out.println(count);
//////////////                res1=count;
//////////////               // return;
//////////////            }
//////////////            i = i + 2;
//////////////            j = j + 2;
//////////////            count++;
//////////////        }
//////////////        int count1 = 0;
//////////////        if(n%2==0) {
//////////////            int x = n + 1;
//////////////            int y = n;
//////////////
//////////////            while (y > 0) {
//////////////                if (x == page || y == page) {
//////////////                    System.out.println(count1);
//////////////                    res2=count1;
//////////////                    //return;
//////////////                }
//////////////                x = x - 2;
//////////////                y = y - 2;
//////////////                count1++;
//////////////            }
//////////////        }else
//////////////            {  int x = n ;
//////////////                int y = n-1;
//////////////               // int count1 = 0;
//////////////                while(y>0)
//////////////                {
//////////////                    if (x == page || y == page) {
//////////////                       // System.out.println(count1);
//////////////                        res2=count1;
//////////////                        //return;
//////////////                    }
//////////////                    x = x - 2;
//////////////                    y = y - 2;
//////////////                    count1++;
//////////////                }
//////////////            }
//////////////        int result=Math.min(res1,res2);
//////////////        System.out.println(result);
//////////////    }
//////////////}
//////////////
//////////////public class Main
//////////////{
//////////////    public static  void main(String args[])
//////////////    {
//////////////        Scanner sc=new Scanner(System.in);
//////////////        String[] nk = sc.nextLine().split(" ");
//////////////        int t=sc.nextInt();
//////////////        for(int j=0;j<t;j++){
//////////////        int count=0;
//////////////        int n = Integer.parseInt(nk[0]);
//////////////        int k = Integer.parseInt(nk[1]);
//////////////        int[] a = new int[n];
//////////////        for(int i=0;i<n;i++)
//////////////        {
//////////////            if(a[i]<=0)
//////////////            {
//////////////                count++;
//////////////            }
//////////////        }
//////////////        if(count<=k){
//////////////            System.out.println("YES");
//////////////        }
//////////////        System.out.println("NO");
//////////////    }
//////////////    }
//////////////}
//////////////public class Main
//////////////{
//////////////    public static void main(String args[])
//////////////    {
//////////////        Scanner sc=new Scanner(System.in);
//////////////        int i=sc.nextInt();
//////////////        int j=sc.nextInt();
//////////////        int k=sc.nextInt();
//////////////        int count=0;
//////////////        while(i<=j)
//////////////        {
//////////////
//////////////            int reversed=0;
//////////////            int x=i;
//////////////            while(x!=0)
//////////////            {
//////////////                int digit=x%10;
//////////////                reversed=reversed*10+digit;
//////////////                x/=10;
//////////////                //System.out.println(reversed);
//////////////            }
//////////////            int result=Math.abs((i-reversed))%k;
//////////////            if(result==0)
//////////////            {
//////////////                count++;
//////////////            }
//////////////            i=i+1;
//////////////        }
//////////////        System.out.println(count);
//////////////    }
//////////////
//////////////import java.util.*;
//////////////public class Main
//////////////{
//////////////    public static void main(String args[])
//////////////    {
//////////////        Scanner sc=new Scanner(System.in);
//////////////        int n=sc.nextInt();
//////////////        int arr[]=new int[n];
//////////////        for(int i=0;i<n;i++)
//////////////        {
//////////////            arr[i]=sc.nextInt();
//////////////        }
//////////////        for(int x=1;x<=5;x++)
//////////////        {
//////////////            for(int i=0;i<n;i++)
//////////////            {
//////////////                if(arr[i]==x)
//////////////                {
//////////////                    int k=i+1;
//////////////                    for(int j=0;j<n;j++)
//////////////                    {
//////////////                        if(arr[j]==k)
//////////////                        {
//////////////                            System.out.println(j+1);
//////////////                        }
//////////////                    }
//////////////                }
//////////////            }
//////////////        }
//////////////    }
//////////////}
//////////////
//////////////
//////////////class Main
//////////////{
//////////////    public static  void main(String args [] )
//////////////    {
//////////////        Scanner sc=new Scanner(System.in);
//////////////        int n=sc.nextInt();
//////////////        int temp=n;
//////////////        int count=0;
//////////////        while (temp>0) {
//////////////            int a = temp % 10;
//////////////            if (a == 0) {
//////////////                temp = temp / 10;
//////////////                continue;
//////////////            } else {
//////////////                temp = temp / 10;
//////////////                if (n % a == 0) {
//////////////                    count++;
//////////////                }
//////////////            }
//////////////        }
//////////////        System.out.println(count);
//////////////    }
//////////////}
//////////////
////////////// */
////////////////import java.util.*;
////////////////class Main
////////////////{
////////////////    public static void main(String args[])
////////////////    {
////////////////        Scanner sc=new Scanner(System.in);
////////////////        String str=sc.nextLine();
////////////////        String temp=str;
////////////////        long n=sc.nextLong();
////////////////        int counter=0;
////////////////        int count=0;
////////////////        for(int k=0;k<str.length();k++)
////////////////        {
////////////////            if(str.charAt(k)=='a')
////////////////            {count++;}
////////////////        }
////////////////        //System.out.println(count);
////////////////        if(count==str.length())
////////////////        {
////////////////            System.out.println(count*n);
////////////////            return;
////////////////        }
////////////////
////////////////        int i=0;
////////////////        while(true)
////////////////        {
////////////////         if(i==temp.length())
////////////////         {
////////////////             i=0;
////////////////         }
////////////////         str=str + str.charAt(i);
////////////////         if(str.length()==n)
////////////////         {
////////////////             break;
////////////////         }
////////////////         i++;
////////////////        }
////////////////       // System.out.println(str);
////////////////        for(int j=0;j<str.length();j++)
////////////////        {
////////////////            if(str.charAt(j)=='a')
////////////////            {
////////////////                counter++;
////////////////            }
////////////////        }
////////////////        System.out.println(counter);
////////////////    }
////////////////}
////////////////class Main
////////////////{
////////////////    public static void main(String args[])
////////////////    {
////////////////        Scanner sc=new Scanner(System.in);
////////////////        int a=sc.nextInt();
////////////////        int b=sc.nextInt();
////////////////        //double b=Math.sqrt(a);
////////////////        double c=Math.floor(Math.sqrt(a));
////////////////        double d=Math.ceil(Math.sqrt(a));
////////////////
////////////////      //  System.out.println(b);
////////////////       // System.out.println(c);
////////////////       // System.out.println(d);
////////////////        int count=(int)(Math.floor(Math.sqrt(b))-Math.ceil(Math.sqrt(a))+1);
////////////////        System.out.println(count);
////////////////    }
////////////////}
////////////////import java.io.*;
////////////////import java.math.*;
////////////////import java.security.*;
////////////////import java.text.*;
////////////////import java.util.*;
////////////////import java.util.concurrent.*;
////////////////import java.util.regex.*;
////////////////
////////////////public class Main {
////////////////
////////////////    // Complete the libraryFine function below.
////////////////    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
////////////////        int result=0;
////////////////
////////////////        if( (d1-d2)<=0 || (m1-m2)<=0 || (y1-y2)<=0)
////////////////        {
////////////////            result=0;
////////////////        }
////////////////        if((d1-d2)>0 && (m1-m2)==0)
////////////////        {
////////////////            result=(d1-d2)*15;
////////////////        }
////////////////        if((m1-m2)>0 && (y1-y2)==0)
////////////////        {
////////////////            result=(m1-m2)*500;
////////////////        }
////////////////        if((y1-y2)>0)
////////////////        {
////////////////            result=(y1-y2)*10000;
////////////////        }
////////////////        return result;
////////////////    }
////////////////
////////////////    private static final Scanner scanner = new Scanner(System.in);
////////////////
////////////////    public static void main(String[] args) throws IOException {
////////////////        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
////////////////
////////////////        String[] d1M1Y1 = scanner.nextLine().split(" ");
////////////////
////////////////        int d1 = Integer.parseInt(d1M1Y1[0]);
////////////////
////////////////        int m1 = Integer.parseInt(d1M1Y1[1]);
////////////////
////////////////        int y1 = Integer.parseInt(d1M1Y1[2]);
////////////////
////////////////        String[] d2M2Y2 = scanner.nextLine().split(" ");
////////////////
////////////////        int d2 = Integer.parseInt(d2M2Y2[0]);
////////////////
////////////////        int m2 = Integer.parseInt(d2M2Y2[1]);
////////////////
////////////////        int y2 = Integer.parseInt(d2M2Y2[2]);
////////////////
////////////////        int result = libraryFine(d1, m1, y1, d2, m2, y2);
////////////////
////////////////        bufferedWriter.write(String.valueOf(result));
////////////////        bufferedWriter.newLine();
////////////////
////////////////        bufferedWriter.close();
////////////////
////////////////        scanner.close();
////////////////    }
////////////////}
////////////////
////////////////class Main
////////////////{
////////////////    public static  void main(String args[])
////////////////    {
////////////////        int arr[]={5,4,4,2,2,8};
////////////////        int n=6;
////////////////        Arrays.sort(arr);
////////////////        for(int j=0;j<n;j++) {
////////////////            arr[j] = arr[j] - 2;
////////////////        }
////////////////        for(int k=0;k<n;k++){
////////////////                  System.out.print(arr[k] +"   ");
////////////////              }
////////////////    }
////////////////}
////////////////class Main
////////////////{
////////////////    public static void main(String args[])
////////////////    {
////////////////      Scanner sc=new Scanner(System.in);
////////////////      int count=0;
////////////////      int n=sc.nextInt();
////////////////      int arr[]=new int[n];
////////////////      for(int i=0;i<n;i++)
////////////////      {
////////////////          arr[i]=sc.nextInt();
////////////////      }
////////////////      Arrays.sort(arr);
////////////////      for(int i=0;i<n;i++)
////////////////      {
////////////////          if(arr[i]!=0)
////////////////          {
////////////////              int temp=arr[i];
////////////////              for(int j=i;j<n;j++)
////////////////              {
////////////////                  arr[j]=arr[j]-temp;
////////////////                  if(arr[j]>=0)
////////////////                  {
////////////////                      count++;
////////////////                  }
////////////////              }System.out.println(count);
////////////////              count=0;
////////////////          }
////////////////
////////////////      }
////////////////    }
////////////////}
////////////////class Main
////////////////{
////////////////    public  static  void main(String args[])
////////////////    {
////////////////        String s="abcac";
////////////////        int n=10;
////////////////        int count=0;
////////////////        String t="";
////////////////        int i=0;
////////////////        if(s.equals('a'))
////////////////        {
////////////////            System.out.println(n);
////////////////            return;
////////////////        }
////////////////        else if(s.equals("aa"))
////////////////        {
////////////////            System.out.println(2*n);
////////////////            return;
////////////////        }
////////////////        while(true)
////////////////        {
////////////////            t=t+s.charAt(i);
////////////////            i++;
////////////////            if(i==s.length()){i=0;}
////////////////            if(t.length()==(n-s.length()))
////////////////            {
////////////////                break;
////////////////            }
////////////////        }
////////////////        String result=s+t;
////////////////        for(int j=0;j<result.length();j++)
////////////////        {
////////////////            if(result.charAt(j)=='a')
////////////////            {count++;}
////////////////        }
////////////////        System.out.println(count);
////////////////    }
////////////////}
//////////////import java.io.*;
//////////////import java.math.*;
//////////////import java.security.*;
//////////////import java.text.*;
//////////////import java.util.*;
//////////////import java.util.concurrent.*;
//////////////import java.util.regex.*;
//////////////
//////////////public class Main {
//////////////
////////////// // Complete the repeatedString function below.
////////////// static long repeatedString(String s, long n) {
//////////////  int counta=0;
//////////////  long count=0;
//////////////  for(int i=0;i<s.length();i++)
//////////////  {
//////////////   if(s.charAt(i)=='a')
//////////////   {
//////////////    counta++;
//////////////   }
//////////////  }
//////////////  long temp=  (n/(s.length()));
//////////////  count=counta*temp;
//////////////  for(int j=0;j<(n-(temp*s.length()));j++)
//////////////  {
//////////////   if(s.charAt(j)=='a')
//////////////   count++;
//////////////  }
//////////////  return count;
////////////// }
//////////////
////////////// private static final Scanner scanner = new Scanner(System.in);
//////////////
////////////// public static void main(String[] args) throws IOException {
//////////////  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//////////////
//////////////  String s = scanner.nextLine();
//////////////
//////////////  long n = scanner.nextLong();
//////////////  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//////////////
//////////////  long result = repeatedString(s, n);
//////////////
//////////////  bufferedWriter.write(String.valueOf(result));
//////////////  bufferedWriter.newLine();
//////////////
//////////////  bufferedWriter.close();
//////////////
//////////////  scanner.close();
////////////// }
//////////////}
//////////////class Main
//////////////{
////////////// public  static void main(String [] args)
////////////// {
//////////////  Scanner in=new Scanner(System.in);
//////////////  long b = in.nextLong();
//////////////  long w = in.nextLong();
//////////////  long x = in.nextLong();
//////////////  long y = in.nextLong();
//////////////  long z = in.nextLong();
//////////////  x = x>y? ((x-y>z)? y+z : x) : x;
//////////////  y = y>x? ((y-x>z)? x+z : y) : y;
////////////// }
////////////////}
//////////////import java.io.*;
//////////////import java.math.*;
//////////////import java.security.*;
//////////////import java.text.*;
//////////////import java.util.*;
//////////////import java.util.concurrent.*;
//////////////import java.util.regex.*;
//////////////
//////////////class Main
//////////////{
////////////// // Returns true if n is a Kaprekar number, else false
////////////// static boolean iskaprekar(long n)
////////////// {
//////////////  long temp=n;
//////////////  long d=0;
//////////////  while(temp!=0)
//////////////  {
//////////////   d++;
//////////////   temp=temp/10;
//////////////  }
//////////////  if (n == 1)
//////////////   return true;
//////////////
//////////////  // Count number of digits in square
//////////////  long sq_n = n * n;
//////////////  long count_digits = 0;
//////////////  while (sq_n != 0)
//////////////  {
//////////////   count_digits++;
//////////////   sq_n /= 10;
//////////////  }
//////////////
//////////////  sq_n = n*n; // Recompute square as it was changed
//////////////
//////////////  // Split the square at different poitns and see if sum
//////////////  // of any pair of splitted numbers is equal to n
//////////////  long eq_parts = (long) Math.pow(10, d);
//////////////  long sum=sq_n/eq_parts + sq_n%eq_parts;
//////////////  if(sum==n)
//////////////  {
//////////////   return true;
//////////////  }
//////////////  // compare with original number
//////////////  return false;
////////////// }
//////////////
////////////// // Driver method
////////////// public static void main (String[] args)
////////////// {
//////////////  // System.out.println("Printing first few Kaprekar Numbers" +
//////////////  //
//////////////  Scanner sc=new Scanner(System.in);
//////////////  long p=sc.nextLong();
//////////////  long q=sc.nextLong();
//////////////  int count=0;
//////////////
//////////////  for (long i=p; i<=q; i++)
//////////////  {
//////////////   if (iskaprekar(i)){
//////////////    System.out.print(i + " ");
//////////////    count++;
//////////////   }
//////////////  }
//////////////  if(count==0)
//////////////  {
//////////////   System.out.println("INVALID RANGE");
//////////////  }
////////////// }
//////////////}
//////////////class Main
//////////////{
////////////// public static void main(String args[])
//////////////   {
//////////////       Scanner sc=new Scanner(System.in);
//////////////        int arr[]=new int[5];
//////////////        int check=0;
//////////////       ArrayList <Integer> al=new <Integer> ArrayList();
//////////////       for(int i :arr)
//////////////       {
//////////////           al.add(sc.nextInt());
//////////////       }
//////////////       for(int j=0;j<al.size();j++) {
//////////////           int freq = Collections.frequency(al,al.get(j));
//////////////           check=check+freq;
//////////////           System.out.println( al.get(j)  + " ---" + freq);
//////////////           if(check==al.size())
//////////////           {
//////////////               break;
//////////////           }
//////////////       }
//////////////
//////////////
//////////////   }
//////////////}
//////////////class Main
//////////////{
//////////////    public static void main(String args[])
//////////////    {
//////////////        int arr[]={1,2,4,5,6};
//////////////        ArrayList <Integer> al=new ArrayList<>();
//////////////        int value=4;
//////////////        for(int i=0;i<al.size();i++)
//////////////        {
//////////////            if(al.get(i)<=value && al.get(i+1)>value)
//////////////            {
//////////////                al.add(value);
//////////////            }
//////////////        }
//////////////        for(int i=0;i<arr.length;i++)
//////////////        {
//////////////            System.out.print(arr[i]+" ");
//////////////        }
//////////////    }
//////////////}
////////////import java.io.*;
////////////import java.math.*;
////////////import java.security.*;
////////////import java.text.*;
////////////import java.util.*;
////////////import java.util.concurrent.*;
////////////import java.util.regex.*;
////////////
////////////public class Main {
////////////    public static void main(String args[])
////////////    {
////////////        Scanner sc=new Scanner(System.in);
////////////        int n=sc.nextInt();
////////////        int [][] arr=new int[n][n];
////////////        for(int i=0;i<n;i++)
////////////        {
////////////            for(int j=0;j<n;j++)
////////////            {
////////////                arr[i][j]=sc.nextInt();
////////////            }
////////////        }
////////////        for(int i=0;i<n;i++)
////////////        {
////////////            for(int j=0;j<n;j++)
////////////            {
////////////                if(i==0 && j==0 && i==(n-1) && j==n-1)
////////////                {
////////////                    continue;
////////////                }else if(arr[i][j]>arr[i][j-1] && arr[i][j] > arr[i][j+1] && arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i-1][j])
////////////                {
////////////                    arr[i][j]=0;
////////////                }
////////////            }
////////////        }
////////////        for(int i=0;i<n;i++)
////////////        {
////////////            for(int j=0;j<n;j++)
////////////            {
////////////                System.out.print(arr[i][j]);
////////////                System.out.println();
////////////            }
////////////        }
////////////    }
////////////}
//////////
////////////
////////////import java.util.Scanner;
////////////
////////////public class  Main
////////////{
////////////    public static void main(String args[])
////////////    {
////////////        int i = 4;
////////////        double d = 4.0;
////////////        String s = "HackerRank ";
////////////
////////////        Scanner sc=new Scanner(System.in);
////////////        int i1=sc.nextInt();
////////////        String s1=sc.nextLine();
////////////        double d1=sc.nextDouble();
////////////
////////////
////////////        System.out.println(i+i1);
////////////        System.out.println(d+d1);
////////////        System.out.println(s+s1);
////////////        }
////////////    }
///////////*package whatever //do not write package name here */
//////////
////////////import java.util.*;
////////////import java.lang.*;
////////////import java.io.*;
////////////
////////////class Main {
////////////    public static void main (String[] args) {
////////////
////////////        Scanner sc=new Scanner(System.in);
////////////        int t=sc.nextInt();
////////////        while(t>0)
////////////        {
////////////            String s= sc.next();
////////////            int count=0;
////////////            for(int i=0;i<s.length()-3;i++)
////////////            {
////////////                if(s.charAt(i)=='g' && s.charAt(i+1)=='f' && s.charAt(i+2)=='g')
////////////                {
////////////                    count++;
////////////                }
////////////            }
////////////            if(count>0)
////////////            {
////////////                System.out.println(count);
////////////            }else
////////////                System.out.println("-1");
////////////            t--;
////////////        }
////////////    }
////////////}
//////////
////////////import java.io.*;
////////////import java.util.*;
////////////import java.text.*;
////////////import java.math.*;
////////////import java.util.regex.*;
////////////
////////////public class Main {
////////////
////////////    public static void main(String[] args) throws IOException {
////////////        int i = 4;
////////////        double d = 4.0;
////////////        String s = "HackerRank ";
////////////
////////////        Scanner scan = new Scanner(System.in);
////////////        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
////////////        int i1 = scan.nextInt();
////////////        double d1 = scan.nextDouble();
////////////        String s1 = ob.readLine();
////////////
////////////        System.out.println(i + i1);
////////////        System.out.println(d + d1);
////////////        System.out.println(s1 + s);
////////////        scan.close();
////////////    }
////////////}
//////////// Interface
////////////interface Animal {
////////////    public void animalSound(); // interface method (does not have a body)
////////////    public void sleep(); // interface method (does not have a body)
////////////}
////////////interface  dog
////////////{
////////////    public void bark(int a);
////////////}
////////////
////////////// Pig "implements" the Animal interface
////////////class Pig implements Animal , dog {
////////////    public void animalSound() {
////////////        // The body of animalSound() is provided here
////////////        System.out.println("The pig says: wee wee");
////////////    }
////////////    public void sleep() {
////////////        // The body of sleep() is provided here
////////////        System.out.println("Zzz");
////////////    }
////////////
////////////    @Override
////////////    public void bark(int a)
////////////    {
////////////        System.out.println("dog is bark");
////////////        System.out.println(a);
////////////    }
////////////}
////////////
////////////class Main {
////////////    public static void main(String[] args) {
////////////        Pig myPig = new Pig();  // Create a Pig object
////////////        myPig.animalSound();
////////////        myPig.sleep();
////////////        myPig.bark(5);
////////////    }
////////////}
////////////interface  shivam
////////////{
////////////    public  void archu();
////////////    public void chaubey();
////////////}
////////////class Main implements shivam
////////////{
////////////   public void archu()
////////////        {
////////////            System.out.println("Crush");
////////////        }
////////////        public void chaubey()
////////////        {
////////////            System.out.println("Crush 2");
////////////        }
////////////    public static void main(String args[])
////////////    {
////////////        Main m=new Main();
////////////        m.archu();
////////////        m.chaubey();
////////////    }
////////////
////////////}
////////////import java.util.*;
////////////class  Main
////////////{
////////////    public static void main(String args[])
////////////    {
////////////        Vector v= new Vector();
////////////        v.add(1);
////////////        v.add("Ankit");
////////////        v.add(2);
////////////        v.add("Bamal");
////////////        v.add(3);
////////////        v.add("Priyesh");
////////////        v.add(4);
////////////        v.add("Ghosh");
////////////
////////////        System.out.println(v.size());
////////////    }
////////////}
////////////
////////////import java.util.*;
////////////class  Main
////////////{
////////////    public static void main(String args[])
////////////    {
////////////        int value=0;
////////////        int hole=0;
////////////        int a[]={10,8,4,5,1,2};
////////////        for(int i=1;i<a.length;i++)
////////////        {
////////////            value=a[i];
////////////            hole=i;
////////////            while(hole>0 && a[hole-1]>value)
////////////            {
////////////                a[hole]=a[hole-1];
////////////                hole=hole-1;
////////////            }
////////////            a[hole]=value;
////////////        }
////////////        for(int i=0;i<a.length;i++)
////////////        {
////////////            System.out.println(a[i]);
////////////        }
////////////    }
////////////}
//////////
//////////
///////////* IMPORTANT: Multiple classes and nested static classes are supported */
//////////
///////////*
////////// * uncomment this if you want to read input.
////////////imports for BufferedReader
//////////import java.io.BufferedReader;
//////////import java.io.InputStreamReader;
//////////
////////////import for Scanner and other utility classes
//////////import java.util.*;
//////////*/
//////////
//////////// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
////////////import java.util.*;
////////////class Main {
////////////    public static void main(String args[] ) throws Exception {
////////////        /* Sample code to perform I/O:
////////////         * Use either of these methods for input
////////////
////////////        //BufferedReader
////////////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////////////        String name = br.readLine();                // Reading input from STDIN
////////////        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
////////////
////////////        //Scanner
////////////        Scanner s = new Scanner(System.in);
////////////        String name = s.nextLine();                 // Reading input from STDIN
////////////        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
////////////
////////////        */
////////////
////////////        // Write your code here
////////////        Scanner sc= new Scanner(System.in);
////////////        int t=sc.nextInt();
////////////        while(t>0)
////////////        {
////////////            int choice=sc.nextInt();
////////////
////////////            {
////////////                switch(choice %12)
////////////                {
////////////                    case 1:
////////////                        System.out.println(choice+11 +" WS");
////////////                        break;
////////////
////////////                    case 2:
////////////                        System.out.println(choice+9 +" MS");
////////////                        break;
////////////
////////////                    case 3:
////////////                        System.out.println(choice+7 +" AS");
////////////                        break;
////////////
////////////                    case 4:
////////////                        System.out.println(choice+5 +" AS");
////////////                        break;
////////////
////////////                    case 5:
////////////                        System.out.println(choice+3 +" MS");
////////////                        break;
////////////
////////////                    case 6:
////////////                        System.out.println(choice+1 +" WS");
////////////                        break;
////////////
////////////                    case 7:
////////////                        System.out.println(choice-1 +" WS");
////////////                        break;
////////////
////////////                    case 8:
////////////                        System.out.println(choice-3 +" MS");
////////////                        break;
////////////
////////////                    case 9:
////////////                        System.out.println(choice-5 +" AS");
////////////                        break;
////////////
////////////                    case 10:
////////////                        System.out.println(choice-7 +" AS");
////////////                        break;
////////////
////////////                    case 11:
////////////                        System.out.println(choice-9 +" WS");
////////////                        break;
////////////
////////////                    case 0:
////////////                        System.out.println(choice-11 + "WS");
////////////                }
////////////            }
////////////            t--;
////////////        }
////////////
////////////    }
////////////}
/////////////* IMPORTANT: Multiple classes and nested static classes are supported */
////////////
/////////////*
//////////// * uncomment this if you want to read input.
//////////////imports for BufferedReader
////////////import java.io.BufferedReader;
////////////import java.io.InputStreamReader;
////////////
//////////////import for Scanner and other utility classes
////////////import java.util.*;
////////////*/
////////////
////////////// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
////////////import java.util.*;
////////////class Main {
////////////    public static void main(String args[] ) throws Exception {
////////////        /* Sample code to perform I/O:
////////////         * Use either of these methods for input
////////////
////////////        //BufferedReader
////////////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////////////        String name = br.readLine();                // Reading input from STDIN
////////////        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
////////////
////////////        //Scanner
////////////        Scanner s = new Scanner(System.in);
////////////        String name = s.nextLine();                 // Reading input from STDIN
////////////        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
////////////
////////////        */
////////////
////////////        // Write your code here
////////////        Scanner sc=new Scanner(System.in);
////////////        int t=sc.nextInt();
////////////
////////////        while(t>0)
////////////        {
////////////            int count=0;
////////////            String a=sc.nextLine();
////////////            sc.nextLine();
////////////            String b=sc.next();
////////////            for(int i=0;i<a.length();i++)
////////////            {
////////////                for(int j=0;j<b.length();j++)
////////////                {
////////////                    if(a.charAt(i)==b.charAt(j))
////////////                    {
////////////                        count++;
////////////                    }
////////////                }
////////////            }
////////////           // System.out.println((a.length()+b.length())-(2*count));
////////////            System.out.println(a.length()+b.length());
////////////            t--;
////////////        }
////////////
////////////    }
////////////}
////////////
////////////
////////////import java.util.Scanner;
////////////
////////////class Main
////////////{
////////////    public  static  void main(String args[])
////////////    {
////////////        Scanner sc=new Scanner(System.in);
////////////        int n=sc.nextInt();
////////////        int res[]=new int[n];
////////////        int arr[]=new int[n];
////////////        for(int i=0;i<n;i++)
////////////        {
////////////            arr[i]=sc.nextInt();
////////////        }
////////////        int temp[]=new int[n];
////////////        temp[0]=0;
////////////        for (int i=1;i<n;i++)
////////////        {
////////////            temp[i]=arr[i-1];
////////////        }
////////////        for(int i=0;i<n;i++)
////////////        {
////////////            res[i]=arr[i]-temp[i];
////////////        }
////////////        for(int i=0;i<n;i++)
////////////        {
////////////            System.out.print(res[i] +" ");
////////////        }
////////////        }
////////////    }
////////////
////////////import java.util.*;
////////////
////////////
////////////class Main
////////////{
////////////    public  static void main(String args[])
////////////    {
////////////        Scanner sc=new Scanner(System.in);
////////////        String s="bcaadac";
////////////        String t="abcabad";
////////////        int count=0;
////////////        for(int i=0;i<t.length();i++)
////////////        {
////////////            if(t.charAt(i)==s.charAt(i))
////////////            {
////////////                count++;
////////////            }
////////////        }
////////////        System.out.println(count);
////////////    }
////////////}
//////////
///////////* package codechef; // don't place package name! */
///////////*
//////////
//////////import java.util.*;
//////////import java.lang.*;
//////////import java.io.*;
//////////
///////////* Name of the class has to be "Main" only if the class is public. * /
//////////class Main
//////////{
//////////    public static void main (String[] args) throws java.lang.Exception
//////////    {
//////////        Scanner sc=new Scanner(System.in);
//////////        int T=sc.nextInt();
//////////        while(T >0)
//////////        {
//////////           int n=sc.nextInt();
//////////            int q=sc.nextInt();
//////////           int arr[]=new int[n];
//////////            for(int i=0;i<n;i++)
//////////            {
//////////                arr[i]=sc.nextInt();
//////////            }
//////////            while(q-- >0){
//////////                String A=sc.next();
//////////                int B=sc.nextInt();
//////////                int C=sc.nextInt();
//////////                int sum=0;
//////////
//////////                if(A.charAt(0)=='Q')
//////////                {
//////////                    int l=(1+B)/2; int r=(C+n)/2;
//////////
//////////                    for(int i=l-1;i<r;i++)
//////////                    {
//////////                        sum=sum+arr[i];
//////////                    }
//////////                }else
//////////                {
//////////                    arr[B-1]=C;
//////////                }
//////////                if(A.charAt(0)=='Q')
//////////                    System.out.println(sum);
//////////            }
//////////            T--;
//////////        }
//////////
//////////    }
//////////}
////////////
//////////
//////////
//////////import java.util.*;
//////////
//////////
//////////abstract class Vehicle
//////////{
//////////    protected static double price;
//////////    protected static double mileage;
//////////    protected static int fuel;
//////////    Vehicle(double price,double mileage,int fuel)
//////////    {
//////////        this.price=price;
//////////        this.mileage=mileage;
//////////        this.fuel=fuel;
//////////    }
//////////
//////////    public int getFuel()
//////////    {
//////////        return fuel;
//////////    }
//////////
//////////    abstract public void addFuel(int f);
//////////}
//////////
//////////
//////////class Main extends Vehicle
//////////{
//////////    Main(double price, double mileage, int fuel)
//////////    {
//////////        super(price, mileage, fuel);
//////////    }
//////////    static String car_name="Mercedes Benz ";
//////////
//////////    public void addFuel(int f)
//////////    {
//////////        fuel=fuel+f;
//////////    }
//////////
//////////    public int getFuel()
//////////    {
//////////        return fuel;
//////////    }
//////////
//////////    public static void main(String[] args)
//////////    {
//////////        Main car=new Main(7000000,15,10);
//////////        car.addFuel(5);
//////////        System.out.println("Car Name : "+car_name);
//////////        System.out.println("Price : "+price);
//////////        System.out.println("Mileage : "+mileage+" Kmpl");
//////////        System.out.println("Available Fuel : "+car.getFuel()+" L");
//////////    }
//////////
//////////
//////////}
//////////class Main
//////////{
//////////    static  void name(int n)
//////////    {
//////////        if(n==0)
//////////            return;
//////////        else
//////////        {
//////////            System.out.println(n);
//////////            name(n-1);
//////////        }
//////////
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        int n=5;
//////////        name(n);
//////////
//////////    }
//////////}
//////////*/
//////////
//////////
///////////*
////////// 1-  With the help of recursion print name
//////////class Main
//////////{
//////////     static void  ankit(int n)
//////////     {
//////////         if(n==0){return;}
//////////         System.out.println("Ankit ");
//////////         ankit(n-1);
//////////     }
//////////     public static void main(String args[])
//////////     {
//////////         ankit(5);
//////////     }
//////////}
//////////*/
//////////
//////////
///////////*
//////////
//////////import java.io.BufferedReader;
//////////import java.io.InputStreamReader;
//////////
////////////Print numbers from 1 to n
//////////class Main
//////////{
//////////    public static void num(int n)
//////////    {
//////////        if(n==0)
//////////            return;
//////////        //System.out.printf("%d  ",n);
//////////
//////////        num(n-1);
//////////        num2(n);
//////////    }
//////////   static void num2(int n)
//////////    {
//////////        System.out.printf("%d  ",n);
//////////    }
//////////    public static void main(String args[])throws Exception
//////////    {
//////////        InputStreamReader is=new InputStreamReader(System.in);
//////////        BufferedReader br=new BufferedReader(is);
//////////        num(Integer.parseInt(br.readLine()));
//////////    }
//////////}
//////////*/
//////////
//////////
///////////*
////////// Find factorial using recursion
//////////import java.util.Scanner;
//////////
//////////class Main
//////////{
//////////    private static int fact(int n)
//////////    {
//////////        if(n==0)
//////////            return 1;
//////////        else
//////////        return n*fact(n-1);
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        Scanner sc=new Scanner(System.in);
//////////        int n=sc.nextInt();
//////////        System.out.println(fact(n));
//////////    }
//////////}
//////////*/
//////////
////////////class Main
////////////{
////////////    public static void main(String args[])
////////////    {
////////////        int n=234;
////////////        System.out.println((int)Math.floor(Math.log10(n))+1);
////////////    }
////////////}
//////////
//////////
//////////
//////////// Revision
////////////class Main
////////////{
////////////    public static void main(String args[])
////////////    {
////////////        System.out.println("Hello World");
////////////    }
////////////}
////////////
////////////import java.util.HashSet;
////////////
////////////class Main
//////////// {
////////////     public static void main(String args[])
////////////     {
////////////         String str="Ankit";
////////////         HashSet <Integer> hs=new HashSet<>();
////////////        // System.out.println(hs.size());
////////////         hs.add(3);
////////////         hs.add(5);
////////////         hs.add(3);
////////////         System.out.println(hs);
////////////         hs.clear();
////////////     }
//////////// }
//////////
////////////import java.util.HashMap;
////////////
////////////class Main
////////////{
////////////    public static void main(String args[])
////////////    {
////////////        int arr[]={1,2,3,4,5,6,7,8,9};
////////////        HashMap<Integer,Integer> hm=new HashMap<>();
//////////////        hm.put(4,3);
//////////////        hm.put(5,2);
//////////////        hm.replace(5,2);
////////////        for (int i = 0; i < arr.length; i++) {
////////////            if(arr[i]==4)
////////////                hm.put(arr[i],arr[i+1]);
////////////        }
////////////        System.out.println(hm);
////////////    }
////////////}
//////////
//////////import java.io.BufferedReader;
//////////import java.io.InputStreamReader;
//////////import java.util.HashMap;
//////////import java.util.HashSet;
//////////import java.util.Scanner;
//////////
////////////class Main
////////////{
////////////    public static void main(String args[])
////////////    {
////////////        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
////////////        int arr[]={2,2,3,1,2,3,4,1,2,3,4,5,5,6};
////////////        for (int i = 0; i <arr.length ; i++) {
////////////            int key=arr[i];
////////////            if(hs.containsKey(arr[i])==true)
////////////            {
////////////                hs.put(arr[i],hs.get(arr[i])+1);
////////////            }else
////////////                hs.put(arr[i],1);
////////////        }
////////////       if(hs.containsValue(1)==true)
////////////           System.out.println(hs.get(5));
////////////       System.out.println(hs);
////////////    }
////////////}
//////////
////////////
//////////
////////////class Main
////////////{
////////////    public static void main(String args[])
////////////    {
////////////        HashMap<Integer,Integer> hmp=new HashMap<>();
////////////        int arr[]=new int[]{2,3,4,3,2,4,1,2,3,4};
////////////        for(int i=0;i<arr.length;i++)
////////////        {
////////////            if(hmp.containsKey(arr[i])==true)
////////////            {
////////////                hmp.put(arr[i],hmp.get(arr[i])+1);
////////////            }else
////////////                hmp.put(arr[i],1);
////////////        }
////////////        System.out.println(hmp);
////////////    }
////////////}
////////////
////////////class Main
//////////
//////////
////////////{
////////////    public static boolean search(int arr[],int x,int l,int u)
////////////    {
////////////        if(l>u)
////////////            return false;
////////////        if(arr[l]==x)
////////////            return true;
////////////        if(arr[u]==x)
////////////            return true;
////////////
////////////        return search(arr, x, l+1, u-1);
////////////    }
////////////    public static void main(String args[])
////////////    {
////////////        int arr[]=new int[]{1,2,3,4,5,6,7};
////////////        int x=3;
////////////        System.out.println(search(arr,x,0,arr.length-1));
////////////    }
////////////}
//////////
//////////
//////////
////////////
//////////
//////////
//////////
////////////import java.io.*;
////////////import java.util.*;
////////////
////////////
////////////public class Main {
////////////
////////////    public static void main(String[] args) {
////////////        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
////////////        Scanner sc=new Scanner(System.in);
////////////        int T=sc.nextInt();
////////////        while(T-->0)
////////////        {
////////////            int H=sc.nextInt();
////////////            int L=sc.nextInt();
////////////            int hens_num = 4H
////////////            if(L<2)
////////////                System.out.println("-1");
////////////            else
////////////                System.out.println(hens_num/2);
////////////        }
////////////    }
////////////}
////////////
////////////import java.io.*;
////////////import java.util.*;
////////////
////////////public class Main {
////////////
////////////    public static void main(String[] args) throws Exception {
////////////        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
////////////        Scanner sc=new Scanner(System.in);
////////////        int T=sc.nextInt();
////////////        while(T-->0)
////////////        {
////////////            InputStreamReader is=new InputStreamReader(System.in);
////////////            BufferedReader br=new BufferedReader(is);
////////////            String s=br.readLine();
////////////            for(int i=0;i<s.length();i++)
////////////            {
////////////                if(i%2==0)
////////////                    System.out.print(s.charAt(i));
////////////            }
////////////            System.out.print(" ");
////////////            for(int i=0;i<s.length();i++)
////////////            {
////////////                if(i%2!=0)
////////////                    System.out.print(s.charAt(i));
////////////            }
////////////            System.out.println();
////////////        }
////////////    }
////////////}
//////////
////////////
////////////class  Main
////////////{
////////////    public static void main(String args[]) throws Exception
////////////    {
////////////      //  Scanner sc=new Scanner(System.in);
////////////        InputStreamReader is=new InputStreamReader(System.in);
////////////        BufferedReader br=new BufferedReader(is);
////////////        int n=Integer.parseInt(br.readLine());
////////////        int q=n;
////////////        HashMap<String,Integer>hmp=new HashMap<String, Integer>();
////////////        while(n-->0)
////////////    {
////////////        String K=br.readLine();
////////////        int V=Integer.parseInt(br.readLine());
////////////        hmp.put(K,V);
////////////    }
////////////        while(q-->0)
////////////        {
////////////            String key=br.readLine();
////////////        }
////////////    }
////////////}
//////////
//////////
//////////
////////////imports for BufferedReader
//////////import java.io.BufferedReader;
//////////import java.io.InputStreamReader;
//////////
//////////
//////////import java.util.*;
//////////
//////////
//////////// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
//////////
//////////class Main {
//////////    public static void main(String args[] ) throws Exception {
//////////
//////////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//////////        int n=Integer.parseInt(br.readLine());
//////////        int k=Integer.parseInt(br.readLine());
//////////        int arr[]=new int[n];
//////////        int count=0;
//////////        for(int i=0;i<n;i++)
//////////            arr[i]=Integer.parseInt(br.readLine());
//////////
//////////        for (int i=0; i<n; i++){
//////////            for (int j=i+1; j<n; j++){
//////////                if (i==j){
//////////                    break;
//////////                }else{
//////////                    if (a[i]+a[j]==k){
//////////                        verify = true;
//////////                        System.out.println("YES");
//////////                        break;
//////////                    }
////////////                }
//////////        }
//////////        System.out.println("NO");
//////////        System.out.println(count);
//////////    }
//////////}
////////
//////////import java.util.*;
//////////import java.lang.*;
//////////class TestClass {
//////////    public static void main(String args[] ) throws Exception {
//////////        Scanner sc=new Scanner(System.in);
//////////        long t=sc.nextLong();
//////////        while(t-->0)
//////////        {
//////////            long n=sc.nextLong();
//////////            long d=sc.nextLong();
//////////            long arr[]=new Long[n];
//////////            for(int i=0;i<n;i++)
//////////                arr[i]=sc.nextLong();
//////////
//////////
//////////            int start=0;
//////////            int end= (int) (n-1);
//////////            while(start<end)
//////////            {
//////////                long temp=arr[start];
//////////                arr[start]=arr[end];
//////////                arr[end]=temp;
//////////                start++;
//////////                end--;
//////////            }
//////////
//////////            start=0;
//////////            end= (int) (d-1);
//////////            while(start<end)
//////////            {
//////////                long temp=arr[start];
//////////                arr[start]=arr[end];
//////////                arr[end]=temp;
//////////                start++;
//////////                end--;
//////////            }
//////////
//////////            start= (int) d;
//////////            end= (int) (n-1);
//////////            while(start<end)
//////////            {
//////////                long temp=arr[start];
//////////                arr[start]=arr[end];
//////////                arr[end]=temp;
//////////                start++;
//////////                end--;
//////////            }
//////////
//////////
//////////            for(int i=0;i<n;i++)
//////////                System.out.print(arr[i]+" ");
//////////        }
//////////    }
//////////}
//////////class Main
//////////{
//////////    public static  void main(String args[])
//////////    {
//////////        Scanner sc=new Scanner(System.in);
//////////        int n=sc.nextInt();
//////////        int d=sc.nextInt();
//////////        int arr[]=new int[n];
//////////        for(int i=0;i<n;i++)
//////////            arr[i]=sc.nextInt();
//////////
//////////        rotate_right(arr,d);
//////////    }
//////////    public static void rotate_right(int arr[],int d)
//////////    {
//////////        int start=0;
//////////        int end=arr.length-1;
//////////        while(start<end)
//////////        {
//////////            int temp=arr[start];
//////////            arr[start]=arr[end];
//////////            arr[end]=temp;
//////////            start++;
//////////            end--;
//////////        }
//////////         start=0;
//////////        end=d-1;
//////////        while(start<end)
//////////        {
//////////            int temp=arr[start];
//////////            arr[start]=arr[end];
//////////            arr[end]=temp;
//////////            start++;
//////////            end--;
//////////        }
//////////
//////////        start=d;
//////////        end=arr.length-1;
//////////        while(start<end)
//////////        {
//////////            int temp=arr[start];
//////////            arr[start]=arr[end];
//////////            arr[end]=temp;
//////////            start++;
//////////            end--;
//////////        }
//////////        for(int i=0;i<arr.length;i++)
//////////        System.out.print(arr[i]+" ");
//////////    }
//////////}
////////
////////
////////
////////
//////////
//////////
//////////import java.io.BufferedReader;
//////////import java.io.InputStreamReader;
//////////import java.util.*;
//////////
//////////
//////////class Main {
//////////    public static void main(String args[] ) throws Exception {
//////////
//////////        Scanner sc=new Scanner(System.in);
//////////        int q=sc.nextInt();
//////////        while(q-->0)
//////////        {
//////////            int n=sc.nextInt();
//////////            int arr[]=new int[n];
//////////            for(int i=0;i<n;i++)
//////////                arr[i]=sc.nextInt();
//////////
//////////
//////////            max_val(arr,n);
//////////
//////////        }
//////////
//////////    }
//////////    public static void max_val(int arr[],int n)
//////////    {
//////////        int a[]=new int[n];
//////////        int b[]=new int[n];
//////////
//////////        for(int i=0;i<n;i++)
//////////        {
//////////            a[i]=arr[i]+1;
//////////            b[i]=arr[i]-1;
//////////        }
//////////
//////////        int x=a[0];
//////////        int y=a[0];
//////////        for(int i=0;i<n;i++)
//////////        {
//////////            x=Math.max(x,a[i]);
//////////            y=Math.min(y,a[i]);
//////////        }
//////////        int ans1=x-y;
//////////
//////////         x=b[0];
//////////         y=b[0];
//////////        for(int i=0;i<n;i++)
//////////        {
//////////            x=Math.max(x,b[i]);
//////////            y=Math.min(y,b[i]);
//////////        }
//////////        int ans2=x-y;
//////////
//////////        System.out.println(Math.max(ans1,ans2));
//////////
//////////    }
//////////
//////////}
////////
//////////
//////////// Efficient Java program to find maximum
//////////// value of |arr[i] - arr[j]| + |i - j|
//////////import java.io.*;
//////////class Main {
//////////
//////////    // Return maximum |arr[i] -
//////////// arr[j]| + |i - j|
//////////    static int findValue(int arr[], int n)
//////////    {
//////////        int a[] = new int[n];
//////////        int b[] = new int[n];
//////////        int tmp;
//////////
//////////        // Calculating first_array
//////////        // and second_array
//////////        for (int i = 0; i < n; i++)
//////////        {
//////////            a[i] = (arr[i] + i);
//////////            b[i] = (arr[i] - i);
//////////        }
//////////
//////////        int x = a[0], y = a[0];
//////////
//////////        // Finding maximum and
//////////        // minimum value in
//////////        // first_array
//////////        for (int i = 0; i < n; i++)
//////////        {
//////////            if (a[i] > x)
//////////                x = a[i];
//////////
//////////            if (a[i] < y)
//////////                y = a[i];
//////////        }
//////////
//////////        // Storing the difference
//////////        // between maximum and
//////////        // minimum value in first_array
//////////        int ans1 = (x - y);
//////////
//////////        x = b[0];
//////////        y = b[0];
//////////
//////////        // Finding maximum and
//////////        // minimum value in
//////////        // second_array
//////////        for (int i = 0; i < n; i++)
//////////        {
//////////            if (b[i] > x)
//////////                x = b[i];
//////////
//////////            if (b[i] < y)
//////////                y = b[i];
//////////        }
//////////
//////////        // Storing the difference
//////////        // between maximum and
//////////        // minimum value in second_array
//////////        int ans2 = (x - y);
//////////
//////////        return Math.max(ans1, ans2);
//////////    }
//////////
//////////    // Driver Code
//////////    public static void main(String[] args)
//////////    {
//////////        Scanner sc=new Scanner(System.in);
//////////        int q=sc.nextInt();
//////////        while(q-->0)
//////////        {
//////////            int n=sc.nextInt();
//////////            int arr[]=new int[n];
//////////            for(int i=0;i<n;i++)
//////////                arr[i]=sc.nextInt();
//////////
//////////
//////////            System.out.println(findValue(arr,n));
//////////
//////////        }
//////////    }
//////////}
//////////
//////////// This code is contributed by anuj_67.
////////
////////
//////////
//////////import java.util.*;
//////////
//////////class TestClass {
//////////    public static void main(String args[] ) throws Exception {
//////////
//////////
//////////        // Write your code here
//////////        Scanner sc=new Scanner(System.in);
//////////        int n=sc.nextInt();
//////////        Stack <Integer> st=new Stack<Integer>();
//////////        for(int i=0;i<n;i++)
//////////        {
//////////            st.push(sc.nextInt());
//////////        }
//////////    }
//////////}
//////////
////////
//////////
//////////class Ankit
//////////{
//////////    int data;
//////////    String str;
//////////    Ankit next;
//////////    Ankit(int x,String y)
//////////    {
//////////        x=data;
//////////        y=str;
//////////    }
//////////}
//////////
//////////class Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        Ankit an=new Ankit(23,"Ankit");
//////////        an.next=new Ankit(25,"Shivam");
//////////        an.next.next=new Ankit(34,"laLLa");
//////////        Ankit curr=an;
//////////        System.out.println(curr.data);
//////////    }
//////////}
////////
//////////
//////////class Node
//////////        {
//////////            int data;
//////////            Node next;
//////////            Node(int x)
//////////            {
//////////                data=x;
//////////                next=null;
//////////            }
//////////        }
//////////        class Main
//////////        {
//////////            public static void main(String args[])
//////////            {
//////////                Node head=new Node(10);
//////////                Node temp1=new Node(20);
//////////                Node temp2=new Node(30);
//////////                Node temp3=new Node(40);
//////////                head.next=temp1;
//////////                temp1.next=temp2;
//////////                temp2.next=temp3;
//////////
//////////                printlist(head);
//////////            }
//////////
//////////            private static void printlist(Node head)
//////////            {
//////////                Node curr=head;
//////////                while(curr!=null)
//////////                {
//////////                    System.out.print(curr.data+" ");
//////////                    curr=curr.next;
//////////                }
//////////            }
//////////        }
////////
////////
////////
//////////
//////////
//////////class Node
//////////{
//////////    int data;
//////////    Node next;
//////////    Node(int x)
//////////    {
//////////        data=x;
//////////        next=null;
//////////    }
//////////}
//////////class Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        Node head=new Node(10);
//////////        Node temp1=new Node(20);
//////////        Node temp2=new Node(30);
//////////        Node temp3=new Node(40);
//////////        head.next=temp1;
//////////        temp1.next=temp2;
//////////        temp2.next=temp3;
//////////       // Node curr=head;
//////////     //   printlist(head);
//////////     //   Search(head,60);
//////////        System.out.println(rSearch(head,40,0));
//////////
//////////    }
//////////
//////////    private static void printlist(Node curr)
//////////    {
//////////        if(curr==null)
//////////            return;
//////////        System.out.print(curr.data + " ");
//////////        printlist(curr.next);
//////////    }
//////////    private static void Search(Node head,int a)
//////////    {
//////////        boolean res=false;
//////////        Node curr=head;
//////////        while(curr!=null)
//////////        {
//////////            if(curr.data==a)
//////////            {
//////////                res=true;
//////////                break;
//////////            }else
//////////                curr=curr.next;
//////////        }
//////////        System.out.println(res);
//////////    }
//////////    private static int rSearch(Node head,int a,int pos)
//////////    {
//////////        if(head==null)
//////////            return -1;
//////////        if(head.data==a)
//////////            return pos;
//////////        else
//////////            return rSearch(head.next,a,pos++);
//////////    }
//////////}
////////
//////////
////////
////////
////////
////////
////////
//////////class  Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        int arr[][]=new int[4][5];
//////////        System.out.println(arr.length);
//////////        for(int i=0;i<arr.length;i++){}
//////////    }
//////////}
////////
////////
/////////* package codechef; // don't place package name! */
////////
////////import java.util.*;
////////import java.lang.*;
////////import java.io.*;
////////
/////////* Name of the class has to be "Main" only if the class is public. */
////////class Main
////////{
////////    public static void main (String[] args) throws java.lang.Exception
////////    {
////////        // your code goes here
////////        InputStreamReader is=new InputStreamReader(System.in);
////////        BufferedReader br=new BufferedReader(is);
////////
////////        int T=Integer.parseInt(br.readLine());
////////        while(T-->0)
////////        {
////////            int n=Integer.parseInt(br.readLine());
////////            int arr[]=new int[n];
////////            for(int i=0;i<n;i++)
////////                arr[i]=Integer.parseInt(br.readLine());
////////        }
////////    }
////////}
//////
//////
//////
///////* package codechef; // don't place package name! */
////////
////////import java.util.*;
////////import java.lang.*;
////////import java.io.*;
////////
/////////* Name of the class has to be "Main" only if the class is public. */
////////class Main
////////{
////////    public static void main (String[] args) throws java.lang.Exception
////////    {
////////        // your code goes here
////////        InputStream inputStream = System.in;
////////
////////        InputReader in = new InputReader(inputStream);
////////
////////        while(true)
////////        {
////////            int n=in.nextInt();
////////            if(n==42)
////////                break;
////////            else
////////                System.out.println(n);
////////        }
////////
////////        static class InputReader {
////////            public BufferedReader reader;
////////            public StringTokenizer tokenizer;
////////
////////            public InputReader(InputStream stream) {
////////                reader = new BufferedReader(new InputStreamReader(stream), 32768);
////////                tokenizer = null;
////////            }
////////
////////            public String next() {
////////                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
////////                    try {
////////                        tokenizer = new StringTokenizer(reader.readLine());
////////                    } catch (IOException e) {
////////                        throw new RuntimeException(e);
////////                    }
////////                }
////////                return tokenizer.nextToken();
////////            }
////////
////////            public int nextInt() {
////////                return Integer.parseInt(next());
////////            }
////////    }
////////}
//////
//////
//////
////////
////////
/////////* package codechef; // don't place package name! */
////////
////////import java.util.*;
////////import java.lang.*;
////////import java.io.*;
////////
/////////* Name of the class has to be "Main" only if the class is public. */
////////class Main
////////{
////////    public static void main (String[] args) throws java.lang.Exception
////////    {
////////        // your code goes here
////////        //	InputStreamReader is=new InputStreamReader(System.in);
////////        //	BufferedReader br=new BufferedReader(is);
////////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////////        int T=Integer.parseInt(br.readLine());
////////
////////        while( T-->0)
////////        {
////////            int n=Integer.parseInt(br.readLine());
////////            int temp,res=0;
////////            while(n!=0)
////////            {
////////                temp=n%10;
////////                res=res*10+temp;
////////                n=n/10;
////////            }
////////            System.out.println(res);
////////        }
////////    }
////////}
////////
//////
//////
//////
//////
//////
//////
//////
////////
////////class Node
////////{
////////    int data;
////////    Node next;
////////    Node(int x)
////////    {
////////        data=x;
////////        next=null;
////////    }
////////}
////////class Main
////////{
////////    public static void main(String args[])
////////    {
////////        Node head=new  Node(10);
////////        Node temp1=new Node(20);
////////        Node temp2=new Node(30);
////////        head.next=temp1;
////////        temp1.next=temp2;
////////        printlist(head);
////////        rprint(head);
////////    }
////////    static void printlist(Node head)
////////    {
////////        Node curr=head;
////////        while(curr!=null)
////////        {
////////            System.out.print(curr.data + " ");
////////            curr=curr.next;
////////        }
////////    }
////////    static void rprint(Node head)
////////    {
////////        if(head==null)
////////            return;
////////        System.out.print("  " +  head.data);
////////        rprint(head.next);
////////    }
//////
//////
//////
///////* package codechef; // don't place package name! */
////////
////////import java.util.*;
////////import java.lang.*;
////////import java.io.*;
////////
/////////* Name of the class has to be "Main" only if the class is public. */
////////class Main
////////{
////////    public static void main (String[] args) throws java.lang.Exception
////////    {
////////        // your code goes here
////////        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
////////        try
////////        {
////////            int n=Integer.parseInt(br.readLine());
////////            while(n-->0)
////////            {
////////                boolean res=false;
////////                String str=br.readLine();
////////                String str1=new String();
////////                String str2=new String();
////////                if(str.length()%2==0)
////////                {
////////                    str1=str.substring(0,str.length()/2);
////////                    str2=str.substring(str.length()/2,str.length());
////////                }else {
////////                    str1 = str.substring(0, str.length() / 2);
////////                    str2 = str.substring(str.length() / 2 + 1, str.length());
////////                }
////////                res=anagram(str1,str2);
////////                System.out.println(str1+" "+str2);
////////                if(res)
////////                    System.out.println("YES");
////////                else
////////                    System.out.println("NO");
////////            }
////////        }
////////        catch(Exception e)
////////        {
////////            System.out.println("Error");
////////        }
////////    }
////////
////////    static boolean anagram(String str1,String str2)
////////    {
////////
////////    }
////////}
//////
////////
////////import java.io.BufferedReader;
////////import java.io.InputStreamReader;
////////import java.util.HashSet;
////////import java.util.Scanner;
////////
////////class Main
////////{
////////    public static void main(String args[])throws  Exception
////////    {
////////        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
////////        String ranSomNote=br.readLine();
////////        String magazine=br.readLine();
////////        if(ranSomNote=="")
////////            System.out.println(true);
////////
////////
////////        HashSet<String> hs=new HashSet<>();
////////        for(int i=0;i<magazine.length();i++)
////////        {
////////            for(int j=i+1;j<=magazine.length();j++)
////////            {
////////                hs.add(magazine.substring(i,j));
////////            }
////////        }
////////        System.out.println(hs);
////////        System.out.println(magazine);
////////        if(hs.size()==0)
////////        {
////////            System.out.println(true);
////////        }
////////       else if(hs.contains(ranSomNote))
////////            System.out.println(true);
////////        else
////////            System.out.println(false);
////////    }
////////}
//////
////////
////////import jdk.swing.interop.SwingInterOpUtils;
////////import org.w3c.dom.ls.LSOutput;
////////
////////import java.io.BufferedReader;
////////import java.io.InputStreamReader;
////////import java.math.BigInteger;
////////import java.security.interfaces.RSAPublicKey;
////////import java.util.*;
////////import java.util.stream.Stream;
////////
//////////class Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        boolean res=true;
//////////        int arr[]=new int[26];
//////////        String str="aaasdsfghjgfdsfgh";
//////////        String str1="aaafgh";
//////////        for(int i=0;i<str.length();i++)
//////////        {
//////////            arr[str.charAt(i) - 'a']++;
//////////        }
//////////
//////////        int arr1[]=new int[26];
//////////        for(int i=0;i<str1.length();i++)
//////////        {
//////////            arr1[str1.charAt(i) - 'a']++;
//////////        }
//////////
//////////        for(int i=0;i<26;i++)
//////////            arr[i]=arr[i]-arr1[i];
//////////
//////////        for(int i=0;i<26;i++)
//////////        {
//////////            if(arr[i]<0)
//////////            {
//////////                res=false;
//////////                break;
//////////            }
//////////        }
//////////        if(res==true)
//////////            System.out.println(true);
//////////        else
//////////            System.out.println(false);
//////////    }
//////////}
//////////
//////////class Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        boolean res=true;
//////////        int arr[]=new int[26];
//////////        String str="a";
//////////        String str1="b";
//////////        for(int i=0;i<str.length();i++)
//////////        {
//////////            arr[str.charAt(i) - 'a']++;
//////////        }
//////////
//////////        int arr1[]=new int[26];
//////////        for(int i=0;i<str1.length();i++)
//////////        {
//////////            arr1[str1.charAt(i) - 'a']++;
//////////        }
//////////
//////////        for(int i=0;i<26;i++)
//////////            arr[i]=arr[i]-arr1[i];
//////////
//////////        for(int i=0;i<26;i++)
//////////        {
//////////            if(arr[i]<0)
//////////            {
//////////                res=false;
//////////                break;
//////////            }
//////////        }
//////////        if(res==true)
//////////            System.out.println(true);
//////////        else
//////////            System.out.println(false);
//////////    }
//////////}
//////////class Main
//////////{
//////////
//////////    static void print(int arr[],int n)
//////////    {
//////////        if(n==1)
//////////            {
//////////                System.out.println(1+" "+1);
//////////                return;
//////////            }
//////////        ArrayList<Integer> al=new ArrayList<>();
//////////        int count=1;
//////////        for(int i=0;i<n-1;i++)
//////////        {
//////////            if((arr[i+1]-arr[i])<3)
//////////                count++;
//////////            else
//////////                {
//////////                    al.add(count);
//////////                    count=1;
//////////                }
//////////        }
//////////        al.add(count);
//////////
//////////        System.out.println(Collections.min(al)+" "+Collections.max(al));
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        int arr[]={4,5};
//////////        print(arr,arr.length);
//////////    }
//////////    }
////////
//////////
///////////* package codechef; // don't place package name! */
//////////
//////////import java.util.*;
//////////import java.lang.*;
//////////import java.io.*;
//////////
///////////* Name of the class has to be "Main" only if the class is public. */
//////////class Main
//////////{
//////////    public static void main (String[] args) throws java.lang.Exception
//////////    {
//////////        // your code goes here
//////////        try
//////////        {
//////////            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//////////            int T=Integer.parseInt(br.readLine());
//////////            while(T-->0)
//////////            {
//////////                int n=Integer.parseInt(br.readLine());
//////////                int arr[]=new int[n];
//////////                for(int i=0;i<n;i++)
//////////                    arr[i]=Integer.parseInt(br.readLine());
//////////
//////////
//////////                ArrayList<Integer> al=new ArrayList<>();
//////////                int count=1;
//////////                for(int i=0;i<n-1;i++)
//////////                {
//////////                    if(Math.abs(arr[i+1]-arr[i])<3)
//////////                        count++;
//////////                    else
//////////                    {
//////////                        al.add(count);
//////////                        count=1;
//////////                    }
//////////                }
//////////                al.add(count);
//////////
//////////                System.out.println(Collections.min(al)+" "+Collections.max(al));
//////////
//////////
//////////            }
//////////        }
//////////        catch(Exception e){}
//////////    }
//////////}
//////////class Main
//////////{
//////////    public static void  main(String args[])
//////////    {
//////////        Scanner sc=new Scanner(System.in);
//////////        while(true)
//////////        {
//////////            int n=sc.nextInt();
//////////            Stack<Integer> st=new Stack<>();
//////////            while(n>0)
//////////            {
//////////                int temp=n%2;
//////////                st.add(temp);
//////////                n=n/2;
//////////            }
//////////        }
//////////
//////////    }
//////////}
//////////
////////
////////
//////////
//////////class Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        Scanner sc=new Scanner(System.in);
//////////        int n=4;
//////////        int res=0;
//////////        while(n>0)
//////////        {
//////////            res=res*10+n%2;
//////////            n=n/2;
//////////        }
//////////        System.out.println(res);
//////////        int rev=0;
//////////        int count=0;
//////////        while(res>0)
//////////        {
//////////            rev=rev*10+res%10;
//////////            res=res/10;
//////////            count++;
//////////        }
//////////      //  System.out.println(rev);
//////////        int arr[]=new int[count];
//////////        for(int i=0;i<count;i++)
//////////        {
//////////            int temp=rev%10;
//////////            arr[i]=temp;
//////////            rev=rev/10;
//////////        }
//////////        for(int i=0;i<count;i++) {
//////////            if (arr[i] == 1)
//////////                arr[i] = 0;
//////////            else
//////////                arr[i] = 1;
//////////        }
//////////        int fn_res=0;
//////////        int j=arr.length-1;
//////////        for (int i=0;i<arr.length;i++)
//////////        {
//////////            fn_res=fn_res+((int)Math.pow(2,i)*arr[j]);
//////////            j--;
//////////        }
//////////       System.out.println(fn_res);
//////////    }
//////////}
//////////class Main {
//////////    public static void main(String args[])
//////////    {
//////////        System.out.println(findComplement(2));  /*findComplement()*/;
//////////    }
//////////    public static int findComplement(int num) {
//////////
//////////        int res=num;
//////////        int count=0;
//////////        while(res>0)
//////////        {
//////////            res=res/2;
//////////            count++;
//////////        }
//////////        int arr[]=new int[count];
//////////        for(int i=count-1;i>=0;i--)
//////////        {
//////////            int temp=num%2;
//////////            arr[i]=temp;
//////////            num=num/2;
//////////        }
//////////        for(int i=0;i<count;i++)
//////////        {
//////////            if(arr[i]==1)
//////////                arr[i]=0;
//////////            else
//////////                arr[i]=1;
//////////        }
//////////
//////////        int fn_res=0;
//////////        int j=arr.length-1;
//////////        for (int i=0;i<arr.length;i++)
//////////        {
//////////            fn_res=fn_res+((int)Math.pow(2,i)*arr[j]);
//////////            j--;
//////////        }
//////////
//////////        return fn_res;
//////////    }
//////////
//////////}
////////
////////
//////////class  Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////     int num=2;
//////////     int bit=(int)Math.floor((Math.log(num)/Math.log(2)))+1;
//////////     int res=((1<<bit)-1)^num;
//////////        System.out.println(res);
//////////    }
//////////}
////////
//////////class Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        String s="leetcode";
//////////        for(int i=0;i<s.length();i++)
//////////        {
//////////            for(int j=0;j<s.length();j++)
//////////            {
//////////                if(s.charAt(i)==s.charAt(j) && i==j)
//////////                {
//////////
//////////                }
//////////            }
//////////        }
//////////    }
//////////}
////////
//////////class  Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        String str="leetcode";
//////////        char ch[]=str.toCharArray();
//////////        int arr[]=new int[26];
//////////        for(int i=0;i<ch.length;i++)
//////////        {
//////////            arr[ch[i]-'a']++;
//////////        }
//////////        for(int i=0;i<25;i++)
//////////        {
//////////            if(arr[ch[i]-'a']==1)
//////////                System.out.println(i);
//////////        }
//////////
//////////    }
//////////}
////////
////////
//////////class Main
//////////{
//////////    public static void main(String args[])throws Exception
//////////    {
//////////        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//////////        String str=br.readLine();
//////////        int arr[]=new int[26];
//////////        for(int i=0;i<str.length();i++)
//////////        {
//////////            arr[str.charAt(i)-'a']++;
//////////        }
//////////        for(int i=0;i<25;i++)
//////////            System.out.print(arr[i]+" ");
//////////    }
//////////}
//////////
//////////class Main
//////////{
//////////    public static void main(String args[]) throws Exception
//////////    {
//////////        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//////////        String str=br.readLine();
//////////        int arr[]=new int[26];
//////////        for(int i=0;i<str.length();i++)
//////////        {
//////////            arr[str.charAt(i)-'a']++;
//////////        }
//////////        for(int i=0;i<str.length();i++)
//////////        {
//////////            if(arr[str.charAt(i)-'a']==1)
//////////            {
//////////                System.out.println(i);
//////////            }
//////////        }
//////////
//////////    }
//////////}
////////
//////////
//////////class Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        //find maximum number of elements
//////////        //  1,2,3,3,2,4,2
//////////        int arr[]=new int[]{8,8,7,7,7};
//////////        HashMap<Integer,Integer> hmp=new HashMap<>();
//////////        for(int i=0;i<arr.length;i++)
//////////        {
//////////            if(hmp.containsKey(arr[i]))
//////////            {
//////////                hmp.put(arr[i],hmp.get(arr[i])+1);
//////////            }else
//////////                hmp.put(arr[i],1);
//////////        }
//////////        int max=0;
//////////        System.out.println(hmp);
//////////        for(int i=0;i<arr.length;i++)
//////////        {
//////////            max=Math.max(max,hmp.get(arr[i]));
//////////           // System.out.println(max);
//////////        }
//////////        System.out.println(max);
//////////        for(Map.Entry entry :hmp.entrySet())
//////////        {
//////////            if(hmp.get(entry.getKey())==max)
//////////            {
//////////                System.out.println(entry.getKey());
//////////                break;
//////////            }
//////////        }
//////////    }
//////////}
//////////
///////////* package codechef; // don't place package name! */
//////////
//////////import java.util.*;
//////////import java.lang.*;
//////////import java.io.*;
//////////
///////////* Name of the class has to be "Main" only if the class is public. */
//////////class Main
//////////{
//////////    public static void main (String[] args) throws java.lang.Exception
//////////    {
//////////        // your code goes here
//////////        try
//////////        {
//////////            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//////////            int T=Integer.parseInt(br.readLine());
//////////            while(T-->0)
//////////            {
//////////                int n=Integer.parseInt(br.readLine());
//////////                int arr[]=new int[n];
//////////                for(int i=0;i<n;i++)
//////////                    arr[i]=Integer.parseInt(br.readLine());
//////////
//////////                Arrays.sort(arr);
//////////                ArrayList<Integer> al=new ArrayList<>();
//////////                int count=1;
//////////                for(int i=0;i<n-1;i++)
//////////                {
//////////                    if((arr[i+1]-arr[i])<3)
//////////                        count++;
//////////                    else
//////////                    {
//////////                        al.add(count);
//////////                        count=1;
//////////                    }
//////////                }
//////////                al.add(count);
//////////
//////////                System.out.println(Collections.min(al)+" "+Collections.max(al));
//////////
//////////            }
//////////        }
//////////        catch(Exception e){}
//////////    }
//////////}
////////
////////
////////
//////////class Node
//////////{
//////////    int key;
//////////    Node left;
//////////    Node right;
//////////    Node(int k)
//////////    {
//////////        k=key;
//////////    }
//////////}
//////////class Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        Node root=new Node(10);
//////////        root.left=new Node(30);
//////////        root.right=new Node(40);
//////////        root.left.left=new Node(60);
//////////        root.left.right=new Node(70);
//////////    }
//////////}
////////
//////////class Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        int arr[][] = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
//////////        Scanner sc = new Scanner(System.in);
//////////        System.out.println(arr.length);
//////////        float x1,x2,y1,y2=0;
//////////        System.out.println(arr[3][1]);
//////////        for(int i=0;i<arr.length;i++)
//////////            for(int j=0;j<2;j++)
//////////            {
//////////                System.out.print(arr[i][j]+" ");
//////////            }
//////////    }
//////////}
////////
//////////
//////////class Main
//////////{
//////////    static int rev(int x)
//////////    {
//////////        int res=0;
//////////        if(x>0)
//////////        {
//////////            while(x>0)
//////////            {
//////////                res=res*10+x%10;
//////////                x=x/10;
//////////            }
//////////            return res;
//////////        }else
//////////            {
//////////                x=(-1)*x;
//////////                while (x>0)
//////////                {
//////////                    res=res*10+x%10;
//////////                    x=x/10;
//////////                }
//////////                return (-1)*res;
//////////            }
//////////
//////////    }
//////////    public static void main(String args [])
//////////    {
//////////        System.out.println(rev(1534236469));
//////////    }
//////////}
////////
//////////
//////////class Node
//////////{
//////////    int key;
//////////    Node left;
//////////    Node right;
//////////    Node(int k)
//////////    {
//////////        key=k;
//////////    }
//////////}
//////////
//////////class Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        Node root=new Node(10);
//////////        root.left=new Node(20);
//////////        root.right=new Node(30);
//////////        root.left.left=new Node(40);
//////////        root.left.right=new Node(50);
//////////        root.right.left=new Node(60);
//////////        root.right.right=new Node(70);
//////////
//////////        System.out.println("Inorder");
//////////        inorder(root);
//////////        System.out.println();
//////////        System.out.println("Preorder");
//////////        preorder(root);
//////////        System.out.println();
//////////        System.out.println("Postorder");
//////////        postorder(root);
//////////        System.out.println("Size");
//////////        System.out.println();
//////////        System.out.println(size(root));
//////////        System.out.println();
//////////        System.out.println("maximum");
//////////        System.out.println();
//////////        System.out.println(maximum(root));
//////////        System.out.println();
//////////        System.out.println(height(root));
//////////
//////////    }
//////////    static void inorder(Node root)
//////////    {
//////////        if(root!=null)
//////////        {
//////////            inorder(root.left);
//////////            System.out.print(root.key+" ");
//////////            inorder(root.right);
//////////        }
//////////    }
//////////    static void preorder(Node root)
//////////    {
//////////        if(root!=null)
//////////        {
//////////            System.out.print(root.key+" ");
//////////            preorder(root.left);
//////////            preorder(root.right);
//////////        }
//////////    }
//////////    static void postorder(Node root)
//////////    {
//////////        if(root!=null)
//////////        {
//////////            postorder(root.right);
//////////            postorder(root.left);
//////////            System.out.print(root.key+" ");
//////////        }
//////////    }
//////////    static int size(Node root)
//////////    {
//////////        if(root==null)
//////////            return 0;
//////////        return 1 +  size(root.left)+size(root.right);
//////////    }
//////////
//////////    static int maximum(Node root)
//////////        {
//////////         if(root==null)
//////////             return Integer.MIN_VALUE;
//////////         else
//////////             return Math.max(root.key,Math.max(maximum(root.left),maximum(root.right)));
//////////        }
//////////
//////////        static int height(Node root)
//////////        {
//////////            if (root==null)
//////////                return 0;
//////////            else
//////////                return Math.max(height(root.left),height(root.right))+1;
//////////        }
//////////}
////////
//////////class Main
//////////{
//////////    static boolean isprime(int n)
//////////    {
//////////        if(n==2)
//////////            return true;
//////////        if(n%2==0) return false;
//////////        if(n<=1) return false;
//////////        for(int i=3;i*i<=n;i+=2)
//////////        {
//////////            if(n%i==0)
//////////                return false;
//////////        }
//////////        return true;
//////////    }
//////////    static void sum(int num)
//////////    {
//////////        for(int i=2;i<num;i++)
//////////        {
//////////            if(isprime(i)==true && isprime(num-i)==true)
//////////            {
//////////                System.out.println(num-i +" "+i);
//////////                break;
//////////            }
//////////        }
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        Scanner sc=new Scanner(System.in);
//////////        //System.out.println(sum(sc.nextInt()));
//////////        sum(sc.nextInt());
//////////     //   System.out.println(isprime(sc.nextInt()));
//////////    }
//////////}
//////////
//////////  class Main
//////////  {
//////////      static int hamming(int x, int y)
//////////      {
//////////          int count=0;
//////////          int z=x^y;
//////////          while(z!=0)
//////////          {
//////////              count += z&1;
//////////              z=z>>1;
//////////          }
//////////          return count;
//////////      }
//////////      public static void main(String args[])
//////////      {
//////////          int arr[]=new int[]{2,4,6};
//////////          int sum=0;
//////////          for(int i=0;i<arr.length;i++)
//////////          {
//////////              for(int j=i;j<arr.length;j++)
//////////              {
//////////                  sum=sum+hamming(arr[i],arr[j]);
//////////              }
//////////          }
//////////          System.out.println(2*sum);
//////////         // System.out.println(hamming(9,14));
//////////      }
//////////  }
//////////
//////////class Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        int num=49;
//////////        for(int i=2;i<num;i++)
//////////        {
//////////            int j=2;
//////////            while(Math.pow(i,j)<=num)
//////////            {
//////////                if(Math.pow(i,j)==num)
//////////                {
//////////                    System.out.println(i + " " + j);
//////////                    break;
//////////                }else
//////////                    j++;
//////////            }
//////////        }
//////////    }
//////////}
////////
////////
////////
////////
////////// Excel column number
//////////class Main
//////////{
//////////    static int col_num(String str)
//////////    {
//////////        int sum=0;
//////////        int j=0;
//////////        for(int i=str.length()-1;i>=0;i--)
//////////        {
//////////            sum=sum+ (str.charAt(i) - 'A'+1)* (int) Math.pow(26,j);
//////////            j++;
//////////        }
//////////        return sum;
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////     String str="AB";
//////////     //col_num(str);
//////////        System.out.println(col_num(str));
//////////    }
//////////}
////////// String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//////////         Stack <Character> st=new Stack<>();
//////////        while(num>0)
//////////        {
//////////        int temp=num%26;
//////////        st.push(str.charAt(temp));
//////////        num=num/26;
//////////        System.out.println(num);
//////////        }
//////////        String res="";
//////////        for(int i=0;i<st.size();i++)
//////////        {
//////////        res+= st.peek();
//////////        st.pop();
//////////        }
//////////        return res;
////////
//////////// find excel number with the help of column number
//////////class Main
//////////{
//////////    static String excel(int num)
//////////    {
//////////       String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//////////       String r="";
//////////       while(num>0)
//////////       {
//////////           num=num-1;
//////////           int temp=num%26;
//////////           r=str.charAt(temp)+r;
//////////           num=num/26;
//////////       }
//////////       return r;
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        System.out.println(excel(28));
//////////    }
//////////}
////////
////////
////////
//////////class Main
//////////{
//////////    static boolean palindrome(int num)
//////////    {
//////////        String str=Integer.toString(num);
//////////        int start=0;
//////////        boolean res=true;
//////////        int end=str.length()-1;
//////////        while(start<end)
//////////        {
//////////            if(str.charAt(start)==str.charAt(end)) {
//////////                start++;
//////////                end--;
//////////            }
//////////            else
//////////                {
//////////                    res=false;
//////////                    return res;
//////////                }
//////////        }
//////////        return res;
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        System.out.println(palindrome(121));
//////////    }
//////////}
////////
//////////
//////////class Main
//////////{
//////////    static int gcd(int x,int y)
//////////    {
//////////        if(y==0) return x;
//////////        return gcd(y,x%y);
//////////    }
//////////    public static void  main(String args[])
//////////    {
//////////        System.out.println(gcd(4,6));
//////////    }
//////////}
////////
////////
////////
////////
////////
////////
////////
////////
//////////
//////////class Main
//////////{
//////////    static int gcd(int A,int B)
//////////    {
//////////        if(B==0) return A;
//////////        return gcd(A,A%B);
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        System.out.println(gcd(2,4));
//////////    }
//////////}
////////
//////////
//////////class Main
//////////{
//////////    static void single(int arr[])
//////////    {
//////////        HashMap <Integer,Integer> hmp=new HashMap<>();
//////////        for(int i=0;i<arr.length;i++)
//////////        {
//////////            if(hmp.containsKey(arr[i]))
//////////            {
//////////                hmp.put(arr[i],hmp.get(arr[i])+1);
//////////            }else
//////////                hmp.put(arr[i],1);
//////////        }
//////////       // System.out.println(hmp);
//////////
//////////
//////////        for (Map.Entry<Integer, Integer> entry : hmp.entrySet()) {
//////////            if (entry.getValue().equals(1)) {
//////////                System.out.println(entry.getKey());
//////////            }
//////////        }
//////////    }
//////////
//////////     public static void main(String args[])
//////////    {
//////////        int arr[]=new int[]{1,1,2,3,3,4,4,5,5,6,6};
//////////        //exor(5);
//////////        single(arr);
//////////    }
//////////}
////////
////////
//////////
//////////class Main
//////////{
//////////    static int reverse(int num)
//////////    {
//////////        // Handel -ve case
//////////        int res=0;
//////////        while(num!=0)
//////////        {
//////////            int temp=num%10;
//////////            int temp1=res*10+temp;
//////////            if(Integer.MIN_VALUE< temp1&& temp1 < Integer.MAX_VALUE)
//////////            {
//////////                res=temp1;
//////////            }else
//////////                return 0;
//////////
//////////            num=num/10;
//////////        }
//////////        return res;
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        System.out.println(reverse(-1146467285));
//////////    }
//////////}
////////
////////
////////
//////////class Main {
//////////
//////////    public int maxSubarraySumCircular(int[] A) {
//////////
//////////        int n=A.length;
//////////        int max_kadane=kadane(A);
//////////
//////////        int max_wrap=0;
//////////        for(int i=0;i<A.length;i++)
//////////        {
//////////            max_wrap+=A[i];
//////////            A[i]=-A[i];
//////////        }
//////////
//////////        max_wrap+=kadane(A);
//////////        return (max_wrap > max_kadane)? max_wrap: max_kadane;
//////////    }
//////////    static int kadane(int[] A)
//////////    {
//////////        int max_ending=0;
//////////        int max_so_far=0;
//////////        for(int i=0;i<A.length;i++)
//////////        {
//////////            max_ending+=A[i];
//////////
//////////            if(max_ending<0)
//////////                max_ending=0;
//////////
//////////            if(max_so_far<max_ending)
//////////                max_so_far=max_ending;
//////////        }
//////////        return max_so_far;
//////////    }
//////////}
//////////
//////////class Main
//////////{
//////////    static int gcd(int A,int B)
//////////    {
//////////        if(B==0) return A;
//////////        return gcd(A,A%B);
//////////    }
//////////
//////////    static int tr_zero(int num)
//////////    {
//////////
//////////        int res=0;
//////////        while(num>0)
//////////        {
//////////            res+= num/5 ;
//////////            num/=5;
//////////        }
//////////        return res;
//////////    }
//////////     static int p_rank(String str)
//////////     {
//////////
//////////     }
//////////
//////////    public static void main(String args[])
//////////    {
//////////        //System.out.println(gcd(2,4));
//////////        System.out.println(tr_zero(10));
//////////    }
//////////}
////////
////////
//////////class Main
//////////{
//////////
//////////    public static void main(String args[])
//////////    {
//////////        int arr[]=new int[]{1,1,2,2,3};
//////////    }
//////////}
////////
//////////class Main
//////////{
//////////    static  int  gcd(int A,int B)
//////////    {
//////////        if(B==0)
//////////            return A;
//////////        else
//////////            return gcd(B,A%B);
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        System.out.println(gcd(2,4));
//////////    }
//////////}
//////////class Main
//////////{
//////////    static int fact(int num)
//////////    {
//////////        if(num<=1)
//////////            return 1;
//////////        return num*fact(num-1);
//////////    }
//////////    static int freq(String str)
//////////    {
//////////        int fre[]=new int[26];
//////////        for(int i=0;i<str.length();i++)
//////////        {
//////////            fre[str.charAt(i)-'a']++;
//////////        }
//////////        int sum=1;
//////////        for(int i=0;i<fre.length;i++)
//////////        {
//////////            if(fre[i]>=1)
//////////            sum=sum* fact(fre[i]);
//////////        }
//////////        return sum;
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////
//////////        System.out.println(freq("anaconda"));
//////////    }
//////////}
////////
////////
//////////public class Main {
//////////    final static int  mod=1000003;
//////////
//////////
//////////    public static void main(String arg[])
//////////    {
//////////      //  findRank("aba");
//////////      System.out.println(findRank("bbbbaaaa"));
//////////      //freq("bbbbaaaa");
//////////        System.out.println(freq("bbbbaaaa"));
//////////       // freq("IhSKbdvuqfmGHh");
//////////    }
//////////
//////////    public static int fact(int num)
//////////    {
//////////        if(num<=1)
//////////            return 1;
//////////        return num* (fact(num-1));
//////////    }
//////////
//////////
//////////    public static int freq(String A)
//////////    {
//////////        HashMap<Character,Integer> hmp=new HashMap<>();
//////////        for(int i=0;i<A.length();i++)
//////////        {
//////////            if(hmp.containsKey(A.charAt(i))==true)
//////////            {
//////////                hmp.put(A.charAt(i),hmp.get(A.charAt(i))+1);
//////////            }else
//////////                hmp.put(A.charAt(i),1);
//////////        }
//////////        int sum=1;
//////////      //  System.out.println(hmp);
//////////        for ( Character key : hmp.keySet() ) {
//////////           // System.out.println(hmp.get(key));
//////////            sum=sum * fact(hmp.get(key));
//////////        }
//////////        return sum;
//////////    }
//////////
//////////
//////////
//////////    public static int findRank(String A) {
//////////        int ans=0;
//////////        int rep=freq(A);
//////////        for(int i=0;i<A.length();i++)
//////////        {
//////////            int count=0;
//////////
//////////            for(int j=i+1;j<A.length();j++)
//////////            {
//////////                if(A.charAt(i)>A.charAt(j))
//////////                {
//////////                    count++;
//////////                }
//////////            }
//////////
//////////          //  ans = ans +  (count*(fact(A.length()-i-1)/rep));
//////////            ans = (ans) +  (count*(fact(A.length()-i-1)/rep));
//////////        }
//////////        return (ans+1);
//////////    }
//////////
//////////}
////////
//////////
//////////class Main
//////////{
//////////    int size ,cap;
//////////    int arr[];
//////////    Main(int c)
//////////    {
//////////        cap=c;
//////////        size=0;
//////////        arr=new int[cap];
//////////    }
//////////    static boolean isfull(int arr[],int size)
//////////    {
//////////        return (arr.length==size);
//////////    }
//////////    static void enque(int x)
//////////    {
//////////
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////
//////////    }
//////////}
//////////
////////
//////////class Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        int arr[]=new int[]{0,1,2,5};
//////////        int size=arr.length;
//////////        if(arr[size-1]<9)
//////////        {
//////////            arr[size-1]=arr[size-1]+1;
//////////        }else
//////////        {
//////////            int i=size-1;
//////////            while(true)
//////////            {
//////////                if(arr[i]==9 && i!=0)
//////////                    arr[i]=0;
//////////                else if(i==0)
//////////                {
//////////                    arr[i]=10;
//////////                    break;
//////////
//////////                else
//////////                    {
//////////                        arr[i]=arr[i]+1;
//////////                }
//////////                        break;
//////////                    }
//////////                i--;
//////////            }
//////////
//////////        }
//////////        for(int i=0;i<size;i++)
//////////        {
//////////            System.out.print(arr[i]+" ");
//////////        }
//////////    }
//////////}
////////
//////////
//////////class Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        int arr[]=new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
//////////        String str=Arrays.toString(arr).replaceAll("\\[|\\]|,|\\s", "");
//////////        BigInteger bigInteger=new BigInteger(str);
//////////        long n=Long.parseLong(str);
//////////        //System.out.println(arr);
//////////        n=n+1;
//////////        int size=(int)Math.floor(Math.log10(n)+1);
//////////        int res[]=new int[size];
//////////        int i=size-1;
//////////        while(n>0)
//////////        {
//////////            long temp=n%10;
//////////            res[i]=(int)temp;
//////////            i--;
//////////            n=n/10;
//////////        }
//////////
//////////        for(int j=0;j<size;j++)
//////////        {
//////////            System.out.print( res[j]+" ");
//////////        }
//////////    }
//////////}
//////////class Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        int A[]=new int[]{1,3,-1};
//////////        int res=0;
//////////        for(int i=0;i<A.length;i++)
//////////            for(int j=0;j<A.length;j++)
//////////            {
//////////                res=Math.max(res,Math.abs(A[i]-A[j])+ Math.abs(i-j));
//////////            }
//////////        System.out.println(res);
//////////    }
//////////}
////////
//////////
//////////class Main
//////////{
//////////
//////////    public static void main(String args[])
//////////    {
//////////        int arr[]=new int[]{3,1,2,5,3};
//////////        HashMap<Integer,Integer> hmp=new HashMap<>();
//////////        for(int i=0;i<arr.length;i++)
//////////        {
//////////            if(hmp.containsKey(arr[i])==true)
//////////            {
//////////                hmp.put(arr[i],hmp.get(arr[i])+1);
//////////            }else
//////////                hmp.put(arr[i],1);
//////////        }
//////////        int max=0;
//////////        int missing=0;
//////////        System.out.println(hmp);
//////////        for(int i=1;i<=arr.length;i++)
//////////        {
//////////            if (hmp.containsKey(i) == true)
//////////                continue;
//////////            else {
//////////                missing = i;
//////////                break;
//////////            }
//////////        }
//////////        int re=0;
//////////        for(int i:hmp.keySet())
//////////        {
//////////            if(hmp.get(i)>1)
//////////                re=i;
//////////            break;
//////////        }
//////////        System.out.println(re+" "+missing);
//////////        }
//////////    }
////////
//////////class Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        int arr[]=new int[]{1,2,3,4,5,5};
//////////        int res[]=new int[arr.length];
//////////        for(int i=0;i<arr.length;i++)
//////////        {
//////////            res[arr[i]-1]++;
//////////        }
//////////        for(int i=0;i<res.length;i++)
//////////            System.out.print(res[i]+" ");
//////////    }
//////////}
////////
//////////
//////////class Main
//////////{
//////////    static int maxSubArraySum(int a[])
//////////    {
//////////        int size = a.length;
//////////        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
//////////
//////////        for (int i = 0; i < size; i++)
//////////        {
//////////            max_ending_here = max_ending_here + a[i];
//////////            if (max_so_far < max_ending_here)
//////////                max_so_far = max_ending_here;
//////////            if (max_ending_here < 0)
//////////                max_ending_here = 0;
//////////        }
//////////        return max_so_far;
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        int arr[]=new int[]{10, -1, 2, 3, -4, 100};
////////////        maxSubArraySum(arr);
//////////        System.out.println(maxSubArraySum(arr));
//////////    }
//////////}\
////////
////////
//////////class Main
//////////{
//////////    static int missing(int arr[])
//////////    {
//////////        HashSet <Integer> hs=new HashSet<>();
//////////        for(int i=0;i<arr.length;i++)
//////////            hs.add(arr[i]);
//////////        for(int i=1;i<=arr.length;i++)
//////////        {
//////////            if(hs.contains(i)!=true)
//////////                return i;
//////////        }
//////////        return 0;
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        int arr []=new int[]{-8, -7, -6};
//////////        System.out.println(missing(arr));
//////////    }
//////////}
////////
//////////class Main
//////////{
//////////    public static int repeatedNumber(final int[] A) {
//////////        HashMap <Integer,Integer> hmp=new HashMap<>();
//////////        for(int i=0;i<A.length;i++)
//////////        {
//////////            if(hmp.containsKey(A[i])==true)
//////////            {
//////////                hmp.put(A[i],hmp.get(A[i])+1);
//////////            }else
//////////                hmp.put(A[i],1);
//////////        }
//////////         int res=A.length/3;
//////////        for(int key : hmp.keySet())
//////////        {
//////////            if(hmp.get(key)>res)
//////////                return key;
//////////        }
//////////
//////////        return 1;
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        int arr[]=new int[]{1,2,3,1,1};
//////////        System.out.println(repeatedNumber(arr));
//////////    }
//////////}
//////////
//////////class Main
//////////{
//////////    public static void main(String args[])
//////////    {
//////////        int arr[]=new int[]{4,4,4,3};
//////////        for(int i=0;i<arr.length;i++)
//////////        {
//////////            int count=0;
//////////            for(int j=0;j<arr.length;j++)
//////////            {
//////////                if(arr[i]<arr[j])
//////////                    count++;
//////////            }
//////////            if(arr[i]==count)
//////////            {
//////////                System.out.println(arr[i]);
//////////                break;
//////////            }
//////////        }
//////////        System.out.println("cmplt");
//////////    }
//////////}
////////
////////
//////////
//////////class Main
//////////{
//////////    public static  int solve(String[] A) {
//////////        int n=A.length;
//////////        Arrays.sort(A);
//////////        for(int i=0;i<n-1;i++)
//////////        {
//////////            //int x=arr[i];
//////////            int l=i+1;
//////////            int R=n-1;
//////////            while(l<R)
//////////            {
//////////                int temp=Integer.parseInt(A[i])+ Integer.parseInt(A[l]) + Integer.parseInt(A[R]);
//////////                if(temp<2 && temp >1)
//////////                    return 1;
//////////
//////////                if(temp>2)
//////////                    R--;
//////////                else if(temp < 1)
//////////                    l++;
//////////            }
//////////
//////////        }
//////////        return 0;
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        String arr[]=new String[]{"0.6","0.7","0.8","1.2","0.4"};
//////////        String str=arr[0];
//////////        System.out.println(Integer.parseInt(str.trim()));
//////////
//////////    }
//////////}
////////
//////////
//////////class Main
//////////{
//////////    public static int solve(ArrayList<String> A) {
//////////        int n=A.size();
//////////        Collections.sort(A);
//////////        for(int i=0;i<n;i++)
//////////        {
//////////            //int x=arr[i];
//////////            int l=i+1;
//////////            int R=n-1;
//////////            while(l<R)
//////////            {
//////////                int temp=Integer.parseInt(A.get(i))+ Integer.parseInt(A.get(l)) + Integer.parseInt(A.get(R));
//////////                if(temp>2 && temp <1)
//////////                    return 1;
//////////
//////////                if(temp>2)
//////////                    R--;
//////////                else if(temp < 1)
//////////                    l++;
//////////            }
//////////
//////////        }
//////////        return 0;
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        ArrayList al=new ArrayList();
//////////        al.add("0.6");
//////////        al.add("0.7");
//////////        al.add("0.8");
//////////        al.add("1.2");al.add("0.4");
//////////        System.out.println(solve(al));
//////////
//////////
//////////    }
//////////}
////////
////////
//////////
//////////
//////////class Main
//////////{
//////////    public static int solve(ArrayList<String> A) {
//////////        ArrayList <Double> al=new ArrayList();
//////////        for(int i=0;i<A.size();i++)
//////////        {
//////////            al.add(Double.parseDouble(A.get(i)));
//////////        }
//////////        int n=al.size();
//////////        Collections.sort(al);
//////////        for(int i=0;i<n;i++)
//////////        {
//////////            //int x=arr[i];
//////////            int l=i+1;
//////////            int R=n-1;
//////////            while(l<R)
//////////            {
//////////                double temp=(al.get(i))+ (al.get(l)) + (al.get(R));
//////////                if(temp<2 && temp>1)
//////////                    return 1;
//////////
//////////                if(temp>2 )
//////////                    R--;
//////////                else if(temp < 1)
//////////                    l++;
//////////              //  else if(temp>1 && temp<2)
//////////            }
//////////
//////////        }
//////////        return 0;
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        ArrayList <String> al=new ArrayList();
//////////        al.add("0.6");
//////////        al.add("0.7");
//////////        al.add("0.8");
//////////        al.add("1.2");al.add("0.4");
//////////        System.out.println(solve(al));
//////////    }
//////////}
//////////
//////////class Main
//////////{
//////////
//////////    static int [] wave(int arr[])
//////////    {
//////////        Arrays.sort(arr);
//////////        for(int i=0;i<arr.length;i++)
//////////        {
//////////            int temp=arr[i];
//////////            arr[i]=arr[i+1];
//////////            arr[i+1]=temp;
//////////            i++;
//////////        }
//////////        return arr;
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        int arr[]=new int[]{1,2,3,4};
//////////        wave(arr);
//////////        for(int i=0;i<arr.length;i++)
//////////        {
//////////            System.out.print(arr[i]+" ");
//////////        }
//////////    }
//////////}
////////
//////////
//////////class Main
//////////{
//////////    public static  int sqrroot(int num)
//////////    {
//////////        int start=1;
//////////        int end=num/2;
//////////        while(start<end)
//////////        {
//////////            int mid=start+(end-start)/2;
//////////            if(mid*mid==num)
//////////                return mid;
//////////            else if(mid*mid>num)
//////////                end=mid;
//////////            else if(mid*mid<num)
//////////                start=mid;
//////////        }
//////////        return -1;
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        System.out.println(sqrroot(4));
//////////    }
//////////}
////////
////////
////////
//////////
//////////class Main
//////////{
//////////    public static  void print(int arr[][])
//////////    {
//////////        int m=arr.length; // Row index
//////////        int n=arr.length; // Column index
//////////
//////////        int k=0;  // Row
//////////        int l=0;   // column index
//////////
//////////        while(k<m && n>l)
//////////        {
//////////            for(int i=k;i<m;i++)
//////////            {
//////////                System.out.print(arr[k][i]+" ");
//////////            }
//////////            k++;
//////////
//////////            for(int i=k;i<n-1;i++)
//////////            {
//////////                System.out.print(arr[k][n-1]+" ");
//////////            }
//////////            n--;
//////////
//////////            if(k<m)
//////////            {
//////////                for(int i=n-1;i>=l;i--)
//////////                {
//////////                    System.out.print(arr[m-1][i]+" ");
//////////                }
//////////                m--;
//////////
//////////            }
//////////
//////////            if(l<n)
//////////            {
//////////                for(int i=m-1;i>=k;i--)
//////////                {
//////////                    System.out.print(arr[i][l]);
//////////
//////////                }
//////////            }
//////////        }
//////////    }
//////////    public static void main(String args[])
//////////    {
//////////        int a[][] = { { 1, 2, 3, 4, 5, 6 },
//////////                { 7, 8, 9, 10, 11, 12 },
//////////                { 13, 14, 15, 16, 17, 18 } };
//////////        print(a);
//////////    }
//////////}
////////
////////
////////
////////// Java program to print a given matrix in spiral form
////////import java.io.*;
////////
////////class Main {
////////    // Function print matrix in spiral form
////////    static int [][] spiralPrint( int a[][])
////////    {
////////        int m=a.length;
////////        int n=a.length;
////////        int count=1;
////////        int i, k = 0, l = 0;
////////		/* k - starting row index
////////		m - ending row index
////////		l - starting column index
////////		n - ending column index
////////		i - iterator
////////		*/
////////
////////        while (k < m && l < n) {
////////            // Print the first row from the remaining rows
////////            for (i = l; i < n; ++i) {
////////                //System.out.print( + " ");
////////                a[k][i]=count;
////////                count++;
////////            }
////////            k++;
////////
////////            // Print the last column from the remaining columns
////////            for (i = k; i < m; ++i) {
//////////                System.out.print(a[i][n - 1] + " ");
////////                a[i][n-1]=count;
////////                count++;
////////            }
////////            n--;
////////
////////            // Print the last row from the remaining rows */
////////            if (k < m) {
////////                for (i = n - 1; i >= l; --i) {
//////////                    System.out.print(a[m - 1][i] + " ");
////////                    a[m-1][i]=count;
////////                    count++;
////////                }
////////                m--;
////////            }
////////
////////            // Print the first column from the remaining columns */
////////            if (l < n) {
////////                for (i = m - 1; i >= k; --i) {
//////////                    System.out.print(a[i][l] + " ");
////////                    a[i][l]=count;
////////                    count++;
////////                }
////////                l++;
////////            }
////////        }
////////        return a;
////////    }
////////
////////    // driver program
////////    public static void main(String[] args)
////////    {
//////////        int R = 3;
//////////        int C = 6;
//////////        int a[][] = { { 1, 2, 3 },
//////////                        { 4,5,6},
//////////                        { 7,8,9} };
////////        int a[][]=new int[4][4];
////////     //   Arrays.fill(a,0);
////////        spiralPrint(a);
////////        for(int i=0;i<4;i++)
////////        {
////////            for(int j=0;j<4;j++)
////////            {
////////                System.out.print(a[i][j]+" ");
////////            }
////////        }
////////    }
////////}
////////
////////// Contributed by Pramod Kumar
//////
//////
//////
//////
//////
////////class Main
////////{
////////   static int arr[]=new int[8];
////////   static int top=-1;
////////    public static  void push(int x)
////////    {
////////        if(top==arr.length-1)
////////            return;
////////        top++;
////////        arr[top]=x;
////////    }
////////    public static int pop()
////////    {
////////        if(top==-1)
////////            return 0;
////////        int temp=arr[top];
////////        top--;
////////        return temp;
////////    }
////////
////////    public static void peek()
////////    {
////////        if(top==-1)
////////            return;
////////        System.out.println(arr[top]);
////////    }
////////
////////
////////    public static void main(String args[])
////////    {
////////        push(10);
////////        push(20);
////////        System.out.println(pop());
////////        System.out.println(pop());
////////        push(30);
////////    }
////////}
//////
////////class Stack
////////{
////////    int arr[]=new int[8];
////////    int top=-1;
////////    public   void push(int x)
////////    {
////////        if(top==arr.length-1)
////////        {
////////            System.out.println("Stack Full");
////////        }
////////         else
////////           {
////////               top++;
////////               arr[top]=x;
////////           }
////////    }
////////    public  int pop()
////////    {
////////        if(top==-1)
////////            return 0;
////////        int temp=arr[top];
////////        top--;
////////        return temp;
////////    }
////////
////////    public  void peek()
////////    {
////////        if(top==-1)
////////            return;
////////        System.out.println(arr[top]);
////////    }
////////    public void display()
////////    {
////////        if(top==-1)
////////            return;
////////        for(int i=top;i>=0;i--)
////////            System.out.print(arr[i]+" ");
////////    }
////////}
////////
////////class Main
////////{
////////    public static  void main(String args[])
////////    {
////////      Stack st=new Stack();
////////      st.push(10);
////////      st.push(20);
////////      st.push(30);
////////      st.push(40);
////////      st.push(50);
////////      st.push(60);
////////      st.push(70);
////////      st.push(80);
////////      st.peek();
////////      st.display();
////////    }
////////}
//////
//////
////////
////////import org.w3c.dom.ls.LSOutput;
////////
////////import java.util.LinkedList;
////////
////////class Node
////////{
////////    int data;
////////    Node link;
////////    Node(int x)
////////    {
////////        data=x;
////////        link=null;
////////    }
////////}
////////class Main
////////{
////////    public static void display(Node head)  //  linked list via iterative approach
////////    {
////////        Node curr=head;
////////        while(curr!=null)
////////        {
////////            System.out.print(curr.data+" ");
////////            curr=curr.link;
////////        }
////////    }
////////    public static void rec_display(Node head)  //  linked list via recursive approach
////////    {
////////        if(head==null)
////////            return;
////////        System.out.print(head.data+" ");
////////        rec_display(head.link);
////////    }
////////
////////    public static void rev_rec_display(Node head)  // Reverse linked list via recursive approach
////////    {
////////        if(head==null)
////////            return;
////////        rev_rec_display(head.link);
////////        System.out.print(head.data+" ");
////////    }
////////
////////    public static int search(Node head,int x)    // Search an element via iterative
////////    {
////////        Node curr=head;
////////        while(curr!=null)
////////        {
////////            if(curr.data==x)
////////                return 1;
////////            else
////////                curr=curr.link;
////////        }
////////        return 0;
////////    }
////////
////////    public static Node Insert_begin(int data,Node head) // insert At Begining
////////    {
////////        Node temp=new Node(data);
////////        temp.link=head;
////////        return temp;
////////    }
////////
////////    public static void main(String args[])
////////    {
////////        Node head=new Node(10);
////////        Node temp=new Node(20);
////////        Node temp2=new Node(30);
////////        head.link=temp;
////////        temp.link=temp2;
////////       // Node head=null;
////////        head=Insert_begin(5,head);
////////        head=Insert_begin(2,head);
////////        display(head);
////////
////////        System.out.println();
////////        rec_display(head);
////////
////////        System.out.println();
////////
////////        rev_rec_display(head);
////////
////////
//////////        if(search(head,40)==1)
//////////            System.out.println("MIL GYA ELEMENT");
//////////        else
//////////            System.out.println("NOT FOUND");
////////
////////
////////
////////
////////
////////    }
////////}
//////
////////                                  arrays/ Recursion / hashing / String / Searching / Sorting
//////
////////import java.util.*;
////////class Main
////////{
////////    public static boolean hotelBooking(int A[],int D[], int k)
////////    {
////////      //  boolean res=true;
////////        Stack <Integer> st=new Stack<>();
////////        int i=1;
////////        int j=0;
////////        while(i<A.length && j<D.length)
////////        {
////////            if(A[i]<D[j])
////////            {
////////                st.push(A[i]);
////////                i++;
////////            }else
////////            {
////////                st.pop();
////////                j++;
////////            }
////////
////////            if(st.size()>k)
////////                return false;
////////
////////        }
////////        return true;
////////    }
////////    public static void main(String args[])
////////    {
////////        int A[]={1,2,5};
////////        int D[]={3,6,8};
////////        int k=1;
////////        System.out.println(hotelBooking(A,D,k));
////////    }
////////}
//////
////////
////////import java.util.Scanner;
////////
////////class Main
////////{
////////    public static void main(String args[])
////////    {
////////        Scanner sc=new Scanner(System.in);
////////        int n=sc.nextInt();
////////        int res=0;
////////        int arr[][]=new int[n][n];
////////        for(int i=0;i<n;i++)
////////            for(int j=0;j<n;j++)
////////                arr[i][j]=sc.nextInt();
////////        for(int i=0;i<n;i++)
////////        {
////////            int count=0;
////////            for(int j=0;j<n;j++)
////////            {
////////                if(arr[i][j]==1)
////////                    count++;
////////            }
////////            if(count>=2)
////////                res++;
////////        }
////////        System.out.println(res);
////////    }
////////}
//////
//////////
////////class Node
////////{
////////    int x;
////////    Node link;
////////    Node(int data)
////////    {
////////        x=data;
////////        link=null;
////////    }
////////
////////}
////////class Main
////////{
////////    public static Node push(int x,Node head)
////////    {
////////        Node temp=new Node(x);
////////        if(head==null)
////////            return temp;
////////        else
////////        {
////////            temp.link=head;
////////            return temp;
////////        }
////////    }
////////    public static void display(Node head)
////////    {
////////        Node curr=head;
////////        while(curr!=null)
////////        {
////////            System.out.print(curr.data+" ");
////////            curr=curr.link;
////////        }
////////    }
////////
////////    public static void main(String args[])
////////    {
////////
////////        Node head=null;
////////        head=push(4,head);
////////        head=push(5,head);
////////
////////    }
////////}
////////
////////
////////
////////// Stack Functionality
////////// 1- LIFO
//////////        Node head=new Node(4);
//////////        head.link=new Node(5);
//////////        head.link.link=new Node(6);
//////
////////
////////import java.util.Stack;
////////
////////class StackusingLinkedlist
////////{
////////    class Node
////////    {
////////        int data;
////////        Node next;
////////    }
////////    Node top;
////////    StackusingLinkedlist()
////////    {
////////        this.top=null;
////////    }
////////
////////    public void push(int x)
////////    {
////////        Node temp=new Node();
////////        if(temp==null)
////////            return;
////////        else
////////            {
////////                temp.data=x;
////////                temp.next=top;
////////                top=temp;
////////            }
////////    }
////////    public boolean isEmpty()
////////    {
////////        return top==null;
////////    }
////////    public void peek()
////////    {
////////        if(!isEmpty())
////////        {
////////            System.out.println(top.data);
////////        }else
////////            System.out.println("Stack is Empty");
////////    }
////////}
//////
//////
//////// Searching
//////// Implement binary search and Linear Search
////////class Main
////////{
////////    public static boolean linearSearch(int arr[],int x)
////////    {
////////     for(int i=0;i<arr.length;i++) {
////////         if (arr[i] == x)
////////             return true;
////////     }
////////     return false;
////////    }
////////
////////    public static boolean bsearch(int arr[],int x)
////////    {
////////        int start=0;
////////        int end=arr.length-1;
////////        while(start<=end)
////////        {
////////            int mid=start+(end-start)/2;
////////            if(arr[mid]==x)
////////                return true;
////////            else if(arr[mid]>x)
////////                end=mid-1;
////////            else
////////                start=mid+1;
////////        }
////////        return false;
////////    }
////////    public static int rbinary(int arr[],int x,int low ,int high)
////////    {
////////        if(low>high)
////////            return -1;
////////
////////        int mid=low+(high-low)/2;
////////        if(arr[mid]==x)
////////            return 1;
////////        else if(arr[mid]>x)
////////            return rbinary(arr,x,low,mid-1);
////////        else if(arr[mid]<x)
////////            return  rbinary(arr,x,mid+1,high);
////////
////////        return -1;
////////    }
////////    public static void main(String args[])
////////    {
////////        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
////////        System.out.println(linearSearch(arr,10));
////////        System.out.println(bsearch(arr,10));
////////        System.out.println(rbinary(arr,10,0,arr.length-1));
////////
////////    }
////////}
////////
////////class Node
////////{
////////    int key;
////////    Node right;
////////    Node left;
////////    Node(int k)
////////    {
////////        key=k;
////////    }
////////}
////////class Main
////////{
////////    public static void inoreder(Node root)
////////    {
////////        if(root!=null)
////////        {
////////            inoreder(root.left);
////////            System.out.print(root.key+" ");
////////            inoreder(root.right);
////////        }
////////    }
////////
////////    public static void preorder(Node root)
////////    {
////////        if(root!=null)
////////        {
////////            System.out.print(root.key+" ");
////////            preorder(root.left);
////////            preorder(root.right);
////////        }
////////    }
////////
////////    public static void postorder(Node root)
////////    {
////////        if(root!=null)
////////        {
////////            postorder(root.left);
////////            postorder(root.right);
////////            System.out.print(root.key+" ");
////////        }
////////    }
////////
////////    public static void lvlorder(Node root)
////////    {
////////        Node temp1=root.left;
////////        Node temp2=root.right;
////////        System.out.print(root.key+" ");
////////        while(temp1!=null && temp2!=null)
////////        {
////////            System.out.print(temp1.key+" ");
////////            System.out.print( temp2.key+" ");
////////            temp1=temp1.left;
////////            temp2=temp2.right;
////////        }
////////    }
////////
////////
////////    public static void main(String args[])
////////    {
////////        Node root=new Node(20);
////////        root.left=new Node(30);
////////        root.right=new Node(40);
////////        root.left.left=new Node(50);
////////        root.left.right=new Node(60);
////////        root.left.left.left=new Node(70);
////////        root.left.left.right=new Node(80);
////////
////////
//////////        preorder(root);
//////////        System.out.println();
//////////        inoreder(root);
//////////        System.out.println();
//////////        postorder(root);
//////////        lvlorder(root);
////////    }
////////}
//////
////////
////////import java.util.*;
////////class Main
////////{
////////    public static boolean hotelBooking(int A[],int D[], int k)
////////    {
////////      //  boolean res=true;
////////        Arrays.sort(D);
////////        Arrays.sort(A);
////////        Stack <Integer> st=new Stack<>();
////////        int i=1;
////////        int j=0;
////////        st.push(A[0]);
////////        while(i<A.length && j<D.length)
////////        {
////////            if(A[i]<D[j])
////////            {
////////                st.push(A[i]);
////////                i++;
////////            }else if(A[i]==D[j])
////////            {
////////                i++;
////////                j++;
////////            }
////////            else if(A[i]>D[j])
////////            {
////////                    st.pop();
////////                    j++;
////////            }
////////           // if(!st.isEmpty())
////////             //    System.out.println(st.size());
////////
////////            if(st.size()>k)
////////                return false;
////////
////////        }
////////        return true;
////////    }
////////    public static void main(String args[])
////////    {
////////        int A[]={1,2,3,4};
////////        int D[]={132,2343,543,5,};
////////        int k=1;
////////        System.out.println(hotelBooking(A,D,k));
////////    }
////////}
//////
//////
////////import java.util.Arrays;
////////import java.util.HashMap;
////////
////////class Main
////////{
////////    public static void main(String args[])
////////    {
////////        int arr[]=new int[]{-1,1,2};
////////        HashMap<Integer,Integer> hmp=new HashMap<>(arr.length);
////////        for(int i=0;i<arr.length;i++)
////////        {
////////            hmp.put(arr[i],i);
////////
////////        }
////////        System.out.println(hmp);
////////        Arrays.sort(arr);
////////        int res=0;
//////////        int j=0;
////////        for(int i=arr.length-1;i>=0;i--)
////////        {
////////           for(int j=i-1;j>=0;j--)
////////               res=Math.max(res,hmp.get(arr[i])-hmp.get(arr[j]));
////////        }
////////        System.out.println(res);
////////
////////    }
////////}
//////
//////
////////import java.lang.reflect.Array;
////////import java.util.Arrays;
////////import java.util.Collections;
////////
////////class Main
////////{
////////    public static void main(String args[])
////////    {
////////        int []arr=new int[]{new  Integer(10),new Integer(20),new Integer(30)};
////////
////////        // 1- Arrays.sort Method
////////        Arrays.sort(arr);
////////        for(int i=0;i<arr.length;i++)
////////            System.out.print(arr[i]+" ");
////////
////////
////////           System.out.println();
//////////        2- Sort in reverse order
////////        Arrays.sort(arr, Collections.reverseOrder());
////////
////////
////////        System.out.println();
//////////        3- Arrays.sort(array,index 1, index 2(i-1));
////////        Arrays.sort(arr,1,3);
////////        for(int i=0;i<arr.length;i++)
////////            System.out.print(arr[i]+" ");
////////    }
////////}
//////
////////
////////import java.util.Arrays;
////////import java.util.Collections;
////////class Main {
////////
////////    public static void main(String[] args) {
////////        // int Array
////////        Integer[] intArray = new Integer[] {
////////             2,3,4,5,6,7,8
////////        };
////////
////////        // Sorting int Array in descending order
////////        Arrays.sort(intArray, Collections.reverseOrder());
////////
////////        // Displaying elements of int Array
////////        System.out.println("Int Array Elements in reverse order:");
////////        for (int i = 0; i < intArray.length; i++)
////////            System.out.print(intArray[i]+" ");
////////
////////        // String Array
////////        String[] stringArray =
////////                new String[] { "FF", "PP", "AA", "OO", "DD" };
////////
////////        // Sorting String Array in descending order
////////        Arrays.sort(stringArray, Collections.reverseOrder());
////////
////////        // Displaying elements of String Array
////////        System.out.println("String Array Elements in reverse order:");
////////        for (int i = 0; i < stringArray.length; i++)
////////            System.out.println(stringArray[i]);
////////    }
////////}
//////
//////
////////import java.util.Arrays;
////////import java.util.Collections;
////////
////////class Main
////////{
////////    public static void main(String args[])
////////    {
//////////        Note :- If u want to perform reverse sort operation in Arrays then use Integer class nor Data types
////////        Integer []arr=new Integer[]{new  Integer(10),new Integer(20),new Integer(30)};
////////
////////        // 1- Arrays.sort Method
////////        Arrays.sort(arr);
////////        for(int i=0;i<arr.length;i++)
////////            System.out.print(arr[i]+" ");
////////
////////
////////           System.out.println();
//////////        2- Sort in reverse order
////////        Arrays.sort(arr, Collections.reverseOrder());
////////
////////
////////        System.out.println();
//////////        3- Arrays.sort(array,index 1, index 2(i-1));
////////
////////        Arrays.sort(arr,1,3);
////////        for(int i=0;i<arr.length;i++)
////////            System.out.print(arr[i]+" ");
////////    }
////////}
//////
//////
//////import jdk.dynalink.beans.StaticClass;
//////
//////import java.sql.Array;
//////import java.util.*;
////////
////////class Main
////////{
////////
////////    public static void bubblesort(int arr[])
////////    {
////////        for(int i=0;i<arr.length;i++)
////////        {
////////            boolean swapped=false;
////////            for(int j=0;j<arr.length-1;j++)
////////            {
////////                if(arr[j]>arr[j+1])
////////                {
//////////                 swap(arr[j],arr[j+1]);
//////////                    You can swap function also
////////                 int temp=arr[j];
////////                 arr[j]=arr[j+1];
////////                 arr[j+1]=temp;
////////                 swapped=true;
////////                }
////////            }
////////            if(swapped==false)
////////                break;
////////        }
////////    }
//////////    Driver Code
////////    public static void main(String args [])
////////    {
////////        int arr[]=new int[]{2,10,8,7};
////////        bubblesort(arr);
////////        for(int i=0;i<arr.length;i++)
////////            System.out.print(arr[i]+" ");
////////    }
////////}
//////
//////
////////
////////class Main
////////{
////////    private static void selectionsort( int arr[])
////////    {
////////        int temp[]=new int[arr.length];
////////
////////        for(int i=0;i<arr.length;i++)
////////        {
////////            int min_ind=0;
////////            for(int j=1;j<arr.length;j++)
////////            {
////////                if(arr[j]<arr[min_ind])
////////                {
////////                    min_ind=j;
////////                }
////////                temp[i]=arr[min_ind];
////////                arr[min_ind]=INF;
////////            }
////////        }
////////        for(int i=0;i<arr.length;i++)
////////        {
////////            arr[i]=temp[i];
////////        }
////////
////////    }
////////    public static void main(String args[])
////////    {
////////        int arr[]=new int[]{10,5,8,20,2,18};
////////        selectionsort(arr);
////////        for(int i=0;i<arr.length;i++)
////////        {
////////            System.out.print(arr[i]+" ");
////////        }
////////    }
////////}
//////
//////
////////class Main
////////{
////////    public static void  selection(int arr[])
////////    {
////////        for(int i=0;i<arr.length;i++)
////////        {
////////            int min_ind=0;
////////            for(int j=i+1;j<arr.length;j++)
////////            {
////////                if(arr[j]<arr[min_ind])
////////                {
////////                    min_ind=j;
////////                    int temp=arr[j];
////////                    arr[j]=arr[min_ind];
////////                    arr[min_ind]=temp;
////////                }
////////            }
////////        }
////////    }
////////    public static void main(String args[])
////////    {
////////        int arr[]=new int[]{10,5,8,20,2,18};
////////        selection(arr);
////////        for(int i=0;i<arr.length;i++)
////////            System.out.print( arr[i]+" ");
////////    }
////////}
//////
////////
////////
////////class Main
////////{
////////    public void insertion(int arr[])
////////    {
////////        for(int i=1;i<arr.length;i++)
////////        {
////////            int key=arr[i];
////////            int j=i-1;
////////            while(j>=0 && arr[j]>key)
////////            {
////////                arr[j+1]=arr[j];
////////                j--;
////////            }
////////            arr[j+1]=key;
////////        }
////////    }
////////    public void selection(int arr[])
////////    {
////////        for(int i=0;i<arr.length;i++)
////////        {
////////            int min_ind=i;
////////            for(int j=i+1;j<arr.length;j++)
////////            {
////////                if(arr[min_ind]>arr[j])
////////                    min_ind=j;
////////            }
////////            int temp=arr[i];
////////            arr[i]=arr[min_ind];
////////            arr[min_ind]=temp;
////////        }
////////    }
////////    public void bubble(int arr[])
////////    {
////////        for(int i=0;i<arr.length;i++)
////////        {
////////            boolean swap=false;
////////            for(int j=0;j<arr.length-i-1;j++)
////////            {
////////                if(arr[j]>arr[j+1])
////////                {
////////                    int temp=arr[j];
////////                    arr[j]=arr[j+1];
////////                    arr[j+1]=temp;
////////                    swap=true;
////////                }
////////            }
////////            if(swap==false)
////////                break;
////////        }
////////    }
////////        public static void main(String args[])
////////    {
////////        int arr[]=new int[]{10,5,8,20,2,18};
////////        Main mn=new Main();
////////        //mn.bubble(arr);
//////////        mn.selection(arr);
////////        mn.insertion(arr);
////////        for(int i=0;i<arr.length;i++)
////////            System.out.print( arr[i]+" ");
////////    }
////////}
////////
////////class Main
////////{
////////
////////    public static void main(String args[])
////////    {
////////        Scanner sc=new Scanner(System.in);
////////        int t=sc.nextInt();
////////        while(t-->0)
////////        {
////////            int n=sc.nextInt();
////////            int k=sc.nextInt();
////////            int arr[]=new int[n];
////////            for(int i=0;i<n;i++)
////////                arr[i]=sc.nextInt();
////////            System.out.println(profit(arr,k));
////////        }
////////
////////    }
////////    public static int profit(int arr [],int k)
////////    {
////////        int sum=0;
////////        int amount=0;
////////        for(int i=0;i<arr.length;i++)
////////        {
////////            sum=sum+arr[i];
////////        }
////////        for(int i=0;i<arr.length;i++)
////////        {
////////            if(arr[i]>k)
////////                amount=amount+k;
////////            else
////////                amount=amount+arr[i];
////////        }
////////        return sum-amount;
////////    }
////////}
//////
////////import java.util.*;
////////class Main
////////{
////////    public static void main (String[] args) throws java.lang.Exception
////////    {
////////        // your code goes here
////////        Scanner sc=new Scanner(System.in);
////////       // InputStreamReader is=new InputStreamReader(System.in);
////////        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
////////        int t=Integer.parseInt(br.readLine());
////////        //int t=sc.nextInt();
////////        while(t-->0)
////////        {
////////            String str=br.readLine();
////////            Stack <Character> st=new Stack<>();
////////            int count=0;
////////            for(int i=0;i<str.length()-1;i++)
////////            {
////////                st.push(str.charAt(i));
////////                if(st.peek()=='x' && str.charAt(i+1)=='y')
////////                    count++;
////////            }
////////            System.out.println(count);
////////        }
////////    }
////////}
//////
////////
/////////* package codechef; // don't place package name! */
////////
////////import java.util.*;
////////import java.lang.*;
////////import java.io.*;
////////
/////////* Name of the class has to be "Main" only if the class is public. */
////////class Main
////////{
////////    public static void main (String[] args) throws java.lang.Exception
////////    {
////////        // your code goes here
////////        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
////////        int t=Integer.parseInt(br.readLine());
////////        while(t-->0)
////////        {
////////            String str=br.readLine();
////////            Stack <Character> st=new Stack<>();
////////            int count=0;
////////            for(int i=0;i<str.length()-1;i++)
////////            {
////////                st.push(str.charAt(i));
////////                if(st.peek()=='x' && str.charAt(i+1)=='y')
////////                    count++;
////////            }
////////            System.out.println(count);
////////        }
////////    }
////////}
////////class Main
////////{
////////    public static void main(String args[])
////////    {
////////        Scanner sc=new Scanner(System.in);
////////        int n=sc.nextInt();
////////        String str=String.valueOf(n);
////////        char arr[]=str.toCharArray();
////////        for(int i=0;i<arr.length;i++)
////////        {
////////            if(arr[i]==0)
////////                arr[i]=5;
////////        }
////////        str=Arrays.toString(arr);
////////        //n=Integer.parseInt(str);
////////        System.out.println(str);
////////    }
////////}
//////
////////class Main
////////{
////////    public static void main(String args[])
////////    {
////////        Scanner sc=new Scanner(System.in);
////////        int t=sc.nextInt();
////////        while(t-->0)
////////        {
////////            int n=sc.nextInt();
////////            int arr[]=new int[n];
////////            int sum=0;
////////            for(int i=0;i<arr.length;i++)
////////                arr[i]=sc.nextInt();
////////
////////            sum=sum+arr[0];
////////            if(arr[0]!=5)
////////            {
////////                System.out.println("No");
////////                return;
////////            }
////////            else
////////                {
////////                    for(int i=1;i<n;i++)
////////                    {
////////                        if(arr[i]>sum)
////////                        {
////////                            System.out.println("No");
////////                            return;
////////                        }else if(arr[i]<sum && sum%5==0)
////////                        {
////////                            System.out.println("yes");
////////                        }
////////                        sum=sum+arr[i];
////////                    }
////////                }
////////
////////        }
////////    }
////////}
////////
////////class Node
////////{
//////////     Node head;
////////    int data;
////////    Node next;
////////    Node(int x)
////////    {
////////        data=x;
////////        next=null;
////////    }
////////}
////////class Main
////////{
////////    public  void insertAtmid(int data)
////////    {
////////        Node temp=new Node(data);
////////        if(head==null)
////////        {
////////            head=temp;
////////        }else
////////            {
////////                Node slow=head;
////////                Node fast=head.next;
////////
////////                while(slow!=null && fast!=null)
////////                {
////////                    slow=slow.next;
////////                    fast=fast.next.next;
////////                }
////////                Node temp1=slow.next;
////////                slow.next=temp;
////////                temp.next=temp1;
////////            }
////////    }
////////    public static void display(Node head)
////////    {
////////        if(head==null)
////////            return;
////////        Node curr=head;
////////        while(curr!=null)
////////        {
////////            System.out.print(curr.data+" ");
////////            curr=curr.next;
////////        }
////////    }
////////    public static void main(String args[])
////////    {
////////        Node head=null;
////////        insertAtmid(head,10);
////////        insertAtmid(head,20);
////////        insertAtmid(head,30);
////////        insertAtmid(head,40);
////////        insertAtmid(head,50);
////////        insertAtmid(head,60);
////////        insertAtmid(head,70);
////////        insertAtmid(head,80);
////////        insertAtmid(head,90);
////////        display(head);
////////
////////    }
////////}
//////
//////
////////class Main
////////{
////////    public static void main(String args[])
////////    {
////////        String str="yyxyx";
//////////        if(str.length()<2)
//////////        {
//////////            System.out.println(0);
//////////            return;
//////////        }
////////        int count=0;
////////        for(int i=0;i<str.length()-1;i++)
////////        {
////////            if((str.charAt(i)=='x' && str.charAt(i+1)=='y') ||(str.charAt(i)=='y' && str.charAt(i+1)=='x'))
////////            {
////////                count++;
////////                i++;
////////            }
////////        }
////////        System.out.println(count);
////////    }
////////}
////////class Main
////////{
////////    public static void main (String[] args) throws java.lang.Exception
////////    {
////////        // your code goes here
////////        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
////////        int t=Integer.parseInt(br.readLine());
////////        while(t-->0)
////////        {
////////            String str=br.readLine();
////////            int count=0;
////////            for(int i=0;i<str.length()-1;i++)
////////            {
////////                if((str.charAt(i)=='x' && str.charAt(i+1)=='y') ||(str.charAt(i)=='y' && str.charAt(i+1)=='x'))
////////                {
////////                    count++;
////////                    i++;
////////                }
////////            }
////////            System.out.println(count);
////////        }
////////    }
////////}
////////class Main {
////////    public static void main(String args[]) throws Exception {
////////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////////        int t = Integer.parseInt(br.readLine());
////////        while (t-->0) {
////////
////////            int n = Integer.parseInt(br.readLine());                //
////////            int arr[] = new int[n];                               //
////////            for (int i = 0; i < arr.length; i++)                //INPUT LINES
////////                arr[i] = Integer.parseInt(br.readLine());       //
////////
////////                boolean for1 = false;
////////                int sum = arr[0];
////////                if (arr[0] != 5) {
////////                    System.out.println("NO");
////////                } else {
////////                    for (int i = 1; i < arr.length; i++)
////////                    {
////////                        if ((arr[i] - 5) > sum) {
////////                            System.out.println("NO");
////////                            break;
////////                        } else if (arr[i] - 5 <= sum) {
////////                            sum = sum + 5 - (arr[i] - 5);
////////                        }
////////                    }
////////                }
////////            //    System.out.println(sum);
////////                System.out.println("YES");
////////        }
////////    }
////////}
//////
////////class Main
////////{
////////    public static void res(int arr[])
////////    {
////////        if(arr[0]!=5)
////////        {
////////            System.out.println("NO");
////////            return;
////////        }
////////        int sum=arr[0];
////////        for(int i=1;i<arr.length;i++)
////////        {
////////            if ((arr[i] - 5) > sum) {
////////                System.out.println("NO");
////////                return;
////////            }
////////            else if (arr[i] - 5 <= sum)
////////            {
////////                sum = sum + 5 - (arr[i] - 5);
////////            }
////////        }
////////        System.out.println("YES");
////////    }
////////    public static void main(String args[])throws Exception
////////    {
////////        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
////////        int t=Integer.parseInt(br.readLine());
////////        while(t-->0)
////////        {
////////            int n=Integer.parseInt(br.readLine());;
////////            int arr[]=new int[n];
////////            for(int i=0;i<n;i++)
////////                arr[i]=Integer.parseInt(br.readLine());
////////
////////            res(arr);
////////        }
////////    }
////////}
//////
//////
////////class Main
////////{
////////    public static void res(int arr[])
////////    {
////////        if(arr[0]!=5)
////////        {
////////            System.out.println("NO");
////////            return;
////////        }
////////        int sum=arr[0];
////////        for(int i=1;i<arr.length;i++)
////////        {
////////            if ((arr[i] - 5) > sum) {
////////                System.out.println("NO");
////////                return;
////////            }
////////            else if (arr[i] - 5 <= sum)
////////            {
////////                sum = sum + 5 - (arr[i] - 5);
////////            }
////////        }
////////        System.out.println("YES");
////////    }
////////
////////    public static void main (String[] args) throws java.lang.Exception
////////    {
////////        // your code goes here
////////        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
////////        int t=Integer.parseInt(br.readLine());
////////        while(t-->0)
////////        {
////////            int n=Integer.parseInt(br.readLine());
////////            int arr[]=new int[n];
////////            for(int i=0;i<arr.length;i++)
////////                arr[i]=Integer.parseInt(br.readLine());
////////
////////
////////
////////            res(arr);
////////
////////        }
////////    }
////////}
//////
//////
/////////* package codechef; // don't place package name! */
////////
////////import java.util.*;
////////import java.lang.*;
////////import java.io.*;
////////
/////////* Name of the class has to be "Main" only if the class is public. */
////////class Main
////////{
////////    public static void res(int arr[])
////////    {
////////        if(arr[0]!=5)
////////        {
////////            System.out.println("NO");
////////            return;
////////        }
////////        int sum=arr[0];
////////        for(int i=1;i<arr.length;i++)
////////        {
////////            if ((arr[i] - 5) > sum) {
////////                System.out.println("NO");
////////                return;
////////            }
////////            else if (arr[i] - 5 <= sum)
////////            {
////////                sum = sum + 5 - (arr[i] - 5);
////////            }
////////        }
////////
////////        System.out.println("YES");
////////    }
////////
////////    public static void main (String[] args) throws java.lang.Exception
////////    {
////////        // your code goes here
////////        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
////////        int t=Integer.parseInt(br.readLine());
////////        while(t-->0)
////////        {
////////            int n=Integer.parseInt(br.readLine());
////////            int arr[]=new int[n];
////////            for(int i=0;i<arr.length;i++)
////////                arr[i]=Integer.parseInt(br.readLine());
////////
////////
////////
////////            res(arr);
////////
////////        }
////////    }
////////}
//////
//////
//////// Implement bst
////////
////////class Node
////////{
////////    int key;
////////    Node left;
////////    Node right;
////////    Node(int x ) {
////////        key = x;
////////    }
////////}
////////
////////class Main
////////{
////////    public Node  insertNode(Node root,int x)
////////    {
////////        if(root==null)
////////            return new Node(x);
////////        else if(root.key > x)
////////        {
////////            root.left=insertNode(root.left,x);
////////        }
////////        else if(root.key < x)
////////        {
////////            root.right=insertNode(root.right,x);
////////        }
////////        return root;
////////    }
////////    public static void main(String args[])
////////    {
////////        Node root=new Node(5);
////////        Main mn=new Main();
////////        mn.insertNode(root,7);
////////    }
////////}
////////class Main
////////{
////////    public static void main(String args[])
////////    {
////////        System.out.println("main");
////////    }
////////    public static void main(char[] arg)
////////    {
////////        System.out.println("insside");
////////    }
////////}
//////
////////
////////class queue
////////{
////////    int front=0;
////////    int rear=0;
////////    int arr[]=new int[8];
////////    int cap=arr.length;
////////    public void push(int a)
////////    {
////////        if(rear==arr.length-1)
////////            return;
////////        arr[rear]=a;
////////        rear++;
////////    }
////////    public int pop()
////////    {
////////        int temp=arr[front];
////////        front++;
////////
////////        return temp;
////////    }
////////    public void display()
////////    {
////////        if(front==rear)
////////            System.out.println("Queue is Empty");
////////        for(int i=front;i<rear;i++)
////////        {
////////            System.out.print(arr[i]+" ");
////////        }
////////    }
////////    public int getsize(){return rear-front;}
////////    public int getFront(){return front;}
////////    public int getRear(){return rear;}
////////}
////////class Main
////////{
////////    public static void main(String args[])
////////    {
////////        queue qu=new queue();
////////        qu.push(5);
////////        qu.push(6);
////////        qu.push(7);
////////        qu.push(8);
////////        System.out.println(qu.pop());
////////        System.out.println(qu.pop());
////////        qu.push(9);
////////        System.out.println(qu.pop());
////////        qu.display();
////////        qu.pop();
////////        qu.pop();
////////        System.out.println();
////////        qu.display();
////////        qu.push(10);
////////        qu.display();
////////        System.out.println();
////////        System.out.println(qu.getsize());
////////
////////    }
////////}
////////
////////class Node
////////{
////////    int data;
////////    Node front=null;
////////    Node rear=null;
////////    Node next;
////////    Node(int x)
////////    {
////////        data=x;
////////    }
////////    void push(int a)
////////    {
////////        Node temp=new Node(a);
////////        if(rear==null)
////////        {
////////            rear=temp;
////////            front=temp;
////////            return;
////////        }
////////        rear.next=temp;
////////        rear=temp;
////////    }
////////    void pop()
////////    {
////////        if(rear==front)
////////            return;
////////        int val=front.data;
////////        front=front.next;
////////    }
////////    void display()
////////    {
////////        Node curr=front;
////////        while (curr!=null)
////////        {
////////            System.out.print(curr.data+" ");
////////            curr=curr.next;
////////        }
////////    }
////////}
////////class Main
////////{
////////    public static void main(String args[])
////////    {
////////        Node ln=new Node(3);
////////    }
////////}
//////
////////class QNode
////////{
////////    int data;
////////    QNode next;
////////    QNode(int x)
////////    {
////////        data=x;
////////    }
////////}
////////class queue
////////{
////////    QNode front,rear;
////////    queue()
////////    {
////////        this.front=this.rear=null;
////////    }
////////    void push(int a)
////////    {
////////        QNode qt=new QNode(a);
////////        if(this.rear==null)
////////        {
////////            this.rear=qt;
////////            this.front=qt;
////////        }
////////        this.rear.next=qt;
////////        this.rear=qt;
////////    }
////////    void pop()
////////    {
////////        if(this.front==null)
////////            return;
////////        QNode val=this.front;
////////        front=front.next;
////////
////////
////////        if(front==null)
////////            rear=null;
////////    }
////////     int  getfront(){return front.data;}
////////     int getrear(){return rear.data;}
////////    void display()
////////    {
////////        if(front==null)
////////            return;
////////        QNode curr=front;
////////        while(curr!=null)
////////        {
////////            System.out.print(curr.data+" ");
////////            curr=curr.next;
////////        }
////////    }
////////}
////////class Main
////////{
////////    public static void main(String args[])
////////    {
////////        queue qu=new queue();
////////        qu.push(5);
////////        qu.push(6);
////////        qu.push(7);
////////        qu.push(8);
////////        qu.push(9);
////////        qu.push(10);
////////        qu.push(11);
////////        qu.pop();
////////        qu.pop();
////////        System.out.println(qu.getfront());
////////        System.out.println(qu.getrear());
////////        qu.display();
////////
////////    }
////////}
//////
//////// Tree Traversal - Inorder(left,root,right)
////////                  Preoredr(root,left,right)
////////                  Postorder(left,right,root)
////////class Node
////////{
////////    int data;
////////    Node left;
////////    Node right;
////////    Node(int x)
////////    {
////////        data=x;
////////    }
////////}
////////class Main
////////{
////////    public static void inorder(Node ts)
////////    {
////////        if(ts==null)
////////            return;
////////        inorder(ts.left);
////////        System.out.print(ts.data+" ");
////////        inorder(ts.right);
////////    }
////////
////////    public static void preorder(Node ts)
////////    {
////////        if(ts==null)
////////            return;
////////        System.out.print(ts.data+" ");
////////        preorder(ts.left);
////////        preorder(ts.right);
////////    }
////////    public static int getsize(Node ts)
////////    {
////////        if(ts==null)
////////            return 0;
////////        else
////////            return 1+getsize(ts.left)+getsize(ts.right);
////////
////////    }
////////    public static int getmax(Node ts)
////////    {
////////        if(ts==null)
////////            return 0;
////////
////////            return Math.max(ts.data,Math.max(getmax(ts.left),getmax(ts.right)));
////////    }
////////    public static int getheight(Node ts)
////////    {
////////        if(ts==null)
////////            return 0;
////////        return Math.max(getheight(ts.left),getheight(ts.right))+1;
////////    }
////////    public static void main(String args[])
////////    {
////////     Node ts=new Node(4);
////////     ts.left=new Node(5);
////////     ts.right=new Node(6);
////////     ts.left.left=new Node(7);
////////     ts.left.right=new Node(8);
////////     ts.right.left=new Node(9);
////////     ts.right.right=new Node(10);
////////
////////
////////        preorder(ts);
////////        System.out.println();
////////        System.out.println(getsize(ts));
////////        System.out.println(getmax(ts));
////////        System.out.println(getheight(ts));
////////
////////    }
////////}
//////
//////
//////
////////// Binary Search Tree
////////class Node
////////{
////////    int data;
////////    Node left;
////////    Node right;
////////    Node(int x)
////////    {
////////        data=x;
////////    }
////////}
////////class Main
////////{
////////    public static Node insert(Node root,int x)
////////    {
////////        Node temp=new Node(x);
////////        if(root==null)
////////        {
////////            return temp;
////////        }
////////        if(root.data>x)
////////        {
////////            root.left=insert(root.left,x);
////////        }else if(root.data<x)
////////        {
////////            root.right=insert(root.right,x);
////////        }
////////        return root;
////////    }
////////    public static void inorder(Node root)
////////    {
////////        if(root==null)
////////            return;
////////        inorder(root.left);
////////        System.out.print(root.data+" ");
////////        inorder(root.right);
////////    }
////////    public static boolean search(Node root,int x)
////////    {
////////        while(root!=null)
////////        {
////////            if(root.data==x)
////////                return true;
////////            else if(root.data>x)
////////                root=root.left;
////////            else if(root.data<x)
////////                root=root.right;
////////        }
////////        return false;
////////    }
////////
////////
////////    public static void main(String args[])
////////    {
////////        Node root=null;
////////
////////        root=insert(root,50);
////////        insert(root,30);
////////        insert(root,20);
////////        insert(root,40);
////////        insert(root,70);
////////        insert(root,60);
////////        insert(root,80);
////////        insert(root,90);
////////        insert(root,100);
////////        insert(root,110);
////////        inorder(root);
////////        System.out.println( search(root,6));
////////    }
////////}
//////
//////
////////
////////class Main
////////{
////////    static void getrepeated(int arr[])
////////    {
////////        HashMap <Integer,Integer> hmp=new HashMap<>();
////////        for(int i=0;i<arr.length;i++)
////////        {
////////            if(hmp.containsKey(arr[i])==true)
////////            {
////////                hmp.put(arr[i],hmp.get(arr[i])+1);
////////            }else
////////                {
////////                    hmp.put(arr[i],1);
////////                }
////////        }
////////        System.out.println(hmp);
////////        for(int key:hmp.keySet())
////////        {
////////            if(hmp.get(key)>1)
////////                System.out.print(key+" ");
////////        }
////////      //  System.out.println(hmp);
////////    }
////////    public static void main(String args[])
////////    {
////////        int arr[]=new int[]{2,3,2,3,4,5,6,4,3,2,2,3,4,4,5};
////////        getrepeated(arr);
////////    }
////////}
//////
////////
////////class Main
////////{
////////    public static void main(String args[])
////////    {
////////        int arr[]=new int[]{0,1,0,2,1,0,1,1,0,1,2,2,1,0,2,1};
////////        int count0=0;
////////                int count1=0;
////////                        int count2=0;
////////        for(int i=0;i<arr.length;i++)
////////        {
////////            if(arr[i]==0)
////////                count0++;
////////            else if(arr[i]==1)
////////                count1++;
////////            else
////////                count2++;
////////        }
//////////        System.out.println(count0);
//////////        System.out.println(count1);
//////////        System.out.println(count2);
////////        for(int i=0;i<count0;i++)
////////            arr[i]=0;
////////
////////        for(int i=count0;i<(count1+count0);i++)
////////            arr[i]=1;
////////
////////        for(int i=count1+count0;i<arr.length;i++)
////////            arr[i]=2;
////////
////////
////////        for(int i=0;i<arr.length;i++)
////////            System.out.print(arr[i]+" ");
////////    }
////////}
////////
////////class Main
////////{
////////    static void sort012(int arr[])
////////    {
////////        int low=0;
////////        int mid=0;
////////        int temp=0;
////////        int high=arr.length-1;
////////        while(mid<=high)
////////        {
////////            switch (arr[mid])
////////            {
////////                case 0:
////////                   temp=arr[low];
////////                   arr[low]=arr[mid];
////////                   arr[mid]=temp;
////////                   low++;
////////                   mid++;
////////                   break;
////////
////////                case 1:
////////                    mid=mid+1;
////////                    break;
////////                case 2:
////////                    temp=arr[mid];
////////                    arr[mid]=arr[high];
////////                    arr[high]=temp;
////////                    high--;
////////                    break;
////////            }
////////
////////        }
////////    }
////////    public static void main(String args[])
////////    {
////////        int arr[]=new int[]{0,1,0,2,1,0,1,1,0,1,2,2,1,0,2,1};
////////        sort012(arr);
////////        for(int i=0;i<arr.length;i++)
////////            System.out.print(arr[i]+" ");
////////    }
////////}
////////
////////
////////class Main
////////{
////////    public static void miss_rep(int arr[])
////////    {
////////        HashMap<Integer,Integer> hmp=new HashMap<>();
////////        for(int i=0;i<arr.length;i++)
////////        {
////////            if(hmp.containsKey(arr[i])==true)
////////            {
////////                hmp.put(arr[i],hmp.get(arr[i])+1);
////////            }else
////////                {
////////                    hmp.put(arr[i],1);
////////                }
////////        }
////////        for(int i=1;i<=arr.length;i++)
////////        {
////////            if(hmp.containsKey(i)==true)
////////                continue;
////////            else
////////                {
////////                    System.out.println("missing ="+i);
////////                    break;
////////                }
////////        }
////////        for(int key:hmp.keySet())
////////        {
////////            if(hmp.get(key)>1)
////////            {
////////                System.out.println("repeat="+key);
////////                break;
////////            }
////////
////////        }
////////
////////    }
////////    public static void main(String args[])
////////    {
////////        int arr[]={3,1,3,4,4};
////////        miss_rep(arr);
////////    }
////////}
//////
//////
////////
////////class Main
////////{
////////    public static void merge(int arr[],int arr1[])
////////    {
////////        int m=arr.length;
////////        int n=arr1.length;
////////        int res[]=new int[m+n];
////////        int i=0;
////////        int j=0;
////////        int k=0;
////////        while(i<m && j<n)
////////        {
////////                if(arr[i]<arr1[j])
////////                res[k++]=arr[i++];
////////                else
////////                res[k++]=arr1[j++];
////////        }
////////
////////        while(i<m)
////////            res[k++]=arr[i++];
////////
////////        while(j<n)
////////            res[k++]=arr1[j++];
////////
////////
////////        for(int ind=0;ind<res.length;ind++)
////////            System.out.print(res[ind]+" ");
////////
////////    }
////////    public static void main(String args[])
////////    {
////////        int arr[]=new int[]{1,3,4,5};
////////        int arr1[]=new int[]{2,4,6,8};
////////        merge(arr,arr1);
////////    }
////////}
//////
////////class Main
////////{
////////    static void merge(int arr[],int arr1[])
////////    {
////////        HashMap<Integer,Boolean> hmp=new HashMap<>();
////////        for(int i=0;i<arr.length;i++)
////////            hmp.put(arr[i],true);
////////
////////        for(int i=0;i<arr1.length;i++)
////////            hmp.put(arr1[i],true);
////////
////////
////////
////////        for(int key: hmp.keySet())
////////        {
////////            System.out.print(key+" ");
////////        }
////////    }
////////    public static void main(String args[])
////////    {
////////        int arr[]=new int[]{1,3,4,5};
////////        int arr1[]=new int[]{2,4,6,8};
////////        merge(arr,arr1);
////////    }
////////}
//////
//////
////////class Main {
////////    public static void merge(int[] nums1, int m, int[] nums2, int n) {
////////        HashMap<Integer,Boolean> hmp=new HashMap<>();
////////        for(int i=0;i<m;i++)
////////            hmp.put(nums1[i],true);
////////
////////        for(int i=0;i<n;i++)
////////            hmp.put(nums2[i],true);
////////
////////        for(int key: hmp.keySet())
////////            System.out.print(key+" ");
////////    }
////////    public static void main(String args[])
////////    {
////////        int nums1[]=new int[]{1,2,3,0,0,0};
////////        int nums2[]=new int[]{2,5,6};
////////        merge(nums1,3,nums2,3);
////////    }
////////}
//////
////////
////////class Main
////////{
////////    public static void merge(int arr1[],int arr2[])
////////    {
////////        for(int i=arr2.length-1;i>=0;i--)
////////        {
////////            if
////////        }
////////    }
////////    public static void main(String args[])
////////    {
////////
////////    }
////////}
//////
//////
////////
////////class Main
////////{
////////    public static void kadanes(int arr[])
////////    {
////////        int sum=0;
////////        int res=Integer.MIN_VALUE;
////////        for(int i=0;i<arr.length;i++)
////////        {
////////            sum=sum+arr[i];
////////
////////            if(sum<0)
////////                sum=0;
////////
////////            else if(res<sum)
////////                res=sum;
////////
////////
////////        }
////////        System.out.println(res);
////////    }
////////    public static void main(String args[])
////////    {
////////       // int arr[]=new int[]{1,2,3,-2,5};
////////        kadanes(new int[]{-2, -3, -4, -1, -2, -1, -5, -3});
////////    }
////////}
//////
////////
//////
//////
////////import java.util.*;
////////public class Main
////////{
////////    public static void main(String args[])throws Exception
////////    {
////////        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
////////        int n=Integer.parseInt(br.readLine());
////////        int k=Integer.parseInt(br.readLine());
////////        int count=0;
////////        int arr[]=new int[n];
////////        for(int i=0;i<n;i++)
////////        {
////////            arr[i]=Integer.parseInt(br.readLine());
////////            if(arr[i]>k)
////////                count++;
////////        }
////////
////////
////////        System.out.println(count);
////////    }
////////}
//////
//////
////////import java.util.*;
////////public class Main
////////{
////////    public static void main(String args[])
////////    {
////////        Scanner sc=new Scanner(System.in);
////////        int count=0;
////////        int n=sc.nextInt();
////////        int k=sc.nextInt();
////////        int arr[]=new int[n];
////////        for(int i=0;i<n;i++)
////////        {
////////            arr[i]=sc.nextInt();
////////            if(arr[i]>k)
////////                count++;
////////        }
////////
////////        System.out.println(count);
////////    }
////////}
//////
////////
////////import java.util.*;
////////public class Main
////////{
////////    public static void main(String args[])
////////    {
////////        Scanner sc=new Scanner(System.in);
////////        int s=sc.nextInt();
////////        int count=0;
////////        int arr[][]=new int[s][3];
////////        for(int i=0;i<s;i++)
////////        {
////////            for(int j=0;j<3;j++)
////////            {
////////                arr[i][j]=sc.nextInt();
////////            }
////////        }
////////
////////        for(int i=0;i<s;i++)
////////        {
////////            int res=0;
////////            for(int j=0;j<3;j++)
////////            {
////////                if(arr[i][j]==1)
////////                    res++;
////////            }
////////            if(res>=2)
////////                count++;
////////        }
////////        System.out.println(count);
////////    }
////////}
//////
//////
////////public class Main
////////{
////////    public static void main(String args[])throws  Exception
////////    {
////////        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
////////        String str=br.readLine();
////////        String str1=br.readLine();
////////        if(str.length()<str1.length())
////////            System.out.println(-1);
////////        else if(str.length()>str1.length())
////////            System.out.println(1);
////////
////////        else if()
////////            System.out.println(0);
////////    }
////////}
////////
////////class Main
////////{
////////    static void mul(int c)
////////    {
////////        System.out.println(c*c);
////////    }
////////    static int sqr(int n)
////////    {
////////        if(n==1)
////////            return n;
////////        int low=1;
////////        int high=n;
////////        int mid=0;
////////        int ans=0;
////////        while(low<=high)
////////        {
////////            mid=low+(high-low)/2;
////////            if(mid==n/mid)
////////                return mid;
////////            else if(mid<n/mid)
////////            {
////////                low=mid+1;
////////                ans=mid;
////////            }
////////            else
////////                high=mid-1;
////////        }
////////        return  ans;
////////
////////    }
////////    public static void main(String args[])
////////    {
////////        System.out.println(sqr(930675566));
////////        mul(229913703);
////////    }
////////}
//////
////////class Main
////////{
////////    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
////////        int m=a.size();
////////        int n=b.size();
////////        int arr[]=new int[m+n];
////////        int i=0; int j=0; int k=0;
////////        while(i<m && j<n)
////////        {
////////            if(a.get(i)<b.get(i))
////////                arr[k++]=a.get(i++);
////////            else
////////                arr[k++]=b.get(j++);
////////        }
////////        while(i<m)
////////            arr[k++]=a.get(i++);
////////
////////
////////        while(j<n)
////////            arr[k++]=b.get(j++);
////////
////////
////////        if(arr.length%2==0)
////////            return (arr[(arr.length)/2-1]+arr[(arr.length)/2])/2;
////////        else
////////            return arr[(arr.length)/2];
////////
////////    }
////////    public static int median(int arr1[],int arr2[])
////////    {
////////        HashMap<Integer,Boolean> hmp=new HashMap<>();
////////        for(int i=0;i<arr1.length;i++)
////////            hmp.put(arr1[i],true);
////////        for(int i=0;i<arr2.length;i++)
////////            hmp.put(arr2[i],true);
////////
////////        int res[]=new int[hmp.size()];
////////        int i=0;
////////        for(int key:hmp.keySet())
////////        {
////////            res[i++]=key;
////////        }
////////        for(int j=0;j<res.length;j++)
////////            System.out.print(res[j]+" ");
////////        System.out.println();
////////        if(res.length%2==0)
////////            return res[(res.length)/2-1];
////////        else
////////            return res[(res.length)/2];
////////    }
////////    public static void main(String args[])
////////    {
////////        ArrayList<Integer>al=new ArrayList<>();
////////        ArrayList<Integer>al
////////        int arr2[]=new int[]{-50, -21, -10};
////////       // System.out.println(median(arr1,arr2));
////////    }
////////}
//////
//////
////////class Node
////////{
////////    int data;
////////    Node left;
////////    Node right;
////////    Node(int x)
////////    {
////////        data=x;
////////    }
////////}
////////class Main
////////{
////////    public static void display(Node root)
////////    {
////////        if(root==null)
////////            return;
////////        display(root.left);
////////        System.out.println(root.data);
////////        display(root.right);
////////    }
////////    public static void main(String args[])
////////    {
////////        Node root=new Node(5);
////////        root.left=new Node(6);
////////        root.right=new Node(7);
////////        root.left.left=new Node(7);
////////        root.left.right=new Node(8);
////////        root.right.left=new Node(9);
////////        root.right.right=new Node(10);
////////
////////        display(root);
////////    }
////////}
//////
////////class Main
////////{
////////    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
////////        // int arr[]=new int[nums.length1+nums2.length];
////////
////////        int m=nums1.length;
////////        int n=nums2.length;
////////        int res[]=new int[m+n];
////////        int i=0;
////////        int j=0;
////////        int k=0;
////////        while(i<m && j<n)
////////        {
////////            if(nums1[i]<nums2[j])
////////                res[k++]=nums1[i++];
////////            else
////////                res[k++]=nums2[j++];
////////        }
////////
////////        while(i<m)
////////            res[k++]=nums1[i++];
////////
////////        while(j<n)
////////            res[k++]=nums2[j++];
////////
////////
////////        for(int ind=0;ind<res.length;ind++)
////////            System.out.print(res[ind]+" ");
////////        int len=m+n;
////////        if(len%2==0)
////////            return ((double) res[len/2-1]+(double)res[len/2])/2;
////////        else
////////            return res[len/2];
////////
////////    }
////////    public static void main(String args[])
////////    {
////////     int arr1[]=new int[]{-50,-41,-40,-19,5,21,28};
////////     int arr2[]=new int[]{-50,-21,-10};
////////        System.out.println(findMedianSortedArrays(arr1,arr2));
////////    }
////////}
//////
////////
////////class Main
////////{
////////    public static int find(int arr[],int k)
////////    {
////////        int start=0;
////////        int end=arr.length;
////////        int ans=0;
////////        while(start<=end)
////////        {
////////            int mid=start+(end-start)/2;
////////            if(arr[mid]==k)
////////                return mid;
////////            else if(arr[mid]<k)
////////            {
////////                start=mid+1;
////////                ans=mid;
////////            }
////////            else
////////                end=mid-1;
////////        }
////////        return ans;
////////    }
////////    public static void main(String args[])
////////    {
////////        int arr[]=new int[]{1,2,4,5,6};
////////        System.out.println(find(arr,9));
////////    }
////////}
//////
///////*
//////
//////
//////class Node
//////{
//////    int data;
//////    Node right;
//////    Node left;
//////    Node(int c)
//////    {
//////        data=c;
//////    }
//////}
//////class Main
//////{
//////    public static int height(Node root)
//////    {
//////        if(root==null)
//////            return 0;
//////        return Math.max(height(root.left),height(root.right))+1;
//////    }
//////    public static void printlvl(Node root)
//////    {
//////        if(root==null)
//////            return;
//////
//////        Queue<Node> q=new LinkedList<>();
//////        q.add(root);
//////        while(q.isEmpty()==false)
//////        {
//////            Node curr=q.poll();
//////            System.out.print(curr.data+" ");
//////            if(curr.left!=null)
//////                q.add(curr.left);
//////            if(curr.right!=null)
//////                q.add(curr.right);
//////        }
//////    }
//////    public static void main(String args[])
//////    {
//////        Node root=new Node(5);
//////        root.left=new Node(6);
//////        root.right=new Node(7);
//////        root.left.left=new Node(8);
//////        root.left.right=new Node(9);
//////        root.right.left=new Node(10);
//////        root.right.right=new Node(11);
//////
//////        printlvl(root);
//////        //height(root);
//////        System.out.println(height(root));
//////    }
//////}*/
////////class Main
////////{
////////    public int searchInsert(ArrayList<Integer> a, int b) {
////////
////////        int start=0;
////////        int end=a.size()-1;
////////        int ans=0;
////////        while(start<=end)
////////        {
////////            int mid=start+(end-start)/2;
////////            if(a.get(mid)==b)
////////                return mid;
////////            else if(a.get(mid)>b)
////////                end=mid-1;
////////            else
////////            {
////////                start=mid+1;
////////                ans=mid;
////////            }
////////        }
////////        return ans;
////////    }
////////
////////    static int[] binarysearch(int arr[],int k)
////////    {
////////        int start=0;
////////        int end=arr.length-1;
////////        int res[]=new int[2];
////////        for(int i=0;i<res.length;i++)
////////            res[i]=-1;
////////
////////        int i=0;
////////        while(start<=end)
////////        {
////////            int mid=start+(end-start)/2;
////////            if(arr[mid]==k)
////////            {
////////                res[i++]=mid;
////////            }
////////            else if(arr[mid]>k)
////////                end=mid-1;
////////            else
////////                {
////////                    start=mid+1;
////////                }
////////
////////        }
////////        return res;
////////    }
////////    public static void main(String args[])
////////    {
////////        int arr[]=new int[]{1,2,3,4,5,7,7,9,10};
////////        System.out.println(arr.length);
////////    }
////////}
////////
//////
////////
////////class Main
////////{
////////    public static int[] searchRange(final int[] A, int B) {
////////
////////        int start=0;
////////        int end=A.length-1;
////////        int res[]=new int[2];
////////        for(int i=0;i<res.length;i++)
////////            res[i]=-1;
////////
////////        int i=0;
////////        while(start<=end)
////////        {
////////            int mid=start+(end-start)/2;
////////            if(A[mid]==B)
////////            {
////////                res[i]=mid;
////////                if(i==0){i++;}
////////            }
////////            else if(A[mid]>B)
////////                end=mid-1;
////////            else
////////                start=mid+1;
////////        }
////////        return res;
////////    }
////////    public static void main(String args[])
////////    {
////////        int arr[]=new int[]{5,7,7,8,8,10};
////////        searchRange(arr,8);
//////////        int res[]=searchRange(arr,8);
//////////        System.out.println(res[0]+" "+res[1]);
////////    }
////////}
////////
////////
////////class Main
////////{
////////
////////    public static int[] bsearch(int arr[],int x)
////////    {
////////        int start=0;
////////        int end=arr.length-1;
////////        int res[]=new int[]{-1,-1};
////////        int ind=0;
////////        while(start<=end)
////////        {
////////            int mid=start+(end-start)/2;
////////            if(arr[mid]==x)
////////            {
////////             res[ind]=mid;
////////             if(ind==0){ind++;}
////////            }
////////            else if(arr[mid]>x)
////////                end=mid-1;
////////            else
////////                start=mid+1;
////////        }
////////        return res;
////////    }
////////    public static void main(String args[])
////////    {
////////        int arr[]=new int[]{5,7,7,8,8,10};
////////        int res[]=bsearch(arr,8);
////////
////////    }
////////}
//////
//////
////////class Main
////////{
////////    static float power(int x,int y)
////////    {
////////
////////        if(y==0)
////////            return 1;
////////        float temp = power(x, y / 2);
////////        if(y%2==0)
////////            return temp*temp;
////////        else
////////            return x*temp*temp;
////////    }
////////    static int res(int x,int y,int d)
////////    {
////////        return (int)power(x,y)%d;
////////    }
////////
////////    public static void main(String args[])
////////    {
////////        int x=2;
////////        int y=4;
////////        System.out.println(power(x,y));
////////    }
//////
//////
////////
////////class Main
////////{
////////    public static void addedge(ArrayList<ArrayList<Integer>> adj,int u,int v)
////////    {
////////        adj.get(u).add(v);
////////        adj.get(v).add(u);
////////    }
////////    static void printgraph(ArrayList<ArrayList<Integer>> adj)
////////    {
////////        for(int i=0;i<adj.size();i++)
////////        {
////////            System.out.println();
////////            for(int j=0;j<adj.get(i).size();j++)
////////            {
////////                System.out.print(adj.get(i).get(j)+" ");
////////            }
////////        }
////////    }
////////    public static void main(String args[])
////////    {
////////        int V=5;
////////        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(V);
////////        for(int i=0;i<V;i++)
////////            adj.add(new ArrayList<Integer>());
////////
////////
////////        addedge(adj,0,1);
////////        addedge(adj,0,4);
////////        addedge(adj,1,2);
////////        addedge(adj,1,3);
////////        addedge(adj,1,4);
////////        addedge(adj,2,4);
////////        addedge(adj,3,4);
////////
////////        printgraph(adj);
////////
////////    }
////////}
////////
////////class Main
////////{
////////    public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v)
////////    {
////////        adj.get(u).add(v);
////////        adj.get(v).add(u);
////////    }
////////    static void DFS(ArrayList<ArrayList<Integer>> adj,int V)
////////    {
////////
////////    }
////////    static void BFS(ArrayList<ArrayList<Integer>>adj,int V)
////////    {
////////        boolean visited[]=new boolean[V+1];
////////        for(int i=0;i<visited.length;i++)
////////            visited[i]=false;
////////
////////        LinkedList<Integer> queue=new LinkedList<Integer>();
////////        int s=1;
////////        visited[s]=true;
////////        queue.add(s);
////////
////////        while(queue.size()!=0)
////////        {
////////            s=queue.poll();
////////            System.out.print(s+" ");
////////
////////
////////            for(int i=0;i<adj.get(s).size();i++)
////////            {
////////                int newNode=adj.get(s).get(i);
////////                if(visited[newNode]==false)
////////                {
////////                    visited[newNode]=true;
////////                    queue.add(newNode);
////////                }
////////            }
////////        }
////////    }
////////
////////    public static void main(String args[])
////////    {
////////        int V=6;
////////        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(V+1);
////////        for(int i=0;i<V+1;i++)
////////            adj.add(new ArrayList<Integer>());
////////
////////
////////        addEdge(adj,1,2);
////////        addEdge(adj,1,3);
////////        addEdge(adj,2,4);
////////        addEdge(adj,2,5);
////////        addEdge(adj,3,5);
////////        addEdge(adj,4,5);
////////        addEdge(adj,4,6);
////////        addEdge(adj,5,6);
////////
////////
////////        BFS(adj,V);
////////
////////
////////
////////    }
////////}
//////
//////
//////
//////
//////
//////
//////
////////class Main
////////{
////////    public static void main(String args[])
////////    {
////////
////////        String str="()[]{}";
////////
////////        Stack<Character> st=new Stack<>();
////////        for(int i=0;i<str.length();i++)
////////        {
////////            if(str.charAt(i)=='('|| str.charAt(i)=='{' || str.charAt(i)=='[')
////////            {
////////                st.push(str.charAt(i));
////////            }
////////            else if(str.charAt(i)==')' && st.peek()=='(')
////////            {
////////                st.pop();
////////            }
////////            else if(str.charAt(i)=='}' && st.peek()=='{')
////////            {
////////                st.pop();
////////            }
////////
////////             else if(str.charAt(i)==']' && st.peek()=='[')
////////            {
////////                st.pop();
////////            }
////////             else
////////                 break;
////////        }
////////        if(st.size()==0)
////////            System.out.println(true);
////////        else
////////            System.out.println(false);
////////    }
////////}
//////
//////
////////
////////class Main {
////////    public static boolean isValid(String s) {
////////
////////        if(s.length()==0)
////////            return true;
////////        else if(s.length()==1)
////////            return false;
////////        Stack<Character> st=new Stack<>();
////////
////////        for(int i=0;i<s.length();i++)
////////        {
////////            if(s.charAt(i)=='('|| s.charAt(i)=='{' || s.charAt(i)=='[')
////////            {
////////                st.push(s.charAt(i));
////////            }
////////            else if(s.charAt(i)==')' && st.peek()=='(')
////////            {
////////                st.pop();
////////            }
////////            else if(s.charAt(i)=='}' && st.peek()=='{')
////////            {
////////                st.pop();
////////            }
////////
////////            else if(s.charAt(i)==']' && st.peek()=='[')
////////            {
////////                st.pop();
////////            }
////////            else
////////                break;
////////        }
////////        if(st.size()==0)
////////            return true;
////////        else
////////            return false;
////////    }
////////    public static void main(String args[])
////////    {
////////        boolean res=isValid("){");
////////        if(res==true)
////////            System.out.println(true);
////////        else
////////            System.out.println(false);
////////    }
////////}
//////
////////
////////class Main
////////{
////////    static boolean isvalid(String s)
////////    {
////////        if(s.length()==0)
////////            return true;
////////        Stack<Character> st=new Stack<>();
////////        for(int i=0;i<s.length();i++)
////////        {
////////            if(s.charAt(i)=='('|| s.charAt(i)=='{' || s.charAt(i)=='[')
////////                st.push(s.charAt(i));
////////
////////            else if(s.charAt(i)==')' && st.peek()=='(' || s.charAt(i)=='}' && st.peek()=='{' ||s.charAt(i)==']' && st.peek()=='[' )
////////                st.pop();
////////
////////            else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')
////////                st.push(s.charAt(i));
////////            else
////////                continue;
////////        }
////////
////////        if(st.size()!=0)
////////            return false;
////////        return true;
////////    }
////////    public static void main(String args[])
////////    {
////////        boolean res=isvalid("){");
////////        if(res)
////////            System.out.println(true);
////////        else
////////            System.out.println(false);
////////    }
////////}
//////
//////
//////
//////
//////
////////class Node
////////{
////////    int data;
////////    Node next;
////////    Node(int d)
////////    {
////////        data=d;
////////    }
////////}
////////class Main
////////{
////////     static void display(Node head)
////////     {
////////         if(head==null)
////////             return;
////////         display(head.next);
////////         System.out.println(head.data);
////////     }
////////    public static void main(String args[])
////////    {
////////        Node head=new Node(2);
////////        head.next=new Node(4);
////////        head.next.next=new Node(3);
////////
////////
////////        Node head1=new Node(5);
////////        head1.next=new Node(6);
////////        head1.next.next=new Node(4);
////////
////////        display(head1);
////////    }
////////}
//////
//////
//////
////////
////////class Main
////////{
////////    static void addedge(ArrayList<ArrayList<Integer>>adj,int u,int v)
////////    {
////////        adj.get(u).add(v);
////////        adj.get(v).add(u);
////////    }
////////    static void BFS(ArrayList<ArrayList<Integer>>adj,int V)
////////    {
////////        boolean visited[]=new boolean[V+1];
////////        for(int i=0;i<V;i++)
////////            visited[i]=false;
////////
////////
////////        for(int i=0;i<V;i++)
////////        {
////////            if(visited[i]==false)
////////                BFSwork(adj,i,visited);
////////        }
////////    }
////////    static void BFSwork(ArrayList<ArrayList<Integer>>adj,int s,boolean visited[] )
////////    {
////////        Queue<Integer> qu=new LinkedList<>();
////////        visited[s]=true;
////////        qu.add(s);
////////        while(qu.isEmpty()==false)
////////        {
////////            int u= qu.poll();
////////            System.out.print(u+" ");
////////
////////            for(int v: adj.get(u))
////////            {
////////                if(visited[v]==false)
////////                {
////////                    visited[v]=true;
////////                    qu.add(v);
////////                }
////////            }
////////        }
////////    }
////////    static void printlist(ArrayList<ArrayList<Integer>>adj,int V)
////////    {
////////        for(int i=0;i<V;i++)
////////        {
////////            System.out.print(i);
////////            for(int j=0;j<adj.get(i).size();j++)
////////            {
////////                System.out.print(" -> "+adj.get(i).get(j));
////////            }
////////            System.out.println();
////////        }
////////    }
////////    public static void main(String args[])
////////    {
////////        int V=5;
////////        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(V);
////////
////////        for(int i=0;i<V;i++)
////////            adj.add(new ArrayList<Integer>());
////////
////////        addedge(adj,0,1);
////////        addedge(adj,0,2);
////////        addedge(adj,1,2);
////////        addedge(adj,1,3);
////////
//////////        printlist(adj,V);
////////        BFS(adj,V);
////////    }
////////}
//////
//////
////////
////////class Main
////////{
////////    public static void main(String args[])
////////    {
////////        Stack<String> st=new Stack<>();
////////        st.push("a");
////////        st.push("b");
////////        st.push("c");
////////        st.push("d");
////////        st.push("e");
////////        st.push("f");
////////        st.push("g");
////////
////////        System.out.print(String.join("-",st));
////////
////////    }
////////}
//////
//////
////////
////////class Node
////////{
////////    int key;
////////    Node right;
////////    Node left;
////////    Node(int k)
////////    {
////////        key=k;
////////    }
////////}
////////class Main
////////{
////////
////////    public static void preorder(Node root)
////////    {
////////
////////
////////        if(root==null)
////////            return;
////////        Stack<Node> st=new Stack<>();
////////        st.push(root);
////////        while( st.isEmpty()==false)
////////        {
////////            Node curr=st.peek();
////////            System.out.print(curr.key+" ");
////////            st.pop();
////////
////////            if(curr.right!=null)
////////                st.push(curr.right);
////////            if(curr.left!=null)
////////                st.push(curr.left);
////////        }
////////    }
////////    public static void main(String args[])
////////    {
////////        Node root=new Node(20);
////////        root.left=new Node(30);
////////        root.right=new Node(40);
////////        root.left.left=new Node(50);
////////        root.left.right=new Node(60);
////////        root.left.left.left=new Node(70);
////////        root.left.left.right=new Node(80);
////////
////////
////////        preorder(root);
////////    }
////////}
//////
//////
//////// Introduction to Greedy Algorithm
//////
////////class Main
////////{
////////    static int coinSupply(int coins[],int n,int v)
////////    {
////////        if(v==0 || n==0)
////////            return 0;
////////        Arrays.sort(coins);
////////
////////    }
////////    public static void main(String args[])
////////    {
////////
////////    }
////////}
//////
//////
////////// Longest subsequence problem
////////class Main
////////{
////////    static int simplerecursive(String s1,String s2,int m,int n)
////////    {
////////        if(m==0 || n==0)
////////            return 0;
////////        if(s1.charAt(m-1)==s2.charAt(n-1))
////////            return 1+simplerecursive(s1,s2,m-1,n-1);
////////        else
////////            return Math.max(simplerecursive(s1,s2,m-1,n),simplerecursive(s1,s2,m,n-1));
////////    }
////////    static int memoization(String s1,String s2,int m,int n)  // Dhynamic programming Memoization Method
////////    {
////////        int arr[][]=new int[m+1][n+1];
////////        for(int i=0;i<=m;i++)
////////            for(int j=0;j<=n;j++)
////////                arr[i][j]=-1;
////////
////////            if(arr[m][n]!=-1)
////////            {
////////                return arr[m][n];
////////            }
////////
////////            if(m==0|| n==0)
////////                arr[m][n]=0;
////////            else if(s1.charAt(m-1)==s2.charAt(n-1))
////////                arr[m][n]=1+memoization(s1,s2,m-1,n-1);
////////            else
////////                {
////////                    arr[m][n]=Math.max(memoization(s1,s2,m-1,n),memoization(s1,s2,m,n-1));
////////                }
////////
////////
////////            return arr[m][n];
////////    }
////////    static int tabulation(String s1,String s2,int m,int n)     //Dhynamic programming Tabulation Method
////////    {
////////        int arr[][]=new int[m+1][n+1];
////////        for(int i=0;i<=m;i++)arr[i][0]=0;
////////        for(int i=1;i<=n;i++)arr[0][i]=0;
////////
////////
////////
////////        for(int i=1;i<=m;i++)
////////            for(int j=1;j<=n;j++)
////////                if(s1.charAt(i-1)==s2.charAt(j-1))
////////                    arr[i][j]=1+arr[i-1][j-1];
////////                else
////////                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
////////
////////
////////
////////        return arr[m][n];
////////    }
////////    public static void main(String args[])
////////    {
////////        String s1="ABCDGH";
////////        String s2="AEDFHR";
////////
////////        System.out.println(simplerecursive(s1,s2,s1.length(),s2.length()));
////////        System.out.println(memoization(s1,s2,s1.length(),s2.length()));
////////        System.out.println(tabulation(s1,s2,s1.length(),s2.length()));
////////
////////    }
////////
////////}
//////
//////
////////
////////class Main
////////{
////////    public static void main(String args[])
////////    {
////////        int arr[]={11,13,21,3,15};
////////        Stack<Integer> st=new Stack<>();
////////        int curr=arr[0];
////////        st.add(curr);
////////        for(int i=1;i<arr.length;i++)
////////        {
////////            if(st.peek()<arr[i])
////////            {
////////                System.out.println(st.peek()+"->"+arr[i]);
////////                st.pop();
////////                st.push(arr[i]);
////////            }else
////////                {
////////                    System.out.println(st.peek()+"->"+ -1);
////////                    st.push(arr[i]);
////////                }
////////        }
////////        System.out.println(st.peek()+"->"+ -1);
////////    }
////////}
//////
//////
////////class Main {
////////    public static int[] nextGreaterElement(int[] nums1, int[] nums2)
////////    {
////////        HashMap<Integer,Integer>hmp=new HashMap<>();
////////        int res[]=new int[nums1.length];
////////        Arrays.fill(res,-1);
////////        for(int i=0;i< nums2.length;i++)
////////            hmp.put(nums2[i],i);
////////
////////        for(int i=0;i<nums1.length;i++)
////////        {
////////            int temp=nums1[i];
////////            for(int j=hmp.get(temp);j<nums2.length;j++)
////////            {
////////                if(nums2[j]>temp)
////////                {
////////                    res[i]=nums2[j];
////////                    break;
////////                }
////////            }
////////        }
////////        return  res;
////////    }
////////    public static void main(String args[])
////////    {
////////        int nums1[]={4,1,2};
////////        int nums2[]={1,3,4,2};
////////        int res[]=nextGreaterElement(nums1,nums2);
////////
////////        for(int i=0;i<res.length;i++)
////////            System.out.print(res[i]+" ");
////////    }
////////}
//////
////////class Main
////////{
////////    public static  String removeDuplicates(String S)
////////    {
////////        Stack<Character> st=new Stack<>();
////////        st.push(S.charAt(0));
////////        for(int i=1;i<S.length();i++)
////////        {
////////            if(st.isEmpty()==false &&  st.peek()==S.charAt(i))
////////                st.pop();
////////            else
////////                st.push(S.charAt(i));
////////        }
////////        String res="";
////////        for(Character i:st)
////////            res=res+i;
////////
////////
////////        return res;
////////
////////    }
////////    public static void main(String args[])
////////    {
////////        String str="abbaca";
////////        System.out.println(removeDuplicates(str));
////////    }
////////}
//////
////////class Main {
////////    public static void removeDuplicates(int[] nums) {
////////        if(nums.length==0)
////////            return ;
////////
////////        Stack<Integer> st=new Stack<>();
////////        st.push(nums[0]);
////////        for(int i=1;i<nums.length;i++)
////////        {
////////            if(st.peek()==nums[i])
////////                nums[i]=nums[i-1];
////////            else
////////                st.push(nums[i]);
////////        }
////////
////////        for(int i:st)
////////            System.out.print(i+" ");
////////
////////
////////        System.out.println();
////////        System.out.println(st.size());
////////    }
////////    public static void main(String args[])
////////    {
////////        removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
////////    }
////////}
//////
//////
//////
//////// Coin Change problem
///////*
//////Input :- coins[]={1,2,3};
//////Sum:- 4;
//////O/p:- 1+1+2
//////      1+1+1+1
//////      2+2
//////      1+3
//////
//////O/p will be 4.
////// */
////////
////////class Main
////////{
////////     static int getcountrecursive(int coins[],int n,int sum)             // Simple Recursive Method
////////    {
////////        if(sum==0) return 1;
////////        if(n==0) return 0;
////////        int res=getcountrecursive(coins,n-1,sum);
////////        if(coins[n-1]<=sum)
////////            res=res+getcountrecursive(coins,n,sum-coins[n-1]);
////////
////////        return res;
////////    }
////////   static int getcountdp(int coins[],int n,int sum)                    // Using DP
////////    {
////////        int dp[][]=new int[sum+1][n+1];
////////        for(int i=0;i<=n;i++) dp[0][i]=1;
////////        for(int i=1;i<=sum;i++) dp[i][0]=0;
////////
////////        for(int i=1;i<=sum;i++)
////////            for(int j=1;j<=n;j++)
////////            {
////////                dp[i][j]=dp[i][j-1];
////////                if(coins[j-1]<=i) {
////////                    dp[i][j]+=dp[i-coins[j-1]][i];
////////                }
////////            }
////////        return dp[sum][n];
////////    }
////////
////////    public static void main(String args[])
////////    {
////////        int coins[]={2,5,3,6};
////////        int sum=10;
////////        System.out.println(getcountrecursive(coins,coins.length,sum));
////////        System.out.println(getcountdp(coins,coins.length,sum));
////////    }
////////}
///////*
//////I/p :    s1="CAT";
//////         s2="CUT"
//////         make string s2 from s1
//////        you can perform 3 operations insert, delete,replace - Every takes 1 unit of Time
//////o/p :-      U can replace with A
//////            O/p Will be 1.
//////
////// */
////////class Main
////////{
////////    static int eD(String s1,String s2,int m, int n)
////////    {
////////        if(m==0) return n;
////////        if(n==0) return m;
////////        if(s1.charAt(m-1)==s2.charAt(n-1))
////////            return eD(s1,s2,m-1,n-1);
////////        else
////////            return 1+ Math.min(Math.min(eD(s1,s2,m-1,n),eD(s1,s2,m,n-1)),eD(s1,s2,m-1,n-1));
////////    }
////////
////////    static  int eDDP(String s1,String s2,int m, int n)
////////    {
////////        int dp[][]=new int[m+1][n+1];
////////        for(int i=0;i<=m;i++) dp[i][0]=i;
////////        for(int i=0;i<=n;i++) dp[0][i]=i;
////////
////////        for(int i=1;i<=m;i++)
////////            for(int j=1;j<=n;j++)
////////            {
////////                if(s1.charAt(i-1) == s2.charAt(j-1))
////////                    dp[i][j]=dp[i-1][j-1];
////////                else
////////                    dp[i][j]=1+Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
////////            }
////////        return dp[m][n];
////////    }
////////    public static void main(String args[])
////////    {
////////        String s1="SATURDAY";
////////        String s2="SUNDAY";
////////        System.out.println(eD(s1,s2,s1.length(),s2.length()));
////////        System.out.println(eDDP(s1,s2,s1.length(),s2.length()));
////////
////////    }
////////}
////////
////////class Main
////////{
////////    static int maximumcuts(int n, int a,int b,int c)
////////    {
////////        if(n<0) return -1;
////////        if(n==0) return 0;
////////
////////        int res=Math.max(Math.max(maximumcuts(n-a,a,b,c),maximumcuts(n-b,a,b,c)),maximumcuts(n-c,a,b,c));
////////
////////
////////        if(res!=-1)
////////            return res+1;
////////        else
////////            return res;
////////    }
////////
////////    static int maxcutsdp(int n,int a,int b,int c)
////////    {
////////        int dp[]=new int[n+1];
////////     //   Arrays.fill(dp,Integer.MAX_VALUE);
////////        dp[0]=0;
////////        for(int i=0;i<=n;i++)
////////        {
////////            dp[i]=-1;
////////            if(i-a>=0)
////////                dp[i]=Math.max(dp[i],dp[i-a]);
////////            if(i-b>=0)
////////                dp[i]=Math.max(dp[i],dp[i-b]);
////////            if(i-c>=0)
////////                dp[i]=Math.max(dp[i],dp[i-c]);
////////
////////            if(dp[i]!=-1)
////////                dp[i]++;
////////        }
////////        for(int i:dp)
////////            System.out.print(i+" ");
////////        return dp[n];
////////    }
////////    public static void main(String args[])
////////    {
////////        System.out.println(maximumcuts(5,1,2,3));
////////        System.out.println(maxcutsdp(5,1,2,3));
////////    }
////////}
//////
//////
//////
//////
//////
////////
////////class Main
////////{
////////    public static void main(String args[])
////////    {
////////        List<Integer> l1=new LinkedList<>();
////////        l1.add(1);
////////        l1.add(3);
////////        l1.add(2);
////////        List<Integer> l2=new LinkedList<>();
////////        l2.add(0);
////////        l2.add(4);
////////        l2.add(1);
////////
////////
////////    }
////////}
////////
//////
//////
//////class Main
//////{
//////    static int knapsackdp(int wt[],int V[],int n,int W)
//////    {
//////        int dp[][]=new int[n+1][W+1];
//////        for(int i=0;i<=n;i++) dp[i][0]=0;
//////        for(int i=0;i<=W;i++) dp[0][i]=0;
//////
//////        for(int i=1;i<=n;i++)
//////            for(int j=1;j<=W;j++)
//////            {
//////                if(dp[i][j]==0)
//////                    dp[i][j]=0;
//////                if(wt[n-1]<=W)
//////                {
//////                    dp[i][j]=Math.max(V[n-1] + knapsack(wt,V,n-1,W-wt[n-1]),knapsack(wt,V,n-1,W));
//////                }else
//////                    dp[i][j]=knapsack(wt,V,n-1,W);
//////            }
//////        return dp[n][W];
//////    }
//////    static int knapsackmemo(int wt[],int V[],int n,int W)
//////    {
//////        int dp[][]=new int[n+1][W+1];
//////       for(int row[]:dp)
//////           Arrays.fill(row,-1);
//////
//////        if(n==0|| W==0)
//////            return  dp[n][W]=0;
//////
//////        if(dp[n][W]!=-1)
//////            return dp[n][W];
//////        if(wt[n-1]<=W)
//////        {
//////            return dp[n][W]=Math.max(V[n-1] + knapsack(wt,V,n-1,W-wt[n-1]),knapsack(wt,V,n-1,W));
//////        }
//////
//////        else
//////            return dp[n][W]=knapsack(wt,V,n-1,W);
//////    }
//////    static int knapsack(int wt[],int V[],int n,int W)
//////    {
//////        if(n==0|| W==0)
//////            return 0;
//////        if(wt[n-1]<=W)
//////            return Math.max(V[n-1] + knapsack(wt,V,n-1,W-wt[n-1]),knapsack(wt,V,n-1,W));
//////        else
//////            return knapsack(wt,V,n-1,W);
//////    }
//////    public static void main(String args[])
//////    {
//////        int wt[]={1,2,3};
//////        int V[]={10,15,40};
//////        System.out.println(knapsack(wt,V,wt.length,1));
//////        System.out.println(knapsackmemo(wt,V,wt.length,6));
//////        System.out.println(knapsackdp(wt,V,wt.length,1));
//////    }
//////}
////
////
//////class Main
//////{
//////    static boolean subsetsumdp(int arr[],int n,int sum)             // DP solution
//////    {
//////        boolean dp[][]=new boolean[n+1][sum+1];
//////        for(int j=0;j<=sum;j++) dp[0][j]=false;
//////        for(int i=0;i<=n;i++) dp[i][0]=true;
//////
//////        for(int i=1;i<=n;i++)
//////            for(int j=1;j<=sum;j++)
//////                if(arr[i-1]>j)
//////                     dp[i][j]=dp[i-1][j];
//////                else
//////                     dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
//////
//////
//////
//////        return dp[n][sum];
//////    }
//////    static boolean subsetsum(int arr[],int n,int sum)          // Recursion
//////    {
//////        if(sum==0) return true;
//////        if(n==0 && sum!=0)return false;
//////
//////        if(arr[n-1]>sum)
//////            return subsetsum(arr,n-1,sum);
//////        else
//////            return subsetsum(arr,n-1,sum-arr[n-1])|| subsetsum(arr,n-1,sum);
//////    }
//////    public static void main(String args[])
//////    {
//////        int arr[]={3,4,5,2};
//////        System.out.println(subsetsum(arr,arr.length,6));
//////        System.out.println(subsetsumdp(arr,arr.length,26));
//////
//////    }
//////}
////
//////
//////class Main
//////{
//////    public static boolean equalpartdp(int arr[], int n,int sum)
//////    {
//////        boolean dp[][]=new boolean[n+1][sum+1];
//////        for(int j=0;j<=sum;j++) dp[0][j]=false;
//////        for(int i=0;i<=n;i++) dp[i][0]=true;
//////
//////        for(int i=1;i<=n;i++)
//////            for(int j=1;j<=sum;j++)
//////            {
//////                if(arr[i-1]>j)
//////                    dp[i][j]= dp[i-1][j];
//////                else
//////                    dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
//////            }
//////        return dp[n][sum];
//////    }
//////    public static void main(String args[])
//////    {
//////        int arr[]={2,3,4,5};
//////        int sum=0;
//////        for(int i: arr)
//////            sum+=i;
//////
//////        if(sum%2!=0)
//////            System.out.println(false);
//////        else
//////            System.out.println(equalpartdp(arr,arr.length,sum/2));
//////    }
//////}
////
//////
//////class Main
//////{
//////    public static int countsubset(int arr[],int n,int sum)
//////    {
//////        int dp[][]=new int[n+1][sum+1];
//////        for(int j=0;j<=sum;j++) dp[0][j]=0;
//////        for(int i=0;i<=n;i++) dp[i][0]=1;
//////
//////
//////        for(int i=1;i<=n;i++)
//////            for(int j=1;j<=sum;j++)
//////            {
//////                if(arr[i-1]>j)
//////                    dp[i][j]=dp[i-1][j];
//////                else
//////                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
//////            }
//////        return dp[n][sum];
//////    }
//////    public static void main(String args[])
//////    {
//////        int arr[]={1,1,1,1};
//////        System.out.println(countsubset(arr,arr.length,1));
//////    }
//////}
////
////
//////class Main
//////{
//////    public static void main(String args[])
//////    {
//////        char ch='9';
//////        System.out.println((int)ch-48);
//////    }
//////}
////
//////
//////class Main
//////{
//////
//////    static int knapsack(int wt[],int V[],int n,int W)
//////    {
//////        if(W==0|| n==0)
//////            return 0;
//////        if(wt[n-1]>W)
//////            return knapsack(wt,V,n-1,W);
//////        else
//////            return Math.max(knapsack(wt,V,n-1,W),V[n-1]+knapsack(wt,V,n-1,W-wt[n-1]));
//////    }
//////    public static void main(String args[])
//////    {
//////        int wt[]={10,20,30};
//////        int V[]={60,100,120};
//////        int W=50;
//////        int res=knapsack(wt,V,wt.length,W);
//////        System.out.println(res);
//////    }
//////}
//////
//////import org.w3c.dom.ls.LSOutput;
//////
//////import java.lang.reflect.Array;
//////import java.util.Arrays;
//////
//////class Main
//////{
//////    public static int fibmemo(int n)
//////    {
//////        int memo[]=new int[n+1];
//////        Arrays.fill(memo,-1);
//////
//////        if(memo[n]!=-1)
//////            return memo[n];
//////        else
//////            {
//////                if(n==1 || n==2)
//////                    memo[n]=1;
//////                else
//////                    memo[n]=fibmemo(n-1)+fibmemo(n-2);
//////            }
//////        return memo[n];
//////    }
//////   public static int fib(int n)
//////   {
//////       int s=0;
//////       if(n==1 || n==2)
//////           return 1;
//////       else
//////           {
//////               return  s=fib(n-1)+fib(n-2);
//////           }
//////   }
//////    public static void main(String args[])
//////    {
//////        System.out.println(fib(9));
//////        System.out.println(fibmemo(9));
//////    }
//////}
//////
//////class Knapsack
//////{
//////    // Returns the maximum value that can be put in a knapsack of capacity W
//////    static int knapSack(int W, int wt[], int val[], int n)
//////    {
//////        // your code here
//////        if(n==0|| W==0)
//////            return 0;
//////
//////        if(wt[n-1]>W)
//////            return knapSack(W,wt,val,n-1);
//////        else
//////            return Math.max(knapSack(W,wt,val,n-1),val[n-1]+knapSack(W-wt[n-1],wt,val,n-1));
//////    }
//////}
//////
//////class Knapsack
//////{
//////    // Returns the maximum value that can be put in a knapsack of capacity W
//////    static int knapSack(int W, int wt[], int val[], int n)
//////    {
//////        // your code here
//////        int dp[][]=new int[n+1][W+1];
//////        for(int i=0;i<=n;i++) dp[i][0]=0;
//////        for(int j=0;j<=W;j++) dp[0][j]=0;
//////
//////        for(int i=1;i<=n;i++)
//////            for(int j=1;j<=W;j++)
//////            {
//////                if(dp[i][j]==0)
//////                    dp[i][j]=0;
//////
//////
//////                if(wt[i-1]<=j) {
//////                    dp[i][j]=Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]);
//////                } else
//////                dp[i][j]=dp[i-1][j];
//////            }
//////
//////        return dp[n][W];
//////
//////    }
//////}
////
//////
//////class Main{
//////
//////    // function to count ways to reach mth stair
//////   static Long countWays(int m){
//////
//////        // your code here
//////        Long dp[]=new Long[m+1];
//////        dp[0]=1L;
//////        dp[1]=1L;
//////        dp[2]=2L;
//////
//////        for(int i=3;i<=m;i++)
//////            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
//////
//////
//////        return  dp[m]%(long)(Math.  pow(10,7)+7);
//////    }
//////    public static void main(String args[])
//////    {
//////        System.out.println(countWays(4));
//////    }
//////}
////
//////class Main
//////{
//////       public static int fib(int n)
//////   {
//////       int s=0;
//////       if(n==1 || n==2)
//////           return 1;
//////       else
//////           {
//////               return  s=fib(n-1)+fib(n-2);
//////           }
//////   }
//////    public static void main(String args[])
//////    {
//////        System.out.println(fib(4));
//////        System.out.println(fib(10));
//////    }
//////}
//////
//////import java.util.Arrays;
//////import java.util.Stack;
//////
//////class Main {
//////    public static int[] searchRange(int[] nums, int target) {
//////        Stack<Integer> st=new Stack<>();
//////        int temp=0;
//////        int arr[]=new int[2];
//////        Arrays.fill(arr,-1);
//////        for(int i=0;i<nums.length;i++)
//////        {
//////            if(nums[i]==target)
//////                st.push(i);
//////        }
//////        if(st.size()!=0)
//////        {
//////            arr[1]=st.peek();
//////        }
//////        for(int i:st)
//////        {
//////            arr[0]=i;
//////            break;
//////        }
//////        return arr;
//////    }
//////    public static void main(String args[])
//////    {
//////        int arr[]={5,7,7,8,8,10};
//////        int res[]=searchRange(arr,8);
//////        System.out.println(res[0]+ " "+ res[1]);
//////    }
//////}
////
//////
//////import java.util.HashMap;
//////import java.util.HashSet;
//////
//////class Main
//////{
//////    public static void main(String args[])
//////    {
//////        HashSet<Integer> hs=new HashSet<>();
//////        int target=4;
//////        hs.add(1);
//////        hs.add(2);
//////        hs.add(3);
//////        hs.add(4);
//////        System.out.println(hs);
//////        int count=0;
//////        for(int i:hs)
//////        {
//////            if(i==target)
//////            {
//////                int temp=i;
//////                for(int j:hs)
//////                {
//////                    if(temp<j)
//////                        count=j;
//////                    else
//////                        count=-1;
//////                }
//////                System.out.println(count);
//////            }
//////
//////        }
//////    }
//////}
////
//////
//////// Count the subset of given difference{}
//////class Main
//////{
//////    static int subsetsum(int arr[],int n,int sum)
//////    {
//////        int dp[][]=new int[n+1][sum+1];
//////        for(int j=0;j<=sum;j++) dp[0][j]=0;
//////        for(int i=0;i<=n;i++) dp[i][0]=1;
//////
//////
//////        for(int i=1;i<=n;i++)
//////            for(int j=1;j<=sum;j++)
//////            {
//////                if(arr[i-1]>j)
//////                    dp[i][j]=dp[i-1][j];
//////                else
//////                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
//////            }
//////        return dp[n][sum];
//////    }
//////    public static void main(String args[])
//////    {
//////        int arr[]={-3,1,3,5};
//////        int diff=6;
//////        int sum=0;
//////        for(int i:arr)
//////            sum+=i;
//////
//////        sum=(diff+sum)/2;
//////        System.out.println(subsetsum(arr,arr.length,sum));
//////    }
//////}
////
//////class Main
//////{
//////    public static int targetsum(int arr[],int sum,int n)
//////    {
//////        int dp[][]=new int[n+1][sum+1];
//////        for(int j=0;j<=sum;j++) dp[0][j]=0;
//////        for(int i=0;i<=n;i++) dp[i][0]=1;
//////
//////
//////        for(int i=1;i<=n;i++)
//////            for(int j=1;j<=sum;j++)
//////            {
//////                if(arr[i-1]>j)
//////                    dp[i][j]=dp[i-1][j];
//////                else
//////                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
//////            }
//////        return dp[n][sum];
//////    }
//////    public static void main(String args[])
//////    {
//////        int arr[]={-3,1,3,5};
//////        int diff=6;
//////        int sum=0;
//////        for(int i:arr)
//////            sum+=i;
//////
//////        sum=(diff+sum)/2;
//////        System.out.println(targetsum(arr,sum,arr.length));
//////    }
//////}
////
//////
//////class Main
//////{
//////    public static int countsubset(int arr[],int n,int sum)
//////    {
//////        int dp[][]=new int[n+1][sum+1];
//////        for(int j=0;j<=sum;j++) dp[0][j]=0;
//////        for(int i=0;i<=n;i++) dp[i][0]=1;
//////
//////
//////        for(int i=1;i<=n;i++)
//////            for(int j=1;j<=sum;j++)
//////            {
//////                if(arr[i-1]>j)
//////                    dp[i][j]=dp[i-1][j];
//////                else
//////                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
//////            }
//////        return dp[n][sum];
//////    }
//////    public static void main(String args[])
//////    {
//////        int arr[]={3,1,3,5};
//////        System.out.println(countsubset(arr,arr.length,6));
//////    }
//////}\
////
////
//////import java.util.Scanner;
//////
//////class Main
//////{
//////    public static void main(String args[])
//////    {
//////        Scanner sc=new Scanner(System.in);
//////        int t=sc.nextInt();
//////        while(t-->0)
//////        {
//////            int n=sc.nextInt();
//////            if(n==1 || n==2)
//////                System.out.println(1);
//////            else if(n%2==0)
//////                System.out.println(n/2);
//////            else
//////                System.out.println((n/2)+1);
//////        }
//////    }
//////}
////
//////import java.util.*;
//////public class Main
//////{
//////    public static void main(String args[])
//////    {
//////        Scanner sc=new Scanner(System.in);
//////        int t=sc.nextInt();
//////        while(t-->0)
//////        {
//////            int n=sc.nextInt();
//////            if(n==1 || n==2)
//////                System.out.println(1);
//////            else if(n%2==0)
//////                System.out.println(n/2);
//////            else
//////                System.out.println((n/2)+1);
//////        }
//////    }
//////}
////
/////*
////class Main
////{
////    // Unbounded Knapsack
////    public static int uknapsackdp(int arr[],int V[],int W,int n)
////    {
////        int dp[][]=new int[n+1][W+1];
////        for(int i=0;i<=n;i++) dp[i][0]=0;
////        for(int j=0;j<=W;j++) dp[0][j]=0;
////
////        for(int i=1;i<=n;i++)
////            for(int j=1;j<=W;j++)
////            {
////
////                if(arr[i-1]>j)
////                    dp[i][j]=dp[i-1][j];
////                else
////                    dp[i][j]=Math.max(dp[i-1][j],V[i-1]+dp[i][j-arr[i-1]]);
////            }
////        return dp[n][W];
////    }
////    public static int uknapsack(int arr[],int V[],int W, int n)
////    {
////        if(W==0 || n==0)
////            return 0;
////        if(arr[n-1]>W)
////            return uknapsack(arr,V,W,n-1);
////        else
////            return Math.max(uknapsack(arr,V,W,n-1),V[n-1]+uknapsack(arr,V,W-arr[n-1],n));
////    }
////    public static void main(String args[])
////    {
////        int arr[]={1,3,4,5,};
////        int V[]={10,40,50,70};
////        int W=8;
////        System.out.println(uknapsack(arr,V,W,arr.length));
////        System.out.println(uknapsackdp(arr,V,W,arr.length));
////    }
////}*/
//////class Main
//////{
//////    public static int rodcuttingdp(int len[],int price[],int N,int n)
//////    {
//////        int dp[][]=new int[n+1][N+1];
//////        for(int i=0;i<=n;i++) dp[i][0]=0;
//////        for(int j=0;j<=N;j++) dp[0][j]=0;
//////
//////        for(int i=1;i<=n;i++)
//////            for(int j=1;j<=N;j++)
//////            {
//////                if(len[i-1]>j)
//////                    dp[i][j]=dp[i-1][j];
//////                else
//////                    dp[i][j]=Math.max(dp[i-1][j],price[i-1]+dp[i][j-len[i-1]]);
//////            }
//////        return dp[n][N];
//////    }
//////    public static int rodcutting(int len[],int price[],int N,int n)
//////    {
//////        if(n==0)
//////            return 0;
//////        if(len[n-1]>N)
//////            return rodcutting(len,price,N,n-1);
//////        else
//////            return Math.max(rodcutting(len,price,N,n-1),price[n-1]+rodcutting(len,price,N-len[n-1],n));
//////    }
//////    public static void main(String args[])
//////    {
//////        int N=8;
//////        int price[]={3,5,8,9,10,17,17,20};
//////        int len[]=new int[N];
//////        for(int i=0;i<N;i++)
//////            len[i]=i+1;
//////        System.out.println(rodcutting(len,price,N,N));
//////        System.out.println(rodcuttingdp(len,price,N,N));
//////
//////    }
//////}
////
////
//////import java.util.LinkedList;
//////class Node
//////{
//////    int data;
//////    Node next;
//////    Node(int d)
//////    {
//////        data=d;
//////    }
//////}
//////class Main
//////{
//////    public static void display(Node head)
//////    {
//////        if(head==null)
//////            return;
//////        Node curr=head;
//////        while(curr!=null)
//////        {
//////            System.out.print(curr.data+" ");
//////            curr=curr.next;
//////        }
//////    }
//////    public static Node rotate(Node head,int k)
//////    {
//////        Node curr=head;
//////        int count=1;
//////        while(count<k && curr!=null)
//////        {
//////            curr=curr.next;
//////            count++;
//////        }
//////        Node kthnode=curr;
//////        while(curr.next!=null)
//////            curr=curr.next;
//////
//////
//////        curr.next=head;
//////        head=kthnode.next;
//////        kthnode.next=null;
//////
//////        return head;
//////    }
//////    public static void main(String args[])
//////    {
//////        Node head=new Node(10);
//////        head.next=new Node(20);
//////        head.next.next=new Node(30);
//////        head.next.next.next=new Node(40);
//////        head.next.next.next.next=new Node(50);
//////        head.next.next.next.next.next=new Node(60);
//////
//////        display(head);
//////        rotate(head,4);
//////        System.out.println( );
//////        display(head);
//////
//////    }
//////}
////
////
//////class Main
//////{
//////    public static void main(String args[])
//////    {
//////        int sum=2147483647;
//////        int temp=0;
//////        for(int i=1;i<2147483647;i++)
//////        {
//////            temp+=i;
//////            if(temp>=sum)
//////                System.out.println(i);
//////        }
//////        System.out.println(temp);
//////
//////
//////       // System.out.println(sum);
//////    }
//////}
////
////
/////*
////class Main
////{
////    public static int coindp(int coins[],int sum,int n)
////    {
////        int dp[][]=new int[n+1][sum+1];
////        for(int j=0;j<=sum;j++) dp[0][j]=0;
////        for(int i=0;i<=n;i++) dp[i][0]=1;
////
////
////        for(int i=1;i<=n;i++)
////            for(int j=1;j<=sum;j++)
////            {
////                if(coins[i-1]>j)
////                    dp[i][j]=dp[i-1][j];
////                else
////                    dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
////            }
////        return dp[n][sum];
////    }
////    public static void main(String args[])
////    {
////        int coins[]={2,5,3,6};
////        System.out.println(coindp(coins,10,coins.length));
////    }
////}*/
////
//////
//////import java.util.*;
//////import java.lang.*;
//////import java.io.*;
//////
///////* Name of the class has to be "Main" only if the class is public. */
//////class Main
//////{
//////    public static void main (String[] args) throws java.lang.Exception
//////    {
//////        // your code goes here
//////        Scanner sc=new Scanner(System.in);
//////        int t=sc.nextInt();
//////        while(t-->0)
//////        {
//////            int sum=0;
//////            int n=sc.nextInt();
//////            int arr[]=new int[n];
//////            for(int i=0;i<n;i++)
//////                arr[i]=sc.nextInt();
//////
//////
//////            for(int i=0;i<n-1;i++)
//////            {
//////                int temp=Math.abs(arr[i]-arr[i+1]);
//////                if(temp>4)
//////                    sum=sum+4;
//////                else
//////                    sum=sum+temp-1;
//////            }
//////            System.out.println(sum);
//////        }
//////    }
//////}
//////
//////import java.util.Scanner;
//////
//////class Main
//////{
//////    public static int reduce(int n)
//////    {
//////        int res=0;
//////        while(n>0)
//////        {
//////            res=res+n%10;
//////            n=n/10;
//////        }
//////        return res;
//////    }
//////    public static void main(String args[])
//////    {
//////        Scanner sc=new Scanner(System.in);
//////        int t=sc.nextInt();
//////        while(t-->0)
//////        {
//////            int n=sc.nextInt();
//////            int arr[][]=new int[n][2];
//////            for(int i=0;i<n;i++)
//////            {
//////                arr[i][0]=sc.nextInt();
//////                arr[i][1]=sc.nextInt();
//////            }
//////            int mortycount=0;
//////            int chefcount=0;
//////            int draw=0;
//////
//////            for(int i=0;i<n;i++)
//////            {
//////                int chef=arr[i][0];
//////                int morty=arr[i][1];
//////                if(chef>9)
//////                    chef=reduce(chef);
//////                if(morty>9)
//////                    morty=reduce(morty);
//////                if(chef>morty)
//////                    chefcount++;
//////                else if(chef<morty)
//////                    mortycount++;
//////                else
//////                    draw++;
//////            }
//////
//////            if(chefcount>mortycount)
//////                System.out.println(0+" "+2);
//////            else
//////                System.out.println(2+" "+1);
//////        }
//////    }
//////}
////
///////* package codechef; // don't place package name! */
//////
//////import java.util.*;
//////import java.lang.*;
//////import java.io.*;
//////
///////* Name of the class has to be "Main" only if the class is public. */
//////class Main
//////{
//////    public static void main (String[] args) throws java.lang.Exception
//////    {
//////        // your code goes here
//////        Scanner sc=new Scanner(System.in);
//////        int t=sc.nextInt();
//////        while(t-->0)
//////        {
//////            int sum=0;
//////            int n=sc.nextInt();
//////            int arr[]=new int[n];
//////            for(int i=0;i<n;i++)
//////                arr[i]=sc.nextInt();
//////
//////
//////            for(int i=0;i<n-1;i++)
//////            {
//////                if(i==)
//////                sum=sum+Math.abs(arr[i]-arr[i+1])-1;
//////            }
//////            System.out.println(sum);
//////        }
//////    }
//////}
////
////
//////
//////import java.util.*;
//////import java.lang.*;
//////import java.io.*;
//////
///////* Name of the class has to be "Main" only if the class is public. */
//////class Main
//////{
//////    public static long  reduce(long n)
//////    {
//////        long res=0;
//////        while(n>0)
//////        {
//////            res=res+n%10;
//////            n=n/10;
//////        }
//////        return res;
//////    }
//////
//////    public static void main (String[] args) throws java.lang.Exception
//////    {
//////        // your code goes here
//////        Scanner sc=new Scanner(System.in);
//////        int t=sc.nextInt();
//////        while(t-->0)
//////        {
//////            long n=sc.nextLong();
//////            long arr[][]=new long[(int) n][2];
//////            for(int i=0;i<n;i++)
//////            {
//////                arr[i][0]=sc.nextLong();
//////                arr[i][1]=sc.nextLong();
//////            }
//////            long mortycount=0;
//////            long chefcount=0;
//////
//////            for(int i=0;i<n;i++)
//////            {
//////                long chef=arr[i][0];
//////                long morty=arr[i][1];
//////                if(chef>9)
//////                    chef=reduce(chef);
//////                if(morty>9)
//////                    morty=reduce(morty);
//////                if(chef>morty)
//////                    chefcount++;
//////                else if(chef<morty)
//////                    mortycount++;
//////                else{chefcount++;mortycount++;}
//////
//////            }
//////
//////            if(chefcount>mortycount )
//////                System.out.println(0+" "+2);
//////            else if(mortycount>chefcount )
//////                System.out.println(2+" "+1);
//////            else
//////                System.out.println(2+" "+mortycount);
//////        }
//////    }
//////}
//////
////
//////class Main
//////{
//////
//////    public static int lcsdp(String str1,String str2,int m,int n)
//////    {
//////        int dp[][]=new int[m+1][n+1];
//////        for (int j=0;j<=m;j++) dp[j][0]=0;
//////        for (int i=0;i<=n;i++) dp[0][i]=0;
//////
//////        for(int i=1;i<=m;i++)
//////            for(int j=1;j<=n;j++)
//////            {
//////                if(str1.charAt(i-1)==str2.charAt(j-1))
//////                    dp[i][j]=1+dp[i-1][j-1];
//////                else
//////                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
//////            }
//////        return dp[m][n];
//////    }
//////    public static int lcs(String str1,String str2,int m,int n)
//////    {
//////        if(m==0||n==0)
//////            return 0;
//////        if(str1.charAt(m-1)==str2.charAt(n-1))
//////            return 1+lcs(str1,str2,m-1,n-1);
//////        else
//////            return Math.max(lcs(str1,str2,m-1,n),lcs(str1,str2,m,n-1));
//////    }
//////    public static void main(String args[])
//////    {
//////       String str1="abcdgh";
//////       String str2="aedfhir";
////////        System.out.println(lcs(str1,str2,str1.length(),str2.length()));
//////        System.out.println(lcsdp(str1,str2,str1.length(),str2.length()));
//////    }
//////}
////
////
//////class Main
//////{
//////    public static int substring(String str1,String str2,int m,int n)
//////    {
//////        int dp[][]=new int[m+1][n+1];
//////        for (int j=0;j<=m;j++) dp[j][0]=0;
//////        for (int i=0;i<=n;i++) dp[0][i]=0;
//////        int res=0;
//////
//////        for(int i=1;i<=m;i++)
//////            for(int j=1;j<=n;j++)
//////            {
//////                if(str1.charAt(i-1)==str2.charAt(j-1))
//////                {
//////                    dp[i][j]=dp[i-1][j-1]+1;
//////                    res=Math.max(res,dp[i][j]);
//////                }
//////                else
//////                    dp[i][j]=0;
//////            }
//////        return res;
//////    }
//////    public static void main(String args[])
//////    {
//////        String str1="geeksforgeeks";
//////        String str2="geeksquixz";
//////        System.out.println(substring(str1,str2,str1.length(),str2.length()));
//////    }
//////}
////
////
////// Printing element of longest common Subsequence
//////class Main
//////{
//////    static int lcsprint(String s1,String s2,int m,int n)
//////    {
//////        int dp[][]=new int[m+1][n+1];
//////        for(int j=0;j<=n;j++)dp[0][j]=0;
//////        for(int i=0;i<=m;i++)dp[i][0]=0;
//////
//////        for(int i=1;i<=m;i++)
//////            for(int j=1;j<=n;j++)
//////            {
//////                if(s1.charAt(i-1)==s2.charAt(j-1))
//////                dp[i][j]=1+dp[i-1][j-1];
//////                else
//////                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
//////            }
//////        return
//////    }
//////    public static void main(String args[])
//////    {
//////        String s1="AGGTAB";
//////        String s2="GXTXAYB";
//////        System.out.println();
//////        lcsprint(s1,s2,s1.length(),s2.length());
//////    }
//////}
////
////
////// Shortest Common SuperSequeence
//////
//////class Main
//////{
//////    static String scsupersequence(String s1,String s2,int m,int n)
//////    {
//////        int dp[][]=new int[m+1][n+1];
//////        for(int j=0;j<=n;j++)dp[0][j]=0;
//////        for(int i=0;i<=m;i++)dp[i][0]=0;
//////
//////        for(int i=1;i<=m;i++)
//////            for(int j=1;j<=n;j++)
//////            {
//////                if(s1.charAt(i-1)==s2.charAt(j-1))
//////                    dp[i][j]=1+dp[i-1][j-1];
//////                else
//////                    dp[i][j]=1+Math.min(dp[i-1][j],dp[i][j-1]);
//////            }
//////        int index= dp[m][n];
//////            int temp=index;
//////            String str="";
//////            int i=m; int j=n;
//////            while(i>0 && j>0) {
//////                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
//////                    str += (s1.charAt(i - 1));
//////                    i--;
//////                    j--;
//////                    index--;
//////                } else if (dp[i - 1][j] > dp[i][j - 1]) {
//////                    str += (s2.charAt(j - 1));
//////                    j--;
//////                    index--;
//////                } else {
//////                    str += (s1.charAt(i - 1));
//////                    i--;
//////                    index--;
//////                }
//////            }
//////                while (i > 0)
//////                {
//////                    str += (s1.charAt(i - 1));
//////                    i--;
//////                    index--;
//////                }
//////                while (j > 0)
//////                {
//////                    str += (s2.charAt(j - 1));
//////                    j--;
//////                    index--;
//////                }
//////                // reverse string
//////
//////        return reverse(str);
//////
//////    }
//////    static String reverse(String input)
//////{
//////    char[] temparray = input.toCharArray();
//////    int left, right = 0;
//////    right = temparray.length - 1;
//////
//////    for (left = 0; left < right; left++, right--)
//////    {
//////        // Swap values of left and right
//////        char temp = temparray[left];
//////        temparray[left] = temparray[right];
//////        temparray[right] = temp;
//////    }
//////    return String.valueOf(temparray);
//////}
//////    public static void main(String args[])
//////    {
//////        String s1="AGGTAB";
//////        String s2="GXTXAYB";
//////        System.out.println(scsupersequence(s1,s2,s1.length(),s2.length()));
//////    }
//////}
////
//////
//////import java.util.HashMap;
//////
///////* A dynamic programming based Java program print
//////shortest supersequence of two strings */
//////class Main {
//////
//////    // returns shortest supersequence of X and Y
//////    static String printShortestSuperSeq(String X, String Y)
//////    {
//////        int m = X.length();
//////        int n = Y.length();
//////
//////        // dp[i][j] contains length of
//////        // shortest supersequence
//////        // for X[0..i-1] and Y[0..j-1]
//////        int dp[][] = new int[m + 1][n + 1];
//////
//////        // Fill table in bottom up manner
//////        for (int i = 0; i <= m; i++)
//////        {
//////            for (int j = 0; j <= n; j++)
//////            {
//////
//////                // Below steps follow recurrence relation
//////                if (i == 0)
//////                {
//////                    dp[i][j] = j;
//////                }
//////                else if (j == 0)
//////                {
//////                    dp[i][j] = i;
//////                }
//////                else if (X.charAt(i - 1) == Y.charAt(j - 1))
//////                {
//////                    dp[i][j] = 1 + dp[i - 1][j - 1];
//////                }
//////                else
//////                {
//////                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
//////                }
//////            }
//////        }
//////
//////        // Following code is used to print
//////        // shortest supersequence dp[m][n] s
//////        // tores the length of the shortest
//////        // supersequence of X and Y
//////        int index = dp[m][n];
//////
//////        // string to store the shortest supersequence
//////        String str = "";
//////
//////        // Start from the bottom right corner and one by one
//////        // push characters in output string
//////        int i = m, j = n;
//////        while (i > 0 && j > 0)
//////
//////        {
//////            // If current character in X and Y are same, then
//////            // current character is part of shortest supersequence
//////            if (X.charAt(i - 1) == Y.charAt(j - 1))
//////
//////            {
//////                // Put current character in result
//////                str += (X.charAt(i - 1));
//////
//////                // reduce values of i, j and index
//////                i--;
//////                j--;
//////                index--;
//////            }
//////
//////            // If current character in X and Y are different
//////            else if (dp[i - 1][j] > dp[i][j - 1])
//////            {
//////
//////                // Put current character of Y in result
//////                str += (Y.charAt(j - 1));
//////
//////                // reduce values of j and index
//////                j--;
//////                index--;
//////            }
//////            else
//////            {
//////
//////                // Put current character of X in result
//////                str += (X.charAt(i - 1));
//////
//////                // reduce values of i and index
//////                i--;
//////                index--;
//////            }
//////        }
//////
//////        // If Y reaches its end, put remaining characters
//////        // of X in the result string
//////        while (i > 0)
//////        {
//////            str += (X.charAt(i - 1));
//////            i--;
//////            index--;
//////        }
//////
//////        // If X reaches its end, put remaining characters
//////        // of Y in the result string
//////        while (j > 0)
//////        {
//////            str += (Y.charAt(j - 1));
//////            j--;
//////            index--;
//////        }
//////
//////        // reverse the string and return it
//////        str = reverse(str);
//////        return str;
//////    }
//////
//////    static String reverse(String input)
//////    {
//////        char[] temparray = input.toCharArray();
//////        int left, right = 0;
//////        right = temparray.length - 1;
//////
//////        for (left = 0; left < right; left++, right--)
//////        {
//////            // Swap values of left and right
//////            char temp = temparray[left];
//////            temparray[left] = temparray[right];
//////            temparray[right] = temp;
//////        }
//////        return String.valueOf(temparray);
//////    }
//////    HashMap<Character,Integer> hmp=new HashMap<>();
//////    // Driver code
//////    public static void main(String[] args)
//////    {
//////        String X = "AGGTAB";
//////        String Y = "GXTXAYB";
//////        System.out.println(printShortestSuperSeq(X, Y));
//////    }
//////}
////
////// This code is contributed by 29AjayKumar
////
//////class Main
//////{
//////    public static void main(String args[])
//////    {
//////        int res=0;
//////        String str="101";
//////        int j=0;
////////        System.out.println((int)str.charAt(str.length()-2)-48);
//////        for(int i=str.length()-1;i>=0;i--)
//////        {
//////            int temp=(int)Math.pow(2,j)*((int)str.charAt(i)-48);
//////            j++;
//////            res+=temp;
//////        }
//////        System.out.println(res);
//////    }
//////}
////
////
////
////// // Definition for a binary tree node.
//////   class TreeNode {
//////      int val;
//////      TreeNode left;
//////      TreeNode right;
//////      TreeNode() {}
//////      TreeNode(int val) { this.val = val; }
//////     TreeNode(int val, TreeNode left, TreeNode right) {
//////          this.val = val;
//////          this.left = left;
//////          this.right = right;
//////      }
////////  }
//////class Main {
//////    public boolean isBalanced(TreeNode root) {
//////        if(root==null)
//////            return true;
//////        if(root.left.val<root.right.val)
//////            return true;
//////
//////
//////
//////        return isBalanced(root.left)||isBalanced(root.right);
//////    }
//////}
////
//////class Main
//////{
//////    public static void main(String args[])
//////    {
//////        int arr[]={1,2,1,1,2,3};
//////        int res[]=new int[arr.length];
//////        for(int i=0;i<arr.length;i++)
//////        {
//////            int temp=0;
//////            for(int j=0;j<arr.length;j++)
//////            {
//////                if(arr[i]==arr[j])
//////                    temp=temp+(Math.abs(i-j));
//////            }
//////            res[i]=temp;
//////
//////        }
//////        for(int i:res)
//////            System.out.print(i+" ");
////
//////    }
//////}
//////
//////import javax.swing.*;
//////import java.util.HashSet;
//////import java.util.LinkedList;
//////
//////class Node
//////{
//////    int data;
//////    Node next;
//////    Node(int x)
//////    {
//////        data=x;
//////    }
//////}
//////class Main
//////{
//////    static Node redun(Node head)
//////    {
//////        HashSet<Integer> hs=new HashSet<>();
//////        Node curr=head;
//////        while(curr!=null)
//////        {
//////            hs.add(curr.data);
//////            curr=curr.next;
//////        }
//////        curr=head;
//////        for(int i:hs)
//////        {
//////            curr.data=i;
//////            curr=curr.next;
//////        }
//////        curr.next=null;
//////        return head;
//////    }
//////    static void display(Node head)
//////    {
//////        Node curr=head;
//////        while(curr!=null)
//////        {
//////            System.out.print(curr.data+" ");
//////            curr=curr.next;
//////        }
//////    }
//////    public static void main(String args[])
//////    {
//////     Node head=new Node(3);
//////     head.next=new Node(4);
//////     head.next.next=new Node(3);
//////     head.next.next.next=new Node(6);
//////
//////     head=redun(head);
//////     display(head);
//////
//////    }
//////}
////
//////
//////import java.util.Arrays;
//////import java.util.HashMap;
//////
//////class Main {
//////    public static int[] topKFrequent(int[] nums, int k) {
//////
//////        HashMap<Integer,Integer> hmp=new HashMap<>();
//////
//////        for(int i=0;i<nums.length;i++)
//////        {
//////            if(hmp.containsKey(nums[i])==true)
//////                hmp.put(nums[i],hmp.get(nums[i])+1);
//////            else
//////                hmp.put(nums[i],1);
//////        }
//////        System.out.print(hmp);
//////        int res[]=new int[k];
//////        for(int i:hmp.keySet())
//////        {
//////
//////        }
//////        return res;
//////
//////    }
//////    public static void main(String args[])
//////    {
//////        int arr[]={2,2,1,1,1,4,4,4,4};
//////        topKFrequent(arr,arr.length);
//////    }
//////}
////
//////
//////import java.util.HashMap;
//////
//////class Main {
//////    public static String longestWord(String[] words) {
//////
//////        HashMap<Integer , String> hmp=new HashMap<>();
//////        for(int i=0;i<words.length;i++)
//////        {
//////            if(words[i].charAt(0)==words[i-1].charAt(0))
//////            hmp.put(words[i].length(),words[i]);
//////        }
//////        int max=0;
//////        for(int i:hmp.keySet())
//////            max=Math.max(max,i);
//////
////////        System.out.println(max);
//////        return hmp.get(max);
//////    }
//////    public static void main(String args[])
//////    {
////////        String [] words={"a","banana","app","appl","ap","apply","apple"};
//////        String [] words={"m","mo","moc","moch","mocha","l","la","lat","latt","latte","c","ca","cat"};
//////        longestWord(words);
//////        System.out.println(longestWord(words));
//////    }
//////}
////
//////
//////class Main
//////{
//////    public static int substring(String str1,String str2,int m,int n)
//////    {
//////        int dp[][]=new int[m+1][n+1];
//////        for (int j=0;j<=m;j++) dp[j][0]=0;
//////        for (int i=0;i<=n;i++) dp[0][i]=0;
//////        int res=0;
//////
//////        for(int i=1;i<=m;i++)
//////            for(int j=1;j<=n;j++)
//////            {
//////                if(str1.charAt(i-1)==str2.charAt(j-1))
//////                {
//////                    dp[i][j]=dp[i-1][j-1]+1;
//////                    res=Math.max(res,dp[i][j]);
//////                }
//////                else
//////                    dp[i][j]=0;
//////            }
//////        return res;
//////    }
//////    public static void main(String args[])
//////    {
//////        String str1="123321";
//////        String str2="32147";
//////        System.out.println(substring(str1,str2,str1.length(),str2.length()));
//////    }
//////}
////
////
////import java.util.Arrays;
////import java.util.HashMap;
//////import java.util.HashSet;
//////
//////class Main
//////{
//////    public static void main(String args[])
//////    {
//////        HashSet<Integer> hs=new HashSet<>();
//////        hs.add(3);
//////        hs.add(2);
//////        hs.add(1);
//////        hs.add(3);
//////        System.out.println(hs);
//////    }
//////}
////
//////class Main {
//////    public static int subarraySum(int[] nums, int k) {
//////        // 0-1 knapsack
//////
//////        int n=nums.length;
//////        int dp[][]=new int[n+1][k+1];
//////
//////        for(int j=0;j<=k;j++) dp[0][j]=0;
//////        for(int i=0;i<=n;i++) dp[i][0]=1;
//////
//////        for(int i=1;i<=n;i++)
//////            for(int j=1;j<=k;j++)
//////            {
//////                if(nums[i-1]>j)
//////                    dp[i][j]=dp[i-1][j];
//////
//////                else
//////                    dp[i][j]=dp[i-1][j]+dp[i-1][j-nums[i-1]];
//////            }
//////        return dp[n][k];
//////
//////    }
//////    public static void main(String args[])
//////    {
//////        int arr[]={3,3,3,3};
//////        System.out.println(subarraySum(arr,6));
//////    }
//////}
////
//////
//////class Solution {
//////    public boolean uniqueOccurrences(int[] arr) {
//////        HashMap<Integer,Integer>hmp=new HashMap<>();
//////
//////        for(int i=0;i<arr.length;i++)
//////        {
//////            if(hmp.containsKey(arr[i])==true)
//////                hmp.put(arr[i],hmp.get(arr[i])+1);
//////            else
//////                hmp.put(arr[i],1);
//////        }
//////        for(int i:hmp.values())
//////        {
//////        }
//////
//////        return true;
//////    }
//////}
////// Longest Repeating Subsequence
//////class Main
//////{
//////    public static int lrs(String s1,String s2,int m,int n)
//////    {
//////        int arr[][]=new int[m+1][n+1];
//////        for(int i=0;i<=m;i++)arr[i][0]=0;
//////        for(int i=1;i<=n;i++)arr[0][i]=0;
//////
//////
//////        int res=0;
//////        for(int i=1;i<=m;i++)
//////            for(int j=1;j<=n;j++)
//////                if(s1.charAt(i-1)==s2.charAt(j-1)&& i!=j )
//////                {
//////                    arr[i][j]=1+arr[i-1][j-1];
//////                    res=Math.max(res,arr[i][j]);
//////                }
//////                else
//////                    arr[i][j]=0;
//////
//////                return res;
//////
//////    }
//////    public static void main(String args[])
//////    {
//////        String s1="geeksforgeeks";
//////        System.out.println(lrs(s1,s1,s1.length(),s1.length()));
//////    }
//////}
////
//////class Main {
//////    public static long fact(int n)
//////    {
//////        if(n<1)
//////            return 1;
//////        return n*fact(n-1);
//////    }
//////    public static int numTrees(int n) {
//////        long temp1= fact(2*n);
//////        long temp2=fact(n+1)*fact(n);
////////        System.out.print(temp1+" "+temp2);
//////
//////        return (int)(temp1/temp2);
//////    }
//////    public static void main(String args[])
//////    {
//////        System.out.println(numTrees(7));
//////    }
//////}
////
////
//////class Main {
//////    static int convertfive(int num) {
//////
//////        String str=Integer.toString(num);
//////        char ch[]=str.toCharArray();
//////
//////        for(int i=0;i<ch.length;i++)
//////        {
//////            if(ch[i]==0)
//////                ch[i]='5';
//////        }
//////        String string=new String(ch);
//////        return Integer.parseInt(string);
//////    }
//////    public static void main(String args[])
//////    {
//////        System.out.println(convertfive(1004));
//////    }
//////
//////}
////
////
//////// { Driver Code Starts
//////import java.util.Scanner;
//////import java.lang.Math;
//////
//////class Convert_To_Five {
//////    public static void main(String args[]) {
//////        Scanner sc = new Scanner(System.in);
//////        int T = sc.nextInt();
//////        while (T > 0) {
//////            int N = sc.nextInt();
//////            System.out.println(new GfG().convertfive(N));
//////            T--;
//////        }
//////    }
////}// } Driver Code Ends
////
//////
//////class GfG {
//////    int reverse(int num)
//////    {
//////        int res=0;
//////        while(num>0)
//////        {
//////            int  temp=num%10;
//////            num/=10;
//////            res=res*10+temp;
//////        }
//////        return res;
//////    }
//////    int convertfive(int num)
//////    {
//////        num=reverse(num);
//////        int res=0;
//////        int temo=num;
//////        while(num>0)
//////        {
//////            int temp=num%10;
//////            num/=10;
//////            if(temp==0)
//////                res=res*10+(temp+5);
//////            else
//////                res=res*10+temp;
//////        }
//////        return res;
//////    }
//////    public static void main(String args[])
//////    {
//////        System.out.println();
//////    }
//////
//////}
////
////
//
//
////import java.util.HashMap;
////
////class Main
////{
////    static   int thirdLargest(int a[], int n)
////    {
////        // Your code here\
////        HashMap<Integer,Integer> hmp=new HashMap<>();
////        for(int i=0;i<a.length;i++)
////        {
////            hmp.put(a[i],i);
////        }
////        System.out.println(hmp);
////        for(int i:hmp.keySet())
////            if(hmp.get(i)==hmp.get(n-3))
////                return i;
////        return -1;
////    }
////    public static void main(String args[])
////    {
////        int a[]={2,4,8,3,5,6,7,9,1,10};
//////        thirdLargest(a,5);
////        System.out.println(thirdLargest(a,a.length));
////    }
////}
////
////class GfG
////{
////    int thirdLargest(int a[], int n)
////    {
////        // Your code here
////        int fir=a[0];
////        int sec=Integer.MIN_VALUE;
////        int third=Integer.MIN_VALUE;
////
////        for(int i=1;i<n;i++)
////        {
////            if(a[i]>fir && fir>sec && sec>third)
////            {
////                third=sec;
////                sec=fir;
////                fir=a[i];
////            }
////            else if(a[i]<fir  && sec<a[i])
////            {
////                third=sec;
////                sec=a[i];
////            }
////            else if(a[i]>third && a[i]<sec)
////                third=a[i];
////
////        }
////        return third;
////    }
////}
//import com.sun.source.tree.Tree;
//import org.w3c.dom.Node;
//
//import java.util.*;
////import java.lang.*;
////import java.io.*;
////
/////* Name of the class has to be "Main" only if the class is public. */
////class Main
////{
////    public static void main (String[] args) throws java.lang.Exception
////    {
////        // your code goes here
////        Scanner sc=new Scanner(System.in);
////        long t=sc.nextLong();
////        while(t-->0)
////        {
////            long k=sc.nextLong();
////            char board[][]=new char[8][8];
////            for(int i=0;i<8;i++)
////                for(int j=0;j<8;j++)
////                    board[i][j]='X';
////
////
////                board[0][0]='O';
////                k--;
////                for(int i=0;i<8;i++)
////                {
////                    for(int j=0;j<8;j++)
////                    {
////                        if (i == 0 && j == 0)
////                            continue;
////                        if(k==0)
////                            break;
////                        board[i][j]='.';
////                        k--;
////
////                    }
////                    if(k==0)
////                        break;
////                }
////
////                for(int i=0;i<8;i++)
////                {
////                    System.out.println();
////                    for(int j=0;j<8;j++)
////                        System.out.print(board[i][j]);
////                }
////
////
////        }
////    }
////}
////
//
//
//
//// TREE
///*
//1-Create a binary tree
//2-Tree Traversal
//3-Level order Traversal / Breadth first Search
//4-Size of binary tree
//5-Height of binary Tree
//6-Maximum in binary Tree
//7-Iterative order Traversal
// */
//
///*
//// 1:-
//class Node
//{
//    int data;
//    Node left;
//    Node right;
//    Node(int k)
//    {
//        data=k;
//    }
//}
//class Main
//{
//    public static void inorder(Node root)
//    {
//        if(root==null)
//            return;
//        inorder(root.left);
//        System.out.print(" "+root.data);
//        inorder(root.right);
//    }
//    public static void preorder(Node root)
//    {
//        if(root==null)
//            return;
//        System.out.print(" "+root.data);
//        preorder(root.left);
//        preorder(root.right);
//    }
//    public static void postoder(Node root)
//    {
//        if(root==null)
//            return;
//        postoder(root.left);
//        postoder(root.right);
//        System.out.print(" "+root.data);
//    }
//    public static int size(Node root)
//    {
//        if(root==null)
//            return 0;
//        return 1+size(root.left)+size(root.right);
//    }
//    public static int height(Node root)
//    {
//        if(root==null)
//            return 0;
//        return Math.max(height(root.left),height(root.right))+1;
//    }
//    public static int max_val(Node root)
//    {
//        if(root==null)
//            return 0;
//        return Math.max(root.data,Math.max(max_val(root.left),max_val(root.right)));
//    }
//    public static void intertraversal(Node root)
//    {
//        if(root==null)
//            return;
//        Stack<Node> st=new Stack<Node>();
//        Node curr=root;
//        while(curr!=null || !st.isEmpty())
//        {
//            while(curr!=null)
//            {
//                st.push(curr);
//                curr=curr.left;
//            }
//            curr=st.pop();
//            System.out.print(" "+curr.data);
//            curr=curr.right;
//        }
//    }
//
//    public static void main(String args[])
//    {
//        Node root=new Node(4);
//        root.left=new Node(5);
//        root.right=new Node(6);
//        root.left.left=new Node(7);
//        root.left.right=new Node(8);
//        root.right.left=new Node(9);
//        root.right.right=new Node(10);
//        root.left.left.left=new Node(11);
//        inorder(root);
//        System.out.println();
//        preorder(root);
//        System.out.println();
//        postoder(root);
//        System.out.println();
//        System.out.println("Size -"+size(root));
//        System.out.println("height-"+height(root));
//        System.out.println("max_val-"+max_val(root));
//        intertraversal(root);
//    }
//}*/
//
//
////BST (Binary Search Tree)
////Implement a BST
////class Node
////{
////    int val;
////    Node left;
////    Node right;
////    Node(int k)
////    {
////        val=k;
////    }
////}
////class Main
////{
////    public static Node insert(Node root,int val)
////    {
////        if(root==null)
////            return new Node(val);
////        if(root.val>val)
////            root.left=insert(root.left,val);
////        else if(root.val<val)
////            root.right=insert(root.right,val);
////
////        return root;
////    }
////
////    public static void inorder(Node root)
////    {
//////        if(root==null)
//////            return;
//////        inorder(root.left);
//////        System.out.print(" "+root.val);
//////        inorder(root.right);
////
////        if(root==null)
////            return;
////        inorder(root.left);
////        System.out.print(" "+root.val);
////        inorder(root.right);
////    }
////    public static void main(String args[])
////    {
////        Node root=null;
////        root=insert(root,50);
////        insert(root,30);
////        insert(root,20);
////        insert(root,40);
////        insert(root,70);
////        insert(root,60);
////        insert(root,80);
////
////        inorder(root);
////    }
////}
//
//
////class Main
////{
////    static int Knapsack(int wt[],int V[],int n,int W)
////    {
////        int dp[][]=new int[n+1][W+1];
////        for(int [] row : dp)
////            Arrays.fill(row,-1); //init everything to -1
////
////        if(W==0||n==0)
////            return dp[n][W]=0;
////        if(dp[n][W]!= -1 )
////            return dp[n][W];
////
////
////        if(wt[n-1]>W)
////            return dp[n][W]=Knapsack(wt,V,n-1,W);
////        else
////            return dp[n][W]=Math.max(Knapsack(wt,V,n-1,W),V[n-1]+Knapsack(wt,V,n-1,W-wt[n-1]));
////    }
////
////    public static void main(String args[])
////    {
////        int wt[]={10,20,30};
////        int V[]={60,100,120};
////        System.out.println(Knapsack(wt,V,wt.length,5));
////
////    }
////}
//
////
////class Main
////{
////    public static int countsubset(int arr[],int n,int sum)
////    {
////        int dp[][]=new int[n+1][sum+1];
////        for(int j=0;j<=sum;j++) dp[0][j]=0;
////        for(int i=0;i<=n;i++) dp[i][0]=1;
////
////
////        for(int i=1;i<=n;i++)
////            for(int j=1;j<=sum;j++)
////            {
////                if(arr[i-1]>j)
////                    dp[i][j]=dp[i-1][j];
////                else
////                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
////            }
////        return dp[n][sum];
////    }
////    public static void main(String args[])
////    {
////        int arr[]={2,3,1,2,4,3};
////        System.out.println(countsubset(arr,arr.length,7));
////    }
////}
//
////class Main
////{
////    public static void main(String args[])
////    {
////        String str="255.100.50.0";
////        String res=str.replace(".","[.]");
////
////    }
////}
//
////class Main
////{
////    public static void main(String args[])
////    {
////
////        char ch='H';
////        char ch1='h';
////        char ch2='I';
////        char ch3='i';
////        System.out.println((int)ch);
////        System.out.println((int)ch1);
////        System.out.println((int)ch2);
////        System.out.println((int)ch3);
////    }
////}
////class Main {
////    public String toLowerCase(String str) {
////        HashSet<Character> hs=new HashSet<>();
////        String res=null;
////        int a=32;
////        for(char ch='A';ch<='Z';ch++)
////        {
////            hs.add(ch);
////        }
////        for(int i=0;i<str.length();i++)
////        {
////            if(hs.contains(str.charAt(i))==true)
////            {
////                int temp1=a;
////                int temp2=str.charAt(i);
////                char temp3=(char)(temp1+temp2);
////                res=res+temp3;
////            }
////            else
////                res=res+str.charAt(i);
////        }
////        return res;
////    }
////}
//
//
////Check whether n is present in an array of size m or not.
///*
//class Main
//{
//    public static boolean search(int arr[],int m)
//    {
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end)
//        {
//            int mid=start+(end-start)/2;
//            if(arr[mid]==m)
//                return true;
//            else if(arr[mid]>m)
//            {
//                end=mid-1;
//            }
//            else
//            {
//                start=mid+1;
//            }
//        }
//        return false;
//    }
//    public static void main(String args[])
//    {
//        int arr[]={2,3,4,5,6,54,3,2,3,45,6,7,6};
//        Arrays.sort(arr);
//        System.out.println(search(arr,54));
//
//    }
//}*/
//
//
////Find the minimum and maximum element in an array.
///*
//class Main
//{
//    public static void min_max(int arr[])
//    {
//        int max=Integer.MIN_VALUE;
//        int min=Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++)
//        {
//            max=Math.max(max,arr[i]);
//            min=Math.min(min,arr[i]);
//        }
//        System.out.print(max+" "+min);
//    }
//    public static void min_max1(int arr[])
//    {
//        int max=Integer.MIN_VALUE;
//        int min=Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]>max)
//                max=arr[i];
//            if(arr[i]<min)
//                min=arr[i];
//        }
//        System.out.print(max+" "+min);
//    }
//    public static void main(String args[])
//    {
//        int arr[]={2,3,4,5,6,10,3,2,3,45,6,7,6,1};
//        min_max(arr);
//        System.out.println();
//        min_max1(arr);
//    }
//}*/
//
//
///*
////Write a program to reverse the array.
//class Main
//{
//    static void rev(int arr[])
//    {
//        int start=0;
//        int end=arr.length-1;
//        while(start<end)
//        {
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//    }
//    public static void main(String args[])
//    {
//        int arr[]={1,2,3,4,5,6,7,8,9,10,11};
//        rev(arr);
//        for(int i:arr)
//            System.out.print(i+" ");
//    }
//}*/
//
//
////Write a program to sort the given array.
///*
//class main
//{
//    static void sort(int arr[])
//    {
//
//    -------------------------------------------------NO--------------------------n0--------------------------n0-----------------------------
//    }
//    public static void main(String args[])
//        {
//        int arr[]={4,5,5,7,8,9,8,7,6,5,5,7};
//
//    }
//}*/
//
////Move all the negative elements to one side of the array.
///*
//class Main
//{
//    static void sort(int arr[])
//    {
//        int start=0;
//        int end=arr.length-1;
//        while (start<end)
//        {
//            if(arr[start]<0)
//                start++;
//            else if(arr[start]<0 && arr[end]<0)
//                {
//                    start++;
//                }
//            else if(arr[start]>0 && arr[end]>0)
//            {
////                start++;
//                end--;
//            }else
//                {
//                    int temp=arr[start];
//                    arr[start]=arr[end];
//                    arr[end]=temp;
//                }
//        }
//    }
//    public static void main(String args[])
//    {
//        int arr[]={1,-1,3,2,-7,-5,11,6};
//        sort(arr);
//        for(int i:arr)
//            System.out.print(" "+i);
//    }
//}*/
///*
//
////Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algorithm.
//
//
//
//class Main
//{
//    static void dutchflag(int arr[])
//    {
//        int lo=0;
//        int hi=arr.length-1;
//        int mid=0;
//        int temp=0;
//        while(lo<=hi)
//        {
//            switch (arr[mid])
//            {
//                case 0:
//                {
//                    temp=arr[lo];
//                    arr[lo]=arr[mid];
//                    arr[mid]=temp;
//                    lo++;
//                    mid++;
//                    break;
//                }
//                case 1:{
//                    mid++;
//                    break;
//                }
//                case 2:{
//                    temp=arr[mid];
//                    arr[mid]=arr[hi];
//                    arr[hi]=temp;
//                    hi--;
//                    break;
//                }
//            }
//        }
//    }
//    public static void main(String args[])
//    {
//        int arr[]={0,1,2,1,1,0,0,2,2};
//        dutchflag(arr);
//        for(int i:arr)
//            System.out.print(i+" ");
//    }
//}*/
//
//
///*
//class Main
//{
//    public static int repeat(int arr[])
//    {
//        HashMap<Integer,Integer> hmp=new HashMap<>();
//        for(int i=0;i<arr.length;i++)
//        {
//            if(hmp.containsKey(arr[i])==true)
//                hmp.put(arr[i],hmp.get(arr[i])+1);
//            else
//                hmp.put(arr[i],1);
//        }
//        for(int i:arr)
//        {
//            if(hmp.get(i)<2)
//                return i;
//        }
//        return -1;
//    }
//    public static void main(String args[])
//    {
//        int arr[]={9, 4, 9 ,6, 7, 4};
//        System.out.println(repeat(arr));
//
//    }
//}*/
//
//
///*
//class Main
//{
//    static void max(int arr[])
//    {
//        int a=0;
//        int b=0;
//        int c=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]>a)
//            {
//                c=b;
//                b=a;
//                a=arr[i];
//            }
//            else if(arr[i]<a && arr[i]>b)
//            {
//                c=b;
//                b=arr[i];
//            }
//            else
//                c=arr[i];
//        }
//        System.out.println(a+" "+" "+b+" "+c);
//    }
//    public static void main(String args[])
//    {
//        int arr[]={10,10,10,11,10,10,12};
//        max(arr);
//    }
//}*/
//
///*
//
//class Main
//{
//    static boolean subsetsumdp(int arr[],int n,int sum)             // DP solution
//    {
//        boolean dp[][]=new boolean[n+1][sum+1];
//        for(int j=0;j<=sum;j++) dp[0][j]=true;
//        for(int i=0;i<=n;i++) dp[i][0]=false;
//
//        for(int i=1;i<=n;i++)
//            for(int j=1;j<=sum;j++)
//                if(arr[i-1]>j)
//                    dp[i][j]=dp[i-1][j];
//                else
//                    dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
//
//
//
//        return dp[n][sum];
//    }
//    public static void main(String args[])
//    {
//        int arr[]={4,2,-3,1,6};
//
//        System.out.println(subsetsumdp(arr,arr.length,0));
//    }
//}*/
//
//
///*package whatever //do not write package name here */
//
///*
//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
//class Main {
//    static String res(int arr[],int n)
//    {
//        Set<Integer> hs=new HashSet<Integer>();
//        int sum=0;
//        for(int i=0;i<n;i++)
//        {
//            sum+=arr[i];
//
//            if(arr[i]==0 || sum==0  || hs.contains(sum))
//            {
//                return "Yes";
//            }
//
//            hs.add(sum);
//        }
//
//        return "No";
//    }
//    public static void main (String[] args) {
//        //code
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t-->0)
//        {
//            int n=sc.nextInt();
//            int arr[]=new int[n];
//            for(int i=0;i<n;i++)
//                arr[i]=sc.nextInt();
//
//            System.out.println(res(arr,arr.length));
//        }
//    }
//}*/
//
///*
//
//class Main {
//    public static int longestConsecutive(int[] nums) {
//
//         if(nums.length<2)
//             return nums.length;
//
//         Arrays.sort(nums);
//         int max=0;
//         int count=1;
//         for(int i=0;i<nums.length-1;i++)
//         {
//             if(nums[i]+1==nums[i+1] && nums[i]!=nums[i+1])
//                 count++;
//             else if(nums[i]!=nums[i+1])
//             {                                    //approach fail if number is duplicate
//                 max=Math.max(count,max);
//                 count=1;
//             }
//
//               max=Math.max(count,max);
//         }
//         return max;
//    }
//    public static void main(String args[])
//    {
////        int arr[]={36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
//        int arr[]={2,2,2,2};
//        System.out.println(longestConsecutive(arr));
//    }
//}*/
//
//
//
///*
//class Node
//{
//    int data;
//    Node left;
//    Node right;
//    Node(int x)
//    {
//        data=x;
//    }
//}
//class Main
//{
//
//    // Tree Traversal
//    static void inorder(Node root)
//    {
//        if(root==null)
//            return;
//        inorder(root.left);
//        System.out.print(root.data+" ");
//        inorder(root.right);
//    }
//    static void Preorder(Node root)
//    {
//        if(root==null)
//            return;
//        System.out.print(root.data+" ");
//        Preorder(root.left);
//        Preorder(root.right);
//
//    }
//    static void Postorder(Node root)
//    {
//        if(root==null)
//            return;
//        Postorder(root.left);
//        Postorder(root.right);
//        System.out.print(root.data+" ");
//    }
//
//    public static void main(String args[])
//    {
//        Node root = new Node(5);
//        root.left = new Node(2);
//        root.right = new Node(6);
//        root.left.left = new Node(1);
//        root.left.right = new Node(4);
//        root.left.right.left = new Node(3);
//        root.right.right = new Node(8);
//        root.right.right.right = new Node(9);
//        root.right.right.left = new Node(7);
//
//
//        inorder(root);
//        System.out.println();
//        Preorder(root);
//        System.out.println();
//        Postorder(root);
//    }
//}*/
//
//
///*
//class Node
//{
//    int data;
//    Node left;
//    Node right;
//    Node(int x)
//    {
//        data=x;
//    }
//}
//class Main
//{
//
//    // difference b/w odd and even level
//    static int getdiff(Node root)
//    {
//        if(root==null)
//            return 0;
//        return root.data-getdiff(root.left)-getdiff(root.right);
//    }
//
//    public static void main(String args[])
//    {
//        Node root = new Node(5);
//        root.left = new Node(2);
//        root.right = new Node(6);
//        root.left.left = new Node(1);
//        root.left.right = new Node(4);
//        root.left.right.left = new Node(3);
//        root.right.right = new Node(8);
//        root.right.right.right = new Node(9);
//        root.right.right.left = new Node(7);
//
//        System.out.println(getdiff(root));
//    }
//}*/
///*
//
//class Node
//{
//    int data;
//    Node left;
//    Node right;
//    Node(int x)
//    {
//        data=x;
//    }
//}
//class Main
//{
//    static int getno(Node root)
//    {
//        if(root==null)
//            return 0;
//        return 1+getno(root.left)+getno(root.right);
//    }
//    public static void main(String args[])
//    {
//        Node root = new Node(5);
//        root.left = new Node(2);
//        root.right = new Node(6);
//        root.left.left = new Node(1);
//        root.left.right = new Node(4);
//        root.left.right.left = new Node(3);
//        root.right.right = new Node(8);
//        root.right.right.right = new Node(9);
//        root.right.right.left = new Node(7);
//
//
//        System.out.println(getno(root));
//
//    }
//}
//
//*/
//
///*
//
//class Node
//{
//    int data;
//    Node left;
//    Node right;
//    Node(int x)
//    {
//        data=x;
//    }
//}
//class Main
//{
//    static int getleaf(Node root)
//    {
//        if(root==null)
//            return 0;
//
//        if(root.left==null && root.right==null)
//            return 1;
//
//        return getleaf(root.left)+getleaf(root.right);
//    }
//    public static void main(String args[])
//    {
//        Node root = new Node(5);
//        root.left = new Node(2);
//        root.right = new Node(6);
//        root.left.left = new Node(1);
//        root.left.right = new Node(4);
//        root.left.right.left = new Node(3);
//        root.right.right = new Node(8);
//        root.right.right.right = new Node(9);
//        root.right.right.left = new Node(7);
//
//
//        System.out.println(getleaf(root));
//    }
//}*/
//
//
///*
//class Node
//{
//    int data;
//    Node left;
//    Node right;
//    Node(int x)
//    {
//        data=x;
//    }
//}
//class Main
//{
//    static int getheight(Node root)
//    {
//        if(root==null)
//            return 0;
//        return 1+Math.max(getheight(root.left),getheight(root.right));
//    }
//    public static void main(String args[])
//    {
//        Node root = new Node(5);
//        root.left = new Node(2);
//        root.right = new Node(6);
//        root.left.left = new Node(1);
//        root.left.right = new Node(4);
//        root.left.right.left = new Node(3);
//        root.right.right = new Node(8);
//        root.right.right.right = new Node(9);
//        root.right.right.left = new Node(7);
//
//        System.out.println(getheight(root));
//    }
//}*/
//
/*class Node
{
    int data;
    Node left;
    Node right;
    Node(int x)
    {
        data=x;
    }
}
class Main
{
    static void print_level(Node root,int level)
    {
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.data+" ");

        print_level(root.left,level-1);
        print_level(root.right,level-1);
    }

    public static void main(String args[])
    {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.left.right.left = new Node(3);
        root.right.right = new Node(8);
        root.right.right.right = new Node(9);
        root.right.right.left = new Node(7);

        print_level(root,1);
    }
}*/
//
///*
//
//class Node
//{
//    int data;
//    Node left;
//    Node right;
//    Node(int x)
//    {
//        data=x;
//    }
//}
//class Main
//{
//    static int height(Node root)
//    {
//        if(root==null)
//            return 0;
//        return 1+Math.max(height(root.left),height(root.right));
//    }
//    static void lvlprint(Node root,int level)
//    {
//        if(root==null)
//            return;
//
//        if(level==1)
//            System.out.print(root.data+" ");
//
//        lvlprint(root.left,level-1);
//        lvlprint(root.right,level-1);
//
//    }
//    public static void main(String args[])
//    {
//        Node root = new Node(5);
//        root.left = new Node(2);
//        root.right = new Node(6);
//        root.left.left = new Node(1);
//        root.left.right = new Node(4);
//        root.left.right.left = new Node(3);
//        root.right.right = new Node(8);
//        root.right.right.right = new Node(9);
//        root.right.right.left = new Node(7);
//        int height=height(root);
//        for(int i=1;i<=height;i++)
//        {
//            lvlprint(root,i);
//            System.out.println();
//        }
//    }
//}
//*/
//
//
///*
//class Node
//{
//    int data;
//    Node left;
//    Node right;
//    Node(int x)
//    {
//        data=x;
//    }
//}
//class Main
//{
//    static  void lvlorderwithoutrec(Node root)
//    {
//        if(root==null)
//            return;
//        Queue<Node> qt=new LinkedList<>();
//        qt.add(root);
//        while(!qt.isEmpty())
//        {
//            Node top=qt.remove();
//            System.out.print(top.data+" ");
//
//            if(top.left!=null)
//                qt.add(top.left);
//            if(top.right!=null)
//                qt.add(top.right);
//        }
//    }
//    public static void main(String args[])
//    {
//        Node root = new Node(5);
//        root.left = new Node(2);
//        root.right = new Node(6);
//        root.left.left = new Node(1);
//        root.left.right = new Node(4);
//        root.left.right.left = new Node(3);
//        root.right.right = new Node(8);
//        root.right.right.right = new Node(9);
//        root.right.right.left = new Node(7);
//
//        lvlorderwithoutrec(root);
//    }
//}*/
//
//
///*
//class Node
//{
//    int data;
//    Node left;
//    Node right;
//    Node(int x)
//    {
//        data=x;
//    }
//}
//class Main
//{
//    static  int maxlevel=0;
//    static void left_view(Node root,int level)
//    {
//        if(root==null)
//            return;
//        if(level>=maxlevel)
//        {
//            System.out.print(" "+root.data);
//            maxlevel++;
//        }
//        left_view(root.left,level+1);
//        left_view(root.right,level+1);
//    }
//    public static void main(String args[])
//    {
//        Node root = new Node(5);
//        root.left = new Node(2);
//        root.right = new Node(6);
//        root.left.left = new Node(1);
//        root.left.right = new Node(4);
//        root.left.right.left = new Node(3);
//        root.right.right = new Node(8);
//        root.right.right.right = new Node(9);
//        root.right.right.left = new Node(7);
//
//        left_view(root,0);
//    }
//}*/
///*
//class Node
//{
//    int data;
//    Node left;
//    Node right;
//    Node(int x)
//    {
//        data=x;
//    }
//}
//class Main
//{
//    static int maxlevel=0;
//    static void right_view(Node root,int level)
//    {
//        if(root==null)
//            return;
//
//        if(level>=maxlevel)
//        {
//            System.out.print(" "+root.data);
//            maxlevel++;
//        }
//        right_view(root.right,level+1);
//        right_view(root.left,level+1);
//    }
//    public static void main(String args[])
//    {
//        Node root = new Node(5);
//        root.left = new Node(2);
//        root.right = new Node(6);
//        root.left.left = new Node(1);
//        root.left.right = new Node(4);
//        root.left.right.left = new Node(3);
//        root.right.right = new Node(8);
//        root.right.right.right = new Node(9);
//        root.right.right.left = new Node(7);
//
//        right_view(root,0);
//
//    }
//}*/
//
//
///*
//class Node
//{
//    int data;
//    Node left;
//    Node right;
//    Node(int x)
//    {
//        data=x;
//    }
//}
//class Main
//{
//    public static Node con_mirror(Node root)
//    {
//        if(root==null)
//            return root;
//        Node t=root.left;
//        root.left=root.right;
//        root.right=t;
//
//        con_mirror(root.left);
//        con_mirror(root.right);
//        return root;
//    }
//    public static void main(String args[])
//    {
//        Node root = new Node(5);
//        root.left = new Node(2);
//        root.right = new Node(6);
//        root.left.left = new Node(1);
//        root.left.right = new Node(4);
//        root.left.right.left = new Node(3);
//        root.right.right = new Node(8);
//        root.right.right.right = new Node(9);
//        root.right.right.left = new Node(7);
//
//
//    }
//}*/
//
///*
//
//class Node
//{
//    int data;
//    Node left;
//    Node right;
//    Node(int x)
//    {
//        data=x;
//    }
//}
//class Main
//{
//    static int maxlevel=0;
//    static int sum=0;
//    public  static int right_view(Node root,int level)
//    {
//        if(root==null)
//            return sum;
//        if(level>=maxlevel)
//        {
////            System.out.print(" "+root.data);
//            sum+=root.data;
//            maxlevel++;
//        }
//        right_view(root.right,level+1);
//        right_view(root.left,level+1);
//
//        return sum;
//    }
//    public static void main(String args[])
//    {
//        Node root = new Node(5);
//        root.left = new Node(2);
//        root.right = new Node(6);
//        root.left.left = new Node(1);
//        root.left.right = new Node(4);
//        root.left.right.left = new Node(3);
//        root.right.right = new Node(8);
//        root.right.right.right = new Node(9);
//        root.right.right.left = new Node(7);
////        System.out.println(right(root,0));
//        System.out.println( right_view(root,0));
//
//    }
//}*/
//
////
////   class TreeNode {
////      int val;
////      TreeNode left;
////      TreeNode right;
//////      TreeNode(int val) { this.val = val; }
//////      TreeNode(int val, TreeNode left, TreeNode right) {
//////          this.val = val;
//////          this.left = left;
//////          this.right = right;
//////      }
////       TreeNode(int x)
////       {
////           val=x;
////       }
//// }
////public class Main {
////    public  static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
////        Stack<TreeNode> s1=new Stack<>();
////        Stack<TreeNode> s2=new Stack<>();
////
////        List<List<Integer>>al=new LinkedList<List<Integer>>();
////        s1.push(root);
//////        List<Integer> temp=new ArrayList<>(); // temp
////        while(!s1.isEmpty() || !s2.isEmpty())
////        {
////            while(!s1.isEmpty())
////            {
////                TreeNode temp=s1.peek();
////                s1.pop();
////                System.out.print(" "+temp.val);
////
////                if(temp.right!=null)
////                    s2.push(temp.right);
////
////                if(temp.left!=null)
////                    s2.push(temp.left);
////            }
////            System.out.println();
////            while(!s2.isEmpty())
////            {
////                TreeNode temp=s2.peek();
////                s2.pop();
////                System.out.print(" "+temp.val);
////
////                if(temp.left!=null)
////                    s1.push(temp.right);
////
////                if(temp.right!=null)
////                    s1.push(temp.left);
////            }
////        }
////        return al;
////    }
////    public static void main(String args[])
////    {
////        TreeNode root = new TreeNode(1);
////        root.left = new TreeNode(2);
////        root.right = new TreeNode(3);
////        root.left.left=new TreeNode(7);
////        root.left.right=new TreeNode(6);
////        root.right.left=new TreeNode(5);
////        root.right.right=new TreeNode(4);
////
////        System.out.println(zigzagLevelOrder(root));
////    }
////}
//


//import java.lang.reflect.Array;
//import java.util.*;
//import java.util.regex.Pattern;
//
///*
//class Node
//{
//    int data;
//    Node left;
//    Node right;
//    int height;
//    Node(int x)
//    {
//        data=x;
//    }
//}
//class Main
//{
//    public static void printtop(Node root)
//    {
//        if(root==null)
//            return;
//        TreeMap<Integer,Integer> tmp=new TreeMap<>();
//        Queue<Node> q=new LinkedList<>();
//        q.add(root);
//        while(!q.isEmpty())
//        {
//            Node temp=q.remove();
//            int hd=temp.height;
//            if(tmp.get(hd)==null)
//                tmp.put(hd,temp.data);
//
//            if(temp.left!=null)
//            {
//                q.add(temp.left);
//                temp.left.height=hd-1;
//            }
//            if(temp.right!=null)
//            {
//                q.add(temp.right);
//                temp.right.height=hd+1;
//            }
//
//        }
//        System.out.print(tmp.values());
//    }
//    public static void main(String args[])
//    {
//        Node root = new Node(5);
//        root.left = new Node(2);
//        root.right = new Node(6);
//        root.left.left = new Node(1);
//        root.left.right = new Node(4);
//        root.left.right.left = new Node(3);
//        root.right.right = new Node(8);
//        root.right.right.right = new Node(9);
//        root.right.right.left = new Node(7);
//
//
//        printtop(root);
//    }
//}*/
//
///*
//class Node
//{
//    Node left;
//    Node right;
//    int val;
//    int height;
//    Node(int x)
//    {
//        val=x;
//    }
//}
//class Main
//{
//    static void bottom_view(Node root)
//    {
//        if(root==null)
//            return;
//        TreeMap<Integer,Integer> tmp=new TreeMap<>();
//        Queue<Node> qt=new LinkedList<>();
//        qt.add(root);
//        while(!qt.isEmpty())
//        {
//            Node temp=qt.remove();
//            int hd=temp.height;
//
//
////            if(tmp.get(hd)==null)
//                tmp.put(hd,temp.val);
//
//            if(temp.left!=null)
//            {
//                temp.left.height=hd-1;
//                qt.add(temp.left);
//            }
//            if(temp.right!=null)
//            {
//                temp.right.height=hd+1;
//                qt.add(temp.right);
//            }
//        }
//        System.out.println(tmp.values());
//    }
//    public static void main(String args[])
//    {
//        Node root = new Node(20);
//        root.left = new Node(8);
//        root.right = new Node(22);
//        root.left.left = new Node(5);
//        root.left.right = new Node(3);
//        root.right.left = new Node(4);
//        root.right.right = new Node(25);
//        root.left.right.left = new Node(10);
//        root.left.right.right = new Node(14);
//
//        bottom_view(root);
//    }
//}*/
//
//
////class TreeNode
////{
////    TreeNode left;
////    TreeNode right;
////    int val;
////    TreeNode(int x)
////    {
////        val=x;
////    }
////}
////class Main
////{
////
////        public static void removeLeafNodes(TreeNode root, int target) {
////            if(root==null)
////                return ;
////
////            if(root.left==null && root.right==null)
////                if(root.val==target)
////                    System.out.print(" "+root.val);
////
////
////            if(root.left!=null)
////                removeLeafNodes(root.left,target);
////
////            if(root.right!=null)
////                removeLeafNodes(root.right,target);
////
//////            return root;
////        }
////    public static void main(String args[])
////    {
////        TreeNode root=new TreeNode(1);
////        root.left=new TreeNode(3);
////        root.right=new TreeNode(3);
////        root.left.left=new TreeNode(3);
////        root.left.right=new TreeNode(2);
////
////        removeLeafNodes(root,3);
////    }
////}
//
//
///*
//class TreeNode
//{
//    TreeNode left;
//    TreeNode right;
//    int val;
//    TreeNode(int x)
//    {
//        val=x;
//    }
//}
//
//class Main {
//    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
//
//        List<Integer> al=new LinkedList<>();
//
//        Queue<TreeNode> qt=new LinkedList<>();
//        qt.add(root1);
//        while(!qt.isEmpty())
//        {
//            TreeNode temp=qt.remove();
//            al.add(temp.val);
//
//            if(temp.left!=null)
//                qt.add(temp.left);
//            if(temp.right!=null)
//                qt.add(temp.right);
//        }
//
//        qt.add(root2);
//        while(!qt.isEmpty())
//        {
//            TreeNode temp=qt.remove();
//            al.add(temp.val);
//
//            if(temp.left!=null)
//                qt.add(temp.left);
//            if(temp.right!=null)
//                qt.add(temp.right);
//        }
//
//        Collections.sort(al);
//        return al;
//    }
//    public static void main(String args[])
//    {
//
//    }
//}*/
//
//
//
////class Main
////{
////    static void dfsrec(ArrayList<ArrayList<Integer>> adj,int s,boolean [] visited)
////    {
////        visited[s]=true;
////        System.out.print(" "+s);
////        for(int u:adj.get(s))
////        {
////            if(visited[u]==false)
////                dfsrec(adj,u,visited);
////        }
////    }
////    static void dfs(ArrayList<ArrayList<Integer>> adj,int v,int s)
////    {
////        boolean visited[]=new boolean[v+1];
////        dfsrec(adj,s,visited);
////    }
////
//////    static void bfs(ArrayList<ArrayList<Integer>> adj,int s,int v)
//////    {
//////        boolean visited[]=new boolean[v+1];
//////        visited[s]=true;
//////        Queue<Integer> qu=new LinkedList<>();
//////        qu.add(s);
//////        visited[s]=true;
//////        while (!qu.isEmpty())
//////        {
//////            int u= qu.poll();
//////            System.out.print(" "+u);
//////            for(int i:adj.get(u))
//////            {
//////                if(visited[i]==false)
//////                {
//////                    qu.add(i);
//////                    visited[i]=true;
//////                }
//////            }
////////            System.out.println();
//////        }
//////    }
////    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v) {
////        adj.get(u).add(v);
////        adj.get(v).add(u);
////    }
////    static  void display(ArrayList<ArrayList<Integer>> adj)
////    {
////        for(int i=0;i<adj.size();i++)
////        {
////            for (int j=0;j<adj.get(i).size();j++)
////            {
////                System.out.print(" "+adj.get(i).get(j));
////            }
////            System.out.println();
////        }
////    }
////
//////    static void printGraph(ArrayList<ArrayList<Integer> > adj)
//////    {
//////        for (int i = 0; i < adj.size(); i++) {
////////            System.out.println("\nAdjacency list of vertex" + i);
////////            System.out.print("head");
//////            for (int j = 0; j < adj.get(i).size(); j++)
//////            {
//////                System.out.print(" -> "+adj.get(i).get(j));
//////            }
//////            System.out.println();
//////        }
//////    }
////    public static void main(String args[])
////    {
////        int c=5;
////        ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>(c);
////        for(int i=0;i<c;i++)
////        {
////            adj.add(new ArrayList<Integer>());
////        }
////
////        addEdge(adj, 0, 1);
////        addEdge(adj, 0, 4);
////        addEdge(adj, 1, 2);
////        addEdge(adj, 1, 3);
////        addEdge(adj, 1, 4);
////        addEdge(adj, 2, 3);
////        addEdge(adj, 3, 4);
////
//////        display(adj);
//////        printGraph(adj);
//////        bfs(adj,0,c);
////            dfs(adj,c,0);
////    }
////}
//
//
////class Main
////{
////    static void cyclic(int arr[])
////    {
////        int temp=arr[arr.length-1];
////        for(int i=arr.length-1;i>0;i--)
////            arr[i]=arr[i-1];
////
////        arr[0]=temp;
////    }
////    static void reverse(int arr[],int k)
////    {
////        int start=0;
////        int end=k-1;
////        while(start<end)
////        {
////            int temp=arr[start];
////            arr[start]=arr[end];
////            arr[end]=temp;
////            start++;
////            end--;
////        }
////        start=k;
////        end=arr.length-1;
////        while(start<end)
////        {
////            int temp=arr[start];
////            arr[start]=arr[end];
////            arr[end]=temp;
////            start++;
////            end--;
////        }
////
////        start=0;
////        end=arr.length-1;
////        while (start<end)
////        {
////            int temp=arr[start];
////            arr[start]=arr[end];
////            arr[end]=temp;
////            start++;
////            end--;
////        }
////    }
////    public static void main(String args[])
////    {
////        int arr[]={1,2,3,4,5,6,7};
//////        reverse(arr,2);
////        cyclic(arr);
////        cyclic(arr);
////        for(int i:arr)
////            System.out.print(i+" ");
////
////    }
////}
////
////class Main
////{
////    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
////    {
////        adj.get(u).add(v);
////        adj.get(v).add(u);
////    }
////    static void display(ArrayList<ArrayList<Integer>> adj)
////    {
////        for(int i=0;i<adj.size();i++)
////        {
////            for(int j=0;j<adj.get(i).size();j++)
////                System.out.print("  " + adj.get(i).get(j));
////
////            System.out.println();
////        }
////    }
////    void BFS(ArrayList<ArrayList<Integer>> adj,int s,int v)
////    {
////        boolean temp[]=new boolean[v+1];
////        Queue<Integer> q=new LinkedList<>();
////
////        temp[s]=true;
////        q.add(s);
////        while(!q.isEmpty())
////        {
////            int tmp=q.poll();
////            System.out.print(tmp+" ");
////            for(int i:adj.get(tmp))
////                if(temp[i]==false)
////                {
////                    q.add(i);
////                    temp[i]=true;
////
////                }
////        }
////
////    }
////
////    void DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[])
////    {
////        visited[s]=true;
////        System.out.print(s+" ");
////        for(int u:adj.get(s))
////            if (visited[u]==false)
////                DFSrec(adj,u,visited);
////    }
////    void  DFS(ArrayList<ArrayList<Integer>> adj,int s,int v)
////    {
////        boolean visited[]=new boolean[v];
////
////    }
////    public static void main(String args[])
////    {
////        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(5);
////        for(int i=0;i<5;i++)
////        {
////            adj.add(new ArrayList<Integer>());
////        }
////
////        addEdge(adj,0,1);
////
////        addEdge(adj,1,2);
////        addEdge(adj,1,3);
////        addEdge(adj,0,4);
////        addEdge(adj,1,4);
////        addEdge(adj,2,3);
////        addEdge(adj,3,4);
//////        display(adj);
////        Main mn=new Main();
////        mn.BFS(adj,0,5);
////        mn.DFS(adj,0,adj.size());
////    }
////}
//
//
////
////class Main {
////    public static String reverseWords(String s) {
////        // String [] words=s.trim().split(" +"); // Collections.reverse(Arrays.asList(words)); // return String.join(" ",words); }
////
////        int i=0;
////        int n=s.length();
////        String res = new String();
////        while(i<n)
////        {
////            while(i<n && s.charAt(i)==' ')
////            {
////                i++;
////            }
////            if(i>=n)
////                break;
////
////           int  j=i+1;
////            while(j<n && s.charAt(j)!=' ')
////                j++;
////
////            String temp=s.substring(i,j);
////
////            if(res.length()==0)
////                res=temp+res;
////            else
////                res=temp+" "+res;
////
////
////            i=j+1;
////        }
////        return res;
////    }
////    public static void main(String args[])
////    {
////        String str="the sky is blue";
////        System.out.println(reverseWords(str));
////    }
////}
//
////class Main
////{
////    static String freq(String str)
////    {
////        HashSet<String> hs=new HashSet<>();
////        int i=0;
////        String res=new String();
////        int n=str.length();
////        while(i<n)
////        {
////            while(i<n && str.charAt(i)==' ')
////                i++;
////
////            int j=i+1;
////            while(j<n && str.charAt(j)!=' ')
////                j++;
////
////            hs.add(str.substring(i,j));
////            i=j+1;
////        }
////        System.out.println(hs);
////        for(String s:hs)
////        {
////            res=res+s;
////        }
////        return  res;
////    }
////    public static void main(String args[])
////    {
////        String st="geeks for geeks";
////        System.out.println(freq(st));
////    }
////}
//
////
////class Main
////{
////    public static void main(String args[])
////    {
////        String ch="B----";
////        char arr[]=ch.toCharArray();
////
////        int i=-1;
////        int j=-1;
////        int curr=0;
////        while(curr<arr.length)
////        {
////            if(arr[curr]=='A')
////                break;
////            curr++;
////        }
////
////        i=curr;
////        curr=0;
////        while(curr<arr.length)
////        {
////            if(arr[curr]=='B')
////                break;
////
////            curr++;
////        }
////        j=curr;
////        curr=0;
////        if(i==-1 && j==-1)
////            System.out.println("win neutral");
////        else if(i!=-1 && j==-1)
////            System.out.println("win A");
////        else if(j==-1)
////            System.out.println("win B");
////        else
////            {
////                i=-1;
////                j=-1;
////                int temp=curr;
////                while(temp<arr.length)
////                {
////                    while(temp<arr.length)
////                    {
////                        if(arr[temp]=='A')
////                            break;
////                        temp++;
////                    }
////                    i=temp;
////                    temp=0;
////
////                    while(temp<arr.length)
////                    {
////                        if(arr[temp]=='B')
////                            break;
////                        temp++;
////                    }
////                    j=temp;
////
////                    while(i>=0 && j<arr.length && arr[i]=='-' &&  arr[j]=='-')
////                    {
////                        arr[i]='A';
////                        arr[j]='B';
////                        i--;
////                        j++;
////                    }
////                    temp=j;
////
////                }
////
////            }
////        for(char u:arr)
////            System.out.print(" "+u);
////
////    }
////}
////
////class Node
////{
////    Node next;
////    int data;
////    boolean flag;
////    Node(int x)
////    {
////        data=x;
////    }
////}
////
////class Main
////{
////    // print a linked list
////    static void display(Node head)
////    {
////        if(head==null)
////            return;
////        while(head!=null)
////        {
////            System.out.print(" "+head.data);
////            head=head.next;
////        }
////    }
////    // Middle of a linked list
////    static void mid(Node head)
////    {
////        if(head==null)
////            return;
////
////        Node slow=head;
////        Node fast=head;
////        while (fast!=null && fast.next!=null)
////        {
////            slow=slow.next;
////            fast=fast.next.next;
////        }
////        System.out.println(slow.data);
////    }
////    // print nth element from lAST
////
////    static void last(Node head,int n)
////    {
////        if(head==null)
////            return;
////
////        Node slow=head;
////        Node fast=head;
////        int count=1;
////        while(count<n && fast!=null)
////        {
////            fast=fast.next;
////            count++;
////        }
////        while (fast!=null&& fast.next!=null)
////        {
////            slow=slow.next;
////            fast=fast.next;
////        }
////        System.out.println(slow.data);
////    }
////
////    // Rotate a linked list in clockwise manner
////
////        Node  rotate(Node root,int n)
////        {
////            Node curr=root;
////            Node last=root;
////            while (last.next!=null)
////                last=last.next;
////
////            int count=1;
////            while (count<n && curr!=null)
////            {
////                curr=curr.next;
////                count++;
////            }
////            last.next=root;
////            root=curr.next;
////            curr.next=null;
////            return root;
////        }
////        // check if linked list is palindrome or not
////    static boolean palindrome(Node head)
////    {
////        if(head==null)
////            return false;
////        Stack<Integer> stk=new Stack<>();
////        Node curr=head;
////        while (curr!=null)
////        {
////            stk.push(curr.data);
////            curr=curr.next;
////        }
////        while (head!=null)
////        {
////            int temp=stk.pop();
////            if(temp!=head.data)
////                return false;
////
////            head=head.next;
////        }
////
////        return true;
////    }
////
////    // reverse a linked list
////
////    static  Node reverse(Node head)
////    {
////        if(head==null)
////            return head;
////        Node prev=null;
////        Node curr=head;
////        Node next=head;
////        while(next!=null && next.next!=null)
////        {
////            next=curr.next;
////            curr.next=prev;
////            prev=curr;
////            curr=next;
////        }
////        curr.next=prev;
////        head=curr;
////
////        return  head;
////
////    }
////
////    // Palindrome a linked list using big of 1 or O(1)
////    static  void chkpalindrome(Node head)
////    {
////        // find mid of linked list
////        // reverse a linked list after mid
////        // then chk both part is identical or not
////
////
////    public static void main(String args[])
////    {
////        Node head=new Node(10);
////        head.next=new Node(12);
////        head.next.next=new Node(14);
////        head.next.next.next=new Node(16);
////        head.next.next.next.next=new Node(14);
////        head.next.next.next.next.next=new Node(12);
////        head.next.next.next.next.next.next=new Node(10);
////        head.next.next.next.next.next.next.next=new Node(24);
////        head.next.next.next.next.next.next.next.next=new Node(26);
//////
////        display(head);
////        System.out.println();
//////        mid(head);
//////        last(head,3);
////        head=reverse(head);
////        display(head);
//////        System.out.println();
//////        Main mn=new Main();
//////        head=mn.rotate(head,2);
//////        display(head);
//////        System.out.println(palindrome(head));
////
////    }
////}
//
//
////class Node
////{
////    Node left;
////    Node right;
////    int data;
////    Node (int x)
////    {
////        data=x;
////    }
////}
////
////// inorder:-left root right
////// preorder:- root left right
////// postorder:- left right root
////
////class Main
////{
////    static void inorder(Node root)
////    {
////        if(root==null)
////            return;
////        inorder(root.left);
////        System.out.print(" "+root.data);
////        inorder(root.right);
////    }
////
////    static void preorder(Node root)
////    {
////        if(root==null)
////            return;
////
////        System.out.print(" "+root.data);
////        preorder(root.left);
////        preorder(root.right);
////    }
////
////    static void postorder(Node root)
////    {
////        if(root==null)
////            return;
////
////
////        preorder(root.left);
////        preorder(root.right);
////        System.out.print(" "+root.data);
////    }
////
////    public static void main(String args[])
////    {
////        Node head=new Node(10);
////        head.left=new Node(12);
////        head.right=new Node(14);
////        head.left.left=new Node(16);
////        head.left.right=new Node(18);
////        head.right.left=new Node(20);
////        head.right.right=new Node(22);
////
////        inorder(head);
////        System.out.println();
////        preorder(head);
////        System.out.println();
////        postorder(head);
////    }
////}
//
//
//
////class Main
////{
////    static void binary(int n)
////    {
////        // Instead of string we can also use Integer Array  (int arr[]=new int[1000];)
////        int t=n;
////        String res="";
////        while(n>0)
////        {
////            int temp=n%2;
////            res=Integer.toString(temp)+res;
////            n=n/2;
////        }
////        System.out.println(t+" -- "+res);
////    }
////    public static void main(String args[])
////    {
////        int n=100;
////        for(int i=0;i<=n;i++)
////        {
////            binary(i);
////            if(i==n/2)
////                System.out.println("\n");
////        }
////    }
////
////}
//
////class Main
////{
////    public static void main(String args[])
////    {
////        for(int i=0;i<5;i++)
////        {
////            System.out.println();
////            for (int j=i+1;j<=5;j++)
////                System.out.print('*' +" ");
////        }
////        System.out.println();
////        for(int i=0;i<5;i++)
////        {
////            for(int j=0;j<=i;j++)
////                System.out.print('*'+" ");
////            System.out.println();
////        }
////    }
////}
//
////class Main
////{
////    public static void main(String args[])
////    {
////        for(int i=0;i<15;i++)
////            System.out.print("*");
////        for(int j=15;j>0;j--)
////        {
////            for(int i=0;i<15;i++)
////            {
////                if(i==j)
////                    System.out.print("*");
////                else
////                    System.out.print(" ");
////            }
////            System.out.println();
////        }
////        for(int i=0;i<15;i++)
////            System.out.print("*");
////    }
////}
//
////class Main
////{
////    static  boolean checkAP1(int arr[])
////    {
////        /*
////        Efficient Approach
////        1- For find or make an Ap we need two parameters
////          a-a(first value)
////          b-d(Common difference)
////          Sequence of AP :- a,a+d,a+2d,a+3d,a+3d,a+5d ....n
////          Algorithm
////          1- Find 'a' which is the minimum number in an array
////          2- Find d which is equal to 2nd minimum number-1st minimum number
////          3- Make a hashSet and store values of an array
////          4- make a loop for every a+d check whether it is present is hashmap or not if yes , remove it
////          5- if hashmap is empty return true, else return false.
////        */
////        HashSet<Integer>hs=new HashSet<>();
////        int a=Integer.MAX_VALUE;
////        int b=Integer.MAX_VALUE;
////        for(int i:arr)
////        {
////            if(i<a)
////            {
////                b=a;  a=i;
////            }
////            else if(i>a && b>i)
////                b=i;
////
////            hs.add(i);
////        }
////
////        if(hs.size()!=arr.length)
////            return false;
////        int first_val=a;
////        int commn_diff=b-first_val;
////        int temp=first_val;
////        for(int i=0;i<arr.length;i++)
////        {
////
////
////            if(hs.contains(temp)==true)
////                hs.remove(temp);
////
////
////            temp+=commn_diff;
////        }
////
////        if(hs.isEmpty()==true)
////            return true;
////
////        return false;
////
////    }
////    static boolean checkAP(int arr[])
////    {
////        // Approach 1
////        /*
////        For Ap , Mandotry conditions is that the difference between two
////                   consecutive number is same
////                   a1-a2=a2-a3=a3-a4=a4-a5....
////                   Algorith:
////                   1- Sort an Array (O(nlogn))
////                   2- make a loop and check for every consecutive number;
////         */
////
////        Arrays.sort(arr);
////        boolean flag=true;
////        int d=arr[1]-arr[0];
////        for(int i=0;i<arr.length-1;i++) {
////            if(arr[i+1]-arr[i]==d)
////                continue;
////            else{
////                flag=false;
////                break;
////            }
////        }
////        if(flag==true)
////            return true;
////
////        return false;
////    }
////    public static void main(String args [])
////    {
////        int arr[]={8,8,8};
//////        System.out.println(checkAP(arr));
////        System.out.println(checkAP1(arr));
////    }
////}
//
//
////class Main
////{
////    static int morning_assembly(int arr[])
////    {
////        /*
////        Question is , sort an array
////        1 move:- takes 1 unit cost
////        Move:-
////        1-choose element and put into first
////        2-choose element and put into last
////
////
////        Approach:-
////        If we find numbers whose relative order is perfect then we can easily find the numbers with wrong relative order
////        Ex:- 3,4,2,1,8,9,5,7,6
////        3,4,5,6 - Relative order is perfect for this, imperfect_order= (arr.length-perfect_order.length)
////        we can move any element in 1 unit of cost so the o/p will be length of Imperfect_relative Order
////
////        How to find length of perfect_relative order
////        1- Longest Consecutive Subsequence
////
////        O/p=arr.length-length(LCS)
////        */
////
////        // find LCS
////        int temp=0;
////        HashMap<Integer,Integer> hmp=new HashMap<>();
////        for(int i=0;i<arr.length;i++)
////        {
////            if(hmp.containsKey(arr[i]-1)==true)
////                hmp.put(arr[i],hmp.get(arr[i]-1)+1);
////            else
////                hmp.put(arr[i],1);
////        }
////        int result=0;
////        for(int i:hmp.keySet())
////        {
////            result=Math.max(result,hmp.get(i));
////        }
////
////        return arr.length-result;
////    }
////    public static void main(String args[])
////    {
////        int arr[]={4,3,1,2};
////
////        System.out.println(morning_assembly(arr));
////    }
////\
//
//
////class Main
////{
////    static boolean check_valid(String str)
////    {
////        /*
////        1- Make a frequency array
////        2- There are three cases
////                a- frequency of every character is same return true;
////                b- frequency of every character is same instead of 1 different frequency by 1  return true;
////                c- frequency of 1 character is 1 and other same return true;
////        */
////
////        HashMap<Character,Integer> hmp=new HashMap<>();
////        for(int i=0;i<str.length();i++)
////        {
////            if(hmp.containsKey(str.charAt(i))==true)
////            {
////                hmp.put(str.charAt(i),hmp.get(str.charAt(i))+1);
////            }
////            else
////                hmp.put(str.charAt(i),1);
////
////        }
////        int arr[]=new int[hmp.size()];
////        int ind=0;
////        for(int i:hmp.values())
////        {
////            arr[ind++]=i;
////        }
////        int count=0;
////        boolean flag=false;
////        for(int i=0;i<arr.length-1;i++)
////        {
////            if(arr[i]-arr[i+1]==0)
////                flag=true;
////            else if(Math.abs(arr[i]-arr[i+1])==1  && count<1)
////            {
////                flag = true;
////                count++;
////            }
////            else
////                {
////                    flag=false;
////                    break;
////                }
////        }
////
////        return flag;
////    }
////    public static void main(String args[])
////    {
////        String str="xxxxyyyyzzz";
////        System.out.println(check_valid(str));
////
////    }
////}
//
////class Main
////{
////    static int smallest(int n)
////    {
////        int j=0;
////        int arr[]=new int[50];
////        if(n<10)
////            return 10+n;
////        else
////            {
////                for(int i=9;i>1;i--)
////                {
////                    while (n%i==0)
////                    {
////                        n=n/i;
////                        arr[j++]=i;
////
////                    }
////                }
////                if(n>10)
////                    return 0;
////
////            }
////        int res=0;
////        for(int i=j-1;i>=0;i--)
////        {
////            res=res*10+arr[i];
////        }
////        return res;
////    }
////    public static void main(String args[])
////    {
////        System.out.println(smallest(35));
////    }
////}
//
//
////class Main
////{
////    public static void main(String args[])
////    {
////        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
////        pq.add(5);
////        pq.add(3);
////        pq.add(9);
////        pq.add(7);
////        pq.add(2);
////        pq.add(11);
////        pq.add(8);
////        while(!pq.isEmpty())
////        {
////            System.out.println(pq.poll());
////        }
////
//////        for(int i:pq)
//////            System.out.print(i+" ");
////    }
////}
//
////class Main
////{
////    public  static int no_of(int arr[][])
////    {
////        if(arr.length==0)
////            return 0;
////        HashMap<Integer,Integer>hmpx=new HashMap<>();
////        HashMap<Integer,Integer>hmpy=new HashMap<>();
////        HashMap<String,Integer>hmps=new HashMap<>();
////        int res=0;
////
////        for(int i=0;i<arr.length;i++)
////        {
////            int x=arr[i][0];
////            int y=arr[i][1];
////
////            if(hmpx.containsKey(x)==true)
////            {
////                res=res+hmpx.get(x);
////                hmpx.put(x,hmpx.get(x)+1);
////            }
////            else
////                hmpx.put(x,1);
////
////
////            if(hmpy.containsKey(y)==true)
////            {
////                res=res+hmpy.get(y);
////                hmpy.put(x,hmpy.get(y)+1);
////            }
////            else
////                hmpy.put(y,1);
////
////            String str=x+"*"+y;
////            if(hmps.containsKey(str)==true)
////            {
////                res=res-2*(hmps.get(str));
////                hmps.put(str,hmps.get(str)+1);
////            }
////            else
////                hmps.put(str,1);
////        }
////        return res;
////    }
////    public static  void main(String args[])
////    {
//////        int arr[][]={{1,4},{2,4},{1,5},{1,4},{6,4},{1,6},{1,4}};
////            int arr[][]={{1,1},{7,5}};
////        System.out.println(no_of(arr));
////
////    }
////}
//
////class Main
////{
////    static int count(int arr[],int k)
////    {
////        int res[]=new int[arr.length];
////        for(int i=0;i<res.length;i++)
////        {
////            res[i]=arr[i]%k;
////        }
////
////    }
////    public static void main(String args[])
////    {
////
////    }
////}
//
//
////class Main
////{
////    static  int anagram_move(String str1,String str2)
////    {
////        HashMap<Character,Integer>hmps1=new HashMap<>();
////        HashMap<Character,Integer>hmps2=new HashMap<>();
////        for(int i=0;i<str1.length();i++)
////        {
////            if(hmps1.containsKey(str1.charAt(i)))
////                hmps1.put(str1.charAt(i),hmps1.get(str1.charAt(i))+1);
////            else
////                hmps1.put(str1.charAt(i),1);
////        }
////
////        for(int i=0;i<str2.length();i++)
////        {
////            if(hmps2.containsKey(str2.charAt(i)))
////                hmps2.put(str2.charAt(i),hmps2.get(str2.charAt(i))+1);
////            else
////                hmps2.put(str2.charAt(i),1);
////        }
////        int count=0;
////        for(int i=0;i<hmps1.size();i++)
////        {
////            if(hmps1.get(str1.charAt(i))>hmps2.get(str2.charAt(i)))
////                count++;
////        }
////
////        return count;
////    }
////    public static void main(String args[])
////    {
////        String str1="abc";
////        String str2="efg";
////        System.out.println(anagram_move(str1,str2));
////    }
////}
//
////class Main
////{
////    static void countingsort(int arr[])
////    {
////        int res[]=new int[9];
////        for(int i=0;i<arr.length;i++)
////        {
////            ++res[arr[i]];
////        }
////        for(int i=1;i<res.length;i++)
////        {
////            res[i]=res[i]+res[i-1];
////        }
////        int res1[]=new int[res[res.length-1]];
////        for(int i=0;i<arr.length;i++)
////        {
////            res1[]
////        }
////    }
////    public static void main(String args[])
////    {
////        // Range given 0-9
////        int arr[]={1,4,1,2,7,5,2};
////        countingsort(arr);
////    }
////}
//
////
////
////class Main
////{
////    static class pair
////    {
////        int x;
////        int y;
////
////        public pair(int i, int i1) {
////        }
////    }
////    public static void main(String args[])
////    {
////        new pair(2,4);
////    }
////}
//
////class Main
////{
////    public static void main(String args[])
////    {
////        Map<String,List>hmp=new HashMap<>();
////        String str="ankit";
////        int count[]=new int[26];
////        for(int i=0;i<str.length();i++)
////        {
////            ++count[str.charAt(i)-'a'];
////        }
////        StringBuilder sb=new StringBuilder("");
////        for(int i:count)
////        {
////            sb.append(i);
////            sb.append('#');
////
////        }
////        String st="tinka";
////        int count1[]=new int[26];
////        for(int i=0;i<st.length();i++)
////        {
////            ++count1[st.charAt(i)-'a'];
////        }
////        StringBuilder s=new StringBuilder("");
////        for(int i:count)
////        {
////            s.append(i);
////            s.append('#');
////        }
//////        hmp.put(str,new ArrayList());
////        if(sb.toString()!=s.toString())
////            System.out.println("True");
////
////
////        System.out.println(sb.toString());
////        System.out.println(sb);
////    }
////}
//
//// Mod of frequency
////class Main
////{
////    public static void main(String args[])
////    {
////        Scanner st=new Scanner(System.in);
////        int t=st.nextInt();
////        while(t-->0)
////        {
////            int n=st.nextInt();
////            int arr[]=new int[n];
////            for(int i=0;i<arr.length;i++)
////                arr[i]=st.nextInt();
////
////            System.out.println(frequency(arr,n));
////
////        }
////    }
////    static int frequency(int arr[],int n)
////    {
////        HashMap<Integer,Integer>hmp=new HashMap<>();
////        for(int i=0;i<n;i++)
////        {
////            if(hmp.containsKey(arr[i]))
////                hmp.put(arr[i],hmp.get(arr[i])+1);
////            else
////                hmp.put(arr[i],1);
////        }
////        int res[]=new int[hmp.size()];
////        int max=0;
////        HashMap<Integer,Integer>hmp1=new HashMap<>();
////        for(int j: hmp.values())
////        {
////            if(hmp1.containsKey(j))
////                hmp1.put(j,hmp1.get(j)+1);
////            else
////                hmp1.put(j,1);
////
////            max=Math.max(max,hmp1.get(j));
////        }
////
////        // if many frequencies same return the small one  update this condition also
////        for(int i:hmp1.keySet()) {
////            if (hmp1.get(i) == max)
////                return i;
////        }
////        return -1;
////    }
////}
//
////class Main
////{
////    static int[] anagram_mapping(int arr1[],int arr2[])
////    {
////        int res[]=new int[arr1.length];
////        HashMap<Integer,Integer>hmp=new HashMap<>();
////        for(int i=0;i<arr2.length;i++)
////        {
////            hmp.put(arr2[i],i);
////        }
////        for(int i=0;i<arr1.length;i++)
////        {
////            res[i]=hmp.get(arr1[i]);
////        }
////        return res;
////    }
////    public static void main(String args[])
////    {
////        int arr1[]={12,28,46,32,50};
////        int arr2[]={50,12,32,46,28};
//////        System.out.println(anagram_mapping(arr1,arr2));
////        int res[]=anagram_mapping(arr1,arr2);
////        for(int i:res)
////            System.out.print(i+" ");
////    }
////}
//
////class Main
////{
////    static int unique(String str)
////    {
////        HashMap<Character,Integer>hmp=new HashMap<>();
////        int max=0;
////        int j=-1;
////        int i=0;
////        while(j<str.length())
////        {
////            while(j<str.length())
////            {
////                // acquire elements
////                j++;
////                if(hmp.containsKey(str.charAt(j))==true)
////                {
////                    hmp.put(str.charAt(j),hmp.get(str.charAt(j))+1);
////                    break;
////                }
////                else
////                    {
////                        hmp.put(str.charAt(j),1);
////                        max=Math.max(max,j-i+1);
////                    }
////            }
////            System.out.println(hmp.get(str.charAt(j)));
////            while(hmp.get(str.charAt(j))>1)
////            {
////                // release elements
////                hmp.put(str.charAt(i),hmp.get(str.charAt(i))-1);
////                if(hmp.get(str.charAt(i))==0)
////                    hmp.remove(str.charAt(i));
////
////
////                i++;
////            }
////            i=i+1;
////
////        }
////        return max;
////    }
////    public static void main(String args[])
////    {
////        System.out.println(unique("geeksforgeeks"));
////    }
////}
//
//
////
////class Main
////{
////    static int len(int arr[])
////    {
////        int temp=0;
////        HashMap<Integer,Integer> hmp=new HashMap<>();
////        int max=0;
////        for(int i=0;i<arr.length;i++)
////        {
////            temp=temp+arr[i];
////            if(hmp.containsKey(temp)==false)
////                hmp.put(temp,i);
////            else
////                {
////                    max=Math.max(max,i-hmp.get(temp));
////                }
////        }
////        System.out.println(hmp);
////        return max;
////    }
////    public static void main(String args[])
////    {
////        int arr[]={ -2, 2, -8, 1, 7, 10, -24};
////        System.out.println(len(arr));
////    }
////}
//
//
////class Main
////{
////    public static int binary(int arr[],int v)
////    {
////        if(arr.length==0)
////            return -1;
////        int lo=0;
////        int hi=arr.length-1;
////        int count=0;
////        while (lo<=hi)
////        {
////            int mid=lo+(hi-lo)/2;
////            if(arr[mid]==v)
////                return mid;
////            else if(arr[mid]>v)
////            {
////                hi=mid-1;
////            }
////            else if(arr[mid]<v)
////                lo=mid+1;
////
////
////            count++;
////        }
////        System.out.println(count);
////        return -1;
////
////    }
////    public static void main(String args[])
////    {
////        int arr[]={1,2,3,4,5,6,7,8,9,10,13,14,15,16,17,18,19,20};
////        System.out.println(binary(arr,21));
////    }
////}
//
////class Main
////{
////    static  int count(int arr[], int mid)
////    {
////        int count=0;
////        int temp=0;
////        for(int i: arr)
////        {
////            temp+=i;
////            if(temp>mid)
////            {
////                count++;
////                temp=i;
////            }
////            else if(temp==mid)
////            {
////                count++;
////                temp=0;
////            }
////        }
////        return count+1;
////    }
////    public static void main(String args[])
////    {
////        int arr[]={1,2,3,1,1};
////        int lo=0;
////        int hi=0;
////        for(int i:arr)
////        {
////            lo=Math.max(lo,i);
////            hi+=i;
////        }
////        // lo=10 hi=55
////        int ans=55;
////        int D=4;
////        while(lo<=hi)
////        {
////
////            int mid=(lo+hi)/2;
////            int req_day=count(arr,mid);
////            if(req_day<=D)
////            {
////                ans=mid;
////                hi=mid-1;
////            }
////            else  if(req_day>D)
////            {
////                lo=mid+1;
////            }
////        }
////
////        System.out.println(ans);
////    }
////}
//
//
////class Main
////{
////    static double median(int arr1[],int arr2[])
////    {
////        int lo=0;
////        int hi=arr2.length;
////        int grp_len=(arr1.length+arr2.length+1)/2;
////        int mid1=-1;
////        int mid2=-1;
////        while(lo<=hi)
////        {
////            mid1=(lo+hi)/2;
////            mid2=grp_len-mid1;
////            if(arr1[mid1-1]>arr2[mid2-1])
////                hi=mid1-1;
////            else if(arr2[mid2-1]>arr1[mid1])
////                lo=mid1+1;
////        }
////        int temp=Math.max(arr1[mid1-1],arr2[mid2-1]);
////        int temp2=Math.min(arr2[mid2-1],arr1[mid1]);
////        if((arr1.length+arr2.length)%2==0)
////            return (temp+temp2)/2;
////        else
////            return temp;
////    }
////    public static void main(String args[])
////    {
////        int arr1[]={1,9,12,18,24};
////        int arr2[]={4,7,10,11,16,19,22,23,26,27,28,29,30};
////        System.out.println(median(arr1,arr2));
////    }
////}
//
//
////class Main
////{
////    static int maximum_loot(int arr[])
////    {
////        int sum1 = arr[0];
////        int sum2 = 0;
////        int result;
////        for (int i = 1; i < arr.length; i++){
////            result = (sum1 > sum2) ? sum1 : sum2;
////            sum1 = sum2 + arr[i];
////            sum2 = result;
////        }
////        return ((sum1 > sum2) ? sum1 : sum2);
////    }
////    public static void main(String args[])
////    {
////        int arr[]={1,2,3};
////        System.out.println(maximum_loot(arr));
////    }
////}
//
//
////class Solution {
////
////    int counting(int[] piles,double k)
////    {
////        int count=0;
////        for(int i:piles)
////            count+=Math.ceil(i/k);
////
////        return count;
////    }
////    public int minEatingSpeed(int[] piles, int H) {
////
////        double lo=1;
////        double hi=0;
////        for(int i:piles)
////            hi=Math.max(hi,i);
////
////        // lo =1  hi = 11
////        while(lo<hi)
////        {
////            double mid=(lo+hi)/2;
////            int temp=counting(piles,mid);
////            System.out.println(temp);
////            if(temp>H)
////                lo=mid+1;
////            else
////                hi=mid;
////        }
////        return (int)lo;
////    }
////
////    public static void main(String args[])
////    {
////        int arr[]={};
////    }
//
//
////class Main
////{
////    public static void main(String args[])
////    {
////        int arr[]={9,8,7,6,5,4,3,2,1,9,8,7};
////        int count[]=new int[10];
////        int output[]=new int[arr.length];
////        for(int i=0;i<arr.length;i++)
////            ++count[arr[i]];
////
//////        for(int i: count)
//////            System.out.print(" "+i);
////        System.out.println();
////        for(int i=1;i<count.length;i++)
////        {
////            count[i]=count[i-1]+count[i];
////        }
////
////
////        for(int i=0;i<arr.length;i++)
////        {
////            output[count[arr[i]]-1]=arr[i];
////            --count[arr[i]];
////        }
////                for(int i:output)
////                  System.out.print(" "+ i);
////    }
////}
//
////class Main
////{
////    static  void reduced(int arr[],int k)
////    {
////        int lo=Integer.MAX_VALUE;
////        int hi=0;
////        int i=0;
////        int j=0;
////        while (k-->0)
////        {
//////            System.out.println("Inside while loop");
////            // 10 7 4 2 5
////            for(int a=0;a<arr.length;a++)
////            {
////                if(lo>arr[a])
////                {
////                    lo=arr[a];
////                    i=a;
////                }
////                if(arr[a]>hi) {
////                    hi = arr[a];
////                    j = a;
////                }
////            }
////
////            lo=Integer.MAX_VALUE;
////            hi=0;
////
//////             System.out.println(i +"  "+ j);
////
////            arr[i]=arr[i]*2;
////            if(arr[j]%2==0)
////                    arr[j]=arr[j]/2;
////            else
////                    arr[j]=(arr[j]/2)+1;
////        }
////
////        for(int c: arr)
////            System.out.print(" "+ c);
////    }
////    public static void main(String args[])
////    {
////        int arr[]={1,6,4,10,14,16};
////        int k=2;
////        reduced(arr,k);
////
////    }
////}
//
////class Main
////{
////    static int max_elem(int arr[],int n)
////    {
////        int maj_ind=0;  int count=1;
//////        1,2,3,4,1,1,1,1
////        for(int i=1;i<n;i++)
////        {
////            if(arr[maj_ind]==arr[i])
////                count++;
////            else
////                count--;
////
////            if(count==0)
////            {
////                count=1;
////                maj_ind=i;
////            }
////        }
////
////        int can=arr[maj_ind];
////        count=0;
////        for(int i: arr)
////        {
////            if(i==can)
////                count++;
////        }
////        if(count>= (n/2))
////            return can;
////        else
////            return 0;
////    }
////    public static void main(String args[])
////    {
////        int arr[]={1, 3, 3, 1, 3, 3, 1};
////        System.out.println(max_elem(arr,arr.length));
////    }
////}
//
//
//// next greater element
////class Main
////{
////    static int [] maximum(int arr[])
////    {
////        Stack <Integer> st=new Stack();
////        int res[]=new int[arr.length];
////        int ind=0;
////        st.push(arr[0]);
////        int element,next;
////        for(int i=1;i<arr.length;i++)
////        {
////            next=arr[i];
////            while (!st.isEmpty())
////            {
////                element=st.pop();
////                while (element<next)
////                {
////                  res[ind++]=element;
////                  if(st.isEmpty())
////                      break;
////                  element=st.pop();
////                }
////                if(element>next)
////                    st.push(element);
////
////            }
////            st.push(next);
////
////        }
////        return res;
////    }
////    public static void main(String args[])
////    {
////        int arr[]={11, 13, 21, 3 };
////        int res[]=maximum(arr);
////        for(int i:res)
////            System.out.print(" "+i);
////    }
////}
//
//// find the duplicate in an array  in O(1)  -> Totoise and hare algorithm
////class Main
////{
////    static int duplicate(int arr[])
////    {
////        int tortoise=arr[0];
////        int hare=arr[0];
////
////        do {
////                tortoise=arr[tortoise];
////                hare=arr[arr[hare]];
////            }while(tortoise!=hare);
////
////        tortoise=arr[0];
////
////
////        while(tortoise!=hare)
////        {
////            tortoise=arr[tortoise];
////            hare=arr[hare];
////
////        }
////        return hare;
////    }
////    public static void main(String args[])
////    {
////        int arr[]={1,3,4,2,2};
////        System.out.println(duplicate(arr));
////    }
////}
//
////
////public class Main {
////    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
////    public static int search(final int[] A, int B) {
////
////        int low=0;
////        int high=A.length-1;
////        while(low<high)
////        {
////            int mid=low+(high-low)/2;
////            if(A[mid]>A[high])
////            {
////                low=mid+1;
////            }
////            else
////                high=mid;
////        }
////
////
////
////        int pivot=low;
////
////        if(A[0]> A[A.length-1])
////        {
////            if(B > A[A.length-1])
////            {
////                low=0;
////                high=pivot;
////            }
////            else
////            {
////                low=pivot;
////                high=A.length-1;
////            }
////        }else
////        {
////            low=0;
////            high=A.length-1;
////        }
////
////        while(low<=high)
////        {
////            int mid=low+(high-low)/2;
////            if(A[mid]==B)
////                return mid;
////            else if(A[mid]>B)
////            {
////                high=mid-1;
////            }
////            else
////                low=mid+1;
////        }
////
////        return -1;
////    }
////
////    public static void main(String args[])
////    {
////        int arr[]={6,7,8,9,1,2,3,4,5};
////        System.out.println(search(arr,1));
////    }
////}
//
//
//// leaders in an array
//
////class Main
////{
////    static void leaders(int arr[])
////    {
////        int max=arr[arr.length-1];
////        System.out.print(max+" ");
////        for(int i=arr.length-2;i>=0;i--)
////        {
////            if(arr[i]>=max)
////            {
////                max=arr[i];
////                System.out.print(max+" ");
////            }
////        }
////    }
////    public static void main(String args[])
////    {
////        int arr[]={16, 17, 4, 3, 5, 2};
////        leaders(arr);
////    }
////}
//
////class Main
////{
////    static  int diff(int arr[])
////    {
////        int max=0;
////        for(int i=0;i<arr.length;i++)
////        {
////            for(int j=i+1;j<arr.length;j++)
////            {
////                if(arr[j]-arr[i]>0)
////                {
////                  max=Math.max(max,arr[j]-arr[i]);
////                }
////            }
////        }
////        return max;
////    }
////    public static void main(String args[])
////    {
////        int arr[]={7, 9, 5, 6, 3, 2};
////        System.out.println(diff(arr));
////    }
////}
//
////class Main
////{
////    static int closest(int n, int m)
////    {
////        if(n==0 || n%m==0)
////            return n;
////
////
////        int ans;
////        int temp=n/m;
//////        System.out.println(temp);
////        if(n>0 || m>0)
////        {
////            ans=temp*m;
////        }
////        else
////            {
////                ans=(temp-1)*m;
//////                System.out.println(" else run hua");
////            }
////
////        return ans;
////    }
////    public static void main(String args[])
////    {
////        int n=18;
////        int m=-7;
////        System.out.println(closest(n,m));
////    }
////}
//
////class Main
////{
////    public static void main(String args[])
////    {
////        int a=2;
////        int b=3;
////        a^=b;
////        b^=a;
////        a^=b;
////        System.out.println(a+" "+b);
////    }
////}
//
//
///*
//Program to find all the missing elements in the given range is discussed here. In this
//program, we have two inputs:
//An array of integers
//The start value and end value of the range
//The elements that are missing within the specified range is the expected output. For
//example, consider the array: arr = {1, 2, 3, 8, 9}. The start value is 1 and the end value is
//5. This means the range is 1 to 5. Here the missing elements are 4 and 5.
//*/
//
////class Main
////{
////
////    static  void missing(int arr[], int lo,int hi)
////    {
////        HashSet<Integer>hs=new HashSet<>();
////        for(int i: arr)
////        {
////            hs.add(i);
////        }
////        for(int i=lo;i<=hi;i++)
////        {
////            if(!hs.contains(i))
////                System.out.print(i+" ");
////        }
////    }
////    public static void main(String args[])
////    {
/////*
////            Input from User
////         Scanner sc=new Scanner(System.in);
////        int n=sc.nextInt();
////        int arr[]=new int[n];
////        for(int i=0;i<n;i++)
////        {
////            arr[i]=sc.nextInt();
////        }
////        int lo=sc.nextInt();
////        int hi=sc.nextInt();*/
////
////        int arr[]={1,2,3,8,9};
////        missing(arr,1,5);
////    }
////}
////
/////*
////Input :- int arr[]={1,2,3,8,9};
////            lo=1;
////            hi=5;
////Output :- 4 5
//// */
///*
//// Bubble sort
//class Main
//{
//    public static void main(String args[])
//    {
//      int arr[]={6,4,8,7,3,2,6,4,29,8,6,5};
//                                                                                // n=7  - i=0 - j=6
//                                                                                // n=7 - i=1 - j=5
//      for(int i=0;i<arr.length;i++)
//      {
//          for(int j=0;j<arr.length-i-1;j++)
//          {
//              if(arr[j]>arr[j+1])
//              {
//                  arr[j]=arr[j]^arr[j+1];
//                  arr[j+1]=arr[j]^arr[j+1];
//                  arr[j]=arr[j]^arr[j+1];
//              }
//          }
//      }
//
//      for(int val:arr)
//          System.out.print(" "+ val);
//    }
//}
////*/
////
////
////class Main
////{
////    public static void main(String args[])
////    {
////        int arr[]={};
////        int max=0;
////        int ind=0;
////        for(int i=0;i<arr.length;i++)
////        {
////            for(int j=0;j<arr.length-i;j++)
////            {
////                if(arr[j]>max)
////                {
////                    max=arr[j];
////                    ind=j;
////                }
////            }
////        }
////    }
////}
//
//
////class Main
////{
//
////    static int dp(int n)
////    {
////
////        int arr[]=new int[n+1];
////        Arrays.fill(arr,-1);
////        if(arr[n]==-1)
////        {
////            if(n==0 || n==1)
////                arr[n]=n;
////            else
////                arr[n]=dp(n-1)+dp(n-2);
////        }
////        return arr[n];
////    }
//
////    int dp(int n)
////    {
////        int dp[]=new int[n+1];
////        dp[0]=0;
////        dp[1]=1;
////
////        for(int i=2;i<=n;i++)
////        {
////            dp[i]=dp[i-1]+dp[i-2];
////        }
////
////        for(int i:dp)
////            System.out.print(i+" ");
////        return dp[n];
////    }
////    public static void main(String args[])
////    {
//////        Print fibonacci Series
////        Main mn=new Main();
////        System.out.println(mn.dp(9));
////    }
////}
//
///*
//
//class Main
//{
////    int lcs(String str,String str1, int m,int n)
////    {
////        if(m==0|| n==0)
////            return 0;
////
////        if(str.charAt(m-1)==str1.charAt(n-1))
////           return 1+lcs(str,str1,m-1,n-1);
////        else
////            return Math.max(lcs(str,str1,m,n-1),lcs(str,str1,m-1,n));
////
////    }
//
//    int lcs(String str,String str1, int m,int n)
//    {
//        int dp[][]=new int[m+1][n+1];
//        for(int i=0;i<=m;i++)
//        {
//            dp[0][i]=0;
//        }
//        for(int j=0;j<=n;j++)
//        {
//            dp[j][0]=0;
//        }
//
//        for(int i=1;i<=m;i++)
//        {
//            for(int j=1;j<=n;j++)
//            {
//                if(str.charAt(i-1)==str1.charAt(j-1))
//                    dp[i][j]=1+dp[i-1][j-1];
//                else
//                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
//            }
//        }
//        return dp[m][n];
//
//    }
//    public static void main(String args[])
//    {
//        Main mn=new Main();
//        String str="ABCDGH";
//        String str1="AEDFHR";
//        System.out.print(mn.lcs(str,str1,str.length(),str1.length()));
//    }
//}*/
//
////
////class Main
////{
////    static  int[] sum(int arr[],int sum)
////    {
////        int a[]=new int[2];
////        HashSet<Integer> hs=new HashSet<>();
////        for(int val: arr)
////            hs.add(val);
////        int j=0;
////
////        for(int i=0;i<arr.length;i++)
////        {
////            if(hs.contains(sum-arr[i]) )
////            {
////                a[0]=arr[i];
////                a[1]=sum-arr[i];
////            }
////        }
////        return a;
////    }
////    public static void main(String args[])
////    {
////        int arr[]={4, 6, 10, 15, 16};
////        int res[]=sum(arr,30);
////        System.out.println(res[0]+" "+res[1]);
////    }
////}
//
////
////class Main{
////    public Stack<Integer> sort(Stack<Integer> s)
////    {
////        //add code here.
////        int arr[]=new int[s.size()];
////        int ind=0;
////        while(!s.isEmpty())
////        {
////            arr[ind++]=s.pop();
////        }
////
////        Arrays.sort(arr);
////        Stack<Integer> st=new Stack<>();
////        for(int i: arr)
////        {
////            st.push(i);
////        }
////
////        return st;
////    }
////    public static void main(String args[])
////    {
////        Stack<Integer> st=new Stack<>();
////        st.push(11);
////        st.push(32);
////        st.push(3);
////        st.push(41);
////        Main mn=new Main();
////        Stack<Integer> res=mn.sort(st);
////        for(int i:res)
////            System.out.print(" "+i);
////
////    }
////}
//
///*
//import java.util.*;
//class Main
//{
//
//    static  int linear(int arr[],int k)
//    {
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]==k)
//                return i;
//        }
//        return -1;
//    }
//
//    static int binary(int arr[],int k)
//    {
//        if(arr.length==0)
//            return -1;
//
//        int start=0;
//        int end=arr.length-1;
//
//        while (start<=end)
//        {
//            int mid=start+(end-start)/2;
//            if(arr[mid]==k)
//                return mid;
//
//            if(arr[mid]<k)
//            {
//                start=mid+1;
//            }
//            else
//                end=mid-1;
//        }
//        return -1;
//    }
//    public static void main(String args[])
//    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Size of an Array");
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        System.out.println("Enter Array values");
//        for(int i=0;i<arr.length;i++)
//            arr[i]=sc.nextInt();
//
//        System.out.println("Which number do you find");
//        int k=sc.nextInt();
//        System.out.println("1- Linear Search");
//        System.out.println("2- Binary Search");
//        System.out.print(" Enter Choice :- ");
//        int choice=sc.nextInt();
//
//        switch (choice)
//        {
//            case 1:
//                {
//                    // Linear search
//                    System.out.println("Output :- "+linear(arr,k));
//                    break;
//                }
//            case 2:
//                {
//                    // binary Search
//                    System.out.println("Output :- "+binary(arr,k));
//                        break;
//                }
//            default:
//                {
//                    System.out.println("Wrong Choice");
//                }
//        }
//    }
//}*/
//
//
////class Main {
////    public static void main (String[] args) {
////        //code
//////        int arr[]={2,3,1,8,4,4};
////        int arr[]={2,3,0,1,4};
////        if(arr[0]<1)
////            return;
////
////        int count=1;
////        for(int i=0;i<arr.length; )
////        {
////            int j=arr[i];
////            int curr_max=0;
////            int curr_ind=0;
////            for(int k=i+1;k<=j;k++)
////            {
////                if(arr[k]>=curr_max)
////                {
////                    curr_max=arr[k];
////                    curr_ind=k;
////                }
//////                System.out.println(curr_max);
////            }
//////            System.out.println("outside inner");
////            if(curr_max+i>=arr.length ) {
//////                System.out.println("inside if");
////                System.out.println(count);
////                return;
////            }else if(curr_max==0 && curr_max+i<arr.length)
////                {
////                    System.out.println(-1);
////                    return;
////                }
////            i=curr_ind;
////            count++;
//////            System.out.println(i);
////        }
////    }
////}
////
////import java.util.*;
////class Main
////{
////    static String StringChallenge(String str)
////    {
////        StringBuilder sb=new StringBuilder();
////        for(int i=0;i<str.length()-1;i++)
////        {
////            int temp1=str.charAt(i)-'0';
////            int temp2=str.charAt(i+1)-'0';
////            if( temp1%2!=0 && temp2%2!=0)
////            {
////                sb.append(str.charAt(i));
////                sb.append('-');
////                sb.append(str.charAt(i+1));
////            }else
////                sb.append(str.charAt(i));
////        }
////        return sb.toString();
////    }
////    public static void main(String args[])
////    {
////        Scanner sc=new Scanner(System.in);
////        String str=sc.nextLine();
////        System.out.println(StringChallenge(str));
////    }
////}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////
////class Main
////{
////    static  boolean isprime(int n)
////    {
////        if(n==2)
////            return false;
////        for(int i=2;i*i<n;i++)
////        {
////            if(n%i==0)
////                return false;
////        }
////        return true;
////    }
////    static void prime(int n)
////    {
////        // code for check prime factorization
////
////        for(int i=2;i<=n;i++)
////        {
////            if(n%i==0 && !isprime(i))
////                System.out.print(i);
////        }
////    }
////
////    public static void main(String args[])
////    {
////        Scanner sc=new Scanner(System.in);
////        int n=sc.nextInt();
////       (prime(n));
////    }
////
////}
//
//
///*
//Write a generic program that takes maximum 30 characters from a input string S1, but without cutting the words.
//eg. "Featuring stylish rooms and moorings for recreation boats, Room Mate Aitana is a designer hotel built in 2013 on an island in the IJ River in Amsterdam."
//First 30 characters: "Featuring stylish rooms and mo"
//Smarter approach (max 30 characters, no words are broken): "Featuring stylish rooms and"*/
//
////
////class Main
////{
////    public static void main(String args[])
////    {
////        Scanner sc=new Scanner(System.in);
////        String str=sc.nextLine();
////
//////        if(str.length()<=30)
//////        {
//////            System.out.println(str);
//////            return;
//////        }
//////        StringBuilder sb=new StringBuilder();
//////        String op=str.substring(0,30);
//////        if(op.charAt(op.length()-1)==' ')
//////        {
//////            System.out.println(op);
//////            return;
//////        }
//////        int temp=0;
//////        for(int i=op.length();i>0;i--)
//////        {
//////            temp=i;
//////            if(op.charAt(i)==' ')
//////            {
//////                break;
//////            }else
//////                sb.append(op.charAt(i));
//////        }
//////        String res=sb.toString();
////        int count=1;
////        int j=0;
////        StringBuilder sb=new StringBuilder();
////        for(int i=0;i<str.length();i++)
////        {
////            if(str.charAt(i)==' ' && count<31)
////            {
////                sb.append(str.substring(j,i+1));
////                sb.append(' ');
////                j=i+1;
////            }
////            else if(count>31)
////                break;
////
////            count++;
////        }
////        System.out.println(sb.toString());
////    }
////}
//
//
//
////class Main
////{
////    public static void main(String args[])
////    {
////        Scanner sc=new Scanner(System.in);
////        int n=sc.nextInt();
////        if(n<1)
////        {
////            System.out.println(0);
////        }
//////        System.out.print(1+" ");
////        for(int i=1;i<=n/2;i++)
////        {
////            if(n%i==0)
////            System.out.print(i+" ");
////        }
////        System.out.print(n);
////    }
////}
//
//// Graph
////class Main
////{
////    static void addEdge(ArrayList<ArrayList<Integer>>adj,int u, int v)
////    {
////        adj.get(u).add(v);
////        adj.get(v).add(u);
////    }
////    static  void print(ArrayList<ArrayList<Integer>> adj)
////    {
////        for(int i=0;i<adj.size();i++)
////        {
////            System.out.println(i);
////            for(int j=0;j<adj.get(i).size();j++)
////            {
////                System.out.print(" ---->  "+adj.get(i).get(j));
////            }
////        }
////    }
////    public static void main(String args[])
////    {
////        int v=5;
////        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>(v);
////
////        for(int i=0;i<v;i++)
////        {
////            al.add(new ArrayList<Integer>());
////        }
////        addEdge(al,0,1);
////        addEdge(al,0,2);
////        addEdge(al,1,2);
////        addEdge(al,1,3);
////        print(al);
////    }
////}\
//
//
//
///*class Main
//{
//    public static void add(ArrayList<ArrayList<Integer>>adj,int u,int v)
//    {
//        adj.get(u).add(v);
//        adj.get(v).add(u);
//    }
//    public static void BFS(ArrayList<ArrayList<Integer>>adj,int v)
//    {
//        boolean arr[]=new boolean[v+1];
//        for(int i=0;i<arr.length;i++)
//        {
//            arr[i]=false;
//        }
//        Queue<Integer> qu=new LinkedList<>();
//        int s=1;
//        arr[s]=true;
//        qu.add(s);
//        while(!qu.isEmpty())
//        {
//            int u=qu.poll();
//            System.out.print(u);
//            for(int x: adj.get(u))
//            {
//               if(arr[x]==false)
//               {
//                   arr[x]=true;
//                   qu.add(x);
//               }
//            }
//
//        }
//    }
//    public static void main(String args[])
//    {
//        int v=5;
//        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
//        for(int i=0;i<v;i++)
//        {
//            adj.add(new ArrayList<Integer>());
//        }
//        add(adj,0,1);
//        add(adj,0,4);
//        add(adj,1,2);
//        BFS(adj,v);
//    }
//}*/
//
//// BFS
///*
//class Main
//{
//    public static void addedge(ArrayList<ArrayList<Integer>>adj ,int u, int v)
//    {
//        adj.get(u).add(v);
//        adj.get(v).add(u);
//    }
//    public static void BFS(ArrayList<ArrayList<Integer>>adj,int v)
//    {
//        boolean visited[]=new boolean[v+1];
//        for(int i=1;i<=v;i++)
//        {
//            visited[i]=false;
//        }
//        Queue<Integer> qu=new LinkedList<>();
//        int s=1;
//        visited[s]=true;
//        qu.add(s);
//        while(qu.size()!=0)
//        {
//            s=qu.poll();
//            System.out.print(s+" ");
//
//            for(int i=0;i<adj.get(s).size();i++)
//            {
//                int newnode=adj.get(s).get(i);
//                if(visited[newnode]==false)
//                {
//                    visited[s]=true;
//                    qu.add(newnode);
//                }
//            }
//        }
//    }
//    public static void main(String args[])
//    {
//        int v=5;
//        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v+1);
//        for(int i=0;i<v;i++)
//        {
//            adj.add(new ArrayList<Integer>());
//        }
//        addedge(adj,1,2);
//        addedge(adj,1,3);
//        addedge(adj,2,4);
//        addedge(adj,2,5);
//        addedge(adj,3,5);
//        addedge(adj,4,5);
//        addedge(adj,4,6);
//        addedge(adj,5,6);
//
//    }
//}*/
//
//
///*
//class Main
//{
//    static void addedge(ArrayList<ArrayList<Integer>>adj,int u, int v)
//    {
//        adj.get(u).add(v);
//        adj.get(v).add(u);
//    }
//
//    private static void BFS(ArrayList<ArrayList<Integer>>adj,int v)
//    {
//        boolean visited[]=new boolean[v+1];
//        for(int i=0;i<adj.size();i++)
//            visited[i]=false;
//
//        int s=1;
//        Queue<Integer> qu=new LinkedList<>();
//        qu.add(s);
//        visited[s]=true;
//
//        while (!qu.isEmpty())
//        {
//            int u=qu.poll();
//            System.out.print(u+" ");
//            for(int p:adj.get(u))
//            {
//                if(visited[p]==false)
//                {
//                    visited[p]=true;
//                    qu.add(p);
//                }
//            }
//        }
//    }
//    public static void main(String args[])
//    {
//        int v=7;
//        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
//        for (int i=0;i<v;i++)
//        {
//            adj.add(new ArrayList<Integer>());
//        }
//        addedge(adj,0,1);
//        addedge(adj,0,2);
//        addedge(adj,1,2);
//        addedge(adj,1,3);
//        addedge(adj,3,5);
//        addedge(adj,4,5);
//        addedge(adj,4,6);
//        addedge(adj,5,6);
//        BFS(adj,v);
//    }
//}*/
//
//
//// Tree
//// Implement a Tree
//
////class Node
////{
////    Node left;
////    Node right;
////    int data;
////    Node(int x)
////    {
////        data=x;
////    }
////}
///*
//class Main
//{
//    private static void print(Node root)
//    {
//        if(root==null)
//            return;
//
//        // LRootR-inorder    PreOrder:Root,left,right   PostOrder:Left,right,root
//        System.out.print(root.data+" ");
//        print(root.left);
//        print(root.right);
//    }
//    public static void main(String args[])
//    {
//        Node root=new Node(5);
//        root.left=new Node(7);
//        root.right=new Node(9);
//        root.left.left=new Node(11);
//        root.left.right=new Node(13);
//        root.right.left=new Node(15);
//        root.right.right=new Node(17);
//        print(root);
//    }
//}*/
//
//
//// Depth first Search
//
///*
//class Main
//{
//    private static void DFS(Node root)
//    {
//        if(root==null)
//            return;
//        Queue<Node>qu=new LinkedList<>();
//        qu.add(root);
//        while (!qu.isEmpty())
//        {
//            Node temp=qu.poll();
//            System.out.print(temp.data+" --> ");
//            if(temp.right!=null)
//                qu.add(temp.right);
//            if(temp.left!=null)
//                qu.add(temp.left);
//        }
//    }
//
//    public static void main(String args[])
//    {
//        Node root=new Node(5);
//        root.left=new Node(7);
//        root.right=new Node(9);
//        root.left.left=new Node(11);
//        root.left.right=new Node(13);
//        root.right.left=new Node(15);
//        root.right.right=new Node(17);
//        DFS(root);
//    }
//}*/
//
//
////DP
//
//// Fibbpnaci series
//
///*
//class Main
//{
//    private static int fib(int n)       // reverse function
//    {
//        if(n<2)
//            return n;
//        else
//            return fib(n-1)+fib(n-2);
//    }
//    static int dp(int n)
//    {
//        int dp[]=new int[n+1];
//        Arrays.fill(dp,-1);
//        dp[0]=0;
//        dp[1]=1;
//        for(int i=2;i<=n;i++)
//        {
//            if(dp[i]==-1)
//                dp[i]=dp[i-1]+dp[i-2];
//
//        }
//        return dp[n];
//    }
//    public static void main(String args[])
//    {
//        System.out.println(dp(9));
//    }
//}*/
//
//// Knapsack
///*
//class Main
//{
//    private static int knapsack(int wt[],int v[],int W,int n)
//    {
//        int arr[]=new int[W+1];
//        if(n==0)
//            return 0;
//        if(v.length==0)
//            return 0;
//
//        if(wt[n-1]>W)
//            return knapsack(wt,v,W,n-1);
//        else
//            return v[n-1]+knapsack(wt,v,W-wt[n-1],n-1);
//    }
//
////    private static int dp(int wt[],int v[],int W,int n)
////    {
////        int dp[][]=new int[n+1][W+1];
////        for(int row[]:dp)
////            Arrays.fill(dp,-1);
////
////        if(n==0 || W==0)
////            return dp[n][W]=0;
////
////        if(dp[n][W]!=-1)
////            return dp[n][W];
////
////
////    }
//    public static void main(String args[])
//    {
//        int wt[]={1,1,1};
//        int v[]={10,20,30};
//        int W=2;
//        System.out.println(knapsack(wt,v,W,wt.length));
//    }
//}*/
//
//
///*
//* Graph
//* Implement graph, BFS
//* DFS
//* Detct cycle in Undirected Graph
//* Tree
//* Size of binary Tree
//* Maximum in binery Tree
//* DP
//* 0/1 knapsack
//* */
//
////class Main
////{
////    private static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
////    {
////        adj.get(u).add(v);
////        adj.get(v).add(u);
////    }
////
////    private static void BFS(ArrayList<ArrayList<Integer>> adj,int v)
////    {
////        boolean arr[]=new boolean[v+1];
////        Arrays.fill(arr,false);
////        int s=0;
////        Queue<Integer> qu=new LinkedList<>();
////        qu.add(s);
////        arr[s]=true;
////
////        while (!qu.isEmpty())
////        {
////            s=qu.poll();
////            System.out.print(s+" ");
////            for(int u:adj.get(s))
////            {
////                if(arr[u]==false)
////                {
////                    arr[u]=true;
////                    qu.add(u);
////                }
////            }
////        }
////    }
////    public static void main(String args[])
////    {
////        int v=6;
////        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>(v);
////        for(int i=0;i<v;i++)
////        {
////            al.add(new ArrayList<Integer>());
////        }
////        addEdge(al,0,1);
////        addEdge(al,1,2);
////        BFS(al,v);
////    }
////}
//
////DFS Depth first Search
//
////Size of binary tree
////class Node
////{
////    Node left;
////    Node right;
////    int data;
////    Node(int x)
////    {
////        data=x;
////    }
////}
////class Main
////{
////    private static int max(Node root)
////    {
////        if(root==null)
////            return Integer.MIN_VALUE;
////        else
////            return Math.max(root.data,Math.max(max(root.left),max(root.right)));
////    }
////    private static int size(Node root)
////    {
////        if(root==null)
////            return 0;
////
////        return 1+size(root.left)+size(root.right);
////    }
////    private static int height(Node root)
////    {
////        if(root==null)
////            return 0;
////        return Math.max(height(root.left),height(root.right))+1;
////    }
////    public static void main(String args[])
////    {
////        Node root=new Node(5);
////        root.left=new Node(7);
////        root.right=new Node(9);
////        root.left.left=new Node(11);
////        root.left.right=new Node(13);
////        root.right.left=new Node(15);
////        root.right.right=new Node(17);
////        System.out.println(max(root));
////        System.out.println(size(root));
////        System.out.println(height(root));
////    }
////}
//// DP 0/1 Knapsack
///*
//* Equal sum partition
//* minimum subset sum
//* count the number of subset with the given difference
//* Target sum
//* Unbounded knapsack
//* */
////
////class Main
////{
////    public static void main(String args[])
////    {
////        int arr[]={1,1,1,1,1,1,0,0,0,00,0};
////
////        int n=arr.length;
//////        int res[]=new int[n];
////        int start=0;
////        int end=n-1;
////        while(start<end)
////        {
////            if(arr[start]==1)
////            {
////                int temp=arr[start];
////                 arr[start]=arr[end];
////                 arr[end]=temp;
////                 end--;
////
////            }
////            else
////                {
////                    start++;
////                }
////        }
////        for(int i:arr)
////        {
////            System.out.print(i+" ");
////        }
////    }
////}
//
//
///*
//class Main
//{
//    static int knapsack(int weight[],int value[],int n,int w)
//    {
//        if(n==0 || w==0)
//            return 0;
//        if(weight[n-1]>w)
//            return knapsack(weight,value,n-1,w);
//
//        else
//        return Math.max(knapsack(weight,value,n-1,w),value[n-1] + knapsack(weight,value,n-1,w-weight[n-1]));
//
//    }
//    static int knapsack(int W,int wt[],int val[],int n)
//    {
//        int i,w;
//        int k[][]=new int[n+1][W+1];
//
//        for(i=0;i<=n;i++)
//        {
//            for(w=0;w<=W;w++)
//            {
//                if(i==0 || w==0)
//                    k[i][w]=0;
//                else if(wt[i-1]<=w)
//                    k[i][w]=Math.max(val[i-1]+k[i-1][w-wt[i-1]],k[i-1][w]);
//                else
//                    k[i][w]=k[i-1][w];
//            }
//        }
//        return k[n][W];
//    }
//    public static void main(String args[])
//    {
//        int weight[]={10,20,30};
//        int value[]={60,100,120};
//        System.out.println(knapsack(weight,value,weight.length,50));
//        System.out.println(knapsack(50,weight,value,weight.length));
//    }
//}*/
//
////
////class Main
////{
////    static boolean subset(int set[],int n,int sum)
////    {
////        if(sum==0)
////            return true;
////        if(n==0)
////            return false;
////
////        if(set[n-1]>sum)
////            return subset(set,n-1,sum);
////
////        return subset(set,n-1,sum)|| subset(set,n-1,sum-set[n-1]);
////    }
////    public static void main(String args[])
////    {
////        int set[]={3,4,5,2};
////        System.out.println(subset(set,set.length,6));
////    }
////}
//
//// n_root_n algorithm
///*
//class Main
//{
//    static  boolean isprime(int n)
//    {
//        if(n<3)
//            return true;
//        for(int i=2;i*i<=n;i++)
//        {
//            if(n%i==0)
//                return  false;
//        }
//        return true;
//    }
//    public static void main(String args[])
//    {
//        System.out.println(isprime(20));
//    }
//}*/
//
////but we want to solve this in to n
////
//
//
///*class Node
//{
//    Node left;
//    Node right;
//    int data;
//    Node(int x)
//    {
//        data=x;
//    }
//}
//class Main
//{
//    static int max=0;*/
///*    static void Level(Node root)
//    {
//        if(root==null)
//            return;
//        Queue<Node> qu=new LinkedList<>();
//        qu.add(root);
//        while (!qu.isEmpty())
//        {
//            Node temp=qu.poll();
//            System.out.print(temp.data+" ");
//            if(temp.left!=null)
//                qu.add(temp.left);
//            if(temp.right!=null)
//                qu.add(temp.right);
//        }
//    }
//    static void revLevel(Node root)
//    {
//        if(root==null)
//            return;
//        Queue<Node> qu=new LinkedList<>();
//        Stack<Integer> st=new Stack<>();
//        qu.add(root);
//        while (!qu.isEmpty())
//        {
//            Node temp=qu.poll();
//            st.push(temp.data);
////            System.out.print(temp.data+" ");
//            if(temp.right!=null)
//                qu.add(temp.right);
//            if(temp.left!=null)
//                qu.add(temp.left);
//        }
//        while (!st.isEmpty())
//        {
//            System.out.print(st.peek()+" ");
//            st.pop();
//        }
//    }
//    static int height(Node root)
//    {
//        if(root==null)
//            return 0 ;
//
//        return Math.max(height(root.left),height(root.right))+1;
//    }*/
///*
//    static int diameter(Node root)
//    {
//        if(root==null)
//            return 0;
//
//        int left=diameter(root.left);
//        int right=diameter(root.right);
//        max=Math.max(max,left+right);
//        return Math.max(left,right)+1;
//
//    }*/
///*
//    static void inorder(Node root)
//    {
//        if(root==null)
//            return;
//        inorder(root.left);
//        System.out.print(root.data+" ");
//        inorder(root.right);
//    }*/
//
///*    static void inorder(Node root)
//    {
//        if(root==null)
//            return;
//        Stack<Node> st=new Stack<>();
//        Node curr=root;
////        st.push(curr);
//        while (!st.isEmpty() || curr!=null)
//        {
//            if(curr!=null)
//            {
//                st.push(curr);
//                curr=curr.left;
//            }else
//                {
//                    curr=st.pop();
//                    System.out.print(curr.data+" ");
//                    curr=curr.right;
//                }
//        }
//    }*/
///*
//static void preorder(Node root)
//{
//    if(root==null)
//        return;
//    Stack<Node> st=new Stack<>();
//    st.push(root);
//    while (!st.isEmpty())
//    {
//        Node curr=st.pop();
//        System.out.print(curr.data+" ");
//
//        if(curr.right!=null)
//            st.push(curr.right);
//        if(curr.left!=null)
//            st.push(curr.left);
//    }
//}*/
///*    public static void bottomview(Node root)
//    {
//    wrong
//        if(root==null)
//            return;
//        Queue<Node> qt=new LinkedList<>();
//        qt.add(root);
//        while (!qt.isEmpty())
//        {
//            Node temp=qt.poll();
//            if(temp.left==null && temp.right==null)
//                System.out.print(temp.data+" ");
//
//            if(temp.left!=null)
//                qt.add(temp.left);
//            if(temp.right!=null)
//                qt.add(temp.right);
//        }
//    }
//    */
///*
//public static void topview(Node root)
//{
//    // wrong
//    if(root==null)
//        return;
//    Queue<Node> qt=new LinkedList<>();
//    qt.add(root);
//    while (!qt.isEmpty())
//    {
//        Node temp=qt.poll();
//        if(temp.left==null && temp.right==null )
//            System.out.print(temp.data+" ");
//
//        if(temp.left!=null)
//            qt.add(temp.left);
//        if(temp.right!=null)
//            qt.add(temp.right);
//    }
//}
//
//    public static void main(String args[])
//    {
//        Node root=new Node(5);
//        root.left=new Node(7);
//        root.right=new Node(9);
//        root.left.left=new Node(11);
//        root.left.right=new Node(13);
//        root.right.left=new Node(15);
//        root.right.right=new Node(17);
////        Level(root);
////        revLevel(root);
////        System.out.println(height(root));
////        System.out.println(diameter(root));
////        inorder(root);
////        inorder(root);
////        preorder(root);
////        bottomview(root);
//        topview(root);
//
//    }
//
//}*/
//
//
//// Java program to find number of operations
//// to make an array palindrome
//
///*
//class Main
//{
//    // Returns minimum number of count operations
//    // required to make arr[] palindrome
//    static int findMinOps(int[] arr, int n)
//    {
//        int ans = 0; // Initialize result
//
//        // Start from two corners
//        for (int i=0,j=n-1; i<=j;)
//        {
//            // If corner elements are same,
//            // problem reduces arr[i+1..j-1]
//            if (arr[i] == arr[j])
//            {
//                i++;
//                j--;
//            }
//
//            // If left element is greater, then
//            // we merge right two elements
//            else if (arr[i] > arr[j])
//            {
//                // need to merge from tail.
//                j--;
//                arr[j] += arr[j+1] ;
//                ans++;
//            }
//
//            // Else we merge left two elements
//            else
//            {
//                i++;
//                arr[i] += arr[i-1];
//                ans++;
//            }
//        }
//
//        return ans;
//    }
//
//    // Driver method to test the above function
//    public static void main(String[] args)
//    {
//        int arr[] = new int[]{11,14,15,16,17,19,8,11} ;
//        System.out.println("Count of minimum operations is "+
//                findMinOps(arr, arr.length));
//
//    }
//}*/
//
//
///*
//class Main
//{
//    public static void main(String args[])
//    {
//        int arr[]={3,2,1,2,7};
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length-1;i++)
//        {
//            if(arr[i]==arr[i+1])
//                arr[i+1] +=1;
//        }
//        int sum=0;
//        for(int k:arr)
//            sum+=k;
//
//        System.out.println(sum);
//    }
//}*/
//
//
//import java.util.*;
//
//class Main{
//
//    // Prints sums of all subsets of array
//    static void subsetSums(int arr[], int n)
//    {
//
//        // There are totoal 2^n subsets
//        int total = 1 << n;
//
//        // Consider all numbers from 0 to 2^n - 1
//        for(int i = 0; i < total; i++)
//        {
//            int sum = 0;
//
//            // Consider binary reprsentation of
//            // current i to decide which elements
//            // to pick.
//            for(int j = 0; j < n; j++)
//                if ((i & (1 << j)) != 0)
//                    sum += arr[j];
//
//            // Print sum of picked elements.
//            System.out.print(sum + " ");
//        }
//    }
//
//    // Driver code
//    public static void main(String args[])
//    {
//        int arr[] = new int[]{ 7,8,9,10 };
//        int n = arr.length;
//
//        subsetSums(arr, n);
//    }
//}


/*
class Main
{
    public static void main(String args[])
    {

//        String str="progxrammerxxproxgxrammerxxprogrammer";
        String str="progankitrammerbamalprognitinrammer";
        String fix="programmer";
        int i=0;
        int j=0;
        int count=0;
        while (i<str.length())
        {

            if(str.charAt(i)==fix.charAt(j))
            {
                i++;
                j++;
            }
            else
                i++;


            if(j==fix.length())
            {
                System.out.println(j);
                count++;
                j=0;
            }
        }

        System.out.println(count);
    }
}*/

/*
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node
{
    Node left;
     Node right;
     int data;
     Node(int x)
     {
         data=x;
     }
}
class Main
{
    static void preorder(Node root)
{
    if(root==null)
        return;
    Stack<Node> st=new Stack<>();
    st.push(root);
    while (!st.isEmpty())
    {
        Node curr=st.pop();
        System.out.print(curr.data+" ");

        if(curr.right!=null)
            st.push(curr.right);
        if(curr.left!=null)
            st.push(curr.left);
    }
}
    static void LeftView(Node root)
    {
        if(root==null)
            return;
        Queue<Node>qu=new LinkedList<>();
        qu.add(root);
        while (!qu.isEmpty())
        {
            Node temp=qu.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
                qu.add(temp.left);
            if(temp.right!=null)
                qu.add(temp.right);
        }
    }
    public static void main(String args[])
    {
        Node root=new Node(5);
        root.left=new Node(7);
        root.right=new Node(9);
        root.left.left=new Node(11);
        root.left.right=new Node(13);
        root.right.left=new Node(15);
        root.right.right=new Node(17);
        LeftView(root);
    }

}
*/

/*
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        String str="1234";
        char ch[]=str.toCharArray();
        int i=0;
        int j=ch.length-1;
        // Reverse a string
        while (i<j)
        {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:ch)
            sb.append(c);
        String reverse=sb.toString();           // store into reverse after reverse a string
        Scanner sc=new Scanner(System.in);
        String Input=sc.nextLine(); // user Input
        if(reverse.equals(Input))
            System.out.println(false);
        else
            System.out.println(true);

    }
}*/


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.PixelGrabber;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.*;
import java.util.List;

/*
class Node
{
    Node next;
    int data;
    Node (int x)
    {
        data=x;
    }
}

class Main
{
    void display(Node head)
    {
        if(head==null)
            return;
        while (head!=null)
        {
            System.out.print(head.data+" ---> ");
            head=head.next;
        }
    }
    static Node rev(Node head)
    {
        if(head==null)
            return null;
        Node curr=head;
        Node next=null;
        Node prev=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String args[])
    {
        Node head=new Node(10);
        head.next=new Node(11);
        head.next.next=new Node(12);
        head.next.next.next=new Node(13);
        head.next.next.next.next=new Node(14);
        Main mn=new Main();
        mn.display(head);
        System.out.println();
       head= rev(head);
        mn.display(head);
    }
}*/
/*
class Main
{
    public static void main(String args[])
    {
        String str="}{{}}{{{";
        Stack<Character> st=new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if (c =='}' && !st.empty())
            {
                if (st.peek()=='{')
                    st.pop();
                else
                    st.push(c);
            }
            else
                st.push(c);
        }
        if(st.size()==0)
        {
            System.out.println(0);
            return;
        }

        int oc=0;
        int cl=0;

        for(char ch:st)
        {
            if(ch=='(' || ch=='{' || ch=='[')
                oc++;
            else
                cl++;
        }
        System.out.println(oc +" "+ cl);
        if(oc%2==0 && cl%2==0)
            System.out.println(oc/2 + cl/2);
        else if(oc%2!=0 && cl%2!=0)
            System.out.println(oc/2+cl/2+2);
        else
            System.out.println(-1);
    }
}*/


//class Main
//{
//    public static void main(String args[])
//    {
//        Stack<Integer> st=new Stack<>();
//        int arr[]={4,5,2,25};
//        st.push(arr[0]);
//
//        for(int i=1;i<arr.length;i++)
//        {
//            if(arr[i]<st.peek())
//                st.push(arr[i]);
//            else
//                {
//                    while (!st.isEmpty() && st.peek()<arr[i] )
//                    {
//                        System.out.println(st.pop()+" "+ arr[i]);
//                    }
//                    st.push(arr[i]);
//                }
//        }
////        System.out.println(arr[arr.length-1]+" "+ -1);
//        while(!st.isEmpty())
//            System.out.println(st.pop()+" "+ -1);
//    }
//
//}

/*
class Solution
{
    public boolean isValid(String s)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                st.push(s.charAt(i));

            else
            {
                if(s.charAt(i)==')')
                {
                    if(st.peek()!='(' || st.isEmpty())
                        return false;
                }
                else if(s.charAt(i)=='}')
                {
                    if(st.peek()!='{' || st.isEmpty())
                        return false;
                }
                else if(s.charAt(i)==']')
                {
                    if(st.peek()!='[' || st.isEmpty())
                        return false;
                }
            }
        }
        return st.isEmpty();
    }
}*/


/*
class Main
{
    public static void main(String args[])
    {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(3);
        if(st.peek()==3 || st.size()==2)
            System.out.println(st.size()+"--- ");
        else
            System.out.println(st.size());
    }
}*/


/*
class Main
{
    public static void main(String args[])
    {
        String str="{{{{}}";
//        char arr[]=str.toCharArray();
        Stack<Character> st=new Stack<>();
//        System.out.println(st.peek());
        for(int i=0;i<str.length();i++)
        {
            if(!st.isEmpty() && str.charAt(i)=='}' && st.peek()=='{')
                st.pop();
            else
                st.push(str.charAt(i));
        }
        int ob=0;
        int cb=0;
        for(int i:st)
        {
            if(i=='{')
                ob++;
            else
                cb++;
        }
        if(ob%2==0 && cb%2==0)
        {
            System.out.println(ob/2 + cb/2);
            return;
        }
        else if(ob%2!=0 && cb%2!=0)
            System.out.println(ob/2+cb/2+2);
        else
            System.out.println(-1);
    }
}*/


/*
class Main
{
    public static void main(String args[])
    {
        String str="(a+(b)+(c+d))";
        Stack<Character> st=new Stack<>();
        for(int i=1;i<str.length()-1;i++)
        {
            if(str.charAt(i)!=')')
                st.push(str.charAt(i));
            else
                {
                    int elem=0;
                    while (st.peek() !='(')
                    {
                        elem++;
                        st.pop();
                    }
                    if(elem<1)
                    {
                        System.out.println("Douplicacy");
                        return;
                    }
                }
        }
        System.out.println("Non Douplicacy");
    }
}*/

/*
class Main
{
    public static void main(String args[])
    {
        Queue<Integer> qu=new LinkedList<>();
        int k=5;
        qu.add(10);qu.add(20);qu.add(30);qu.add(40);qu.add(50);qu.add(60);qu.add(70);qu.add(80);qu.add(90);qu.add(100);
        Stack<Integer> st=new Stack<>();
        int size=qu.size();
*/
/*        int count=0;
        while (count<k)
        {
            st.push(qu.poll());
            count++;
        }
        while (!st.isEmpty())
        {
            qu.add(st.pop());
        }
        System.out.println(st);
        System.out.println(qu);*//*

        int count=1;
        while(count<=size)
        {
            int count1=0;
            while(count1<k)
            {
                st.push(qu.poll());
                count1++;
            }
            while(!st.isEmpty())
            {
                qu.add(st.pop());
            }
            count+=k;
        }
        System.out.println(qu);
    }
}*/


/*
class Main
{
    public static void main(String args[])
    {
        Queue<Integer> qu=new LinkedList<>();
        int k=5;
        qu.add(10);qu.add(20);qu.add(30);qu.add(40);qu.add(50);qu.add(60);qu.add(70);qu.add(80);qu.add(90);qu.add(100);
        Stack<Integer> st=new Stack<>();
        if (qu.isEmpty() == true
                || k > qu.size())
            return;
        if (k <= 0)
            return;
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < k; i++) {
            stack.push(qu.peek());
            qu.remove();
        }
        while (!stack.empty()) {
            qu.add(stack.peek());
            stack.pop();
        }
        for (int i = 0; i < qu.size() - k; i++) {
            qu.add(qu.peek());
            qu.remove();
        }

        System.out.println(qu);
    }
}*/

/*
class Main
{
    public static void main(String args[])
    {
        int n=5;
        int j=2;
        System.out.println(Math.ceil((double) n/2.0));
    }
}*/


/*
class Main
{
    public static void main(String args[])
    {
        int twod[][]=new  int[4][4];
        int inx=0;
*/
/*        System.out.println(twod.length);
        System.out.println(twod[0].length);*//*

        for(int i=0;i<twod.length;i++)
        {
            for(int j=0;j<twod[0].length;j++)
            {
                twod[i][j]=inx++;
            }
        }
        for(int i=0;i<twod.length;i++)
        {
            for(int j=0;j<twod[0].length;j++)
            {
                System.out.print(twod[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/


/*
class Main
{
    int arr[]=new int[7];
    int i=-1;
    void push(int ele)
    {
        if(i==arr.length-1)
            return;
        else
            {
                i++;
                arr[i]=ele;
            }
    }
    int pop()
    {
        int temp=0;
        if(i==-1)
            return -1;
        else
            {
                temp=arr[i];
                arr[i]=-1;
                i--;
            }
        return temp;
    }
    boolean isEmpty()
    {
        if(i!=arr.length-1)
            return true;

        return false;
    }
    void display()
    {
        for(int i: arr)
            if(i!=-1)
                System.out.print(i+" ");
            else
                break;
    }
    public static void main(String args[])
    {
        Main st=new Main();
        Arrays.fill(st.arr,-1);
        st.push(40);
        st.push(50);
        st.push(60);
//        System.out.println(st.isEmpty());
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());
        st.display();
    }
}*/


/*
class Main
{
    int arr[]=new int[10];
    int start=0;
    int tail=0;
    */
/* Starting point is front of queue and ending point is rear of the queue *//*

    void enqueue(int ele)
    {

    }
    int dequeue()
    {

        return 1;

    }
    boolean isEmpty()
    {
        return true;
    }
    public static void main(String args[])
    {

    }
}*/



// Implement two stacks in one array
/*
class Main
{
    int arr[]=new int[10];
    int top1=-1;
    int top2=arr.length;

    void push1(int x)
    {
        top1++;
        if(top1>top2)
            return;
        arr[top1]=x;
    }
    void push2(int x)
    {
        top2--;
        if(top2<top1)
            return;
        arr[top2]=x;
    }
    int pop1()
    {
        if(top1==-1)
            return -1;
        int temp=arr[top1];
        top1--;
        return temp;

    }
    int pop2()
    {
        if(top2==arr.length)
            return -1;

        int temp=arr[top2];
        top2++;
        return top2;

    }
    void display1()
    {
        if(top1==-1)
            return;

        for(int i=top1-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void display2()
    {
        if(top2==arr.length)
            return;
        for(int i=top2;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String arga[])
    {
        Main mn=new Main();
        mn.push1(2);
        mn.push1(3);
        mn.push1(4);
        mn.push1(5);
        mn.push1(6);
        mn.push2(100);
        mn.push2(200);
        mn.push2(300);
        mn.push2(400);
        mn.push2(500);
        mn.push2(600);
//        mn.display1();
//        mn.display2();
        mn.pop1();
        mn.pop2();
//        mn.display1();
//        mn.display2();
        mn.pop2();
        mn.pop1();
        mn.pop2();
        mn.pop1();
//        mn.display1();
//        mn.display2();
        mn.pop1();
        mn.pop1();
        mn.pop2();
        mn.pop2();
        mn.pop2();
        mn.display1();
        mn.display2();
    }
}*/

/*

class Main
{
    public static boolean exists(String URLName) {
        boolean result = false;
        try {
            InputStream input = (new URL(URLName)).openStream();
            result = true;
        } catch (IOException ex) {
            System.out.println("Image doesnot exits :");
        }
        return result;
    }
    public static boolean isValid(String imageUrl) throws IOException, InterruptedException {
        URL url = new URL(imageUrl);
        Image img = ImageIO.read(url);
        //img = img.getScaledInstance(100, -1, Image.SCALE_FAST);
        int w = img.getWidth(null);
        int h = img.getHeight(null);
        int[] pixels = new int[w * h];
        PixelGrabber pg = new PixelGrabber(img, 0, 0, w, h, pixels, 0, w);
        pg.grabPixels();
        boolean isValid = false;
        for (int pixel : pixels) {
            Color color = new Color(pixel);
            if (color.getAlpha() == 0 || color.getRGB() != Color.WHITE.getRGB()) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    public static void main(String args[]) throws IOException, InterruptedException {
        String url="";
        System.out.println(exists(url));
//        System.out.println(isValid(url));
    }
}
*/

/*
class Main
{
    public static void main(String args[])
    {
        System.out.println("I will do that");
    }
}*/

/*
class Main
{
    public static void main(String args[])
    {
//        System.out.println("Om ganeshay nam:");
        System.out.println(" We can easily do");
    }
}*/


/*
* 0/1 Knapsack
* Subset sum Problem
* Equal sum partition Problem
* Count of subset sum
* Minimum subset sum difference
* count the number of subset with a given difference
* Target Sum
* Unbounded Knapsack
* Rod Cutting Problem
* Coin change problem (Maximum && Minimum)
* Longest common subsequence
* LCS
* Print LCS
* Minimum number of insertion and deletion to convert a string into a into b
* Longest palindromic Subsequence
* Print shortest Supersequence
* Sequence Pattern matching
* Minimum number of matching to make a palindrome
* MCM
* */

/*
class Main
{
    static int knapsack(int wt[],int V[],int n,int W)
    {
        if(n==0 || W==0)
            return 0;
        if(wt[n-1]>W)
            return knapsack(wt,V,n-1,W);
        else
            return Math.max(knapsack(wt,V,n-1,W),V[n-1]+knapsack(wt,V,n-1,W-wt[n-1]));
    }
    static int dpknapsack(int wt[],int V[],int n,int W)
    {

        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=W;j++)
            {
                if(i==0 || j==0)
                    dp[i][j]=0;
                else if(wt[i-1]<=j)
                    dp[i][j]=Math.max(dp[i-1][j],V[i-1]+dp[i-1][j-wt[i-1]]);
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return  dp[n][W];
    }
    public static void main(String args[])
    {
        int W=50;
        int value[]={60,100,120};
        int wt[]={10,20,30};
        System.out.println(knapsack(wt,value,wt.length,W));
        System.out.println(dpknapsack(wt,value,wt.length,W));
    }
}*/


/*
class Main
{
    public static boolean Subset(int arr[],int sum,int n)
    {
        if(sum==0 && n==0)
            return true;
        if(sum==0)
            return true;
        if(n==0)
            return false;

        if(arr[n-1]>sum)
            return Subset(arr,sum,n-1);
        else
            return Subset(arr,sum,n-1)|| Subset(arr,sum-arr[n-1],n-1);

    }
    public static boolean dpSubset(int arr[],int sum,int n)
    {
        boolean subset[][]=new boolean[sum+1][n+1];
        for(int i=0;i<=n;i++)
        {
            subset[0][i]=true;
        }
        for(int j=0;j<=sum;j++)
        {
            subset[j][0]=false;
        }
        for(int i=1;i<=sum;i++)
        {
            for(int j=1;j<=n;j++)
            {
                subset[i][j]=subset[i][j-1];
                if(i>=arr[i-1])
                    subset[i][j]=subset[i][j] || subset[i-arr[j-1]][j-1];
            }
        }
        return subset[sum][n];
    }
    public static void main(String args[])
    {
        int arr[]={2,15,7,9,15};
        int sum=30;
        System.out.println(Subset(arr,sum,arr.length));
        System.out.println(dpSubset(arr,sum,arr.length));
    }
}*/


//class Main
//{
//    public static void main(String args[])
//    {
//        int arr[]={2,3,5,7,9};
//        for(int i=1;i<arr.length;i++)
//        {
//            arr[i]=arr[i-1]+arr[i];
//        }
//        for(int i: arr)
//        {
//            System.out.print(i+" ");
//        }
//    }
//}


//class Main
//{
//    public static void main(String args[])
//    {
//        int arr[]={1,2,1};
//        int ind=0;
//        int res[]=new int[arr.length];
//        Arrays.fill(res,-1);
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=i+1;j<arr.length*2;j++)
//            {
//                if(arr[i%arr.length]<arr[j%arr.length])
//                {
//                    res[ind] = arr[j%arr.length];
//                    break;
//                }
//            }
//            ind++;
//        }
//        for(int i:res)
//        {
//            System.out.print(i+" ");
//        }
//    }
//}
//
//class Main
//{
//    public static void main(String args[])
//    {
//        int arr[]={1,2,1};
//        int count=0;
//        Stack<Integer> st=new Stack<>();
//        st.push(arr[0]);
//        for(int i=1;i<arr.length*2;i++)
//        {
////            if(!st.isEmpty() && arr[i]>st.peek())
//            {
//                while(!st.isEmpty() && arr[i%arr.length]>st.peek())
//                {
//                    System.out.println(st.pop()+"-->"+ arr[i%arr.length]);
//                }
//            }
//            st.push(arr[i%arr.length]);
////            System.out.println(st);
//            count++;
//            if(count==arr.length)
//                break;
//        }
////        System.out.println(st);
//        while(!st.isEmpty())
//        {
//            System.out.println(st.pop()+"-->"+ -1);
//        }
//    }
//}

/*
class Main
{
    public static void main(String args[])
    {
        int arr[]={4,5,2,25};
        int ind=0;
        int res[]=new int[arr.length];
        Arrays.fill(res,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while (!st.isEmpty() && st.peek()<=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
                res[i]=-1;
            else
                res[i]= st.peek();

            st.push(arr[i]);
        }

        for(int i:res)
            System.out.print(i+" ");
    }
}*/


/*
class Main
{
    public static void main(String args[])
    {
        int arr[]={10, 4, 5, 90, 120, 80 };
        int res[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]>arr[st.peek()])
                st.pop();

            if(st.isEmpty())
                res[i]=i+1;
            else
                res[i]=i-st.peek();

            st.push(i);


        }
        for(int i:res)
            System.out.print(i+" ");
    }
}*/


/*
class Main
{
    public static void main(String args[])
    {
        String s="()(()))))";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                st.push(s.charAt(i));
            else
                {
                    if(!st.isEmpty() && st.peek()=='(')
                        st.pop();
                }
        }
        System.out.println(st);
        System.out.println(s.length()-st.size());
    }
}*/
/*

class Main
{
    public static void main(String args[])
    {
        String s="((()()";
        int max=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push(i);
            }else
            {
                if(!st.isEmpty())
                    st.pop();

                if(!st.isEmpty())
                    max=Math.max(max,i-st.peek());

                else
                    st.push(i);
            }
        }
        System.out.println(max);
    }
}*/
/*
class Main
{
    public static void main(String args[])
{
        int n=7;
        Queue<String> qu=new LinkedList<>();
        qu.add("1");
        while(n-->0)
        {
            String s1=qu.peek();
            qu.remove();
            System.out.println(s1);
//            String s2=s1;
            qu.add(s1+"0");
            qu.add(s1+"1");
          }
}
}*/

/*
class Main
{
    public static void main(String args[])
    {
        String name="ankit";
        String typed="ankittttttttttttttt";
        if(name.length()>typed.length())
        {
            System.out.println(false);
            return;
        }
        int i=0;
        int j=0;
        while(i<typed.length() || j<name.length())
        {
            if(typed.charAt(i)==name.charAt(j))
            {
                i++;
                j++;
            }else if(typed.charAt(i)==name.charAt(j-1))
                {
                    i++;
                }
            else
                {
                    System.out.println(false);
                    return;
                }
        }
        System.out.println(true);
    }
}*/


/*
class Main
{
    static void  reverse(int arr[],int start, int end )
    {
        if(start>end)
            return;

        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7};
        int k=2;
        k=k%arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}*/

/*
class Main
{
    public static void main(String args[])
    {
        int arr[]={1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1 };
        int k=4;
        HashMap<Integer,Integer> hmp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hmp.containsKey(arr[i]))
            {
                hmp.put(arr[i],hmp.get(arr[i])+1);
            }else
                hmp.put(arr[i],1);
        }
        int val=arr.length/k;
        for(int i:hmp.keySet())
        {
            if(hmp.get(i)>val)
                System.out.print(i+" ");
        }
    }
}*/

/*
class Main
{
    public static void main(String args[])
    {
        int arr[]={0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1};
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            if(arr[start]==0)
                start++;
            else if(arr[end]==1)
                end--;
            else
                {
                    int temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;

                    end--;
                }
        }
        for(int i: arr)
            System.out.print(i+" ");
    }
}*/

/*
class Main
{
    public static void main(String args[])
    {
        int arr[]={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int lo=0;
        int hi=arr.length-1;
        int mid=0;
        while(mid<=hi)
        {
            switch(arr[mid])
            {
                case 0:
                    {
                        int temp=arr[lo];
                        arr[lo]=arr[mid];
                        arr[mid]=temp;
                        lo++;
                        mid++;
                        break;
                    }
                case 1:
                    {
                        mid++;
                        break;
                    }
                case 2:
                    {
                        int temp=arr[mid];
                        arr[mid]=arr[hi];
                        arr[hi]=temp;
                        hi--;
                        break;
                    }
            }
        }
        for(int i: arr)
            System.out.print(i+" ");
    }
}*/

/*
class Main
{
    public static void main(String args[])
    {
        int n=20;
        boolean arr[]=new boolean[n+1];
        Arrays.fill(arr,true);

        for(int i=2;i*i<=n;i++)
        {
            if(arr[i]==true)
                for(int j=i*i;j<=n;j+=i )
                {
                    arr[j]=false;
                }
        }
        for(int i=2;i<=n;i++)
            if(arr[i]==true)
                System.out.println(i);
    }
}*/


/*
class Main
{
    public static void main(String args[])
    {
        Integer.toString(81, 3).matches("^10*$");
    }
}*/

/*
class Main
{
    public static void main(String args[])
    {
        int arr[]={0, -1, 2, -3, 1};
        int sum=-2;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
    }
}*/

/*

class Main
{
    public static void main(String args[])
    {
        int arr[] = { 900, 940 };
        int dep[] = { 910, 1200 };

        int count=0;
        int max=0;
        int i=0;
        int j=0;
        while(i < arr.length && j < dep.length)
        {
            if(arr[i]<dep[j])
            {
                count++;
                max=Math.max(max,count);
                i++;
            }else
                {
                    count--;
                    max=Math.max(max,count);
                    j++;
                }
        }
        System.out.println(max);
    }
}*/
/*
class Node
{
    int val;
    Node left;
    Node right;
    Node(int data)
    {
        val=data;
    }
}
class Main
{
    public static void main(String args[])
    {
        Node root=new Node(2);
        root.left=new Node(3) ;
        root.right=new Node(4);
        root.left.left=new Node(5);
        root.left.right=new Node(6);
        root.right.left=new Node(7);
        root.right.right=new Node(8);

        Queue<Node> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            int size=qu.size();
            for(int i=0;i<size;i++)
            {
                Node temp=qu.peek();
//            System.out.print(temp.val+" ");
//            qu.poll();
                if(temp.left!=null)
                    qu.add(temp.left);
                if(temp.right!=null)
                    qu.add(temp.right);

                System.out.print(qu.peek().val+" ");
                qu.poll();
            }
            System.out.println();

        }
        System.out.println("---");
        greater(root);
    }
    static void greater(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.val+" ");
        greater(root.left);
        greater(root.right);
    }
}*/


/*
class Main
{
    public static void main(String args[])
    {
        int arr[]={1,0,0,1,0,0,1};
        int i=0;
        int j=0;
        int max=0;
        while(i<arr.length)
        {
            if(arr[i]==0 )
            {
                while ( i<arr.length && arr[i]==0)
                {
                    i++;
                    max=Math.max(max,i-j);
                }
                j=i;
            }else
                {
                    i++;
                    j++;
                }

        }
        System.out.println(max);
    }
}*/

/*
class Main
{
    static void addEdge(ArrayList<ArrayList<Integer>> al,int u, int v)
    {
        al.get(u).add(v);
        al.get(v).add(u);
    }
    static void display(ArrayList<ArrayList<Integer>>al)
    {
        for(int i=0;i<al.size();i++)
        {
            System.out.print(i+"-->");
            for(int j=0;j<al.get(i).size();j++)
            {
                System.out.print(al.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int c=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>(c);
        for(int i=0;i<c;i++)
            adj.add(new ArrayList<Integer>());


        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        display(adj);
    }
}

*/


//class Main
//{
//
//    public static  void addEdge(ArrayList<ArrayList<Integer>> al, int u, int v)
//    {
//        al.get(u).add(v);
//        al.get(v).add(u);
//    }
//
//    public static void Display(ArrayList<ArrayList<Integer>> al)
//    {
//        for(int i=0;i<al.size();i++)
//        {
//            System.out.print(i+"-->");
//            for (int j=0;j<al.get(i).size();j++)
//            {
//                System.out.print(al.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String args[])
//    {
//        int c=5;
//        ArrayList<ArrayList<Integer>> adj=new ArrayList<>(c);
//        for(int i=0;i<c;i++)
//        {
//            adj.add(new ArrayList<Integer>());
//        }
//
//        addEdge(adj, 0, 1);
//        addEdge(adj, 0, 4);
//        addEdge(adj, 1, 2);
//        addEdge(adj, 1, 3);
//        addEdge(adj, 1, 4);
//        addEdge(adj, 2, 3);
//        addEdge(adj, 3, 4);
//
//        Display(adj);
//    }
//}

/*
class Main
{
    public static void main(String args[])
    {
        int arr[]={1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k=4;
        int target=18;
        int i=0;
        int j=k;
        int currsum=0;
        for(int ind=0;ind<k;ind++)
            currsum+=arr[ind];

//        System.out.println(currsum  );
        if(currsum==target)
        {
            return;
        }
        while(j<arr.length)
        {
            currsum=currsum-arr[i];
            i++;
            currsum=currsum+arr[j];
            j++;
            if(currsum==target)
            {
                System.out.println(true);
                return;
            }

        }
        System.out.println(false);

    }
}*/

/*
class Main
{
    public static void main(String args[])
    {
        int arr[]={9, 4, 20, 3, 10, 5};
        int count=0;
        int k= 33;
        for(int i=0;i<arr.length;i++)
        {
            int currsum=0;
            for(int j=i;j<arr.length;j++)
            {
                currsum+=arr[j];
                if(currsum==k)
                    count++;
            }
        }
        System.out.println(count);
    }
}*/

// 0/1 Knapsack

/*
class Main
{
    static int knapsack(int wt[],int v[],int W, int n)
    {
        if(n==0 || W==0)
            return 0;
        if(wt[n-1]>W)
            return  knapsack(wt,v,W,n-1);

        return Math.max(knapsack(wt,v,W,n-1),v[n-1]+knapsack(wt,v,W-wt[n-1],n-1));
    }
    static int dpknapsack(int wt[],int v[],int W, int n)
    {
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=W;j++)
            {
                if(i==0 || j==0)
                    dp[i][j]=0;

                else if(wt[i-1]>j)
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=Math.max(dp[i-1][j],v[i-1]+dp[i-1][j-wt[i-1]]);
            }
        }
        return dp[n][W];
    }
    static int knapsackMemo(int wt[],int v[],int W, int n)
    {
        int dp[][]=new int[n+1][W+1];

        for(int row[]:dp)
            Arrays.fill(row,-1);

        if(n==0 || W==0)
            return  dp[n-1][W-1]=0;

        if(dp[n][W]!=-1)
            return dp[n][W];

        if(wt[n-1]<=W)
            return  dp[n][W]=Math.max(v[n-1] + knapsack(wt,v,n-1,W-wt[n-1]),knapsack(wt,v,n-1,W));


        return dp[n][W]=knapsack(wt,v,n-1,W);
    }

    public static void main(String args[])
    {
        int wt[]={10,20,30};
        int v[]={60,100,120};
        int W=50;
        int n=wt.length;
        System.out.println(knapsack(wt,v,W,n));
        System.out.println(dpknapsack(wt,v,W,n));
        System.out.println(knapsackMemo(wt,v,W,n));
    }
}*/


/*
class Main
{
    static boolean subset(int set[],int n,int sum)
    {
        boolean dp[][]=new boolean[n+1][sum+1];

        for(int i=0;i<=sum;i++)
            dp[0][i]=false;

        for(int i=0;i<=n;i++)
            dp[i][0]=true;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(set[i-1]>j)
                    dp[i][j]=dp[i-1][j];

                else
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-set[i-1]];
            }
        }

        return dp[n][sum];

    }
    public static void main(String args[])
    {
        int set[]={3, 4, 5, 2};
        int sum=6;
        System.out.println(subset(set,set.length,sum));
    }
}*/

/*

class Main
{
    private static int count(int arr[], int n,int sum)
    {
        int dp[][]=new int[n+1][sum+1];
        for(int i=0;i<=sum;i++)
            dp[0][i]=0;
        for(int i=0;i<=n;i++)
            dp[i][0]=1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(arr[i-1]>j)
                    dp[i][j]=dp[i-1][j];

                else
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
            }
        }
        return dp[n][sum];
    }
    public static void main(String args[])
    {
        int arr[]={4,3,-1,2,4,2};
        int sum=2;
        System.out.println(count(arr,arr.length,sum));
    }
}*/


/*
class Main
{
    private static int gcd(int a, int b)
    {
        if(a==0)
            return b;
        if(b==0)
            return  a;

        if(a>b)
            return gcd(a-b,b);

        return  gcd(a,b-a);
    }
    private  static  int efficientgcd(int a, int b)
    {
        if(b==0)
            return a;

        return efficientgcd(b,a%b);
    }
    public static void main(String args[])
    {
        int a=98;
        int b=56;
        System.out.println(gcd(a,b));
        System.out.println(efficientgcd(a,b));
    }
}*/

/*
class Main
{
    int fib(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1 || n==2)
            return 1;

         return (fib(n-1)+fib(n-2));
    }
    int fact(int n)
    {
        if(n<=1)
            return 1;

        return n*fact(n-1);
    }
    int sum(int n)
    {
        if(n<0)
            return 0;

        return n+sum(n-1);
    }
    public static void main(String args[])
    {
        Main mn=new Main();
        int temp=mn.sum(5);
        System.out.println(temp);
        System.out.println(mn.fact(5));
        System.out.println(mn.fib(4));
    }
}*/


/*
class Main
{
    public static void main(String args[])
    {
        int bits=0;
        int a=3;
        while(a>0)
        {
            bits+=a&1;
            a>>=1;
        }
        System.out.println(bits);
    }
}*/


/*
class Main
{
    private  static int tabulation(int val[],int wt[],int W,int n)
    {
        int dp[][]=new int[n+1][W+1];


        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=W;j++)
            {

                 if(i==0 || j==0)
                     dp[i][j]=0;
                 else if(wt[i-1]>j)
                    dp[i][j]=dp[i-1][j];
                 else
                    dp[i][j]=Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]);
            }
        }
        return dp[n][W];
    }
    private  static int knapsack(int val[],int wt[],int W,int n)
    {
        if(n==0)
            return 0;
        if(W<0)
            return 0;

        if(wt[n-1]>W)
            return  knapsack(val,wt,W,n-1);

        return Math.max(knapsack(val,wt,W,n-1),val[n-1]+knapsack(val,wt,W-wt[n-1],n-1));
    }
    public static void main(String args[])
    {
        int val[]={10,15,40};
        int wt[]={1,2,3};
        int W=6;

        System.out.println(knapsack(val,wt,W,wt.length));
        System.out.println(tabulation(val,wt,W,wt.length));
    }
}*/

/*

class Main
{
    private static boolean subset(int arr[],int sum,int n)
    {
        if(sum==0)
            return  true;

        if(n==0)
            return false;
        if(arr[n-1]>sum)
            return subset(arr,sum,n-1);

        return subset(arr,sum,n-1) || subset(arr,sum-arr[n-1],n-1);

    }
    public static void main(String args[])
    {
        int arr[] = {3, 34, 4, 12, 5, 2};
        int sum=30;
        System.out.println(subset(arr,sum,arr.length));
    }
}*/


/*
class Main
{
    public static void main(String args[])
    {
        int n=13;
        
    }
}*/

/*
class Main
{
    public static void main(String args[])
    {
        String str="catch";
        String s="tch";
        if(str.contains(s))
            System.out.println("Kaam kr rha hai");
        else
            System.out.println("Kuch or socho");
    }
}
*/


/*
class Main
{
    private static int lcs(String s1,String s2, int n, int m)
    {
        if(n==0 || m==0)
            return 0;
        if(s1.charAt(n-1)==s2.charAt(m-1))
            return 1+lcs(s1,s2,n-1,m-1);


         return   Math.max(lcs(s1,s2,n-1,m),lcs(s1,s2,n,m-1));


    }
    public static void main(String args[])
    {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        List<Integer> al=new ArrayList<>();
        al.add(1,2);
        System.out.println(lcs(s1,s2,s1.length(),s2.length()));
    }
}*/


/*
class Main
{
    static void java()
    {
        try
        {
            System.out.println("Inside java");
            throw new RuntimeException("demo");
        }
        finally {
            System.out.println("Java Finally");
        }
    }
    public static void main(String args[])
    {
        try {
            java();
        }
        catch (Exception e)
        {
            System.out.println("Exception Caught");
        }
    }
}*/


/*
class B1
{
    private int a=10;
    protected int b=30;
    public B1(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    protected void sum(int a,int b)
    {
        new B1(a,b).get();
    }
    private void get()
    {
        System.out.println(a+b);
    }
}
class B2 extends B1
{

    B2(int a, int b) {
        super(a, b);
    }
    protected int c=10;
    protected  void add()
    {
        sum(10,20);
    }
}
public class Main
{
    public static void main(String args[])
    {
        new B2(2,3).add();
    }
}*/


/*
enum Languages
{
    Python(10-10+10*10),java(9+9*9-9),Angular(12*12-12-12);
    private int coders;
    Languages(int p)
    {
        coders =p;
    }
    int getCoders()
    {
        return  coders;
    }
}
public class Main
{
    public static void main(String args[])
    {
        Languages ap;
        for(Languages a:Languages.values())
        {
            System.out.println(a+" "+a.getCoders()+" coders.");
        }
    }
}*/

/*
import java.lang.*;
public  class  StringMatch
{
    public static void main(String args[])
    {
        String regex=".@";
        StringMatch.compare("Hacker@Earth.com",regex);
    }
}*/


/*
class Main
{
    public static void main(String args[])
    {
        System.out.println(1|3);
    }
}*/


/*class Node
{
    int data;
    Node left;
    Node right;
    Node(int x)
    {
        data=x;
    }
}*/
/*

class Main
{

    */
/*
    * TREE Traversal
    * InOrder(Left,Root,Right)
    * PreOrder(Root,left,Right)
    * PostOrder(Left,Right,Root)
    * *//*

    private  static void Inorder(Node root)
    {
        if(root==null)
            return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    private  static void PreOrder(Node root)
    {
        if(root==null)
            return;

        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    private  static void PostOrder(Node root)
    {
        if(root==null)
            return;

        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }
    private static void Display(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        Display(root.left);
        Display(root.right);
    }

    private  static void LevelOrder(Node root)
    {
        if(root==null)
            return;
        Queue<Node> qu=new LinkedList<>();
        qu.add(root);
        while (!qu.isEmpty())
        {
            Node temp=qu.poll();
            System.out.print(temp.data+" ");

            if(temp.left!=null)
                qu.add(temp.left);
            if(temp.right!=null)
                qu.add(temp.right);
        }
    }
    private static void LevelOrder1(Node root)
    {
        if(root==null)
            return;

        Queue<Node> qu=new LinkedList<>();
        qu.add(root);
        while (!qu.isEmpty())
        {
            int size=qu.size();
            while(size-->0)
            {
                Node temp=qu.poll();
                System.out.print(temp.data+" ");

                if(temp.left!=null)
                    qu.add(temp.left);
                if(temp.right!=null)
                    qu.add(temp.right);
            }
            System.out.println();
        }
    }
    private static void  PreOrderIter(Node root)
    {
        if(root==null)
            return;
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty())
        {
            Node temp=st.pop();
            System.out.print(temp.data+" ");

            if(temp.right!=null)
                st.push(temp.right);
            if(temp.left!=null)
                st.push(temp.left);
        }
    }
    private  static void InOrderIterative(Node root)
    {
        if(root==null)
            return;

        Stack<Node> st=new Stack<>();

//        st.push(root);

        Node curr=root;
        while(curr!=null ||!st.isEmpty())
        {
            while(curr!=null)//            Node temp=st.peek();

            {
                st.push(curr);
                curr=curr.left;
            }

            curr =st.pop();
            System.out.print(curr.data+" ");

            curr=curr.right;
        }
    }
    private static int size(Node root)
    {
        if(root==null)
            return 0;

        return 1+size(root.left)+size(root.right);
    }
    private static int maximum(Node root)
    {
        if(root==null)
            return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
    }
    private static int height(Node root)
    {
        if(root==null)
            return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void main(String args[])
    {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);

*/
/*        System.out.println("Display");
        Display(root);
        System.out.println();
        System.out.println("InOrder");
        Inorder(root);
        System.out.println();
        System.out.println("PreOrder");
        PreOrder(root);
        System.out.println();
        System.out.println("PostOrder");
        PostOrder(root);
        System.out.println();
        System.out.println(" Level Order Approach");
        LevelOrder(root);
        System.out.println();
        LevelOrder1(root);
        System.out.println();
        System.out.println("PreOrder Iterative");
        PreOrderIter(root);
//        System.out.println();
        System.out.println("\nInOrder Iterative");
        InOrderIterative(root);*//*

        System.out.println("\n Size");
        System.out.println(size(root));
        System.out.println("Maximum \n"+ maximum(root));
        System.out.println("Height \n"+ height(root));

    }
}*/

/*
class Node
{
    Node left;
    Node right;
    int data;
    Node(int x)
    {data=x; }
}
class Main
{
    private static boolean Search (Node root, int x)
    {
        if(root==null)
            return false;

        if(root.data==x)
            return true;
        if(root.data<x)
            return Search(root.right,x);

        return Search(root.left,x);
    }

    private  static boolean ISearch(Node root,int x)
    {
        if(root==null)
            return false;

        while(root!=null)
        {
            if(root.data==x)
                return true;

            if(root.data<x)
                root=root.right;

            else
                root=root.left;
        }
        return false;
    }
    public static void main(String args[])
    {
        Node root=new Node(10);
        root.left=new Node(8);
        root.right=new Node(12);
        root.left.left=new Node(4);
        root.left.right=new Node(9);
        root.right.left=new Node(11);
        root.right.right=new Node(14);

        System.out.println(Search(root,12));
        System.out.println(Search(root,14));
        System.out.println(Search(root,20));

        System.out.println(ISearch(root,12));
        System.out.println(ISearch(root,14));
        System.out.println(ISearch(root,20));
    }
}*/
/*
class  Main
{
    static int fib(int n)
    {
        if(n<=1)
            return n;

        return fib(n-1)+fib(n-2);
    }
    static int dp(int n)
    {
        int arr[]=new int[n+1];
        Arrays.fill(arr,-1);

        for(int i=1;i<=n;i++)
        {
            if(arr[i]==-1)
                arr[i]=fib(i);
            else
                continue;
        }
        return arr[n];
    }

    static int dptab(int n)
    {
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++)
            arr[i]=arr[i-1]+arr[i-2];

        return arr[n];
    }
    public static void main(String args[])
    {
        System.out.println(fib(7));
        System.out.println(dp(7));
        System.out.println(dptab(7));
    }
}*/

/*
class Main
{
    private static int first(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;
        int res=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target) {
                high = mid - 1;
                res=mid;
            }
            else if(arr[mid]<target)
                low=mid+1;
            else
                high=mid-1;

        }
        return res;
    }
    private static int second(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;
        int res=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target) {
                low = mid + 1;
                res=mid;
            }
            else if(arr[mid]<target)
                low=mid+1;
            else
                high=mid-1;

        }
        return res;
    }
    public static void main(String args[])
 {
        int arr[]={1,2,5,8,9,10};
        int target=8;
     System.out.println(first(arr,target));
     System.out.println(second(arr,target));
    }
}*/


/*
class Main
{
    public static void main(String args[])
    {
        String st="ankKKit";
        int upp=0;
        int low=0;
        for(char i : st.toCharArray())
        {
            int temp= (int) i;
            if(temp<=65 || temp >=90)
                low++;

            if(temp<=97 || temp>=122)
                upp++;
        }

        if(upp>low)
            System.out.println(low);
        else
            System.out.println(upp);

    }
}*/


/*
class Main
{
    public static void main(String args[])
    {
        int arr[][]=new int[4][6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }

        int len=arr.length;
        int len1=arr[0].length;
        int sum=0;
        int max=0;
        System.out.println(len +" "+len1);
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len1;j++)
            {
                System.out.print(arr[i][j]+" ");
                sum+=arr[i][j];
            }
            max=Math.max(max,sum);
            sum=0;
            System.out.println();
            sum=0;
        }
        System.out.println(max+" \n");
        System.out.println("\n");
        for(int i=0;i<len1;i++)
        {
            for(int j=0;j<len;j++)
            {
                System.out.print(arr[j][i]+" ");
                sum+=arr[j][i];
            }
            max=Math.max(max,sum);
            sum=0;
            System.out.println();

        }
        System.out.println(max);
    }
}*/


//
/*
class Node
    {
        Node left;
        Node right;
        int data;
        Node(int x)
        {
            data=x;
        }
    }
    class Main
    {
        static void insert(Node root, int a)
        {
            if(root==null)
            {
                root= new Node(a);
                return;
            }
            Queue<Node> qu=new LinkedList<>();
            qu.add(root);
            while(!qu.isEmpty())
            {
                Node temp=qu.poll();
                if(temp.left==null)
                {
                    temp.left=new Node(a);
                    break;
                }else
                    qu.add(temp.left);

                if(temp.right==null)
                {
                    temp.right=new Node(a);
                    break;
                }else
                    qu.add(temp.right);

            }
        }
        static void Display(Node root)
        {
            if(root==null)
                return;
            System.out.println(root.data);
            Display(root.left);
            Display(root.right);
        }
        public static void main(String args[])
        {
            Node root=new Node(1);
             insert(root,2);
            insert(root,3);
            Display(root);
        }
    }*/

/*
class Main
{
    static int rec(int val[],int weight[],int n,int W)
    {
        if(n==0 || W==0)
            return 0;

        if(weight[n-1]>W)
            return rec(val,weight,n-1,W);

        return Math.max(rec(val,weight,n-1,W),val[n-1]+rec(val,weight,n-1,W-weight[n-1]));
    }
    static int dp(int val[],int weight[],int n,int W,int dp1[][])
    {
        if(n==0||W==0)
            return 0;
        if(dp1[n][W]!=-1)
            return dp1[n][W];

        if(weight[n-1]>W)
             return dp[n][W]=dp(val,weight,n-1,W,dp1);

        return dp[n][W]= Math.max(dp(val,weight,n-1,W,dp1),val[n-1]+dp(val,weight,n-1,W-weight[n-1],dp1));
    }
    static int dpp(int val[],int weight[],int n,int W)
    {
        int dpp[][]=new int[n+1][W+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=W;j++)
            {
                if(i==0 || j==0)
                    dpp[i][j]=0;
                else if(weight[i-1]<=j)
                    dpp[i][j]=Math.max(dpp[i-1][j],val[i-1]+dpp[i-1][j-weight[i-1]]);
                else
                    dpp[i][j]=dpp[i-1][j];
            }
        }
        return dpp[n][W];
    }
    public static void main(String args[])
    {
        int val[]={60,100,120};
        int weight[]={10,20,30};

        int W=50;
        System.out.println(rec(val,weight,weight.length,W));
//        System.out.println(dp(val,weight,weight.length,W));
//                        System.out.println(dpp(val,weight,weight.length,W));
                        int dp1[][]=new int[weight.length+1][W+1];
                        for(int arr[]:dp1)
                            Arrays.fill(arr,-1);
        System.out.println(dp(val,weight,weight.length,W,dp1));
    }
}*/

// Subset Sum Problem
/*
class Main
{
    static boolean subset(int arr[],int n,int sum)
    {
        if(n==0 && sum==0)
            return true;
        if(n==0|| sum==0)
            return false;

        if(arr[n-1]>sum)
            return subset(arr,n-1,sum);

        return subset(arr,n-1,sum) || subset(arr,n-1,sum-arr[n-1]);


    }
    static boolean dp(int arr[],int n,int sum)
    {
        boolean dp[][]=new boolean[n+1][sum+1];
        for(int i=0;i<=sum;i++)
            dp[0][i]=false;

        for(int i=0;i<=n;i++)
            dp[i][0]=true;

        for(int i=1;i<=n;i++)
            for(int j=0;j<=sum;j++)
            {
                if(arr[i-1]<=j)
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
                else
                    dp[i][j]=dp[i-1][j];

            }
        return dp[n][sum];
    }
    static int dpp(int arr[],int n,int sum)
    {
        int dp[][]=new int[n+1][sum+1];
        for(int i=0;i<=sum;i++)
            dp[0][i]=0;

        for(int i=0;i<=n;i++)
            dp[i][0]=1;

        for(int i=1;i<=n;i++)
            for(int j=0;j<=sum;j++)
            {
                if(arr[i-1]<=j)
                    dp[i][j]=dp[i-1][j] + dp[i-1][j-arr[i-1]];
                else
                    dp[i][j]=dp[i-1][j];

            }

        return dp[n][sum];
    }
    public static void main(String args[])
    {
        int arr[]={2,2,-4};
        int sum=0;
        int n=arr.length;
//        System.out.println(subset(arr,n,sum));
//        System.out.println(dp(arr,n,sum));
        System.out.println(dpp(arr,n,sum));
    }
}
*/

 // Unbounded Knapsack
/*
class Main
{
    static int unknapsack(int val[],int wt[],int n,int W)
    {
        if(n==0 || W==0)
            return 0;
        if(wt[n-1]>W)
            return unknapsack(val,wt,n-1,W);

        return Math.max(unknapsack(val,wt,n-1,W),val[n-1]+unknapsack(val,wt,n,W-wt[n-1]));
    }
    public static void main(String args[])
    {
        int val[]={10, 30, 20};
        int wt[]={5, 10, 15 };
        int W=100;
        System.out.println(unknapsack(val,wt,wt.length,W));

    }
}*/
// Road Cutting


// Number of SubStrings
/*
class Main
{
    public static void main(String args[])
    {
        String str="abcdd";

        int n=str.length();
        int temp=n*(n+1)/2;
        System.out.println(temp);
    }
}*/
/*
* You are given two strings pattern and s. The first string pattern contains only the symbols 0 and 1, and the second string s contains only
* - lowercase English letters.

Let's say that pattern matches a substring s[l..r] of s if the following 3 conditions are met:

they have equal length;
for each 0 in pattern the corresponding letter in the substring is a vowel;
for each 1 in pattern the corresponding letter is a consonant.
Your task is to calculate the number of substrings of s that match pattern.

Note: In this task we define the vowels as 'a', 'e', 'i', 'o', 'u', and 'y'. All other letters are consonants.

Example

For pattern = "010" and s = "amazing", the output should be binaryPatternMatching(pattern, s) = 2.
example

"010" matches s[0..2] = "ama", because both 0s match a, which is a vowel, and 1 match m, which is a consonant;
"010" doesn't match s[1..3] = "maz", because the first 0 corresponds to an m, which is a consonant, not a vowel;
"010" matches s[2..4] = "azi", because the first 0 matches an a (vowel), 1 matches z (consonant), and the second 0 matches i (vowel);
"010" doesn't match s[3..5] = "zin", because the first 0 corresponds to a consonant (z);
"010" doesn't match s[4..6] = "ing", because the second 0 corresponds to the letter g, which is a consonant.
So, there are only 2 matches.

For pattern = "100" and s = "codesignal", the output should be binaryPatternMatching(pattern, s) = 0.

There are no double vowels in the string "codesignal", so it's not possible for any of its substrings to match this pattern.

Input/Output

[execution time limit] 3 seconds (java)

[input] string pattern

A string of 0s and 1s.

Guaranteed constraints:
1 ≤ pattern.length ≤ 103.

[input] string s

A string of lowercase English letters.

Guaranteed constraints:
1 ≤ s.length ≤ 103.

[output] integer

The number of substrings of s that match pattern.

[Java] Syntax Tips

// Prints help message to the console
// Returns a string
//
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
String helloWorld(String name) {
    System.out.println("This prints to the console when you Run Tests");
    return "Hello, " + name;
}
* */

/*
class Main
{
    static int check(String text,String pattern)
    {
        HashSet<Character> hs=new HashSet<>();
        hs.add('a');hs.add('e');hs.add('i');hs.add('o');hs.add('u');hs.add('y');
        System.out.println(hs);
        int n=text.length()-pattern.length();
        int i=0;
        int count=0;
        while(i<=n)
        {
            for(int j=0;j<pattern.length();j++)
            {
                if(pattern.charAt(j)=='0')
                {
                    if(hs.contains(text.charAt(j+i)))
                        count++;
                }else
                    {
                        if(!hs.contains(text.charAt(j+i)))
                            count++;
                    }
            }
            i++;
        }
        return count;
    }
    public static void main(String args[])
    {
        String text="amazing";
        String pattern="010";
        System.out.println(check(text,pattern));
    }
}*/


/*
class Main
{
    static void Disply(String str)
    {
        if(str.length()==1)
        {
            System.out.println(str);
            return;
        }
        Stack<Character> st=new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            if(!st.isEmpty() && str.charAt(i)==st.peek())
            {
                StringBuilder sb=new StringBuilder();
                while(!st.isEmpty() && str.charAt(i)==st.peek())
                {
                    sb.append(st.peek());
                    st.pop();
                }
                sb.append(str.charAt(i));
                System.out.println(sb.toString());
            }else
                st.push(str.charAt(i));

        }
    }
    public static void main(String args[])
    {
        String str="ankiit";
        Disply(str);
    }
}*/

/*

class Main
{
    static void Display(String st)
    {
        for(int ind=0;ind<st.length();ind++)
        {
            int i=ind;
            for(int j=i;j<st.length();j++)
            {
                for(int k=i;k<=j;k++)
                    System.out.print(st.charAt(k));

                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        String st="ankit";
        Display(st);
    }
}*/


//class A
//{
//
//}
//enum Enums extends A
//{
//
//}
//class Main
//{
//
//    public static void main(String args[])
//    {
//        String obj="I LIKE SYNPULSE";
//        System.out.println(obj.charAt(3));
//    }
//}

/*
 class Main {
    public static void main(String args[] ) throws Exception {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
 */
/*       String st[]= str.split(" ");*//*


        ArrayList<String> al=new ArrayList<>();
        StringBuilder bs=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
         if(str.charAt(i)!=' ')
         {
             bs.append(str.charAt(i));
         }else
             {
                if(bs.length()!=0)
                {
                 al.add(bs.toString());
                 bs.setLength(0);
                }

             }
        }
        if(bs.length()>0)
            al.add(bs.toString());
        bs.setLength(0);
        System.out.println(al);
        for(int i=al.size()-1;i>=0;i--)
        {
            bs.append(al.get(i));
            if(i!=0)
                bs.append(" ");
        }
        System.out.println(bs.toString());
*/
/*
        StringBuilder sb=new StringBuilder();
        for(int i=st.length-1;i>=0;i--)
        {
            sb.append(st[i]);
            if(i!=0)
                sb.append(" ");
        }

        System.out.println(sb.toString());*//*

        //Write code here

    }
}
*/

/*
public class Main {
    public static void main(String args[] ) throws Exception {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        // String st[]= str.split(" ");

        // StringBuilder sb=new StringBuilder();
        // for(int i=st.length-1;i>=0;i--)
        // {
        //    sb.append(st[i]);
        //    if(i!=0)
        //       sb.append(" ");
        // }

        // System.out.println(sb.toString());
        //Write code here
        ArrayList<String> al=new ArrayList<>();
        StringBuilder bs=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                bs.append(str.charAt(i));
            }else
            {
                if(bs.length()!=0)
                {
                    al.add(bs.toString());
                    bs.setLength(0);
                }

            }
        }
        if(bs.length()>0)
            al.add(bs.toString());
        bs.setLength(0);
        System.out.println(al);
        for(int i=al.size()-1;i>=0;i--)
        {
            bs.append(al.get(i));
            if(i!=0)
                bs.append(" ");
        }
        System.out.println(bs.toString());
    }
}
*/
/*

class Main
{
    static int palin(String str)
    {
        if(str.length()<2)
            return str.length();

        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                i++;
                j--;
            }else
                return 0;
        }
        return str.length();
    }
    public static void main(String args[])
        {
            Scanner sc=new Scanner((System.in));
            String str=sc.nextLine();
            int max=0;
            for(int i=0;i<str.length();i++)
            {
                for(int j=i+1;j<str.length();j++)
                {
                    max=Math.max(palin(str.substring(i,j+1)),max);
                }
            }
            System.out.println(max);
//            System.out.println(str.substring(0,2));

    }
}*/

// Print your output to STDOUT*/

import java.io.*;
import java.util.*;
/*public class Main {
    static int palin(String str)
    {
        if(str.length()<2)
            return str.length();

        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                i++;
                j--;
            }else
                return 0;
        }
        return str.length();
    }
    public static void main(String args[] ) throws Exception {

        //Write code here
        Scanner sc=new Scanner((System.in));
        String str=sc.nextLine();
        int max=0;
//        String res=str.cha
                    StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
//                max=Math.max(palin(str.substring(i,j+1)),max)                ;
                    int temp=palin(str.substring(i,j+1));
                    if(temp>max)
                    {
                        max=temp;
                        sb.setLength(0);
                        sb.append(str.substring(i,j+1));
                    }
            }

        }
//        System.out.println(max);
        System.out.println(sb.toString());

    }
}*/


/*
class Main
{
    public static void main(String args[])
    {
        int num=22;
        int den=7;
        double ans=(double)num/(double) den;
        String str=String.valueOf(ans);
        System.out.println(str);
        System.out.println(ans);
    }
}*/


/*
class Main
{
    public static void main(String args[])
    {
        int N=9;
        int res=0;
        int temp=1;

        while(N>0)
        {
            res=res+temp*(N%9);
            N=N/9;
            temp=temp*10;
        }
        System.out.println(res);
    }
}*/

/*
class Main
{
    public static void main(String args[])
    {
        int n=5;
        int var1=1;
        int var2=1;
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>i;j--)
                System.out.print(" ");

//            System.out.print(0);
*/
/*            for(int k=1;k<i+1;k++)
                System.out.print(k);*//*


            for(int k=1;k<=var1;k++)
            {
                System.out.print(Math.abs(k-var2));
            }
            var1+=2;
            var2++;

            System.out.println();
        }
    }
}*/

/*

class Main
{
    public static void main(String args[])
    {
        int count=1;
        int n=4;
*/
/*        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i;j++)
                System.out.print(" ");

            for(int k=1;k<=n;k++)
                System.out.print(count++ +" ");

            System.out.println();

        }*//*



    }
}*/

//class Main
//{
//    enum Levels
//    {
//         TOP,
//         MEDIUM,
//         BOTTOM,
//    }
//    public static void main(String args[])
//        {
//            System.out.println(Levels.TOP);
//    }
//}

/*
class Main
{
    static int square(int a, int b)
    {
        HashMap<String,Integer> hmp=new HashMap<>();
        hmp.put("i*i",-1);

        return a*a+b*b+2*a*b;
    }
    public static void main(String args[])
    {
        String a="5+6i";
        String s[]=a.split("\\+");
        for(String s1: s)
            System.out.print(s1+" ");
        System.out.println();
        String s1[]=a.split("\\+|i");
        for(String s2: s1)
            System.out.print(s2+" ");

        int i=2;
        System.out.println("|i");
    }
}*/

// GRAPH


// Java program to find nth
// magic numebr
import java.io.*;
//
//class Main
//{
//    // Function to find nth magic number
//    static int nthMagicNo(int n)
//    {
//        int pow = 1, answer = 0;
//
//        // Go through every bit of n
//        while (n != 0)
//        {
//            pow = pow*7;
//
//            // If last bit of n is set
//            if ((int)(n & 1) == 1)
//                answer += pow;
//
//            // proceed to next bit
//            // or n = n/2
//            n >>= 1;
//        }
//        return answer;
//    }
//
//    // Driver program to test
//// above function
//    public static void main(String[] args)
//    {
//        int n = 7;
//        System.out.println("nth magic" +
//                " number is " + nthMagicNo(n));
//    }
//}
//
//
//// This code is contributed by
//// prerna saini


// Graph
//class Main
//{
//    static void addEdge(ArrayList<ArrayList<Integer>>adj,int u, int v)
//    {
//        adj.get(u).add(v);
//        adj.get(v).add(u);
//    }
//    static  void BFS(ArrayList<ArrayList<Integer>>adj,int v)
//    {
////        int v=adj.size();
//        boolean visited[]=new boolean[v+1];
//        Arrays.fill(visited,false);
//
//        LinkedList<Integer> queue=new LinkedList<>();
//        int s=1;
//        visited[s]=true;
//        queue.add(s);
//        while(!queue.isEmpty())
//        {
//            s=queue.poll();
//            System.out.print(s+" ");
//
//            for(int i=0;i<adj.get(s).size();i++)
//            {
//                int newnode=adj.get(s).get(i);
//                if(visited[newnode]==false)
//                {
//                    queue.add(newnode);
//                    visited[newnode]=true
//                    ;
//                }
//
//            }
//        }
//
//    }
//    static void Display(ArrayList<ArrayList<Integer>>adj)
//    {
//        for (int i=0;i<adj.size();i++)
//        {
//            System.out.print(i);
//            for(int j=0;j<adj.get(i).size();j++)
//            {
//                System.out.print("---->"+adj.get(i).get(j));
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String args[])
//    {
//
//        int v= 5;
//        ArrayList<ArrayList<Integer>> adj=new ArrayList<>(v);
//        for(int i=0;i<v;i++)
//            adj.add(new ArrayList<>());
//
//        addEdge(adj,0,1);
//        addEdge(adj,0,4);
//        addEdge(adj,1,2);
//        addEdge(adj,1,3);
//        addEdge(adj,1,4);
//        addEdge(adj,2,3);
//        addEdge(adj,3,4);
//        BFS(adj,v);
////        Display(adj);
//    }


/*
abstract class Main
{
    private List<Double> sides;

//    public Main(Double side1, Double side2) {
//    }

    public List<Double> getSides()
    {
        return sides;
    }
    public Main(List<Double> sides)
    {
        this.sides=sides;
    }


    public abstract double area();
    public abstract double perimeter();

}
public  class Rectangle extends Main
{
    private final double width, height, area1, perimeter1 = 0;
    public Rectangle(Double side1,Double side2)
    {
    }

    @Override
    public double area() {
        return 0;
    }

    public double perimeter()
    {
        return 0;
    }
}*/
//
//public abstract class Main {
//    public abstract double getArea();
//    public abstract double getPerimeter();
//
//    public static void main(String args[])
//    {
//
//    }
//}
// abstract class Rectangle extends Main {
//    private final double width, height, area, perimeter;
//
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height= height;
//        this.area = width * height;
//        this.perimeter = 2 * (width + height);
//    }
//
//    public double getArea() {
//        return this.area;
//    }
//
//    public double getPerimeter() {
//        return this.perimeter;
//    }
//
//}


/*
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ken[]=new int[n];
        int ama[]=new int[n];

        for(int i=0;i<n;i++)
            ken[i]=sc.nextInt();


        for(int i=0;i<n;i++)
            ama[i]=sc.nextInt();


        Arrays.sort(ken);
        Arrays.sort(ama);

        int amasum=0;
        int kensum=0;
        for(int i=n-k;i<n;i++)
        {
            kensum+=ken[i];
        }
        for(int i=n-k;i<n;i++)
        {
            amasum+=ama[i];
        }


        if(kensum==amasum)
            System.out.println("DRAW");
        else if(kensum>amasum)
            System.out.println("WIN");
        else
            System.out.println("LOSS");
    }
}*/

/*
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String s=sc.nextLine();
        char prev=s.charAt(0);
        int count=1;
        int max=1;

        for(int i=1;i<n-1;i++)
        {
            if(s.charAt(i)=='a' && (prev=='h' || s.charAt(i+1)=='h'))
                count++;
            else if(s.charAt(i)=='h' && (prev=='a' || s.charAt(i+1)=='a'))
                count++;
            else
            {
                max=Math.max(count,max);
                count=1;
            }
            prev=s.charAt(i-1);
        }
        if(s.charAt(0)=='a' && s.charAt(1)=='h' )
            count++;
        if(s.charAt(n-1)=='h' && s.charAt(n-2)=='a' )
            count++;


        System.out.println(max);
    }
}*/
// Graph WEEK'

/*
* When we have random connections b/w nodes then we use Graoh data Structure
*
* */