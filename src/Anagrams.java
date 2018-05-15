import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] input_1 = scanner.nextLine().split("");

        String[] input_2 = scanner.nextLine().split("");

        ArrayList<String> input_1_array_list = new ArrayList<String>(Arrays.asList(input_1));

        ArrayList<String> input_2_array_list = new ArrayList<String>(Arrays.asList(input_2));

        int necessary_deletion = anagram(input_1_array_list, input_2_array_list);

        System.out.println(necessary_deletion);
    }

    public static int anagram(ArrayList<String> input_1_array_list, ArrayList<String> input_2_array_list) {

        int deletion = 0;

        for(int i=0; i<input_1_array_list.size(); i++) {

            for (int j=0; j<input_2_array_list.size(); j++) {

                if (input_1_array_list.get(i).equals(input_2_array_list.get(j))) {

                    input_1_array_list.remove(i);
                    input_2_array_list.remove(j);

                    i--; // for rearranging the index
                    j=input_2_array_list.size(); // for breaking out of loop

                }
            }
        }

        deletion = input_1_array_list.size() + input_2_array_list.size();

        return deletion;
    }
}
