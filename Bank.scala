//Q4
case class Account(acc: String, bal: Double){
  var accNo = acc
  var balance = bal      
            
  def isNegBal() = if (balance < 0) true else false
  def addInterest(depositRate: Double, overdraftRate: Double) = balance = balance * (1 + (if(isNegBal()) overdraftRate else depositRate))
  override def toString = "\nAccount : " + accNo + "\nBalance : " + balance
            
}

object Bank extends App{
    var accounts: List[Account] = List(
    
    Account("00001", -1000.0), 
    Account("00002", 2000.0), 
    Account("00003", 3000.0)
    
    )

    println("List of Accounts with negative balances : ")
    val negativeBalances = accounts.filter(account => account.isNegBal())
    negativeBalances.map(account => println(account))
   
    println("The sum of all account balances : ")
    val total = accounts.reduce((x, y) => Account("-TOTAL-", x.balance + y.balance))
    println(total)
    
    println("The final balances of all accounts after apply the interest : ")
    accounts.map(account => account.addInterest(0.05, 0.1))
    accounts.map(account => println(account))
    
}