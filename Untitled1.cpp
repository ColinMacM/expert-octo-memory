/**
 * This program will focus on squaring numbers
 * and cubing numbers as well. It will recieve 
 * an input, square it, and cube it.
 * @author Colin MacMillan
 * Date: Sep 12, 2023
 */
 #include <iostream>
 #include <cmath>
 #include <cstdlib>
 
 using namespace std;
 
 int main(){
     int side_length = 0;
     cout<<"Please enter an integer that you wish to square and cube.";
     cin>>side_length;
     int square = side_length*side_length;
     int cube = side_length*side_length*side_length;
     cout<<"The value of the square is "<< square;
     cout<<"The value of the cube is " <<cube;
     return EXIT_SUCCESS;
     
     }
