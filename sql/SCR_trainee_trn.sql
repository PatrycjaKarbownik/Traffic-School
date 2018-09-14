INSERT INTO TRAINEE (Pesel, Starting_date)
SELECT '77070900053', to_date('2018-08-24', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '82092400105', to_date('2015-01-29', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '88111600280', to_date('2016-04-17', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '71031600384', to_date('2014-11-06', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '83100700487', to_date('2016-05-28', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '65110600515', to_date('2016-02-13', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '81010300641', to_date('2016-12-24', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '61072600720', to_date('2017-04-08', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '67011200875', to_date('2017-11-25', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '64091100926', to_date('2014-07-03', 'yyyy-mm-dd') FROM dual
;