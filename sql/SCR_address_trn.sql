INSERT INTO ADDRESS (City, Street, Building_number, Flat_number)
SELECT 'Nowy Dwor Mazowiecki', 'Paderewskiego', 40, 38 FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Modlinska', 63, 31 FROM dual
UNION ALL SELECT 'Pomiechowek', 'Broniewskiego', 97, 3 FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Mickiewicza', 45, 44 FROM dual
UNION ALL SELECT 'Leoncin', 'Polna', 85, 23 FROM dual
UNION ALL SELECT 'Pomiechowek', 'Nasielska', 96, NULL FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Wojska Polskiego', 76, 4 FROM dual
UNION ALL SELECT 'Czosnow', 'Warszawska', 7, 32 FROM dual
