#include "Address.h"

void addressScript()
{
	std::vector<std::string> city;
	std::vector<std::string> street;

	city.push_back("Nowy Dwor Mazowiecki");
	city.push_back("Zakroczym");
	city.push_back("Janowek");
	city.push_back("Jablonna");
	city.push_back("Czosnow");
	city.push_back("Leoncin");

	street.push_back("Zakroczymska");
	street.push_back("Legionow");
	street.push_back("Modlinska");
	street.push_back("Paderewskiego");
	street.push_back("Falata");
	street.push_back("Kopernika");
	street.push_back("Zegrzynska");

	std::ofstream file("D:/Pati/AA SERWER/Documents/Important things/STUDIA/Projects/TrafficSchool/sql/SCR_address.sql");
	bool start = true;

	file << "INSERT INTO ADDRESS (City, Street)" << std::endl;
	
	for(unsigned int i=0; i<city.size(); ++i)
		for (unsigned int j = 0; j < street.size(); ++j)
		{
			if (start)
			{
				file << "SELECT '" << city[i] << "', '" << street[j] << "' FROM dual" << std::endl;
				start = false;
			}
			else
				file << "UNION ALL SELECT '" << city[i] << "', '" << street[j] << "' FROM dual" << std::endl;
		}
	file << ";";
}