import java.util.ArrayList;

public class RomanToInt {
    public static void main(String[] args) {
        int integer = convertRomanToInt("MMDCCCLXXIX");
        System.out.println(integer);
    }

    public static int convertRomanToInt(String s) {
        int sum = 0;
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i=0; i< s.length(); i++) {
            int value = getValue(s.charAt(i));
            integerArrayList.add(value);
        }
        for (int addValue: integerArrayList) {
            sum += addValue;
        }
        ArrayList<Integer> integerSubtractList = cleanRomanNumeral(integerArrayList);
        for (int subtractValue: integerSubtractList) {
            sum -= (subtractValue*2);
        }
        return sum;
    }

    public static int getValue(char c){
        if (c == 'M'){
            return 1000;
        }
        else if (c == 'D'){
            return 500;
        }
        else if (c == 'C'){
            return 100;
        }
        else if (c == 'L'){
            return 50;
        }
        else if (c == 'X'){
            return 10;
        }
        else if (c == 'V'){
            return 5;
        }
        else if (c == 'I'){
            return 1;
        }
        else {
            return 0;
        }
    }

    public static ArrayList<Integer> cleanRomanNumeral(ArrayList<Integer> integerAddList){
        ArrayList<Integer> integerSubtractList = new ArrayList<>();
        for (int i=0; i < integerAddList.size()-1; i++) {
            if (integerAddList.get(i) < integerAddList.get(i+1)){
                integerSubtractList.add(integerAddList.get(i));
            }
        }
        return integerSubtractList;
    }
}