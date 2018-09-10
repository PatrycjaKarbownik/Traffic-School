INSERT INTO PERSON (Pesel, Surname, Name, Birthday, ID_addr)
SELECT '96031900007', 'Kowal', 'Urszula', to_date('1996-03-19', 'yyyy-mm-dd'), 55 FROM dual
UNION ALL SELECT '71031200185', 'Czajnik', 'Agata', to_date('1971-03-12', 'yyyy-mm-dd'), 56 FROM dual
UNION ALL SELECT '99071300285', 'Stolc', 'Justyna', to_date('1999-07-13', 'yyyy-mm-dd'), 57 FROM dual
UNION ALL SELECT '89012700380', 'Kmita', 'Justyna', to_date('1989-01-27', 'yyyy-mm-dd'), 58 FROM dual
UNION ALL SELECT '76111000478', 'Lisik', 'Patryk', to_date('1976-11-10', 'yyyy-mm-dd'), 59 FROM dual
UNION ALL SELECT '82011600569', 'Mateja', 'Izabela', to_date('1982-01-16', 'yyyy-mm-dd'), 60 FROM dual
UNION ALL SELECT '63111100688', 'Stolc', 'Magdalena', to_date('1963-11-11', 'yyyy-mm-dd'), 61 FROM dual
UNION ALL SELECT '67082200750', 'Wilk', 'Mateusz', to_date('1967-08-22', 'yyyy-mm-dd'), 62 FROM dual
UNION ALL SELECT '97102500892', 'Bitke', 'Piotr', to_date('1997-10-25', 'yyyy-mm-dd'), 63 FROM dual
UNION ALL SELECT '94050300978', 'Lisik', 'Patryk', to_date('1994-05-03', 'yyyy-mm-dd'), 64 FROM dual
;