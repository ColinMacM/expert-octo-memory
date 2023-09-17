#include <iostream>
#include <cstdlib>
using namespace std;

int main(){
	cout<<"What is the height of a square based pyramid? \n";
	double height = -8.0;
	cin >> height;
	
	cout << "And the length of the sides of the base? \n";
	double side_length = -8.0;
	cin >> side_length;
	
	double volume_of_pyramid = (side_length * side_length * height)/3.0;
	cout << "The volume of the pyramid is " << volume_of_pyramid;
	
	return EXIT_SUCCESS;	
}
