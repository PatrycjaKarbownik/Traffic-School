INSERT INTO PERSON (Pesel, Surname, Name, Birthday, ID_addr)
SELECT '77070900053', 'Czajnik', 'Patryk', to_date('1977-07-09', 'yyyy-mm-dd'), 55 FROM dual
UNION ALL SELECT '82092400105', 'Czajnik', 'Agata', to_date('1982-09-24', 'yyyy-mm-dd'), 56 FROM dual
UNION ALL SELECT '88111600280', 'Kmita', 'Monika', to_date('1988-11-16', 'yyyy-mm-dd'), 57 FROM dual
UNION ALL SELECT '71031600384', 'Pierscieniak', 'Klaudia', to_date('1971-03-16', 'yyyy-mm-dd'), 58 FROM dual
UNION ALL SELECT '83100700487', 'Lisik', 'Klaudia', to_date('1983-10-07', 'yyyy-mm-dd'), 59 FROM dual
UNION ALL SELECT '65110600515', 'Bitke', 'Adam', to_date('1965-11-06', 'yyyy-mm-dd'), 60 FROM dual
UNION ALL SELECT '81010300641', 'Czajnik', 'Paulina', to_date('1981-01-03', 'yyyy-mm-dd'), 61 FROM dual
UNION ALL SELECT '61072600720', 'Bogusz', 'Agata', to_date('1961-07-26', 'yyyy-mm-dd'), 62 FROM dual
UNION ALL SELECT '67011200875', 'Kowal', 'Wojciech', to_date('1967-01-12', 'yyyy-mm-dd'), 63 FROM dual
UNION ALL SELECT '64091100926', 'Kowalik', 'Klaudia', to_date('1964-09-11', 'yyyy-mm-dd'), 64 FROM dual
;