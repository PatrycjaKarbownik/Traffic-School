INSERT INTO PERSON (Pesel, Surname, Name, Birthday, ID_addr)
SELECT '70101400044', 'Matys', 'Barbara', to_date('1970-10-14', 'yyyy-mm-dd'), 55 FROM dual
UNION ALL SELECT '85062500127', 'Bitke', 'Justyna', to_date('1985-06-25', 'yyyy-mm-dd'), 56 FROM dual
UNION ALL SELECT '89020500251', 'Kmita', 'Andrzej', to_date('1989-02-05', 'yyyy-mm-dd'), 57 FROM dual
UNION ALL SELECT '84080300351', 'Grzeja', 'Patryk', to_date('1984-08-03', 'yyyy-mm-dd'), 58 FROM dual
UNION ALL SELECT '60081000425', 'Nawrot', 'Izabela', to_date('1960-08-10', 'yyyy-mm-dd'), 59 FROM dual
UNION ALL SELECT '83091200550', 'Sysyn', 'Andrzej', to_date('1983-09-12', 'yyyy-mm-dd'), 60 FROM dual
UNION ALL SELECT '77120700632', 'Bogusz', 'Wojciech', to_date('1977-12-07', 'yyyy-mm-dd'), 61 FROM dual
UNION ALL SELECT '68050100717', 'Czajnik', 'Cezary', to_date('1968-05-01', 'yyyy-mm-dd'), 62 FROM dual
