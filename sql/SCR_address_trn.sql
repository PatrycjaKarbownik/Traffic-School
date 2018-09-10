INSERT INTO ADDRESS (City, Street, Building_number, Flat_number)
SELECT 'Nowy Dwor Mazowiecki', 'Morawicza', 97, 12 FROM dual
UNION ALL SELECT 'Pomiechowek', 'Broniewskiego', 59, NULL FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Mickiewicza', 79, 17 FROM dual
UNION ALL SELECT 'Pomiechowek', 'Kolejowa', 28, NULL FROM dual
UNION ALL SELECT 'Leoncin', 'Polna', 83, NULL FROM dual
UNION ALL SELECT 'Leoncin', 'Parkowa', 30, 1 FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Generala Jozefa Bema', 58, 33 FROM dual
UNION ALL SELECT 'Zakroczym', 'Galachy', 97, 18 FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Generala Jozefa Bema', 23, 22 FROM dual
UNION ALL SELECT 'Zakroczym', 'Warszawska', 79, 13 FROM dual
;