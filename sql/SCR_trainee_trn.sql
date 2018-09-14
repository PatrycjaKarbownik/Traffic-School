INSERT INTO TRAINEE (Pesel, Starting_date, Theory, Internal_exam)
SELECT '82072500045', to_date('2016-11-12', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '82010100153', to_date('2015-06-25', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '77050800216', to_date('2016-05-28', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '67120200375', to_date('2017-09-02', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '63081800455', to_date('2017-03-18', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '94051900514', to_date('2015-10-08', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '76061600679', to_date('2017-02-25', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '68072800707', to_date('2018-03-30', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '64010200859', to_date('2017-11-04', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '82101300982', to_date('2014-07-03', 'yyyy-mm-dd'), 'T', 'T' FROM dual
;