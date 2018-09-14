#include <cstdlib>
#include <vector>
#include <ctime>
#include <fstream>
#include <string>
#include <iostream>

class Trainee
{
public:
	Trainee() {};
	~Trainee() {};

private:
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

	int exam_year, exam_month, exam_day;
	int ID_word;
	std::string pass_or_not;
	int random;

	void checkDate(int &year, int &month, int &day);

public:
	void traineeScript(int how_many);
};