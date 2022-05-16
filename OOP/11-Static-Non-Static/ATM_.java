public class ATM_{
    // Static variables
    public static int totalMoney = 0;
    public static int numATMs = 0;
  
    // Instance variables
    public int money;
  
    public ATM_(int inputMoney){
      this.money = inputMoney;
      numATMs += 1;
      totalMoney += inputMoney;
    }
  
    public void withdrawMoney(int amountToWithdraw){
      if(amountToWithdraw <= this.money){
        this.money -= amountToWithdraw;
        totalMoney -= amountToWithdraw;
      }
    }
  
    public static void averageMoney(){
      System.out.println(totalMoney / numATMs);
    }
  
    public static void main(String[] args){
  
      System.out.println("Total number of ATMs: " + ATM_.numATMs); 
      ATM_ firstATM = new ATM_(1000);
      ATM_ secondATM = new ATM_(500);
      System.out.println("Total number of ATMs: " + ATM_.numATMs); 
  
      System.out.println("Total amount of money in all ATMs: " + ATM_.totalMoney);  
      firstATM.withdrawMoney(500);
      secondATM.withdrawMoney(200);
      System.out.println("Total amount of money in all ATMs: " + ATM_.totalMoney);    
  
      // Call averageMoney() here
      ATM_.averageMoney();
    }
  
  }