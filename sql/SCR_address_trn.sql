INSERT INTO ADDRESS (City, Street, Building_number, Flat_number)
SELECT 'Nowy Dwor Mazowiecki', 'Inzynierska', 80, 7 FROM dual
UNION ALL SELECT 'Czosnow', 'Strazacka', 40, NULL FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Morawicza', 9, NULL FROM dual
UNION ALL SELECT 'Pomiechowek', 'Wojska Polskiego', 38, NULL FROM dual
UNION ALL SELECT 'Zakroczym', 'Kapitana Tadeusza Doranta', 73, 16 FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Morawicza', 18, 8 FROM dual
UNION ALL SELECT 'Pomiechowek', 'Nasielska', 29, 13 FROM dual
UNION ALL SELECT 'Zakroczym', 'Galachy', 46, 22 FROM dual
UNION ALL SELECT 'Pomiechowek', 'Kolejowa', 69, 27 FROM dual
UNION ALL SELECT 'Leoncin', 'Polna', 70, 8 FROM dual
;