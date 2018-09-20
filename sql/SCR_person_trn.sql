INSERT INTO PERSON (Pesel, Surname, Name, Birthday, ID_addr)
SELECT '67052100097', 'Zajac', 'Piotr', to_date('1967-05-21', 'yyyy-mm-dd'), 55 FROM dual
UNION ALL SELECT '97110400188', 'Zajac', 'Magdalena', to_date('1997-11-04', 'yyyy-mm-dd'), 56 FROM dual
UNION ALL SELECT '91070900294', 'Mateja', 'Andrzej', to_date('1991-07-09', 'yyyy-mm-dd'), 57 FROM dual
UNION ALL SELECT '71031200371', 'Kolba', 'Maciej', to_date('1971-03-12', 'yyyy-mm-dd'), 58 FROM dual
UNION ALL SELECT '60072600498', 'Wilk', 'Piotr', to_date('1960-07-26', 'yyyy-mm-dd'), 59 FROM dual
UNION ALL SELECT '64042200549', 'Kmita', 'Dagmara', to_date('1964-04-22', 'yyyy-mm-dd'), 60 FROM dual
UNION ALL SELECT '98110600669', 'Wilk', 'Magdalena', to_date('1998-11-06', 'yyyy-mm-dd'), 61 FROM dual
UNION ALL SELECT '60040900762', 'Kolba', 'Paulina', to_date('1960-04-09', 'yyyy-mm-dd'), 62 FROM dual
UNION ALL SELECT '72102200889', 'Matys', 'Izabela', to_date('1972-10-22', 'yyyy-mm-dd'), 63 FROM dual
UNION ALL SELECT '91051800933', 'Bitke', 'Michal', to_date('1991-05-18', 'yyyy-mm-dd'), 64 FROM dual
;