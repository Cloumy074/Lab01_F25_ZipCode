package vaniercollege.zyd;

import java.util.Arrays;

/**
 * @author 2480549
 * 2025/08/27
 * https://github.com/Cloumy074/Lab01_F25_ZipCode.git
 */
class ZipCode {
    int Zip;

    public ZipCode(int input) {
        String temp = Integer.toString(input);
        System.out.println(temp);
    }

    public ZipCode(String input) {}

    public String GetBarCode() {
        return "";
    }
    
    private int parseBarCode() {
        return Zip;
    }
    
}
