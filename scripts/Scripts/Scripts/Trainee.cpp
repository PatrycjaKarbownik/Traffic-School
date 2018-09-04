#include "Trainee.h"

void traineeScript()
{
	srand(time(NULL));
	int year, month, day;
	int sex, last;
	std::string pesel;
	std::vector<std::string> female;
	std::vector<std::string> male;
	std::vector<std::string> surname;
	int name, surnam;
	int size_male, size_female, size_surname;
	std::vector<std::string> starting_date;
	int start_date;
	int size_starting_date;
	std::vector<std::string> city_street;
	int city_str;
	int size_city_street;
	int building_number, flat_number;
	int ID_addr = 54;

	female.push_back("Anna");
	female.push_back("Urszula");
	female.push_back("Klaudia");
	female.push_back("Izabela");
	female.push_back("Justyna");
	female.push_back("Monika");


	male.push_back("Andrzej");
	male.push_back("Cezary");
	male.push_back("Mateusz");
	male.push_back("Michal");
	male.push_back("Piotr");
	male.push_back("Krzysztof");
	male.push_back("Andrzej");

	surname.push_back("Kowal");
	surname.push_back("Pierscieniak");
	surname.push_back("Mateja");
	surname.push_back("Kmita");
	surname.push_back("Sysyn");
	surname.push_back("Matys");
	surname.push_back("Aksamit");
	surname.push_back("Koliber");
	surname.push_back("Kolba");
	surname.push_back("Zajac");
	surname.push_back("Stolc");
	surname.push_back("Bitke");
	surname.push_back("Wilk");
	surname.push_back("Bogusz");

	//starting_date
	{
		starting_date.push_back("'2014-05-01'");
		starting_date.push_back("'2014-05-22'");
		starting_date.push_back("'2014-06-12'");
		starting_date.push_back("'2014-07-03'");
		starting_date.push_back("'2014-07-24'");
		starting_date.push_back("'2014-08-14'");
		starting_date.push_back("'2014-09-04'");
		starting_date.push_back("'2014-09-25'");
		starting_date.push_back("'2014-10-16'");
		starting_date.push_back("'2014-11-06'");
		starting_date.push_back("'2014-11-27'");
		starting_date.push_back("'2014-12-18'");
		starting_date.push_back("'2015-01-08'");
		starting_date.push_back("'2015-01-29'");
		starting_date.push_back("'2015-02-19'");
		starting_date.push_back("'2015-03-12'");
		starting_date.push_back("'2015-04-02'");
		starting_date.push_back("'2015-04-23'");
		starting_date.push_back("'2015-05-14'");
		starting_date.push_back("'2015-06-04'");
		starting_date.push_back("'2015-06-25'");
		starting_date.push_back("'2015-07-16'");
		starting_date.push_back("'2015-08-06'");
		starting_date.push_back("'2015-08-27'");
		starting_date.push_back("'2015-09-17'");
		starting_date.push_back("'2015-10-08'");
		starting_date.push_back("'2015-10-29'");
		starting_date.push_back("'2015-11-20'");
		starting_date.push_back("'2015-12-11'");
		starting_date.push_back("'2016-01-02'");
		starting_date.push_back("'2016-01-23'");
		starting_date.push_back("'2016-02-13'");
		starting_date.push_back("'2016-03-06'");
		starting_date.push_back("'2016-03-27'");
		starting_date.push_back("'2016-04-17'");
		starting_date.push_back("'2016-05-07'");
		starting_date.push_back("'2016-05-28'");
		starting_date.push_back("'2016-06-18'");
		starting_date.push_back("'2016-07-09'");
		starting_date.push_back("'2016-07-30'");
		starting_date.push_back("'2016-08-20'");
		starting_date.push_back("'2016-09-10'");
		starting_date.push_back("'2016-10-01'");
		starting_date.push_back("'2016-10-22'");
		starting_date.push_back("'2016-11-12'");
		starting_date.push_back("'2016-12-03'");
		starting_date.push_back("'2016-12-24'");
		starting_date.push_back("'2017-01-14'");
		starting_date.push_back("'2017-02-04'");
		starting_date.push_back("'2017-02-25'");
		starting_date.push_back("'2017-03-18'");
		starting_date.push_back("'2017-04-08'");
		starting_date.push_back("'2017-04-29'");
		starting_date.push_back("'2017-05-20'");
		starting_date.push_back("'2017-06-10'");
		starting_date.push_back("'2017-07-01'");
		starting_date.push_back("'2017-07-22'");
		starting_date.push_back("'2017-08-12'");
		starting_date.push_back("'2017-09-02'");
		starting_date.push_back("'2017-09-23'");
		starting_date.push_back("'2017-10-14'");
		starting_date.push_back("'2017-11-04'");
		starting_date.push_back("'2017-11-25'");
		starting_date.push_back("'2017-12-16'");
		starting_date.push_back("'2018-01-06'");
		starting_date.push_back("'2018-01-27'");
		starting_date.push_back("'2018-02-17'");
		starting_date.push_back("'2018-03-09'");
		starting_date.push_back("'2018-03-30'");
		starting_date.push_back("'2018-04-20'");
		starting_date.push_back("'2018-05-11'");
		starting_date.push_back("'2018-06-01'");
		starting_date.push_back("'2018-06-22'");
		starting_date.push_back("'2018-07-13'");
		starting_date.push_back("'2018-08-03'");
		starting_date.push_back("'2018-08-24'");
		starting_date.push_back("'2018-09-14'");
		starting_date.push_back("'2018-10-05'");
	}

	//ciy_street
	{
		city_street.push_back("'Nowy Dwor Mazowiecki', 'Inzynierska");
		city_street.push_back("'Nowy Dwor Mazowiecki', 'Paderewskiego");
		city_street.push_back("'Nowy Dwor Mazowiecki', 'Modlinska");
		city_street.push_back("'Nowy Dwor Mazowiecki', 'Morawicza");
		city_street.push_back("'Nowy Dwor Mazowiecki', 'Wojska Polskiego");
		city_street.push_back("'Nowy Dwor Mazowiecki', 'Mickiewicza");
		city_street.push_back("'Nowy Dwor Mazowiecki', 'Generala Jozefa Bema");
		city_street.push_back("'Pomiechowek', 'Nasielska");
		city_street.push_back("'Pomiechowek', 'Wojska Polskiego");
		city_street.push_back("'Pomiechowek', 'Kolejowa");
		city_street.push_back("'Pomiechowek', 'Broniewskiego");
		city_street.push_back("'Zakroczym', 'Kapitana Tadeusza Doranta");
		city_street.push_back("'Zakroczym', 'Warszawska");
		city_street.push_back("'Zakroczym', 'Galachy");
		city_street.push_back("'Leoncin', 'Polna");
		city_street.push_back("'Leoncin', 'Parkowa");
		city_street.push_back("'Leoncin', 'Partyzantow");
		city_street.push_back("'Czosnow', 'Warszawska");
		city_street.push_back("'Czosnow', 'Strazacka");
	}
	
	size_female = female.size();
	size_male = male.size();
	size_surname = surname.size();
	size_starting_date = starting_date.size();
	size_city_street = city_street.size();

	std::ofstream file_person("D:/Pati/AA SERWER/Documents/Important things/STUDIA/Projects/TrafficSchool/sql/SCR_person_trn.sql"),
		file_trainee("D:/Pati/AA SERWER/Documents/Important things/STUDIA/Projects/TrafficSchool/sql/SCR_trainee_trn.sql"),
		file_address("D:/Pati/AA SERWER/Documents/Important things/STUDIA/Projects/TrafficSchool/sql/SCR_address_trn.sql");

	file_person << "INSERT INTO PERSON (Pesel, Surname, Name, Birthday, ID_addr)";
	file_trainee << "INSERT INTO TRAINEE (Pesel, Starting_date)";
	file_address << "INSERT INTO ADDRESS (City, Street, Building_number, Flat_number)";

	bool start = true;

	for (int i = 0; i<100; ++i)
	{
		++ID_addr;
		year = rand() % 100;
		while (year < 60)
			year = rand() % 100;
		month = rand() % 12 + 1;
		day = rand() % 28 + 1;
		//i -> three numbers to pesel;
		sex = rand() % 10;
		last = rand() % 10;

		//pesel tu trzeba posklejac

		if (sex % 2 == 0)
			name = rand() % size_female;
		else
			name = rand() % size_male;

		surnam = rand() % size_surname;

		start_date = rand() % size_starting_date;

		city_str = rand() % size_city_street;
		building_number = rand() % 100;
		flat_number = rand() % 50;

		if (start)
		{
			file_address << "SELECT ";
			file_person << "SELECT ";
			file_trainee << "SELECT ";
		}
		else
		{
			file_address << "UNION ALL SELECT ";
			file_person << "UNION ALL SELECT ";
			file_trainee << "UNION ALL SELECT ";
		}
		
		file_address << city_street[city_str] << ", " << building_number << ", ";
		if (flat_number % 5 == 0) file_address << "NULL";
		else file_address << flat_number;
		file_address << " FROM dual" << std::endl;



	}
}