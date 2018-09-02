-- INSTRUCTORS
INSERT INTO PERSON (Pesel, Surname, Name, Birthday, ID_addr)
	SELECT '65011421306', 'Rzepecka', 'Monika', to_date('1965-01-14', 'yyyy-mm-dd'), 5 FROM dual
	UNION ALL SELECT '64061521330', 'Bialy', 'Tomasz', to_date('1964-06-15', 'yyyy-mm-dd'), 6 FROM dual
	UNION ALL SELECT '60021405051', 'Krzywda', 'Andrzej', to_date('1960-02-14', 'yyyy-mm-dd'), 7 FROM dual
	UNION ALL SELECT '65010206978', 'Koziol', 'Dariusz', to_date('1965-01-02', 'yyyy-mm-dd'), 8 FROM dual
	UNION ALL SELECT '68052102210', 'Borkowski', 'Roman', to_date('1968-05-21', 'yyyy-mm-dd'), 9 FROM dual
	;

-- SECRETARIES
INSERT INTO PERSON (Pesel, Surname, Name, Birthday, ID_addr)
	SELECT '73061201223', 'Antoszczuk', 'Joanna', to_date('1973-06-12', 'yyyy-mm-dd'), 10 FROM dual
	UNION ALL SELECT '80012832005', 'Selonka', 'Magdalena', to_date('1980-01-28', 'yyyy-mm-dd'), 11 FROM dual
	;
	
-- DIRECTOR
INSERT INTO PERSON (Pesel, Surname, Name, Birthday, ID_addr)
	VALUES '76071501330', 'Shulz', 'Kamil', to_date('1976-07-15', 'yyyy-mm-dd'), 12;
	
