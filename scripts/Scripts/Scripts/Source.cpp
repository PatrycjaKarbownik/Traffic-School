#include <iostream>
#include "Address.h"
#include "Trainee.h"

void clear()
{
	system("cls");
}

int main()
{
	int choice;
	Trainee *trn;
	Address *adr;

	while(1)
	{ 
		std::cout << "Which script would you like to choose?" << std::endl;
		std::cout << "[1] - ADDRESS" << std::endl;
		std::cout << "[2] - trainee (PERSON, TRAINEE, LESSON and EXAM)" << std::endl;
		std::cout << "[0] - end" << std::endl << std::endl;

		std::cout << "I choose: ";
		std::cin >> choice;
		clear();

		switch (choice)
		{
		case 0:
			return 1;
		case 1:
			adr = new Address();
			adr->addressScript();
			std::cout << "[ADDRESS] The script has saved." << std::endl << std::endl;
			break;
		case 2:
			int x;
			std::cout << "How many trainees do you need?" << std::endl << "I need: ";
			std::cin >> x;
			trn = new Trainee();
			trn->traineeScript(x);
			clear();
			std::cout << "[PERSON and TRAINEE] The script has saved." << std::endl << std::endl;
			break;
		default:
			std::cout << "Wrong choice!" << std::endl << std::endl;
			break;
		}

	}
	return 0;
}