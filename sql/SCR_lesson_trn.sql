INSERT INTO LESSON (L_date, Starting_time, Area_name, ID_emp, ID_trn, ID_veh)
SELECT to_date('2014-09-25', 'yyyy-mm-dd'), 13, 'Nowy Dwor Mazowiecki', 4, 2, 4 FROM dual
UNION ALL SELECT to_date('2014-09-28', 'yyyy-mm-dd'), 11, 'Legionowo', 4, 2, 4 FROM dual
UNION ALL SELECT to_date('2014-09-29', 'yyyy-mm-dd'), 7, 'Legionowo', 4, 2, 4 FROM dual
UNION ALL SELECT to_date('2014-09-30', 'yyyy-mm-dd'), 15, 'Warszawa Radarowa', 4, 2, 4 FROM dual
UNION ALL SELECT to_date('2014-10-02', 'yyyy-mm-dd'), 15, 'Warszawa Radarowa', 4, 2, 4 FROM dual
UNION ALL SELECT to_date('2014-10-04', 'yyyy-mm-dd'), 7, 'Warszawa Radarowa', 4, 2, 4 FROM dual
UNION ALL SELECT to_date('2014-10-06', 'yyyy-mm-dd'), 15, 'Warszawa Radarowa', 4, 2, 4 FROM dual
UNION ALL SELECT to_date('2014-10-09', 'yyyy-mm-dd'), 15, 'Warszawa Radarowa', 4, 2, 4 FROM dual
UNION ALL SELECT to_date('2014-10-11', 'yyyy-mm-dd'), 7, 'Warszawa Radarowa', 4, 2, 4 FROM dual

