INSERT INTO TRAINEE (Pesel, Starting_date)
SELECT '96031900007', to_date('2014-07-24', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '71031200185', to_date('2017-07-22', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '99071300285', to_date('2017-05-20', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '89012700380', to_date('2014-09-25', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '76111000478', to_date('2018-09-14', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '82011600569', to_date('2014-07-24', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '63111100688', to_date('2014-09-25', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '67082200750', to_date('2017-04-29', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '97102500892', to_date('2017-09-02', 'yyyy-mm-dd') FROM dual
UNION ALL SELECT '94050300978', to_date('2016-12-24', 'yyyy-mm-dd') FROM dual
;