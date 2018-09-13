INSERT INTO PERSON (Pesel, Surname, Name, Birthday, ID_addr)
	VALUES ('96090912013', 'Matysiak', 'Piotr', to_date('1996-09-09', 'yyyy-mm-dd'), 55);
	
INSERT INTO ADDRESS (City, Street, Building_number)
	VALUES ('Henrysin', 'Henrysin', 9);
	
INSERT INTO TRAINEE (Pesel, Starting_date, Theory, Internal_exam) --TRG age
	VALUES ('96090912013', to_date('2014-09-25', 'yyyy-mm-dd'), 'T', 'T');
	
	
--data kolejna od rozpoczecia kursu (pierwsze jazdy, potem losowo co 1,2, (3, 4) dni
INSERT INTO LESSON (L_date, Starting_time, Area_name, ID_emp, ID_trn, ID_veh)
	SELECT '2014-10-16', 7, Nowy Dwor Mazowiecki, 1, 1, 1 FROM dual
	UNION ALL SELECT '2014-10-17', 13, Nowy Dwor Mazowiecki, 1, 1, 1 FROM dual
	UNION ALL SELECT '2014-10-19', 13, Nowy Dwor Mazowiecki, 1, 1, 1 FROM dual
	UNION ALL SELECT '2014-10-21', 7, Nowy Dwor Mazowiecki, 1, 1, 1 FROM dual
	UNION ALL SELECT '2014-10-22', 7, Warszawa Odlewnicza, 1, 1, 1 FROM dual
	UNION ALL SELECT '2014-10-23', 10, Warszawa Odlewnicza, 1, 1, 1 FROM dual
	UNION ALL SELECT '2014-10-26', 7, Warszawa Odlewnicza, 1, 1, 1 FROM dual
	UNION ALL SELECT '2014-10-28', 13, Warszawa Odlewnicza, 1, 1, 1 FROM dual
	UNION ALL SELECT '2014-10-31', 10, Warszawa Odlewnicza, 1, 1, 1 FROM dual
	UNION ALL SELECT '2014-11-03', 13, Warszawa Odlewnicza, 1, 1, 1 FROM dual
	UNION ALL SELECT '2014-11-06', 7, Warszawa Odlewnicza, 1, 1, 1 FROM dual
	UNION ALL SELECT '2014-11-11', 13, Warszawa Odlewnicza, 1, 1, 1 FROM dual
	;
	
INSERT INTO EXAM (E_date, ID_word, ID_trn, E_type, Pass_or_not)
	SELECT '2014-12-01', 1, 1, 'theory', 'pass' FROM dual
	UNION ALL SELECT '2014-12-01', 1, 1, 'practice', 'not' FROM dual
	UNION ALL SELECT '2014-12-21', 1, 1, 'practice', 'pass' FROM dual