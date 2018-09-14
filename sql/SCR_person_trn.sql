INSERT INTO PERSON (Pesel, Surname, Name, Birthday, ID_addr)
SELECT '69082800059', 'Zajac', 'Wojciech', to_date('1969-08-28', 'yyyy-mm-dd'), 55 FROM dual
UNION ALL SELECT '70121500150', 'Matys', 'Wojciech', to_date('1970-12-15', 'yyyy-mm-dd'), 56 FROM dual
UNION ALL SELECT '99012000256', 'Zajac', 'Adam', to_date('1999-01-20', 'yyyy-mm-dd'), 57 FROM dual
UNION ALL SELECT '91021100312', 'Kmita', 'Michal', to_date('1991-02-11', 'yyyy-mm-dd'), 58 FROM dual
UNION ALL SELECT '73052000419', 'Kowalik', 'Michal', to_date('1973-05-20', 'yyyy-mm-dd'), 59 FROM dual
UNION ALL SELECT '94071500548', 'Kowalik', 'Barbara', to_date('1994-07-15', 'yyyy-mm-dd'), 60 FROM dual
UNION ALL SELECT '83091700616', 'Stolc', 'Mateusz', to_date('1983-09-17', 'yyyy-mm-dd'), 61 FROM dual
UNION ALL SELECT '89040200711', 'Aksamit', 'Cezary', to_date('1989-04-02', 'yyyy-mm-dd'), 62 FROM dual
UNION ALL SELECT '81060400817', 'Zajac', 'Mateusz', to_date('1981-06-04', 'yyyy-mm-dd'), 63 FROM dual
UNION ALL SELECT '94031000975', 'Kmita', 'Maciej', to_date('1994-03-10', 'yyyy-mm-dd'), 64 FROM dual
;