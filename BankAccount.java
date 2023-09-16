class BankAccount{
   private int pin;
   private String name;
   private double chequingBal;
   private double savingsBal;
   private int accountNum;
   
    private static int numOfAccounts = 0;
  
    public BankAccount(){
      this.pin = pin;
      this.name = name;
      this.chequingBal = chequingBal;
      this.savingsBal = savingsBal;
      this.accountNum = accountNum;
   } 

   public BankAccount(int pin, String name, double chequingBal, savingsBal, int accountNum)
   {
      if(pin < 9999 || pin > 0)
         this.pin = pin;
      else
         throw new RuntimeException("Incorrect pin! Pin can only be a 4 digits.");
      this.name = name;
      chequingBal =
      
   }
	


    public double WithdrawChequing(BankAccount account, double amount)
    {
	    if (amount < 1 || amount > account.chequingBal)
		    throw new RuntimeException(“Error: amount must be positive and must be equal to or less than the balance of the account”);
	    else
	    {
		    account.chequingBal = account.chequingBal - amount;
    return account.chequingBal;
	    }
    }
    public double WithdrawSaving(BankAccount account, double amount)
    {
	    if (amount < 1 || amount > account.savingBal)
	    throw new RuntimeException(“Error: amount must be positive and must be equal to or less than the balance of the account”);
	    else
	    {
		    account.savingBal = account.savingBal - amount;
            return account.savingBal;
	    }
    }


    public double DepositChequing (BankAccount account, double amount)
    {
	    if (amount <= 0)
		    throw new RuntimeException(“Error: must deposit positive amount”);
	    else
	    {
            account.chequingBal = account.chequingBal + amount;
            return account.chequingBal;
        }
    }
    public double DepositSaving (BankAccount account, double amount)
    {
	    if (amount <= 0)
		    throw new RuntimeException(“Error: must deposit positive amount”);
	    else
	    {
            account.savingBal = account.savingBal + amount;
            return account.savingBal;
        }
    }
}