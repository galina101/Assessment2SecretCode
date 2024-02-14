package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        //convert the string into code(String), ignore the case


        System.out.println(createSecretCode("AbCygHg"));
        System.out.println(createSecretCode("hijklMn"));
        System.out.println(createSecretCode("nsadfjklfg"));
        System.out.println(createSecretCode("AppleSauce"));
        System.out.println(createSecretCode("wOrD"));
        System.out.println(createSecretCode("Revature"));


    }

    public static String createSecretCode(String s){

        //define the secret conversion pattern
        int rows = 26;
        int columns = 2;
        String[][] conversionChart = new String[rows][columns];
        conversionChart[0][0] = "a";
        conversionChart[0][1] = "01";
        conversionChart[1][0] = "b";
        conversionChart[1][1] = "02";
        conversionChart[2][0] = "c";
        conversionChart[2][1] = "03";
        conversionChart[3][0] = "d";
        conversionChart[3][1] = "04";
        conversionChart[4][0] = "e";
        conversionChart[4][1] = "05";
        conversionChart[5][0] = "f";
        conversionChart[5][1] = "06";
        conversionChart[6][0] = "g";
        conversionChart[6][1] = "07";
        conversionChart[7][0] = "h";
        conversionChart[7][1] = "08";
        conversionChart[8][0] = "i";
        conversionChart[8][1] = "09";
        conversionChart[9][0] = "j";
        conversionChart[9][1] = "10";
        conversionChart[10][0] = "k";
        conversionChart[10][1] = "11";
        conversionChart[11][0] = "l";
        conversionChart[11][1] = "12";
        conversionChart[12][0] = "m";
        conversionChart[12][1] = "13";
        conversionChart[13][0] = "n";
        conversionChart[13][1] = "14";
        conversionChart[14][0] = "o";
        conversionChart[14][1] = "15";
        conversionChart[15][0] = "p";
        conversionChart[15][1] = "16";
        conversionChart[16][0] = "q";
        conversionChart[16][1] = "17";
        conversionChart[17][0] = "r";
        conversionChart[17][1] = "18";
        conversionChart[18][0] = "s";
        conversionChart[18][1] = "19";
        conversionChart[19][0] = "t";
        conversionChart[19][1] = "20";
        conversionChart[20][0] = "u";
        conversionChart[20][1] = "21";
        conversionChart[21][0] = "v";
        conversionChart[21][1] = "22";
        conversionChart[22][0] = "w";
        conversionChart[22][1] = "23";
        conversionChart[23][0] = "x";
        conversionChart[23][1] = "24";
        conversionChart[24][0] = "y";
        conversionChart[24][1] = "25";
        conversionChart[25][0] = "z";
        conversionChart[25][1] = "26";

        int stringLength = s.length();
        String result ="";

        for (int i = 0; i < s.length(); i++) {
            String currentCharacter = String.valueOf(s.charAt(i));
            currentCharacter = currentCharacter.toLowerCase();

            //if 2-d array contains the character, then add it to the result
            //find current character in 2d array

           // if (currentCharacter.equals(conversionChart[i][0])){

           // }

            for (int j=0; j<conversionChart.length; j++){

                for (int k =0; k< conversionChart[j].length; k++){
                    //System.out.println("conversionChart[j][k]: "+ conversionChart[j][k]);
                    //System.out.println("currentCharacter: "+ currentCharacter);
                    //System.out.println("conversionChart[j][k] == currentCharacter: " + (conversionChart[j][k] == currentCharacter));

                    if ((conversionChart[j][k]).equalsIgnoreCase(currentCharacter)){
                        result += conversionChart[j][1];
                    }
                }
            }
            System.out.println("result = " + result);
        }

        return result;
    }
}