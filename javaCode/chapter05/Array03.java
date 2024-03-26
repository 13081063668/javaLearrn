public class Array03 {
    public static void main(String []args){
        char []chs = new char[26];
        for(int i = 0; i < chs.length; i ++ ){
            chs[i] = (char)('A' + i);
        }
        for(int i = 0; i < chs.length; i ++ ){
            System.out.println(chs[i]);
        }
    }
}
