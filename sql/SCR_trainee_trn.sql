INSERT INTO TRAINEE (Pesel, Starting_date, Theory, Internal_exam)
SELECT '69082800059', to_date('2017-04-29', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '70121500150', to_date('2015-01-29', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '99012000256', to_date('2018-08-03', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '91021100312', to_date('2018-02-17', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '73052000419', to_date('2016-12-03', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '94071500548', to_date('2017-07-01', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '83091700616', to_date('2014-05-22', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '89040200711', to_date('2014-05-01', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '81060400817', to_date('2018-03-30', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '94031000975', to_date('2016-04-17', 'yyyy-mm-dd'), 'T', 'T' FROM dual
;