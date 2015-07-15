package String.Question1;

/**
 * Created by hardikarora on 7/14/15.
 */
public class Solution {

    public String convert(String s, int numRows) {
        // If the number of rows is 1 , return the whole string.
        if(numRows == 1) return s;

        // Calculate the distance between two separate vertical columns.
        int distance = 2 * numRows - 2;
        StringBuilder builder = new StringBuilder();

        // Initiate gap bw to columns as distance.
        int gap = distance;

        for(int i = 0; i < numRows ; i++){
            builder.append(helper(s, i, gap, distance));

            // At each append, the distance decreases by 2.
            gap = gap - 2;
        }
        return builder.toString();
    }

    /**
     * Helper function to get the string printed according to the given distance and
     * given gap
     * @param s String s, from which characters have to be taken.
     * @param start int start representing the starting point of the first character.
     * @param gap Represents the gap between the two characters.
     * @param distance The max distance between whole vertical columns.
     * @return The string without zig zag.
     */
    public String helper(String s,int start, int gap, int distance){
        StringBuilder builder = new StringBuilder();

        if(gap == distance || gap == 0){
            // If the gap is equal to distance or is 0 , we append the characters
            // at each distance. These characters are the characters from the whole
            // vertical column.
            for (int i = start ; i < s.length(); i = i + distance){
                builder.append(s.charAt(i));
            }
        } else{
            // Else we first append the char and then append the second character
            // which is in between the whole vertical columns.
            for (int i = start ; i < s.length(); i = i + distance - gap){
                builder.append(s.charAt(i));
                i += gap;
                if(i < s.length()){
                    builder.append(s.charAt(i));
                }
            }
        }
        return builder.toString();
    }


}