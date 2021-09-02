public class EqualApp {
    public static void main(String [] args){

        // 원시데이터타입은 ==으로 비교 (위치가 동일)
        // 그렇지 않은 것은 .equals로 비교 (값이 동일)
        // 예외적으로 String은 원시데이터타입 아니지만 선언형태에 따라 다르게 행동


        int p1 = 1;
        int p2 = 1;
        System.out.println(p1==p2); //true

        // instnace로 선언
        String o1 = new String("java");
        String o2 = new String("java");
        System.out.println(o1==o2);  //false
        System.out.println(o1.equals(o2));  //true

        String o3 = "java2";
        String o4 = "java2";
        System.out.println(o3==o4);  //true

    }
}
