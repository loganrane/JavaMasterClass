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

**Sorting in Java**
>STL to sort an array in java.

````
Arrays.sort(arr);
````

**Exceptions**
>Throwing exceptions from a class.
````$xslt
public int power(int x, int y) throws Exception{
    if(x < 0 || y < 0){
        throw new Exception("n and p should be non-negative");
    }
    else{
        return (int)Math.pow(x,y);
    }
}
````

