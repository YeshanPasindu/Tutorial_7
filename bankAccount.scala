//Q3

case class Account(acc: String, bal: Double){
    var accNo = acc
    var bal = bal

    def withdraw(amount: Double) = bal = bal - amount

    def deposit(amount: Double) = bal = bal + amount

    def transfer(amount: Double, toAccount: Account) = {
    bal = bal - amount
    toAccount.bal = toAccount.bal + amount
    }
                
    override def toString = "\nAccount : " + accNo + "\nBalance : " + bal

}

object Bank extends App{
    val account1 = Account("00001", 1500.0)
    val account2 = Account("00002", 2500.0)

    println("\n-------------------------------------------------------------------------")
    println("Accounts : ")
    println(account1)
    println(account2)

    println("\n-------------------------------------------------------------------------")
    println("Transfer 500.0 to account 002")
    account1.transfer(500.0, account2)

    println("\n-------------------------------------------------------------------------")
    println("After tranfer : ")
    println(account1)
    println(account2)
}