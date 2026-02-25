import models.*;

fun main (args:Array<String>){

    val banco = Banco()

    banco.addAccount(Account("0001", Customer("João"), 100.0F));
    banco.addAccount(Account("0002", Customer("Matheus"), 100.0F));
    banco.addAccount(Account("0003", Customer("Tiago"), 100.0F));
    banco.addAccount(Account("0004", Customer("Bartolomeu"), 100.0F));
    banco.addAccount(Account("0005", Customer("Judas"), 100.0F));

    banco.AllAccounts();
}