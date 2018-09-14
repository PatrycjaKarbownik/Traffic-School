INSERT INTO LESSON (L_date, Starting_time, Area_name, ID_emp, ID_trn, ID_veh)
SELECT to_date('2018-09-14', 'yyyy-mm-dd'), 16, 'Nowy Dwor Mazowiecki', 2, 2, 2 FROM dual
UNION ALL SELECT to_date('2018-09-16', 'yyyy-mm-dd'), 18, 'Legionowo', 2, 2, 2 FROM dual
UNION ALL SELECT to_date('2018-09-18', 'yyyy-mm-dd'), 18, 'Legionowo', 2, 2, 2 FROM dual
UNION ALL SELECT to_date('2018-09-19', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 2, 2 FROM dual
UNION ALL SELECT to_date('2018-09-21', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 2, 2 FROM dual
UNION ALL SELECT to_date('2018-09-25', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 2, 2 FROM dual
UNION ALL SELECT to_date('2018-09-27', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 2, 2 FROM dual
UNION ALL SELECT to_date('2018-09-29', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 2, 2 FROM dual
UNION ALL SELECT to_date('2018-09-30', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 2, 2 FROM dual

UNION ALL SELECT to_date('2015-02-19', 'yyyy-mm-dd'), 18, 'Nowy Dwor Mazowiecki', 5, 3, 5 FROM dual
UNION ALL SELECT to_date('2015-02-22', 'yyyy-mm-dd'), 16, 'Legionowo', 5, 3, 5 FROM dual
UNION ALL SELECT to_date('2015-02-24', 'yyyy-mm-dd'), 18, 'Nowy Dwor Mazowiecki', 5, 3, 5 FROM dual
UNION ALL SELECT to_date('2015-02-28', 'yyyy-mm-dd'), 16, 'Warszawa Bemowo', 5, 3, 5 FROM dual
UNION ALL SELECT to_date('2015-03-05', 'yyyy-mm-dd'), 16, 'Warszawa Bemowo', 5, 3, 5 FROM dual
UNION ALL SELECT to_date('2015-03-07', 'yyyy-mm-dd'), 16, 'Warszawa Bemowo', 5, 3, 5 FROM dual
UNION ALL SELECT to_date('2015-03-09', 'yyyy-mm-dd'), 16, 'Warszawa Bemowo', 5, 3, 5 FROM dual
UNION ALL SELECT to_date('2015-03-11', 'yyyy-mm-dd'), 16, 'Warszawa Bemowo', 5, 3, 5 FROM dual
UNION ALL SELECT to_date('2015-03-12', 'yyyy-mm-dd'), 16, 'Warszawa Bemowo', 5, 3, 5 FROM dual
UNION ALL SELECT to_date('2015-03-13', 'yyyy-mm-dd'), 16, 'Warszawa Bemowo', 5, 3, 5 FROM dual
UNION ALL SELECT to_date('2015-03-14', 'yyyy-mm-dd'), 16, 'Warszawa Bemowo', 5, 3, 5 FROM dual

UNION ALL SELECT to_date('2016-05-07', 'yyyy-mm-dd'), 11, 'Nowy Dwor Mazowiecki', 1, 4, 4 FROM dual
UNION ALL SELECT to_date('2016-05-09', 'yyyy-mm-dd'), 11, 'Nowy Dwor Mazowiecki', 1, 4, 4 FROM dual
UNION ALL SELECT to_date('2016-05-10', 'yyyy-mm-dd'), 13, 'Legionowo', 1, 4, 4 FROM dual
UNION ALL SELECT to_date('2016-05-13', 'yyyy-mm-dd'), 7, 'Warszawa Odlewnicza', 1, 4, 4 FROM dual
UNION ALL SELECT to_date('2016-05-16', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 1, 4, 4 FROM dual
UNION ALL SELECT to_date('2016-05-20', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 1, 4, 4 FROM dual
UNION ALL SELECT to_date('2016-05-24', 'yyyy-mm-dd'), 10, 'Warszawa Odlewnicza', 1, 4, 4 FROM dual
UNION ALL SELECT to_date('2016-05-28', 'yyyy-mm-dd'), 10, 'Warszawa Odlewnicza', 1, 4, 4 FROM dual
UNION ALL SELECT to_date('2016-05-30', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 1, 4, 4 FROM dual
UNION ALL SELECT to_date('2016-06-03', 'yyyy-mm-dd'), 10, 'Warszawa Odlewnicza', 1, 4, 4 FROM dual
UNION ALL SELECT to_date('2016-06-04', 'yyyy-mm-dd'), 7, 'Warszawa Odlewnicza', 1, 4, 4 FROM dual

UNION ALL SELECT to_date('2014-11-27', 'yyyy-mm-dd'), 16, 'Legionowo', 2, 5, 2 FROM dual
UNION ALL SELECT to_date('2014-12-02', 'yyyy-mm-dd'), 18, 'Legionowo', 2, 5, 2 FROM dual
UNION ALL SELECT to_date('2014-12-03', 'yyyy-mm-dd'), 18, 'Nowy Dwor Mazowiecki', 2, 5, 2 FROM dual
UNION ALL SELECT to_date('2014-12-07', 'yyyy-mm-dd'), 19, 'Ciechanow', 2, 5, 2 FROM dual
UNION ALL SELECT to_date('2014-12-08', 'yyyy-mm-dd'), 19, 'Ciechanow', 2, 5, 2 FROM dual
UNION ALL SELECT to_date('2014-12-10', 'yyyy-mm-dd'), 19, 'Ciechanow', 2, 5, 2 FROM dual
UNION ALL SELECT to_date('2014-12-13', 'yyyy-mm-dd'), 19, 'Ciechanow', 2, 5, 2 FROM dual
UNION ALL SELECT to_date('2014-12-14', 'yyyy-mm-dd'), 19, 'Ciechanow', 2, 5, 2 FROM dual
UNION ALL SELECT to_date('2014-12-16', 'yyyy-mm-dd'), 19, 'Ciechanow', 2, 5, 2 FROM dual

UNION ALL SELECT to_date('2016-06-18', 'yyyy-mm-dd'), 7, 'Legionowo', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2016-06-21', 'yyyy-mm-dd'), 13, 'Nowy Dwor Mazowiecki', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2016-06-23', 'yyyy-mm-dd'), 11, 'Nowy Dwor Mazowiecki', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2016-06-27', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2016-06-28', 'yyyy-mm-dd'), 10, 'Warszawa Odlewnicza', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2016-06-29', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2016-07-03', 'yyyy-mm-dd'), 7, 'Warszawa Odlewnicza', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2016-07-04', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2016-07-05', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2016-07-06', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2016-07-07', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 4, 6, 4 FROM dual

UNION ALL SELECT to_date('2016-03-06', 'yyyy-mm-dd'), 16, 'Nowy Dwor Mazowiecki', 2, 7, 2 FROM dual
UNION ALL SELECT to_date('2016-03-07', 'yyyy-mm-dd'), 18, 'Legionowo', 2, 7, 2 FROM dual
UNION ALL SELECT to_date('2016-03-10', 'yyyy-mm-dd'), 18, 'Legionowo', 2, 7, 2 FROM dual
UNION ALL SELECT to_date('2016-03-11', 'yyyy-mm-dd'), 19, 'Ciechanow', 2, 7, 2 FROM dual
UNION ALL SELECT to_date('2016-03-12', 'yyyy-mm-dd'), 19, 'Ciechanow', 2, 7, 2 FROM dual
UNION ALL SELECT to_date('2016-03-13', 'yyyy-mm-dd'), 19, 'Ciechanow', 2, 7, 2 FROM dual
UNION ALL SELECT to_date('2016-03-16', 'yyyy-mm-dd'), 19, 'Ciechanow', 2, 7, 2 FROM dual
UNION ALL SELECT to_date('2016-03-20', 'yyyy-mm-dd'), 19, 'Ciechanow', 2, 7, 2 FROM dual
UNION ALL SELECT to_date('2016-03-21', 'yyyy-mm-dd'), 19, 'Ciechanow', 2, 7, 2 FROM dual

UNION ALL SELECT to_date('2017-01-14', 'yyyy-mm-dd'), 13, 'Nowy Dwor Mazowiecki', 4, 8, 4 FROM dual
UNION ALL SELECT to_date('2017-01-18', 'yyyy-mm-dd'), 7, 'Nowy Dwor Mazowiecki', 4, 8, 4 FROM dual
UNION ALL SELECT to_date('2017-01-21', 'yyyy-mm-dd'), 11, 'Legionowo', 4, 8, 4 FROM dual
UNION ALL SELECT to_date('2017-01-22', 'yyyy-mm-dd'), 7, 'Warszawa Bemowo', 4, 8, 4 FROM dual
UNION ALL SELECT to_date('2017-01-23', 'yyyy-mm-dd'), 10, 'Warszawa Bemowo', 4, 8, 4 FROM dual
UNION ALL SELECT to_date('2017-01-27', 'yyyy-mm-dd'), 10, 'Warszawa Bemowo', 4, 8, 4 FROM dual
UNION ALL SELECT to_date('2017-01-30', 'yyyy-mm-dd'), 13, 'Warszawa Bemowo', 4, 8, 4 FROM dual
UNION ALL SELECT to_date('2017-02-04', 'yyyy-mm-dd'), 7, 'Warszawa Bemowo', 4, 8, 4 FROM dual
UNION ALL SELECT to_date('2017-02-06', 'yyyy-mm-dd'), 13, 'Warszawa Bemowo', 4, 8, 4 FROM dual
UNION ALL SELECT to_date('2017-02-08', 'yyyy-mm-dd'), 10, 'Warszawa Bemowo', 4, 8, 4 FROM dual
UNION ALL SELECT to_date('2017-02-12', 'yyyy-mm-dd'), 13, 'Warszawa Bemowo', 4, 8, 4 FROM dual

UNION ALL SELECT to_date('2017-04-29', 'yyyy-mm-dd'), 16, 'Legionowo', 5, 9, 5 FROM dual
UNION ALL SELECT to_date('2017-05-02', 'yyyy-mm-dd'), 16, 'Legionowo', 5, 9, 5 FROM dual
UNION ALL SELECT to_date('2017-05-05', 'yyyy-mm-dd'), 18, 'Nowy Dwor Mazowiecki', 5, 9, 5 FROM dual
UNION ALL SELECT to_date('2017-05-06', 'yyyy-mm-dd'), 16, 'Warszawa Bemowo', 5, 9, 5 FROM dual
UNION ALL SELECT to_date('2017-05-08', 'yyyy-mm-dd'), 16, 'Warszawa Bemowo', 5, 9, 5 FROM dual
UNION ALL SELECT to_date('2017-05-11', 'yyyy-mm-dd'), 16, 'Warszawa Bemowo', 5, 9, 5 FROM dual
UNION ALL SELECT to_date('2017-05-15', 'yyyy-mm-dd'), 16, 'Warszawa Bemowo', 5, 9, 5 FROM dual
UNION ALL SELECT to_date('2017-05-19', 'yyyy-mm-dd'), 16, 'Warszawa Bemowo', 5, 9, 5 FROM dual
UNION ALL SELECT to_date('2017-05-22', 'yyyy-mm-dd'), 16, 'Warszawa Bemowo', 5, 9, 5 FROM dual
UNION ALL SELECT to_date('2017-05-24', 'yyyy-mm-dd'), 16, 'Warszawa Bemowo', 5, 9, 5 FROM dual
UNION ALL SELECT to_date('2017-05-26', 'yyyy-mm-dd'), 16, 'Warszawa Bemowo', 5, 9, 5 FROM dual

UNION ALL SELECT to_date('2017-12-16', 'yyyy-mm-dd'), 16, 'Legionowo', 2, 10, 2 FROM dual
UNION ALL SELECT to_date('2017-12-17', 'yyyy-mm-dd'), 16, 'Legionowo', 2, 10, 2 FROM dual
UNION ALL SELECT to_date('2017-12-21', 'yyyy-mm-dd'), 18, 'Legionowo', 2, 10, 2 FROM dual
UNION ALL SELECT to_date('2017-12-24', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 10, 2 FROM dual
UNION ALL SELECT to_date('2017-12-27', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 10, 2 FROM dual
UNION ALL SELECT to_date('2017-12-31', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 10, 2 FROM dual
UNION ALL SELECT to_date('2018-01-04', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 10, 2 FROM dual
UNION ALL SELECT to_date('2018-01-05', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 10, 2 FROM dual
UNION ALL SELECT to_date('2018-01-06', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 10, 2 FROM dual

UNION ALL SELECT to_date('2014-07-24', 'yyyy-mm-dd'), 11, 'Nowy Dwor Mazowiecki', 1, 11, 4 FROM dual
UNION ALL SELECT to_date('2014-07-27', 'yyyy-mm-dd'), 11, 'Legionowo', 1, 11, 4 FROM dual
UNION ALL SELECT to_date('2014-07-28', 'yyyy-mm-dd'), 7, 'Nowy Dwor Mazowiecki', 1, 11, 4 FROM dual
UNION ALL SELECT to_date('2014-07-30', 'yyyy-mm-dd'), 7, 'Warszawa Odlewnicza', 1, 11, 4 FROM dual
UNION ALL SELECT to_date('2014-07-31', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 1, 11, 4 FROM dual
UNION ALL SELECT to_date('2014-08-02', 'yyyy-mm-dd'), 7, 'Warszawa Odlewnicza', 1, 11, 4 FROM dual
UNION ALL SELECT to_date('2014-08-03', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 1, 11, 4 FROM dual
UNION ALL SELECT to_date('2014-08-05', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 1, 11, 4 FROM dual
UNION ALL SELECT to_date('2014-08-06', 'yyyy-mm-dd'), 7, 'Warszawa Odlewnicza', 1, 11, 4 FROM dual
UNION ALL SELECT to_date('2014-08-10', 'yyyy-mm-dd'), 10, 'Warszawa Odlewnicza', 1, 11, 4 FROM dual
UNION ALL SELECT to_date('2014-08-13', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 1, 11, 4 FROM dual

;