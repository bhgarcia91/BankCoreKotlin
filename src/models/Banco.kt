package models

class Banco {
    private var accounts = mutableMapOf<String, Account>()

    fun addAccount (account: Account) {
        accounts[account.accountNumber] = account;
    }

    fun AllAccounts(){
        println("Número da Conta - Nome    -  Saldo")
        for (account in accounts.values){
            println("${account.accountNumber}     - ${account.customer.name}    - ${account.balance}");
        }
    }

    fun accountBalanceUpdate(accountNumber: String, value: Float){
        val account = accounts[accountNumber]

        if(account != null){
             account.balance = value;
        } else {
            println("Account Not Found");
        }
    }
}