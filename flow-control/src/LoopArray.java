public class LoopArray {

    public static void main(String[] args){

        String[] names = new String[4];
        names[0] = "suy2on";
        names[1] = "sukmoon";
        names[2] = "yuri";

        //이때 names.length = 4
        for(int i=0; i<names.length; i++) {
            System.out.println(names[i]+",");
        }

        // 한번에 초기화
        // Stirng[] names = {"suy2on", "sukmmon", "yuri"};
    }
}
