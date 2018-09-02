INSERT INTO ADDRESS (City, Street, Building_number, Flat_number)
	SELECT 'Warszawa', 'Odlewnicza', 8 FROM dual
	UNION ALL SELECT 'Warszawa', 'Powstancow Slaskich', 127 FROM dual
	UNION ALL SELECT 'Warszawa', 'Radarowa', 1 FROM dual
	UNION ALL SELECT 'Ciechanow', 'Mleczarska', 27 FROM dual
	;