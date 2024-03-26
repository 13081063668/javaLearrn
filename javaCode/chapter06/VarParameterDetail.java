package javaCode.chapter06;

public class VarParameterDetail {
    public static void main(String[] args) {
        int []arr = {1,2,3};
        VarDetail varDetail = new VarDetail();
        varDetail.f1(0, arr);
        
    }
}

class VarDetail{
    public void f1(double num, int ...nums){
        
    }
    // 不可以有两个可变参数
    // public void f2(double ...nums1, int ...nums2){

    // }

}