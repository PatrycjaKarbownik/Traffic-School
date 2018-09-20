INSERT INTO ADDRESS (City, Street, Building_number, Flat_number)
SELECT 'Pomiechowek', 'Kolejowa', 10, NULL FROM dual
UNION ALL SELECT 'Zakroczym', 'Kapitana Tadeusza Doranta', 53, NULL FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Mickiewicza', 27, 28 FROM dual
UNION ALL SELECT 'Zakroczym', 'Galachy', 83, 6 FROM dual
UNION ALL SELECT 'Czosnow', 'Warszawska', 14, NULL FROM dual
UNION ALL SELECT 'Leoncin', 'Polna', 70, NULL FROM dual
UNION ALL SELECT 'Leoncin', 'Parkowa', 71, 8 FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Mickiewicza', 24, 38 FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Wojska Polskiego', 33, 23 FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Inzynierska', 36, 11 FROM dual
;