UNION ALL SELECT to_date('2015-04-02', 'yyyy-mm-dd'), 18, 'Nowy Dwor Mazowiecki', 2, 3, 2 FROM dual
UNION ALL SELECT to_date('2015-04-04', 'yyyy-mm-dd'), 18, 'Legionowo', 2, 3, 2 FROM dual
UNION ALL SELECT to_date('2015-04-07', 'yyyy-mm-dd'), 16, 'Nowy Dwor Mazowiecki', 2, 3, 2 FROM dual
UNION ALL SELECT to_date('2015-04-08', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 3, 2 FROM dual
UNION ALL SELECT to_date('2015-04-09', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 3, 2 FROM dual
UNION ALL SELECT to_date('2015-04-11', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 3, 2 FROM dual
UNION ALL SELECT to_date('2015-04-14', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 3, 2 FROM dual
UNION ALL SELECT to_date('2015-04-15', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 3, 2 FROM dual
UNION ALL SELECT to_date('2015-04-16', 'yyyy-mm-dd'), 19, 'Warszawa Radarowa', 2, 3, 2 FROM dual

UNION ALL SELECT to_date('2018-05-11', 'yyyy-mm-dd'), 7, 'Legionowo', 1, 4, 1 FROM dual
UNION ALL SELECT to_date('2018-05-12', 'yyyy-mm-dd'), 7, 'Nowy Dwor Mazowiecki', 1, 4, 1 FROM dual
UNION ALL SELECT to_date('2018-05-15', 'yyyy-mm-dd'), 11, 'Legionowo', 1, 4, 1 FROM dual
UNION ALL SELECT to_date('2018-05-16', 'yyyy-mm-dd'), 7, 'Ciechanow', 1, 4, 1 FROM dual
UNION ALL SELECT to_date('2018-05-18', 'yyyy-mm-dd'), 11, 'Ciechanow', 1, 4, 1 FROM dual
UNION ALL SELECT to_date('2018-05-21', 'yyyy-mm-dd'), 11, 'Ciechanow', 1, 4, 1 FROM dual
UNION ALL SELECT to_date('2018-05-23', 'yyyy-mm-dd'), 15, 'Ciechanow', 1, 4, 1 FROM dual
UNION ALL SELECT to_date('2018-05-25', 'yyyy-mm-dd'), 7, 'Ciechanow', 1, 4, 1 FROM dual
UNION ALL SELECT to_date('2018-05-27', 'yyyy-mm-dd'), 7, 'Ciechanow', 1, 4, 1 FROM dual

UNION ALL SELECT to_date('2014-06-12', 'yyyy-mm-dd'), 11, 'Legionowo', 1, 5, 1 FROM dual
UNION ALL SELECT to_date('2014-06-15', 'yyyy-mm-dd'), 13, 'Nowy Dwor Mazowiecki', 1, 5, 1 FROM dual
UNION ALL SELECT to_date('2014-06-19', 'yyyy-mm-dd'), 13, 'Legionowo', 1, 5, 1 FROM dual
UNION ALL SELECT to_date('2014-06-20', 'yyyy-mm-dd'), 7, 'Warszawa Radarowa', 1, 5, 1 FROM dual
UNION ALL SELECT to_date('2014-06-21', 'yyyy-mm-dd'), 15, 'Warszawa Radarowa', 1, 5, 1 FROM dual
UNION ALL SELECT to_date('2014-06-25', 'yyyy-mm-dd'), 15, 'Warszawa Radarowa', 1, 5, 1 FROM dual
UNION ALL SELECT to_date('2014-06-26', 'yyyy-mm-dd'), 11, 'Warszawa Radarowa', 1, 5, 1 FROM dual
UNION ALL SELECT to_date('2014-06-30', 'yyyy-mm-dd'), 11, 'Warszawa Radarowa', 1, 5, 1 FROM dual
UNION ALL SELECT to_date('2014-07-05', 'yyyy-mm-dd'), 7, 'Warszawa Radarowa', 1, 5, 1 FROM dual

UNION ALL SELECT to_date('2014-08-14', 'yyyy-mm-dd'), 13, 'Legionowo', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2014-08-17', 'yyyy-mm-dd'), 11, 'Nowy Dwor Mazowiecki', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2014-08-21', 'yyyy-mm-dd'), 13, 'Legionowo', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2014-08-24', 'yyyy-mm-dd'), 10, 'Warszawa Odlewnicza', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2014-08-25', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2014-08-28', 'yyyy-mm-dd'), 7, 'Warszawa Odlewnicza', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2014-08-29', 'yyyy-mm-dd'), 7, 'Warszawa Odlewnicza', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2014-08-30', 'yyyy-mm-dd'), 7, 'Warszawa Odlewnicza', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2014-09-03', 'yyyy-mm-dd'), 10, 'Warszawa Odlewnicza', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2014-09-07', 'yyyy-mm-dd'), 10, 'Warszawa Odlewnicza', 4, 6, 4 FROM dual
UNION ALL SELECT to_date('2014-09-08', 'yyyy-mm-dd'), 10, 'Warszawa Odlewnicza', 4, 6, 4 FROM dual

UNION ALL SELECT to_date('2017-11-25', 'yyyy-mm-dd'), 7, 'Legionowo', 1, 7, 1 FROM dual
UNION ALL SELECT to_date('2017-11-28', 'yyyy-mm-dd'), 7, 'Nowy Dwor Mazowiecki', 1, 7, 1 FROM dual
UNION ALL SELECT to_date('2017-11-29', 'yyyy-mm-dd'), 11, 'Legionowo', 1, 7, 1 FROM dual
UNION ALL SELECT to_date('2017-11-30', 'yyyy-mm-dd'), 15, 'Ciechanow', 1, 7, 1 FROM dual
UNION ALL SELECT to_date('2017-12-05', 'yyyy-mm-dd'), 11, 'Ciechanow', 1, 7, 1 FROM dual
UNION ALL SELECT to_date('2017-12-06', 'yyyy-mm-dd'), 11, 'Ciechanow', 1, 7, 1 FROM dual
UNION ALL SELECT to_date('2017-12-08', 'yyyy-mm-dd'), 11, 'Ciechanow', 1, 7, 1 FROM dual
UNION ALL SELECT to_date('2017-12-12', 'yyyy-mm-dd'), 7, 'Ciechanow', 1, 7, 1 FROM dual
UNION ALL SELECT to_date('2017-12-13', 'yyyy-mm-dd'), 7, 'Ciechanow', 1, 7, 1 FROM dual

UNION ALL SELECT to_date('2014-07-24', 'yyyy-mm-dd'), 7, 'Nowy Dwor Mazowiecki', 1, 8, 1 FROM dual
UNION ALL SELECT to_date('2014-07-27', 'yyyy-mm-dd'), 7, 'Nowy Dwor Mazowiecki', 1, 8, 1 FROM dual
UNION ALL SELECT to_date('2014-07-31', 'yyyy-mm-dd'), 7, 'Nowy Dwor Mazowiecki', 1, 8, 1 FROM dual
UNION ALL SELECT to_date('2014-08-04', 'yyyy-mm-dd'), 13, 'Warszawa Bemowo', 1, 8, 1 FROM dual
UNION ALL SELECT to_date('2014-08-06', 'yyyy-mm-dd'), 10, 'Warszawa Bemowo', 1, 8, 1 FROM dual
UNION ALL SELECT to_date('2014-08-08', 'yyyy-mm-dd'), 10, 'Warszawa Bemowo', 1, 8, 1 FROM dual
UNION ALL SELECT to_date('2014-08-09', 'yyyy-mm-dd'), 10, 'Warszawa Bemowo', 1, 8, 1 FROM dual
UNION ALL SELECT to_date('2014-08-10', 'yyyy-mm-dd'), 7, 'Warszawa Bemowo', 1, 8, 1 FROM dual
UNION ALL SELECT to_date('2014-08-12', 'yyyy-mm-dd'), 13, 'Warszawa Bemowo', 1, 8, 1 FROM dual
UNION ALL SELECT to_date('2014-08-15', 'yyyy-mm-dd'), 7, 'Warszawa Bemowo', 1, 8, 1 FROM dual
UNION ALL SELECT to_date('2014-08-17', 'yyyy-mm-dd'), 7, 'Warszawa Bemowo', 1, 8, 1 FROM dual

UNION ALL SELECT to_date('2017-12-16', 'yyyy-mm-dd'), 18, 'Nowy Dwor Mazowiecki', 2, 9, 4 FROM dual
UNION ALL SELECT to_date('2017-12-17', 'yyyy-mm-dd'), 18, 'Legionowo', 2, 9, 4 FROM dual
UNION ALL SELECT to_date('2017-12-18', 'yyyy-mm-dd'), 18, 'Nowy Dwor Mazowiecki', 2, 9, 4 FROM dual
UNION ALL SELECT to_date('2017-12-20', 'yyyy-mm-dd'), 16, 'Warszawa Odlewnicza', 2, 9, 4 FROM dual
UNION ALL SELECT to_date('2017-12-22', 'yyyy-mm-dd'), 16, 'Warszawa Odlewnicza', 2, 9, 4 FROM dual
UNION ALL SELECT to_date('2017-12-24', 'yyyy-mm-dd'), 16, 'Warszawa Odlewnicza', 2, 9, 4 FROM dual
UNION ALL SELECT to_date('2017-12-25', 'yyyy-mm-dd'), 16, 'Warszawa Odlewnicza', 2, 9, 4 FROM dual
UNION ALL SELECT to_date('2017-12-28', 'yyyy-mm-dd'), 16, 'Warszawa Odlewnicza', 2, 9, 4 FROM dual
UNION ALL SELECT to_date('2017-12-31', 'yyyy-mm-dd'), 16, 'Warszawa Odlewnicza', 2, 9, 4 FROM dual
UNION ALL SELECT to_date('2018-01-02', 'yyyy-mm-dd'), 16, 'Warszawa Odlewnicza', 2, 9, 4 FROM dual
UNION ALL SELECT to_date('2018-01-06', 'yyyy-mm-dd'), 16, 'Warszawa Odlewnicza', 2, 9, 4 FROM dual

UNION ALL SELECT to_date('2017-01-14', 'yyyy-mm-dd'), 11, 'Nowy Dwor Mazowiecki', 1, 10, 1 FROM dual
UNION ALL SELECT to_date('2017-01-18', 'yyyy-mm-dd'), 13, 'Nowy Dwor Mazowiecki', 1, 10, 1 FROM dual
UNION ALL SELECT to_date('2017-01-21', 'yyyy-mm-dd'), 13, 'Nowy Dwor Mazowiecki', 1, 10, 1 FROM dual
UNION ALL SELECT to_date('2017-01-25', 'yyyy-mm-dd'), 11, 'Warszawa Radarowa', 1, 10, 1 FROM dual
UNION ALL SELECT to_date('2017-01-26', 'yyyy-mm-dd'), 11, 'Warszawa Radarowa', 1, 10, 1 FROM dual
UNION ALL SELECT to_date('2017-01-29', 'yyyy-mm-dd'), 15, 'Warszawa Radarowa', 1, 10, 1 FROM dual
UNION ALL SELECT to_date('2017-01-31', 'yyyy-mm-dd'), 11, 'Warszawa Radarowa', 1, 10, 1 FROM dual
UNION ALL SELECT to_date('2017-02-05', 'yyyy-mm-dd'), 11, 'Warszawa Radarowa', 1, 10, 1 FROM dual
UNION ALL SELECT to_date('2017-02-07', 'yyyy-mm-dd'), 11, 'Warszawa Radarowa', 1, 10, 1 FROM dual

UNION ALL SELECT to_date('2017-09-02', 'yyyy-mm-dd'), 13, 'Nowy Dwor Mazowiecki', 4, 11, 4 FROM dual
UNION ALL SELECT to_date('2017-09-03', 'yyyy-mm-dd'), 11, 'Legionowo', 4, 11, 4 FROM dual
UNION ALL SELECT to_date('2017-09-07', 'yyyy-mm-dd'), 7, 'Legionowo', 4, 11, 4 FROM dual
UNION ALL SELECT to_date('2017-09-11', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 4, 11, 4 FROM dual
UNION ALL SELECT to_date('2017-09-13', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 4, 11, 4 FROM dual
UNION ALL SELECT to_date('2017-09-17', 'yyyy-mm-dd'), 10, 'Warszawa Odlewnicza', 4, 11, 4 FROM dual
UNION ALL SELECT to_date('2017-09-20', 'yyyy-mm-dd'), 13, 'Warszawa Odlewnicza', 4, 11, 4 FROM dual
UNION ALL SELECT to_date('2017-09-22', 'yyyy-mm-dd'), 10, 'Warszawa Odlewnicza', 4, 11, 4 FROM dual
UNION ALL SELECT to_date('2017-09-26', 'yyyy-mm-dd'), 10, 'Warszawa Odlewnicza', 4, 11, 4 FROM dual
UNION ALL SELECT to_date('2017-09-28', 'yyyy-mm-dd'), 7, 'Warszawa Odlewnicza', 4, 11, 4 FROM dual
UNION ALL SELECT to_date('2017-09-29', 'yyyy-mm-dd'), 7, 'Warszawa Odlewnicza', 4, 11, 4 FROM dual

;