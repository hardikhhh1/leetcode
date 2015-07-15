#include <iostream>
#include <string>

using namespace std;

class Solution {
    public:
        string convert(string s, int numRows){

            // If the number of rows is 1 , return the whole string.
            if(s.empty()) return s;

            if(numRows == 1) return s;

            // Calculate the distance between two separate vertical columns.
            int distance = 2 * numRows - 2;

            string result = ("");

            // Initiate gap bw to columns as distance.
            int gap = distance;

            for(int i = 0; i < numRows; i++){
                result += helper(s, i, gap, distance);

                // At each append, the distance decreases by 2.
                gap = gap - 2;
            }
            return result;
        }

    private:
        string helper(string s, int start, int gap, int distance){
            string returnStr = ("");
            if(gap == 0 || gap == distance){
                // If the gap is equal to distance or is 0 , we append the characters
                // at each distance. These characters are the characters from the whole
                // vertical column.
                for(int i = start ; i < s.length() ; i = i + distance){
                    returnStr += s.at(i);
                }
            } else{
                // Else we first append the char and then append the second character
                // which is in between the whole vertical columns.
                for(int i = start ; i < s.length() ; i = i + distance - gap){
                    returnStr += s.at(i);
                    i += gap;
                    if(i < s.length()){
                        returnStr += s.at(i);
                    }
                }
            }
            return returnStr;
        }


};