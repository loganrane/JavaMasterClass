package ExceptionHandling;

import java.util.Scanner;

class Customer{
    private int custNo;
    private String custName;
    private String custPhone;

    public int getCustNo() {
        return custNo;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public Customer(int custNo, String custName, String custPhone) throws InvalidCustNoException {
        this.custNo = custNo;
        this.custName = custName;
        this.custPhone = custPhone;
        String s = Integer.toString(custNo);
        try{
            if(s.length() > 4) {
                throw new InvalidCustNoException();
            }
        } catch(InvalidCustNoException e){
            System.out.println("Invalid Customer ID");
        }

        try{
            if(custPhone.length() != 10){
                throw new InvalidPhoneException();
            }
        }
        catch(InvalidPhoneException e){
            System.out.println("Invalid phone number");
        }
    }
}
class InvalidCustNoException extends Exception{}
class InvalidPhoneException extends  Exception{}


public class TestCustomer {
    public static void main(String[] args) throws InvalidCustNoException {
        System.out.println("Enter customer details : ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        String phone = sc.next();
        Customer c = new Customer(id, name, phone);
        System.out.println(" -- Customer Details -- ");
        System.out.println("ID : " + c.getCustNo());
        System.out.println("Name : " + c.getCustName());
        System.out.println("Phone : " + c.getCustPhone());
    }
}
