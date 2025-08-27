package vaniercollege.zyd;

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
        int lastDigit = (input.length() - 1);
        String barcode = input.substring(1, lastDigit);
        for (int i = 4; i < barcode.length(); i+=5) {
            String temp = barcode.substring(i - 4, i);
            int count = 0;
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == '1') {
                    count++;
                }
            }
            if (count > 2) {
                System.out.println(temp + " is an invalid sequence in the bar code");
            }
        }
        
        this.Zip = parseBarCode(barcode);
    }

    public String GetBarCode() {
        return "";
    }
    
    private int parseBarCode(String input) {
        String result = "";
        for (int i = 4; i < input.length(); i+=5) {
            String temp = input.substring(i - 4, i);
            switch (temp) {
                case "11000" -> result += 0;
                case "00011" -> result += 1;
                case "00101" -> result += 2;
                case "00110" -> result += 3;
                case "01001" -> result += 4;
                case "01010" -> result += 5;
                case "01100" -> result += 6;
                case "10001" -> result += 7;
                case "10010" -> result += 8;
                case "10100" -> result += 9;
            }
        }
        return Integer.parseInt(result);
    }
    
}
