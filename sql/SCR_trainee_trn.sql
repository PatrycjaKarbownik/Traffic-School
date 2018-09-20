INSERT INTO TRAINEE (Pesel, Starting_date, Theory, Internal_exam)
SELECT '67052100097', to_date('2014-09-04', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '97110400188', to_date('2015-03-12', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '91070900294', to_date('2018-04-20', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '71031200371', to_date('2014-05-22', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '60072600498', to_date('2014-07-24', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '64042200549', to_date('2017-11-04', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '98110600669', to_date('2014-07-03', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '60040900762', to_date('2017-11-25', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '72102200889', to_date('2016-12-24', 'yyyy-mm-dd'), 'T', 'T' FROM dual
UNION ALL SELECT '91051800933', to_date('2017-08-12', 'yyyy-mm-dd'), 'T', 'T' FROM dual
;