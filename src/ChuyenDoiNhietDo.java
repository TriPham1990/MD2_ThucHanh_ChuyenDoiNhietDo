public class ChuyenDoiNhietDo {
    public static double doCSangDoF(double doC){
        double doF = (doC +32) * 9 / 5;
        return doF;
    }
    public static double doFSangDoC(double doF){
        double doC = (doF - 32) * 5 / 9;
        return doC;
    }
}
