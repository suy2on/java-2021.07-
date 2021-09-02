# 9월 2일 (목) : 클래스에서 인스턴트사용

1. 메인클래스
~~~java
public class MyOOP {

    public static void main(String[] args) {
        Print p1 = new Print();
        p1.delimiter = "_____";
        p1.A();
        p1.A();
        p1.B();
        p1.B();

        Print p2= new Print();
        p2.delimiter = "*****";
        p2.A();
        p2.A();
        p2.B();
        p2.B();

        p1.A();
        p2.A();
        p1.B();

    }
}
~~~
2. 서브클래스
~~~java
public class Print {
    public  String delimiter = "";
    public void A(){
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public void B(){
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
~~~

3. 배운점
- 서브클래스에서는 멤버변수나 멤버함수 앞에 static사용하면 클래스자체로 사용할때만 쓰인다
- 인스턴트로 만들어서 멤버변수, 함수 사용하려면 static 없애줘야한다
- java는 클래스 파일이름과 같은 class에 들어있는 main함수를 실행시키기로 약속되어있다
- 여러 클래스들 분리가능
