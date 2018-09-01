INSERT INTO POSITION_DATA
	SELECT 
	UNION ALL SELECT 'director', to_date('2014-05-01', 'yyyy-mm-dd'), to_date('2016-12-31', 'yyyy-mm-dd'), 4000, 0 FROM dual
	UNION ALL SELECT 'secretary', to_date('2014-05-01', 'yyyy-mm-dd'), to_date('2016-12-31', 'yyyy-mm-dd'), 2000, 0 FROM dual
	UNION ALL SELECT 'instructor' to_date('2014-05-01', 'yyyy-mm-dd'), to_date('2016-12-31', 'yyyy-mm-dd'), 2500, 15 FROM dual
	
	UNION ALL SELECT 'director', to_date('2017-01-01', 'yyyy-mm-dd'), to_date('2018-10-31', 'yyyy-mm-dd'), 5000, 0 FROM dual
	UNION ALL SELECT 'secretary', to_date('2017-01-01', 'yyyy-mm-dd'), to_date('2018-10-31', 'yyyy-mm-dd'), 2500, 0 FROM dual
	UNION ALL SELECT 'instructor' to_date('2017-01-01', 'yyyy-mm-dd'), to_date('2018-10-31', 'yyyy-mm-dd'), 3000, 20 FROM dual
	
	UNION ALL SELECT 'director', to_date('2018-11-01', 'yyyy-mm-dd'), to_date('2099-12-31', 'yyyy-mm-dd'), 5500, 0 FROM dual
	UNION ALL SELECT 'secretary', to_date('2018-11-01', 'yyyy-mm-dd'), to_date('2099-12-31', 'yyyy-mm-dd'), 2700, 0 FROM dual
	UNION ALL SELECT 'instructor' to_date('2018-11-01', 'yyyy-mm-dd'), to_date('2099-12-31', 'yyyy-mm-dd'), 3500, 20 FROM dual
	;