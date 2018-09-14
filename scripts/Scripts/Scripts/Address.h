#include <cstdlib>
#include <vector>
#include <ctime>
#include <fstream>
#include <string>

/*
std::vector<std::string> city;
std::vector<std::string> street;

std::ofstream file("D:/Pati/AA SERWER/Documents/Important things/STUDIA/Projects/TrafficSchool/sql/SCR_address.sql");
*/

class Address
{
	std::vector<std::string> city;
	std::vector<std::string> street;

public:
	void addressScript();
};