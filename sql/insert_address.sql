-- WORDs
INSERT INTO ADDRESS (City, Street, Building_number)
	SELECT 'Warszawa', 'Odlewnicza', 8 FROM dual
	UNION ALL SELECT 'Warszawa', 'Powstancow Slaskich', 127 FROM dual
	UNION ALL SELECT 'Warszawa', 'Radarowa', 1 FROM dual
	UNION ALL SELECT 'Ciechanow', 'Mleczarska', 27 FROM dual
	;
	
-- EMPLOYEES
INSERT INTO ADDRESS (City, Street, Building_number, Flat_number)
	SELECT 'Czosnow', 'Legionow', 77, NULL FROM dual
	UNION ALL SELECT 'Legionowo', 'Zegrzynska', 12, 30 FROM dual
	UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Warszawska', 1, 13 FROM dual
	UNION ALL SELECT 'Zakroczym', 'Sloneczna', 11, NULL FROM dual
	UNION ALL SELECT 'Pomiechowek', 'Nowodworska', 43, NULL FROM dual
	UNION ALL SELECT 'Skierdy', 'Modlinska', 49, NULL FROM dual
	UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Legionow', 13, 21 FROM dual
	UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Mazowiecka', 8, 10 FROM dual
	;
	
INSERT INTO ADDRESS (City, Street)
	SELECT 'Nowy Dwor Mazowiecki', 'Zakroczymska' FROM dual
	UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Legionow' FROM dual
	UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Modlinska' FROM dual
	UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Paderewskiego' FROM dual
	UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Falata' FROM dual
	UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Kopernika' FROM dual
	UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Zegrzynska' FROM dual
	UNION ALL SELECT 'Zakroczym', 'Zakroczymska' FROM dual
	UNION ALL SELECT 'Zakroczym', 'Legionow' FROM dual
	UNION ALL SELECT 'Zakroczym', 'Modlinska' FROM dual
	UNION ALL SELECT 'Zakroczym', 'Paderewskiego' FROM dual
	UNION ALL SELECT 'Zakroczym', 'Falata' FROM dual
	UNION ALL SELECT 'Zakroczym', 'Kopernika' FROM dual
	UNION ALL SELECT 'Zakroczym', 'Zegrzynska' FROM dual
	UNION ALL SELECT 'Janowek', 'Zakroczymska' FROM dual
	UNION ALL SELECT 'Janowek', 'Legionow' FROM dual
	UNION ALL SELECT 'Janowek', 'Modlinska' FROM dual
	UNION ALL SELECT 'Janowek', 'Paderewskiego' FROM dual
	UNION ALL SELECT 'Janowek', 'Falata' FROM dual
	UNION ALL SELECT 'Janowek', 'Kopernika' FROM dual
	UNION ALL SELECT 'Janowek', 'Zegrzynska' FROM dual
	UNION ALL SELECT 'Jablonna', 'Zakroczymska' FROM dual
	UNION ALL SELECT 'Jablonna', 'Legionow' FROM dual
	UNION ALL SELECT 'Jablonna', 'Modlinska' FROM dual
	UNION ALL SELECT 'Jablonna', 'Paderewskiego' FROM dual
	UNION ALL SELECT 'Jablonna', 'Falata' FROM dual
	UNION ALL SELECT 'Jablonna', 'Kopernika' FROM dual
	UNION ALL SELECT 'Jablonna', 'Zegrzynska' FROM dual
	UNION ALL SELECT 'Czosnow', 'Zakroczymska' FROM dual
	UNION ALL SELECT 'Czosnow', 'Legionow' FROM dual
	UNION ALL SELECT 'Czosnow', 'Modlinska' FROM dual
	UNION ALL SELECT 'Czosnow', 'Paderewskiego' FROM dual
	UNION ALL SELECT 'Czosnow', 'Falata' FROM dual
	UNION ALL SELECT 'Czosnow', 'Kopernika' FROM dual
	UNION ALL SELECT 'Czosnow', 'Zegrzynska' FROM dual
	UNION ALL SELECT 'Leoncin', 'Zakroczymska' FROM dual
	UNION ALL SELECT 'Leoncin', 'Legionow' FROM dual
	UNION ALL SELECT 'Leoncin', 'Modlinska' FROM dual
	UNION ALL SELECT 'Leoncin', 'Paderewskiego' FROM dual
	UNION ALL SELECT 'Leoncin', 'Falata' FROM dual
	UNION ALL SELECT 'Leoncin', 'Kopernika' FROM dual
	UNION ALL SELECT 'Leoncin', 'Zegrzynska' FROM dual
	;