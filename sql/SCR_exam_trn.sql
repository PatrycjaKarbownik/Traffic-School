INSERT INTO EXAM (E_date, ID_word, ID_trn, E_type, Pass_or_not)
SELECT to_date('2014-10-23', 'yyyy-mm-dd'), 3, 2, 'theory', 'pass' FROM dual
UNION ALL SELECT to_date('2014-11-14', 'yyyy-mm-dd'), 3, 2, 'practice', 'pass' FROM dual
UNION ALL SELECT to_date('2015-04-27', 'yyyy-mm-dd'), 3, 3, 'theory', 'pass' FROM dual
UNION ALL SELECT to_date('2015-05-19', 'yyyy-mm-dd'), 3, 3, 'practice', 'not' FROM dual
UNION ALL SELECT to_date('2015-06-10', 'yyyy-mm-dd'), 3, 3, 'practice', 'not' FROM dual
UNION ALL SELECT to_date('2015-07-02', 'yyyy-mm-dd'), 3, 3, 'practice', 'pass' FROM dual
UNION ALL SELECT to_date('2018-06-10', 'yyyy-mm-dd'), 4, 4, 'theory', 'pass' FROM dual
UNION ALL SELECT to_date('2018-07-02', 'yyyy-mm-dd'), 4, 4, 'practice', 'not' FROM dual
UNION ALL SELECT to_date('2018-07-23', 'yyyy-mm-dd'), 4, 4, 'practice', 'pass' FROM dual
UNION ALL SELECT to_date('2014-07-17', 'yyyy-mm-dd'), 3, 5, 'theory', 'not' FROM dual
UNION ALL SELECT to_date('2014-07-24', 'yyyy-mm-dd'), 3, 5, 'theory', 'not' FROM dual
UNION ALL SELECT to_date('2014-07-31', 'yyyy-mm-dd'), 3, 5, 'theory', 'pass' FROM dual
UNION ALL SELECT to_date('2014-08-22', 'yyyy-mm-dd'), 3, 5, 'practice', 'pass' FROM dual
UNION ALL SELECT to_date('2014-09-22', 'yyyy-mm-dd'), 1, 6, 'theory', 'pass' FROM dual
UNION ALL SELECT to_date('2014-10-14', 'yyyy-mm-dd'), 1, 6, 'practice', 'not' FROM dual
UNION ALL SELECT to_date('2014-11-05', 'yyyy-mm-dd'), 1, 6, 'practice', 'not' FROM dual
UNION ALL SELECT to_date('2014-11-26', 'yyyy-mm-dd'), 1, 6, 'practice', 'pass' FROM dual
UNION ALL SELECT to_date('2017-12-26', 'yyyy-mm-dd'), 4, 7, 'theory', 'not' FROM dual
UNION ALL SELECT to_date('2018-01-03', 'yyyy-mm-dd'), 4, 7, 'theory', 'pass' FROM dual
UNION ALL SELECT to_date('2018-01-24', 'yyyy-mm-dd'), 4, 7, 'practice', 'not' FROM dual
UNION ALL SELECT to_date('2018-02-15', 'yyyy-mm-dd'), 4, 7, 'practice', 'not' FROM dual
UNION ALL SELECT to_date('2018-03-09', 'yyyy-mm-dd'), 4, 7, 'practice', 'not' FROM dual
UNION ALL SELECT to_date('2018-03-30', 'yyyy-mm-dd'), 4, 7, 'practice', 'not' FROM dual
UNION ALL SELECT to_date('2018-04-21', 'yyyy-mm-dd'), 4, 7, 'practice', 'pass' FROM dual
UNION ALL SELECT to_date('2014-08-29', 'yyyy-mm-dd'), 2, 8, 'theory', 'pass' FROM dual
UNION ALL SELECT to_date('2014-09-20', 'yyyy-mm-dd'), 2, 8, 'practice', 'not' FROM dual
UNION ALL SELECT to_date('2014-10-12', 'yyyy-mm-dd'), 2, 8, 'practice', 'pass' FROM dual
UNION ALL SELECT to_date('2018-01-18', 'yyyy-mm-dd'), 1, 9, 'theory', 'not' FROM dual
UNION ALL SELECT to_date('2018-01-25', 'yyyy-mm-dd'), 1, 9, 'theory', 'not' FROM dual
UNION ALL SELECT to_date('2018-02-02', 'yyyy-mm-dd'), 1, 9, 'theory', 'pass' FROM dual
UNION ALL SELECT to_date('2018-02-23', 'yyyy-mm-dd'), 1, 9, 'practice', 'not' FROM dual
UNION ALL SELECT to_date('2018-03-17', 'yyyy-mm-dd'), 1, 9, 'practice', 'not' FROM dual
UNION ALL SELECT to_date('2018-04-08', 'yyyy-mm-dd'), 1, 9, 'practice', 'pass' FROM dual
UNION ALL SELECT to_date('2017-02-18', 'yyyy-mm-dd'), 3, 10, 'theory', 'pass' FROM dual
UNION ALL SELECT to_date('2017-03-12', 'yyyy-mm-dd'), 3, 10, 'practice', 'not' FROM dual
UNION ALL SELECT to_date('2017-04-03', 'yyyy-mm-dd'), 3, 10, 'practice', 'pass' FROM dual
UNION ALL SELECT to_date('2017-10-13', 'yyyy-mm-dd'), 1, 11, 'theory', 'not' FROM dual
UNION ALL SELECT to_date('2017-10-20', 'yyyy-mm-dd'), 1, 11, 'theory', 'pass' FROM dual
UNION ALL SELECT to_date('2017-11-11', 'yyyy-mm-dd'), 1, 11, 'practice', 'not' FROM dual
UNION ALL SELECT to_date('2017-12-03', 'yyyy-mm-dd'), 1, 11, 'practice', 'not' FROM dual
UNION ALL SELECT to_date('2017-12-24', 'yyyy-mm-dd'), 1, 11, 'practice', 'not' FROM dual
UNION ALL SELECT to_date('2018-01-15', 'yyyy-mm-dd'), 1, 11, 'practice', 'pass' FROM dual
;