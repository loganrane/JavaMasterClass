## Important Notes related to JAVA

**To read a file till EOF**
>To take input till the end of file is reached.
```` 
Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = new String(sc.nextLine());
        }
````

**Exception in Java**
>Handling an exception in java.
````
    try{
             
    } catch (Exception e){
        // System.out.println("Exception : " + e.getMessage());
    }
````