package hwfour;

import java.lang.reflect.Array;
import java.util.*;

public class Questions {
    public static void main(String[] args) {
        // Question 1

        String[] names = {"george", "mary", "paul", "Joey"};
        int[] nums = new int[]{1, 2, 3, 4};


        System.out.println(getLastIndex(names));

        System.out.println(getSecondToLastIndex(names));

        System.out.println(getFirstElement(names));

        System.out.println(getLastElement(names));

        System.out.println(getSecondToLastElement(names));

        System.out.println(getSum(nums));

        System.out.println(getAverage(nums));

        System.out.println(extractAllOddNumbers(nums));

        System.out.println(extractAllEvenNumbers(nums));

        System.out.println(contains(names, "Randall"));

         System.out.println(getIndexByElement(names, "george"));

         printOddNumbersInRange(0,100);

         System.out.println(printGivenStringTimesNumberGiven("LOL", 3));

         System.out.println(repeatFirstThreeLetters("hello", 2));

         System.out.println(WordsInAStringCounter("What is the meaning of life?"));

        System.out.println(VowelsCounter("Never gonna give you up"));

        System.out.println(Arrays.toString(swap(names)));

        System.out.println(replaceCharacters("The farmer went to the store to get 1 dollar's worth of fertilizer"));

        System.out.println(replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence"));

       System.out.println(createStringOfFibonnaciUpToMax(200));

    }

    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }

    public static String getFirstElement(String[] names) {
        return names[0];
    }

    public static String getLastElement(String[] names) {
        return names[names.length - 1];
    }

    public static String getSecondToLastElement(String[] names) {
        return names[names.length - 2];
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        return sum;
    }

    public static double getAverage(int[] ints) {
        double sum = 0;
        for (double i : ints) {
            sum = sum + i;
        }
        return sum / ints.length;
    }

    public static String extractAllOddNumbers(int[] ints) {
        List<Integer> oddNums = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                oddNums.add(ints[i]);
            }
        }
        return oddNums.toString();
    }

    public static String extractAllEvenNumbers(int[] ints) {
        List<Integer> evenNums = new ArrayList<>();
        for (int e = 0; e < ints.length; e++) {
            if (ints[e] % 2 == 0) {
                evenNums.add(ints[e]);
            }
        }
        return evenNums.toString();
    }

    public static boolean contains(String[] names, String element) {

        for (String name : names) {
            if (name.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static int getIndexByElement(String[] names, String element) {
        for (int i = 0; i < names.length; i++)
            if (element.equals(names[i]))
                return i;

        return 1;
    }

    public static void printOddNumbersInRange(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static String printGivenStringTimesNumberGiven(String str, int n) {
        System.out.println(str.repeat(n));
        return str;
    }

    public static String repeatFirstThreeLetters(String str, int n) {
        String substr;
        substr = str.substring(0, 3);
        System.out.println(substr.repeat(n));
        return substr;
    }

    public static int WordsInAStringCounter(String str) {
        StringTokenizer tokens = new StringTokenizer(str);
        return tokens.countTokens();
    }

    public static int VowelsCounter(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static String[] swap(String[] stringArray) {
        String ele = stringArray[0];
        stringArray[0] = stringArray[stringArray.length - 1];
        stringArray[stringArray.length - 1] = ele;

        return stringArray;
    }

    public static String replaceCharacters(String str) {
        String replaceString = str.replace('f', '7').replace('s', '$').replace('1', '!').replace('a', '@');
        return replaceString;
    }

    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
        String[] arrOfStr = stringInput.split(" ");

        for (int i = 1; i < arrOfStr.length; i++) {
            if (i % 2 == 0) {
                arrOfStr[i - 1] = "Wu";
            } else if (i % 3 == 0) {
                arrOfStr[i - 1] = "Tang";
            }
        }
        return String.join(" ", arrOfStr);
    }

        public static String createStringOfFibonnaciUpToMax ( int maxnumber){
            int n = maxnumber, i = 0, x = 1;
            String fibonnaci ="";
            while (i <= n)
            {
                int sum = i + x;
                i = x;
                x = sum;
                fibonnaci = fibonnaci + i + " ";
            }
            return fibonnaci;
        }
    }
