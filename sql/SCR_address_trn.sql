INSERT INTO ADDRESS (City, Street, Building_number, Flat_number)
SELECT 'Nowy Dwor Mazowiecki', 'Morawicza', 48, 17 FROM dual
UNION ALL SELECT 'Leoncin', 'Partyzantow', 55, 36 FROM dual
UNION ALL SELECT 'Zakroczym', 'Kapitana Tadeusza Doranta', 71, NULL FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Wojska Polskiego', 86, 47 FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Inzynierska', 91, 7 FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Wojska Polskiego', 66, 46 FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Inzynierska', 84, NULL FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Modlinska', 37, 27 FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Morawicza', 95, 17 FROM dual
UNION ALL SELECT 'Nowy Dwor Mazowiecki', 'Inzynierska', 79, 22 FROM dual
;