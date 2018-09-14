#include "Trainee.h"

void traineeScript(int how_many)
{
	srand(time(NULL));

	// variable
	
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
		int ID_trn = 1;

		std::vector<std::string> area_name;
		std::vector<int> starting_time_2;
		std::vector<int> starting_time_3;
		std::vector<int> starting_time_4;
		int lesson_date;
		int lesson_year, lesson_month, lesson_day;
		int lesson_no;
		int area_no;
		int ID_emp;
		int ID_veh;
		int starting_time;
		int how_many_lessons;
		int lesson_break;
		int area_first_no;

		std::ofstream file_person("D:/Pati/AA SERWER/Documents/Important things/STUDIA/Projects/TrafficSchool/sql/SCR_person_trn.sql"),
			file_trainee("D:/Pati/AA SERWER/Documents/Important things/STUDIA/Projects/TrafficSchool/sql/SCR_trainee_trn.sql"),
			file_address("D:/Pati/AA SERWER/Documents/Important things/STUDIA/Projects/TrafficSchool/sql/SCR_address_trn.sql"),
			file_lesson("D:/Pati/AA SERWER/Documents/Important things/STUDIA/Projects/TrafficSchool/sql/SCR_lesson_trn.sql");
	

	//female
	{
		female.push_back("Anna");
		female.push_back("Urszula");
		female.push_back("Klaudia");
		female.push_back("Izabela");
		female.push_back("Justyna");
		female.push_back("Monika");
		female.push_back("Barbara");
		female.push_back("Paulina");
		female.push_back("Magdalena");
		female.push_back("Dagmara");
		female.push_back("Agata");
	}

	//male
	{
		male.push_back("Andrzej");
		male.push_back("Cezary");
		male.push_back("Mateusz");
		male.push_back("Michal");
		male.push_back("Piotr");
		male.push_back("Krzysztof");
		male.push_back("Patryk");
		male.push_back("Wojciech");
		male.push_back("Oskar");
		male.push_back("Maciej");
		male.push_back("Adam");
	}

	//surname
	{
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
		surname.push_back("Charko");
		surname.push_back("Nawrot");
		surname.push_back("Kowalik");
		surname.push_back("Lisik");
		surname.push_back("Grzeja");
		surname.push_back("Czajnik");
	}

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
		starting_date.push_back("'2018-10-26'");
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

	//area_name
	{
		area_name.push_back("'Nowy Dwor Mazowiecki'");
		area_name.push_back("'Legionowo'");
		area_name.push_back("'Ciechanow'");
		area_name.push_back("'Warszawa Odlewnicza'");
		area_name.push_back("'Warszawa Bemowo'");
		area_name.push_back("'Warszawa Radarowa'");
	}

	//starting_time_3
	{
		starting_time_2.push_back(7);
		starting_time_2.push_back(11);
		starting_time_2.push_back(13);
		starting_time_2.push_back(16);
		starting_time_2.push_back(18);
	}
	
	//starting_time_3
	{
		starting_time_3.push_back(7);
		starting_time_3.push_back(10);
		starting_time_3.push_back(13);
		starting_time_3.push_back(16);
		starting_time_3.push_back(19);
	}

	//starting_time_4
	{
		starting_time_4.push_back(7);
		starting_time_4.push_back(11);
		starting_time_4.push_back(15);
		starting_time_4.push_back(19);
	}

	
	size_female = female.size();
	size_male = male.size();
	size_surname = surname.size();
	size_starting_date = starting_date.size();
	size_city_street = city_street.size();

	file_person << "INSERT INTO PERSON (Pesel, Surname, Name, Birthday, ID_addr)" << std::endl;
	file_trainee << "INSERT INTO TRAINEE (Pesel, Starting_date)" << std::endl;
	file_address << "INSERT INTO ADDRESS (City, Street, Building_number, Flat_number)" << std::endl;
	file_lesson << "INSERT INTO LESSON (L_date, Starting_time, Area_name, ID_emp, ID_trn, ID_veh)" << std::endl;

	bool start = true;

	for (int i = 0; i<how_many; ++i)
	{
		++ID_addr;
		++ID_trn;
		year = rand() % 100;
		while (year < 60)
			year = rand() % 100;
		month = rand() % 12 + 1;
		day = rand() % 28 + 1;
		//i -> three numbers to pesel;
		sex = rand() % 10;
		last = rand() % 10;

		pesel = std::to_string(year);
		if (month < 10) pesel += '0' + std::to_string(month);
		else pesel += std::to_string(month);
		if (day < 10) pesel += '0' + std::to_string(day);
		else pesel += std::to_string(day);
			
		if (i < 10) pesel += "00" + std::to_string(i);
		else pesel += '0' + std::to_string(i);
		pesel += std::to_string(sex) + std::to_string(last);

		surnam = rand() % size_surname;
		if (sex % 2 == 0)
			name = rand() % size_female;
		else
			name = rand() % size_male;

		start_date = rand() % (size_starting_date - 1);

		city_str = rand() % size_city_street;
		building_number = rand() % 100 + 1;
		flat_number = rand() % 50 + 1;

		if (start)
		{
			file_address << "SELECT ";
			file_person << "SELECT ";
			file_trainee << "SELECT ";
			file_lesson << "SELECT ";
		}
		else
		{
			file_address << "UNION ALL SELECT ";
			file_person << "UNION ALL SELECT ";
			file_trainee << "UNION ALL SELECT ";
			file_lesson << "UNION ALL SELECT ";
		}
		
		file_address << city_street[city_str] << "', " << building_number << ", ";
		if (flat_number % 5 == 0) file_address << "NULL";
		else file_address << flat_number;
		file_address << " FROM dual" << std::endl;

		file_person << "'" << pesel << "', '" << surname[surnam] << "', '";
		if (sex % 2 == 0) file_person << female[name];
		else file_person << male[name];
		file_person << "', to_date('19" << year << "-";
		if (month < 10) file_person << "0";
		file_person << month << "-";
		if (day < 10) file_person << "0";
		file_person << day << "', 'yyyy-mm-dd'), " << ID_addr << " FROM dual" << std::endl;

		file_trainee << "'" << pesel << "', to_date(" << starting_date[start_date] << ", 'yyyy-mm-dd') FROM dual" << std::endl;


		lesson_date = ++start_date; //first
		lesson_year = std::stoi(starting_date[lesson_date].substr(1, 4));
		lesson_month = std::stoi(starting_date[lesson_date].substr(6, 7));
		lesson_day = std::stoi(starting_date[lesson_date].substr(9, 10));

		ID_emp = rand() % 5 + 1;

		switch (ID_emp)
		{
			case 1:
				ID_veh = 1;
				break;
			case 2:
				ID_veh = 2;
				break;
			case 3:
				ID_veh = 3;
				break;
			case 4:
				ID_veh = 4;
				break;
			case 5:
				ID_veh = 5;
				break;
		}

		area_no = rand() % 4 + 2;

		if (area_no == 3) ID_veh = 4;

		for (int i = 0; i < 3; ++i) //2h
		{
			area_first_no = rand() % 2;

			if (ID_emp == 3) starting_time = rand() % 3 + 1;
			else if (ID_emp == 1 || ID_emp == 4) starting_time = rand() % 3;
			else starting_time = rand() % 2 + 3;

			file_lesson << "to_date('" << lesson_year << "-";
			if (lesson_month < 10) file_lesson << "0";
			file_lesson << lesson_month << "-";
			if (lesson_day < 10) file_lesson << "0";
			file_lesson << lesson_day << "', 'yyyy-mm-dd')" << ", " << starting_time_2[starting_time] << ", " << area_name[area_first_no] << ", " << ID_emp
						<< ", " << ID_trn << ", " << ID_veh << " FROM dual" << std::endl;

			lesson_break = rand() % 10 + 1;
			if (lesson_break >= 7) lesson_break = rand() % 2 + 3;
			else lesson_break = rand() % 2 + 1;

			lesson_day += lesson_break;
			if (lesson_month == 2)
			{
				if (lesson_year % 4 == 0)
				{
					if (lesson_day > 29)
					{
						++lesson_month;
						lesson_day = lesson_day % 29 + 1;
					}
				}
				else if (lesson_day > 28)
				{
					++lesson_month;
					lesson_day = lesson_day % 28 + 1;
				}
			}
			else if (lesson_month == 12)
			{
				if (lesson_day > 31)
				{
					++lesson_year;
					lesson_month = 1;
					lesson_day = lesson_day % 31 + 1;
				}
			}
			else if (lesson_month == 1 || lesson_month == 3 || lesson_month == 5 || lesson_month == 7 || lesson_month == 8 || lesson_month == 10)
			{
				if (lesson_day > 31)
				{
					++lesson_month;
					lesson_day = lesson_day % 31 + 1;
				}
			}
			else if (lesson_day > 30)
			{
				++lesson_month;
				lesson_day = lesson_day % 30 + 1;
			}

			file_lesson << "UNION ALL SELECT ";
		}



		if (area_no == 2 || area_no == 5) how_many_lessons = 6;
		else how_many_lessons = 8;

		for (int i = 0; i < how_many_lessons; ++i)
		{
			if (area_no == 2 || area_no == 5) //4h
			{
				if (ID_emp == 3) starting_time = rand() % 2 + 1;
				else if (ID_emp == 1 || ID_emp == 4) starting_time = rand() % 3;
				else starting_time = 3;
			}
			else //3h
			{
				if (ID_emp == 3) starting_time = rand() % 3 + 1;
				else if (ID_emp == 1 || ID_emp == 4) starting_time = rand() % 3;
				else starting_time = 3;
			}

			file_lesson << "to_date('" << lesson_year << "-";
			if (lesson_month < 10) file_lesson << "0";
			file_lesson << lesson_month << "-";
			if (lesson_day < 10) file_lesson << "0";
			file_lesson << lesson_day << "', 'yyyy-mm-dd')" << ", ";
			
			if (area_no == 2 || area_no == 5) file_lesson << starting_time_4[starting_time];
			else file_lesson << starting_time_3[starting_time];
				
			file_lesson << ", " << area_name[area_no] << ", " << ID_emp << ", " << ID_trn << ", " << ID_veh << " FROM dual" << std::endl;



			lesson_break = rand() % 10 + 1;
			if (lesson_break >= 7) lesson_break = rand() % 2 + 3;
			else lesson_break = rand() % 2 + 1;
			lesson_day += lesson_break;

			if (lesson_month == 2)
			{
				if (lesson_year % 4 == 0)
				{
					if (lesson_day > 29)
					{
						++lesson_month;
						lesson_day = lesson_day % 29 + 1;
					}
				}
				else if (lesson_day > 28)
				{
					++lesson_month;
					lesson_day = lesson_day % 28 + 1;
				}
			}
			else if (lesson_month == 12)
			{
				if (lesson_day > 31)
				{
					++lesson_year;
					lesson_month = 1;
					lesson_day = lesson_day % 31 + 1;
				}
			}
			else if (lesson_month == 1 || lesson_month == 3 || lesson_month == 5 || lesson_month == 7 || lesson_month == 8 || lesson_month == 10)
			{
				if (lesson_day > 31)
				{
					++lesson_month;
					lesson_day = lesson_day % 31 + 1;
				}
			}
			else if (lesson_day > 30)
			{
				++lesson_month;
				lesson_day = lesson_day % 30 + 1;
			}

			if(i != how_many_lessons - 1) file_lesson << "UNION ALL SELECT ";
			else file_lesson << std::endl;
		}


		start = false;
	}
	file_address << ";";
	file_person << ";";
	file_trainee << ";";
	file_lesson << ";";
}