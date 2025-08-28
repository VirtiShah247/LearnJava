// package bankSystem;

// // Source code is decompiled from a .class file using FernFlower decompiler.
// class Account {
//     private long accountNumber;
//     private String holderName;
//     private double balance;

//     Account() {
//         System.out.println("default constructor called");
//     }

//     Account(long var1, String var3, double var4) {
//         this();
//         this.accountNumber = var1;
//         this.holderName = var3;
//         this.balance = var4;
//     }

//     public long getAccountNumber() {
//         return this.accountNumber;
//     }

//     public double getBalance() {
//         return this.balance;
//     }

//     public String getHolderName() {
//         return this.holderName;
//     }

//     public void setAccountNumber(long var1) {
//         this.accountNumber = var1;
//     }

//     public void setHolderName(String var1) {
//         this.holderName = var1;
//     }

//     public void setBalance(double var1) throws Exception {
//         if(var1 < 0) {
//             throw new Exception("Balance cannot be negative");
//         }
//         this.balance = var1;
//     }

//     private static void thisIsStaticMethod() {
//         System.out.println("This is a private static method");
//     }

//     void displayAccountDetails() {
//         System.out.println("Account number: " + this.accountNumber + "\nHolder name: " + this.holderName + "\nBalance: "
//                 + this.balance);
//     }

//     public String toString() {
//         return "Account number: " + this.accountNumber + "\nHolder name: " + this.holderName + "\nBalance: "
//                 + this.balance;
//     }
// }
