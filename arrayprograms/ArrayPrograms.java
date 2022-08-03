
package arrayprograms;
  import java.io.*; 

/**
 *1. Write a program to print the name, salary and date of joining of 10 employees in a company. Use array of objects.
 * @author SHUBHAM
 */
      class WorkerDetail 
        { 
            int code,salary; 
            String WorkerName; 
            void SetData() 
            throws IOException 
              { 
                  BufferedReader bf=new BufferedReader(new InputStreamReader(System.in)); 
                  String s; 
                  System.out.println("Enter Employee Code :"); 
                  s=bf.readLine(); 
                  code=Integer.parseInt(s); 
                  System.out.println("Enter Name of Employee :"); 
                  WorkerName=bf.readLine(); 
                  System.out.println("Enter Basic Salary "); 
                  s=bf.readLine(); 
                  salary=Integer.parseInt(s); 
              } 
                 void ShowDetail() 
                 { 
                    System.out.println("Code :"+ code); 
                    System.out.println("Name : "+WorkerName); 
                    System.out.println("Salary :"+salary); 
                 } 
       } 
                class EmployeesArrayofObjects 
                   { 
                       public static void main(String args[]) 
                          { 
                             int i; 
                               try 
                                 { 
                                     WorkerDetail Worker[]=new WorkerDetail[10]; 
                                     System.out.println("Enter the Details of ten Workers"); 
                                     for(i=0;i<=9;i++) 
                                         { 
                                             Worker[i]=new WorkerDetail(); 
                                             Worker[i].SetData(); 
                                         } 
                                            System.out.println("The details of ten Worker are :"); 
                                            for(i=0;i<=9;i++) 
                                                 { 
                                                     Worker[i].ShowDetail(); 
                                                  } 
                                 } 
                                         catch(IOException e) 
                                            { 
                                             } 
                          } 
                  }
 
    
