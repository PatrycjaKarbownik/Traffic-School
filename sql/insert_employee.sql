-- INSTRUCTORS
INSERT INTO EMPLOYEE (Pesel, Hire_date, Name_of_position)
	VALUES ('65011421306', to_date('2016-09-03', 'yyyy-mm-dd'), 'instructor');

INSERT INTO EMPLOYEE (Pesel, Hire_date, Name_of_position, Starting_time)
	SELECT '64061521330', to_date('2014-05-01', 'yyyy-mm-dd'), 'instructor', 16 FROM dual
	UNION ALL SELECT '60021405051', to_date('2014-05-01', 'yyyy-mm-dd'), 'instructor', 9 FROM dual
	UNION ALL SELECT '65010206978', to_date('2014-05-01', 'yyyy-mm-dd'), 'instructor', 7 FROM dual
	UNION ALL SELECT '68052102210', to_date('2015-07-09', 'yyyy-mm-dd'), 'instructor', 14 FROM dual
	;

-- SECRETARIES
INSERT INTO EMPLOYEE (Pesel, Hire_date, Name_of_position, Starting_time)
	SELECT '73061201223', to_date('2014-05-01', 'yyyy-mm-dd'), 'secretary', 10 FROM dual
	UNION ALL SELECT '80012832005', to_date('2017-04-14', 'yyyy-mm-dd'), 'secretary', 10 FROM dual
	;
	
-- DIRECTOR
INSERT INTO EMPLOYEE (Pesel, Hire_date, Name_of_position)
	VALUES ('76071501330', to_date('2014-05-01', 'yyyy-mm-dd'), 'director');
