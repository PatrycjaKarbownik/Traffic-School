INSERT INTO ADDRESS (City, Street, Building_number, Flat_number)
SELECT 'Pomiechowek', 'Nasielska', 4, 1 FROM dual
UNION ALL SELECT 'Czosnow', 'Warszawska', 6, NULL FROM dual
UNION ALL SELECT 'Pomiechowek', 'Broniewskiego', 85, NULL FROM dual
UNION ALL SELECT 'Pomiechowek', 'Broniewskiego', 32, NULL FROM dual
UNION ALL SELECT 'Leoncin', 'Partyzantow', 100, 46 FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Paderewskiego', 6, NULL FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Inzynierska', 28, 39 FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Modlinska', 88, 16 FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Mickiewicza', 17, NULL FROM dual
UNION ALL SELECT 'Pomiechowek', 'Nasielska', 26, 46 FROM dual
;