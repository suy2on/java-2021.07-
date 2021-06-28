#6월 28일 (월) : 자바로 회계 앱만들기  

### 1. AccountingApp 동작설명
##### 공급가를 입력받으면 부가가치세 및 수입을 계산해주고 그것을 배당까지 해주는 프로그램

### 2. 코드
~~~java
public class AccountingApp {

    public static void main(String[] args){

        double valueOfSupply = Double.parseDouble(args[0]); // string -> double
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        double dividend1 = income * 0.5 ;
        double dividend2 = income * 0.3 ;
        double dividend3 = income * 0.2 ;


        System.out.println("Value of supply : "+ valueOfSupply);
        System.out.println("VAT : "+ vat);
        System.out.println("Total : "+ total);
        System.out.println("Expense : "+ expense );
        System.out.println("Income : "+ income);
        System.out.println("Dividend 1 : " + dividend1);
        System.out.println("Dividend 2 : " + dividend2);
        System.out.println("Dividend 3 : " + dividend3);
    }
}
~~~

### 3. 앱 command에서 실행 (java가 깔려있는 컴퓨터여야함)
- 프로젝트 경로복사  
- command창에서 그 경로로 이동
- ls -al 로 확인
- .class 파일 만들어주기 위해 (실행파일) javac AccountingApp.java입력
- java AccountingApp arg[0]값입력
- 예) java AccountingApp 20000.0