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
        
        if (temp.length() > 5) {
            System.out.println(temp + " zip code is more than 5 digits");
        } else {
            this.Zip = input;
        }
    }

    public ZipCode(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '0' && input.charAt(i) != '1' ) {
                System.out.println("bar code character " + input.charAt(i) + " must be '0' or '1'");
            }
        }
        if (input.lastIndexOf('1') != (input.length() - 1) || input.indexOf('1') != 0) {
            System.out.println("Error: bar code missing a 1 at start or end");
        }
        if ((input.length() - 2) % 5 != 0) {
            System.out.println("Error: bar code must be in multiples of 5-binary digits");
        }
    }

    public String GetBarCode() {
        return "";
    }
    
    private int parseBarCode() {
        return Zip;
    }
    
}
