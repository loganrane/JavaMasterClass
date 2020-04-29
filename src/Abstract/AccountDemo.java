package Abstract;

interface AccountInter {
    void create (int accNo, String name, double accBal);
    void delete (int accNo);
    void print(int accNo);
}

class Account implements AccountInter{
    private int accNo;
    private String name;
    private double accBal;

    public Account(int accNo, String name, double accBal) {
        this.accNo = accNo;
        this.name = name;
        this.accBal = accBal;
    }

    public void create (int accNo, String name, double accBal){

    }
    public void delete (int accNo){

    }
    public void print(int accNo){

    }
}


public class AccountDemo {
    public static void main(String[] args){

    }
}
