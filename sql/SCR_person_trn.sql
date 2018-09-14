INSERT INTO PERSON (Pesel, Surname, Name, Birthday, ID_addr)
SELECT '82072500045', 'Koliber', 'Magdalena', to_date('1982-07-25', 'yyyy-mm-dd'), 55 FROM dual
UNION ALL SELECT '82010100153', 'Kowalik', 'Piotr', to_date('1982-01-01', 'yyyy-mm-dd'), 56 FROM dual
UNION ALL SELECT '77050800216', 'Grzeja', 'Adam', to_date('1977-05-08', 'yyyy-mm-dd'), 57 FROM dual
UNION ALL SELECT '67120200375', 'Koliber', 'Adam', to_date('1967-12-02', 'yyyy-mm-dd'), 58 FROM dual
UNION ALL SELECT '63081800455', 'Matys', 'Wojciech', to_date('1963-08-18', 'yyyy-mm-dd'), 59 FROM dual
UNION ALL SELECT '94051900514', 'Matys', 'Krzysztof', to_date('1994-05-19', 'yyyy-mm-dd'), 60 FROM dual
UNION ALL SELECT '76061600679', 'Kowal', 'Patryk', to_date('1976-06-16', 'yyyy-mm-dd'), 61 FROM dual
UNION ALL SELECT '68072800707', 'Matys', 'Monika', to_date('1968-07-28', 'yyyy-mm-dd'), 62 FROM dual
UNION ALL SELECT '64010200859', 'Stolc', 'Cezary', to_date('1964-01-02', 'yyyy-mm-dd'), 63 FROM dual
UNION ALL SELECT '82101300982', 'Matys', 'Justyna', to_date('1982-10-13', 'yyyy-mm-dd'), 64 FROM dual
;