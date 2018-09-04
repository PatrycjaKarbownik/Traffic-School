INSERT INTO PERSON (Pesel, Surname, Name, Birthday, ID_addr)
	VALUES ('96090912013', 'Matysiak', 'Piotr', to_date('1996-09-09', 'yyyy-mm-dd'), 55);
	
INSERT INTO ADDRESS (City, Street, Building_number)
	VALUES ('Henrysin', 'Henrysin', 9);
	
INSERT INTO TRAINEE (Pesel, Starting_date) --TRG age
	VALUES ('96090912013', to_date('2014-09-21', 'yyyy-mm-dd'));
	
